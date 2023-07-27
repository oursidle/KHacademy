package com.kh.spring06.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring06.dto.BoardDto;
import com.kh.spring06.mapper.BoardDetailMapper;

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
	
	public void insert(BoardDto dto) {
		String sql = "insert into board("
				+ "board_no, board_title, board_content, board_writer"
				+ ") values(board_seq.nextval, ?, ?, ?)";
		Object[] data = {
				dto.getBoardTitle(), dto.getBoardContent(),
				dto.getBoardWriter()
		};
		jdbcTemplate.update(sql, data);
	}
	
	//@AutoWired가 이미 위에서 등록됐으므로 또 작성하지 않음
	public boolean update(BoardDto dto) {
		String sql = "update board"
				+ " set board_title = ?, board_content = ?, board_writer = ?,"
					+ " board_readcount = ?"
				+ "  where board_no = ?";
		Object[] data = {
				dto.getBoardTitle(), dto.getBoardContent(), dto.getBoardWriter(),
				dto.getBoardReadCount(), dto.getBoardNo()
		};
		
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	public List<BoardDto> selectDetailList(){
		String sql = "select board_no, board_title, board_content,"
				+ " board_writer, board_readcount"
				+ " from board"
				+ " order by board_no desc";
		return jdbcTemplate.query(sql, detailMapper);
	}
}
