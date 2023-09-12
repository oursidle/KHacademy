package com.kh.springhome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.dto.BoardLikeDto;
import com.kh.springhome.mapper.BoardLikeMapper;
import com.kh.springhome.mapper.BoardMapper;

@Repository
public class BoardLikeDaoImpl implements BoardLikeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private BoardLikeMapper boardLikeMapper;
	
	@Autowired
	private BoardMapper boardMapper;
	
	//좋아요 등록
	@Override
	public void insert(BoardLikeDto boardLikeDto) {
		String sql = "insert into board_like(member_id, board_no) values(?, ?)";
		Object[] data = {boardLikeDto.getMemberId(), boardLikeDto.getBoardNo()};
		jdbcTemplate.update(sql, data);
	}
	
	//좋아요 삭제(삭제 시에도 두 개의 정보가 요구됨)
	@Override
	public boolean delete(BoardLikeDto boardLikeDto) {
		String sql = "delete board_like where member_id = ? and board_no = ?";
		Object[] data = {boardLikeDto.getMemberId(), boardLikeDto.getBoardNo()};
		return jdbcTemplate.update(sql, data) > 0;
	}

	//좋아요 여부 확인(확인 시에도 두 개의 정보가 요구됨)
	@Override
	public boolean check(BoardLikeDto boardLikeDto) {
		String sql = "select * from board_like where member_id = ? and board_no = ?";
		Object[] data = {boardLikeDto.getMemberId(), boardLikeDto.getBoardNo()};
		List<BoardLikeDto> list = jdbcTemplate.query(sql, boardLikeMapper, data);
		return list.isEmpty() ? false : true;
	}
	
	@Override
	public int count(int boardNo) {
		String sql = "select count(*) from board_like where board_no = ?";
		Object[] data = {boardNo};
		return jdbcTemplate.queryForObject(sql, int.class, data);
	}
	
	@Override
	public List<BoardDto> findByMemberId(String memberId) {
		String sql = "select board.* "
						+ "from board_like left outer join board "
						+ "on board_like.board_no = board.board_no "
						+ "where board_like.member_id = ? "
						+ "order by board.board_no desc";
		Object[] data = {memberId};
		return jdbcTemplate.query(sql, boardMapper, data);
	}
}
