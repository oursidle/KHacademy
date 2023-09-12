package com.kh.springhome.dao;

import com.kh.springhome.dto.BoardLikeDto;

//복합키로 구성된 테이블이므로 기본키 대신 DTO를 사용
public interface BoardLikeDao {
	void insert(BoardLikeDto boardLikeDto);//좋아요 등록
	boolean delete(BoardLikeDto boardLikeDto);//좋아요 삭제
	boolean check(BoardLikeDto boardLikeDto);//좋아요 여부 확인
}
