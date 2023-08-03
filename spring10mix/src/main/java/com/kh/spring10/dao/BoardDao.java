package com.kh.spring10.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring10.dto.BoardDto;
import com.kh.spring10.mapper.BoardDetailMapper;
import com.kh.spring10.mapper.BoardListMapper;

//DAO 클래스
//= Spring에 등록해야 함
//= JdbcTemplate 처리를 요청해야 함(DI, 의존성 주입)
//= @Repository로 등록(영원히 변하지 않는 것을 다루는 객체. 영속성 제어 객체)

@Repository
public class BoardDao {
	
	@Autowired//(주의) 등록을 하지 않으면 절대로 주지 않음
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private BoardDetailMapper detailMapper;
	
	@Autowired
	private BoardListMapper listMapper;

//	public void insert(BoardDto dto) {
//		String sql = "insert into board("
//				+ "board_no, board_title, board_content, board_writer"
//				+ ") values(board_seq.nextval, ?, ?, ?)";
//		Object[] data = {
//				dto.getBoardTitle(), dto.getBoardContent(),
//				dto.getBoardWriter()
//		};
//		jdbcTemplate.update(sql, data);
//	}
	
	//등록과 번호생성 기능
	//select board_seq.nextval from dual
	//insert into board(...) values(?, ?, ?, ?, 0)
	public int seqeunce() {
		String sql = "select board_seq.nextval from dual";
		return jdbcTemplate.queryForObject(sql, int.class);
//		return jdbcTemplate.queryForObject(sql, Integer.class);
	}
	
	public void insert(BoardDto dto) {
	      String sql="insert into board("
	            + "board_no,board_title,board_content,board_writer,board_readcount) values(?,?,?,?,0)";
	      Object[] data = {dto.getBoardNo(),dto.getBoardTitle(),dto.getBoardContent(),dto.getBoardWriter()};
	      jdbcTemplate.update(sql,data);
	   }
		
	//@AutoWired가 이미 위에서 등록됐으므로 또 작성하지 않음
	public boolean update(BoardDto dto) {
		String sql = "update board"
				+ " set board_title = ?, board_content = ?, board_writer = ?"
				+ "  where board_no = ?";
		Object[] data = {
				dto.getBoardTitle(), dto.getBoardContent(), dto.getBoardWriter(), dto.getBoardNo()
		};
		
		return jdbcTemplate.update(sql, data) > 0;
	}

	public boolean delete(int boardNo) {
		String sql = "delete board where board_no = ?";
		Object[] data = {boardNo};
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	public List<BoardDto> selectList() {
		//String sql = "select * from board order by board_no desc";
		String sql = "select "
							+ "board_no, board_title, "
							+ "board_writer, board_readcount "
						+ "from "
						+ "board order by board_no desc";
		return jdbcTemplate.query(sql, listMapper);
	}
	
	public BoardDto selectOne(int boardNo) {
		String sql = "select * from board where board_no = ?";
		Object[] data = {boardNo};
		List<BoardDto> list = jdbcTemplate.query(sql, detailMapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
}
