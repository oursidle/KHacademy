package com.kh.springhome.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.kh.springhome.dto.StatDto;

public class StatMapper implements RowMapper<StatDto>{

	@Override
	public StatDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		StatDto statDto = new StatDto();
		statDto.setName(rs.getString("name"));
		statDto.setCnt(rs.getInt("cnt"));
		return statDto;
	}

}
