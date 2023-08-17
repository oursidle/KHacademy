package com.kh.springhome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.dto.BoardListDto;
import com.kh.springhome.mapper.BoardListMapper;
import com.kh.springhome.mapper.BoardMapper;

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
									+ "board_no, board_writer, board_title, board_content)"
								+ " values(?, ?, ?, ?)";//sequence 받는 것을 따로 구분해놓았기 때문에 sequence를 홀더로 지정하지 않음
			Object[] data = {
					boardDto.getBoardNo(), boardDto.getBoardWriter(), 
					boardDto.getBoardTitle(), boardDto.getBoardContent()
			};
			jdbcTemplate.update(sql, data);
		}
		
		//R
		@Override
		public List<BoardListDto> selctList() {
			String sql = "select * from board_list order by board_no desc";
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
					+ " set board_title=?, board_content=?, board_readcount=board_readcount-1, board_utime=sysdate"
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
						+ " order by board_no desc";
			Object[] data = {keyword};
			return jdbcTemplate.query(sql, boardListMapper, data);
			}
//			String sql = "select * from board_list"
//					+ " where instr(#1, ?) > 0"
//					+ " order by board_no desc";
//			sql = sql.replace("#1", type);
//			}
}
