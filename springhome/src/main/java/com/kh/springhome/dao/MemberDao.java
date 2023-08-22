package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.MemberBlockDto;
import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.dto.MemberListDto;
import com.kh.springhome.vo.PaginationVO;

//메소드 명세만 작성(책의 목차와 같음)
public interface MemberDao {
		void insert(MemberDto memberDto);
		MemberDto selectOne(String memberId);
		boolean updateMemberLogin(String memberId);
		boolean updateMemberPw(String memberId, String changePw);
		boolean updateMemberInfo(MemberDto memberDto);
		boolean updateMemberInfoByAdmin(MemberDto memberDto);
		boolean delete(String memberId);
		
		boolean increaseMemberPoint(String memberId, int point);
		
		int countList(PaginationVO vo);
		List<MemberDto> selectListByPage(PaginationVO vo);
		List<MemberListDto> selectListByPage2(PaginationVO vo);
		
		//차단 설정+해제 기능
		void insertBlock(String memberId);
		boolean deleteBlock(String memberId);
		
		List<MemberBlockDto> selectBlockList();
		MemberBlockDto selectBlockOne(String memberId);
}
