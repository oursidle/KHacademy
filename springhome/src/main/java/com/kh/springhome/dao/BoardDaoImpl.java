package com.kh.springhome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.dto.BoardListDto;
import com.kh.springhome.mapper.BoardListMapper;
import com.kh.springhome.mapper.BoardMapper;
import com.kh.springhome.vo.PaginationVO;

@Repository
public class BoardDaoImpl implements BoardDao{

		@Autowired
		private JdbcTemplate jdbcTemplate;
		
		@Autowired
		private BoardMapper boardMapper;
		
		@Autowired
		private BoardListMapper boardListMapper;

		@Override
		public int sequence() {//sequence로 번호를 먼저 받은 후 insert에 대입
			String sql = "select board_seq.nextval from dual";
			return jdbcTemplate.queryForObject(sql, int.class);
		}
		
		//C
		@Override
		public void insert(BoardDto boardDto) {
			String sql = "insert into board("
									+ " board_no, board_writer, board_title, board_content,"
									+ " board_group, board_parent, board_depth)"
								+ " values(?, ?, ?, ?, ?, ?, ?)";//sequence 받는 것을 따로 구분해놓았기 때문에 sequence를 홀더로 지정하지 않음
			Object[] data = {
					boardDto.getBoardNo(), boardDto.getBoardWriter(), 
					boardDto.getBoardTitle(), boardDto.getBoardContent(),
					boardDto.getBoardGroup(), boardDto.getBoardParent(), boardDto.getBoardDepth()
			};
			jdbcTemplate.update(sql, data);
		}
		
		//R
		@Override
		public List<BoardListDto> selctList() {
			//기존 조회 구문
//			String sql = "select * from board_list order by board_no desc";
//			return jdbcTemplate.query(sql, boardListMapper);
			
			//계층형 조회 구문
			String sql = "select * from board_list"
					+ " connect by prior board_no = board_parent"
					+ " start with board_parent is null"
					+ " order siblings by board_group desc, board_no asc";
			return jdbcTemplate.query(sql, boardListMapper);
		}
		//R
		@Override
		public BoardDto selectOne(int boardNo) {
			String sql = "select * from board where board_no=?";
			Object[] data = {boardNo};
			List<BoardDto> list = jdbcTemplate.query(sql, boardMapper, data);
			return list.isEmpty() ? null : list.get(0);
		}

		//U
		@Override
		public boolean update(BoardDto boardDto) {
			String sql = "update board"
					+ " set board_title=?, board_content=?, board_utime=sysdate"
					+ " where board_no=?";
			Object[] data = {
					boardDto.getBoardTitle(), boardDto.getBoardContent(),
					boardDto.getBoardNo()
			};
			return jdbcTemplate.update(sql, data) > 0;
		}
		
		//D
		@Override
		public boolean delete(int boardNo) {
			String sql = "delete board where board_no=?";
			Object[] data = {boardNo};
			return jdbcTemplate.update(sql, data) > 0;
		}
		
		
		@Override
		public boolean updateBoardReadCount(int boardNo) {
			String sql = "update board set board_readcount = board_readcount + 1 where board_no = ?";
			Object[] data = {boardNo};
			return jdbcTemplate.update(sql, data) > 0;
		}

		@Override
		public Integer selectMax(String boardWriter) {
			String sql = "select max(board_no) from board"
							+ " where board_writer = ?";
			Object[] data = {boardWriter};
			return jdbcTemplate.queryForObject(sql, Integer.class, data);
		}
		//select * from board where board_no = (
		//		select max(board_no) from board
		//		where board_writer = 'testuser2'
		//); 서브쿼리 sql 구문

//		@Override//안 좋은 예
//		public List<BoardDto> selectList(String type, String keyword) {
//			String sql;
//			if(type.equals("board_title")) {//type이 제목인 경우
//				sql = "select * from board"
//						+ " where instr(board_title, ?) > 0"
//						+ " order by board_no desc";
//			}else {//type이 작성자인 경우
//				sql = "select * from board"
//						+ " where instr(board_writer, ?) > 0"
//						+ " order by board_no desc	";
//			}
//			Object[] data = {keyword};
//			return jdbcTemplate.query(sql, boardListMapper, data);
//		}
		
		@Override//좋은 예
		public List<BoardListDto> selectList(String type, String keyword) {
			String sql = "select * from board_list"
						+ " where instr("+type+", ?) > 0"
						+ " connect by prior board_no = board_parent"
						+ " start with board_parent is null"
						+ " order siblings by board_group desc, board_no asc";
			Object[] data = {keyword};
			return jdbcTemplate.query(sql, boardListMapper, data);
			}
//			String sql = "select * from board_list"
//					+ " where instr(#1, ?) > 0"
//					+ " order by board_no desc";
//			sql = sql.replace("#1", type);
//			}

		
		//페이징 추가된 목록
		@Override
		public List<BoardListDto> selectListByPage(int page) {
			int begin = page * 10 - 9;
			int end = page * 10;
			
			String sql = "select * from ("
									+ "select rownum rn, TMP.* from ("
										+ "select * from board_list"
										+ " connect by prior board_no = board_parent"
										+ " start with board_parent is null"
										+ " order siblings by board_group desc, board_no asc"
									+ ")TMP"
								+ ") where rn between ? and ?";
			Object[] data = {begin, end};
			return jdbcTemplate.query(sql, boardListMapper, data);
		}

		@Override
		public List<BoardListDto> selectListByPage(String type, String keyword, int page) {
			int begin = page * 10 - 9;
			int end = page * 10;
			
			String sql = "select * from ("
									+ "select rownum rn, TMP.* from ("
										+ "select * from board_list"
										+ " where instr("+type+", ?) > 0"
										+ " connect by prior board_no = board_parent"
										+ " start with board_parent is null"
										+ " order siblings by board_group desc, board_no asc"
									+ ")TMP"
								+ ") where rn between ? and ?";
			Object[] data = {keyword, begin, end};
			return jdbcTemplate.query(sql, boardListMapper, data);
		}

		@Override
		public int countList() {
			String sql = "select count(*) from board";
			return jdbcTemplate.queryForObject(sql, int.class);
		}

		@Override
		public int countList(String type, String keyword) {
			String sql = "select count(*) from board where instr("+type+", ?) > 0";
			Object[] data = {keyword};
			return jdbcTemplate.queryForObject(sql, int.class, data);
		}

		@Override
		public int countList(PaginationVO vo) {
			if(vo.isSearch()) {//검색
				String sql = "select count(*) from board where instr("+vo.getType()+", ?) > 0";
				Object[] data = {vo.getKeyword()};
				return jdbcTemplate.queryForObject(sql, int.class, data);
			}else {//목록
				String sql = "select count(*) from board";
				return jdbcTemplate.queryForObject(sql, int.class);
			}
		}

		@Override
		public List<BoardListDto> selectListByPage(PaginationVO vo) {
			if(vo.isSearch()) {
				return selectListByPage(vo.getType(),vo.getKeyword(), vo.getPage());
			}else {
				return selectListByPage(vo.getPage());
			}
		}

		@Override
		public List<BoardListDto> selectListByBoardWriter(String boardWriter) {
			String sql = "select * from board_list"
								+ " where board_writer = ?"
								+ " order by board_no desc";
			Object[] data = {boardWriter};
			return jdbcTemplate.query(sql, boardListMapper, data);
		}
}
