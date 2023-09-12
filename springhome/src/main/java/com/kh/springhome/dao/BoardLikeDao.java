package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.dto.BoardLikeDto;

//복합키로 구성된 테이블이므로 기본키 대신 DTO를 사용
public interface BoardLikeDao {
	void insert(BoardLikeDto boardLikeDto);//좋아요 등록
	boolean delete(BoardLikeDto boardLikeDto);//좋아요 삭제
	boolean check(BoardLikeDto boardLikeDto);//좋아요 여부 확인
	int count(int boardNo);//좋아요 개수 조회
	List<BoardDto>findByMemberId(String memberId);//좋아요 내역 조회
}
