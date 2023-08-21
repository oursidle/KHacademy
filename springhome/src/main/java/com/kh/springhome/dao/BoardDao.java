package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.dto.BoardListDto;
import com.kh.springhome.vo.PaginationVO;

public interface BoardDao {
	int sequence();
	
	//기본적인 구조
	void insert(BoardDto boardDto);//C
	List<BoardListDto> selctList();//R
	BoardDto selectOne(int boardNo);//R
	boolean update(BoardDto boardDto);//U
	boolean delete(int boardNo);//D
	
	boolean updateBoardReadCount(int boardNo);
	Integer selectMax(String boardWriter);//Integer은 null 값이 있을 수 있음
	List<BoardListDto> selectList(String type, String keyword);//type:제목, 작성자, .... / keyword:검색어
	
	List<BoardListDto> selectListByPage(int page);
	List<BoardListDto> selectListByPage(String type, String keyword, int page);
	List<BoardListDto> selectListByPage(PaginationVO vo);
	
	int countList();
	int countList(String type, String keyword);
	int countList(PaginationVO vo);

}