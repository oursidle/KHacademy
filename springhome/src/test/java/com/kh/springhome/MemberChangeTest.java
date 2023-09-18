package com.kh.springhome;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.springhome.dao.MemberDao;
import com.kh.springhome.dto.MemberDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class MemberChangeTest {
	
	@Autowired
	private MemberDao memberDao;
	
	@Test
	public void test() {
		MemberDto memberDto = new MemberDto();
		memberDto.setMemberId("woori2000");
		memberDto.setMemberPw("Woori2000");
		memberDto.setMemberEmail("wwoooorrii@gmail.com");
		memberDto.setMemberNickname("우리");
		
		boolean result = memberDao.updateMemberInfo(memberDto);
		assertTrue(result);
		
	}
}
