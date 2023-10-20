package com.kh.springhome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.springhome.dto.BoardDto;
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
	public int sequence() {
		String sql = "select board_seq.nextval from dual";
		return jdbcTemplate.queryForObject(sql, int.class);
	}

	@Override
	public void insert(BoardDto boardDto) {
		String sql = "insert into board("
							+ "board_no, board_title, board_content, board_writer"
						+ ") values(?, ?, ?, ?)";
		Object[] data = {
				boardDto.getBoardNo(), boardDto.getBoardTitle(),
				boardDto.getBoardContent(), boardDto.getBoardWriter()
		};
		jdbcTemplate.update(sql, data);
	}

	@Override
	public List<BoardDto> selectList() {
		String sql = "select "
								+ "board_no, board_writer, "
								+ "board_title, board_content, "
								+ "board_readcount, board_likecount, board_replycount, "
								+ "board_ctime, board_utime "
							+ "from board order by board_no desc";
		return jdbcTemplate.query(sql, boardListMapper);
	}

	@Override
	public BoardDto selectOne(int boardNo) {
		String sql = "select * from board where board_no = ?";
		Object[] data = {boardNo};
		List<BoardDto> list = jdbcTemplate.query(sql, boardMapper, data);
		return list.isEmpty() ? null : list.get(0);
	}

	@Override
	public boolean update(BoardDto boardDto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int boardNo) {
		// TODO Auto-generated method stub
		return false;
	}

}
