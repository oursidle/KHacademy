package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.BoardDto;

public interface BoardDao {
	int sequence();
	
	//기본적인 구조
	void insert(BoardDto boardDto);//C
	List<BoardDto> selctList();//R
	BoardDto selectOne(int boardNo);//R
	boolean update(BoardDto boardDto);//U
	boolean delete(int boardNo);//D
	
	boolean updateBoardReadCount(int boardNo);
}
