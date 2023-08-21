package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.vo.PaginationVO;

public interface AdminDao {
	List<MemberDto> selectList();//회원 목록
	List<MemberDto> selectList(String type, String keyword);//회원 목록(검색)

	List<MemberDto> selectListByPage(int page);
	List<MemberDto> selectListByPage(String type, String keyword, int page);
	List<MemberDto> selectListByPage(PaginationVO vo);
	
	int countList(PaginationVO vo);
}
