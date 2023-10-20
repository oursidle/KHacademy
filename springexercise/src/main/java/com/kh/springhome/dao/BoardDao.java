package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.BoardDto;

public interface BoardDao {
	int sequence();
	void insert(BoardDto boardDto);//C(등록)
	List<BoardDto> selectList();//R(조회-목록)
	BoardDto selectOne(int boardNo);//R(조희-상세)
	boolean update(BoardDto boardDto);//U(수정)
	boolean delete(int boardNo);//D(삭제)
}
