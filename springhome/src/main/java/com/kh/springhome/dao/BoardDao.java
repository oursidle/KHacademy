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
	Integer selectMax(String boardWriter);//Integer은 null 값이 있을 수 있음
	List<BoardDto> selectList(String type, String keyword);//type:제목, 작성자, .... / keyword:검색어
}