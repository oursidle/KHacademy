package com.kh.springhome.dao;

import com.kh.springhome.dto.AttachDto;
import com.kh.springhome.dto.PocketmonDto;

public interface AttachDao {
	int sequence();
	void insert(AttachDto attachDto);
	boolean delete(int attachNo);
	AttachDto selectOne(int attachNo);
}
