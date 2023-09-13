package com.kh.springhome.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh.springhome.dto.PocketmonDto;

@Component
public class PocketmonMapper implements RowMapper<PocketmonDto> {

	@Override
	public PocketmonDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		PocketmonDto pocketmonDto = new PocketmonDto();
		pocketmonDto.setNo(rs.getInt("no"));
		pocketmonDto.setName(rs.getString("name"));
		pocketmonDto.setType(rs.getString("type"));
		return pocketmonDto;
	}
}
