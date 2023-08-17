package com.kh.springhome.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh.springhome.dto.BoardListDto;

@Component
public class BoardListMapper  implements RowMapper<BoardListDto>{
	
	@Override
	public BoardListDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardListDto boardListDto = new BoardListDto();
		boardListDto.setBoardNo(rs.getInt("board_no"));
		boardListDto.setBoardWriter(rs.getString("board_writer"));
		boardListDto.setBoardTitle(rs.getString("board_title"));
		boardListDto.setBoardReadCount(rs.getInt("board_readcount"));
		boardListDto.setBoardLikeCount(rs.getInt("board_likecount"));
		boardListDto.setBoardReplyCount(rs.getInt("board_replycount"));
		boardListDto.setBoardCTime(rs.getDate("board_ctime"));
		boardListDto.setBoardUTime(rs.getDate("board_utime"));
		boardListDto.setMemberNickname(rs.getString("member_nickname"));
		return boardListDto;
	}

}
