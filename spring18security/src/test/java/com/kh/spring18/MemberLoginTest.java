package com.kh.spring18;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring18.dao.SecureMemberDao;
import com.kh.spring18.dto.SecureMemberDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class MemberLoginTest {

	@Autowired
	private SecureMemberDao dao;
	
	@Test
	public void test() {
		//로그인 테스트
		SecureMemberDto dto = SecureMemberDto.builder()
				.memberId("hello1234").memberPw("password1234")
				.build();
		
		//Dao에서 이미 판정된 결과를 가져 옴
		SecureMemberDto target = dao.login(dto);
		log.debug("target ={}", target);
		
		assertNotNull(target);//target이 not null이라면 테스트 성공
		//Test에서만 아래의 코드 대신 위의 코드로 사용할 수 있음
		//Assertions.assertNotNull(target);
	}
}
