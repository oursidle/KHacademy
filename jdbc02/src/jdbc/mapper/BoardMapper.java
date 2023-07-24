package jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.BoardDto;

public class BoardMapper implements RowMapper<BoardDto>{

	@Override
	public BoardDto mapRow(ResultSet rs, int idx) throws SQLException {
		BoardDto dto = new BoardDto();
		dto.setBoardNo(rs.getInt("Board_no"));
		dto.setBoardTitle(rs.getString("Board_title"));
		dto.setBoardContent(rs.getString("Board_content"));
		dto.setBoardWriter(rs.getString("Board_writer"));
		dto.setBoardReadCount(rs.getInt("Board_readCount"));
		return dto;
	}
		
		
}
