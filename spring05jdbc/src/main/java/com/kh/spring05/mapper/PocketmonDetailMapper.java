package com.kh.spring05.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh.spring05.dto.PocketmonDto;

@Component
public class PocketmonDetailMapper implements RowMapper<PocketmonDto>{

	@Override
	public PocketmonDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		PocketmonDto dto = new PocketmonDto();
		dto.setNo(rs.getInt("no"));
		dto.setName(rs.getString("name"));
		dto.setType(rs.getString("type"));
		return dto;
	}

}
