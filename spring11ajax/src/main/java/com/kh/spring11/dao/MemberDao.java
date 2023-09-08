package com.kh.spring11.dao;

import com.kh.spring11.dto.MemberDto;

//메소드 명세만 작성(책의 목차와 같음)
public interface MemberDao {
		void insert(MemberDto memberDto);
		MemberDto selectOne(String memberId);
		MemberDto selectOneByMemberNickname(String memberNickname);
		
		boolean updateMemberLogin(String memberId);
		boolean updateMemberPw(String memberId, String changePw);
		boolean updateMemberInfo(MemberDto memberDto);
		boolean updateMemberInfoByAdmin(MemberDto memberDto);
		boolean delete(String memberId);
		
		boolean increaseMemberPoint(String memberId, int point);
		
		//차단 설정+해제 기능
		void insertBlock(String memberId);
		boolean deleteBlock(String memberId);
}
