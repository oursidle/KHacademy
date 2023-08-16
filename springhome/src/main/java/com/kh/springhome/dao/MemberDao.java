package com.kh.springhome.dao;

import com.kh.springhome.dto.MemberDto;

//메소드 명세만 작성(책의 목차와 같음)
public interface MemberDao {
		void insert(MemberDto memberDto);
		MemberDto selectOne(String memberId);
		boolean updateMemberLogin(String memberId);
		boolean updateMemberPw(String memberId, String changePw);
		boolean updateMemberInfo(MemberDto memberDto);
		boolean delete(String memberId);
		
		boolean increaseMemberPoint(String memberId, int point);
}
