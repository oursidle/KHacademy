package com.kh.spring17;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring17.dto.MemberDto;
import com.kh.spring17.vo.MemberComplexSearchVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class MemberComplexSearchTest {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		MemberComplexSearchVO vo = new MemberComplexSearchVO();
//		vo.setMemberId("test");
//		vo.setMemberNickname("테스트");
//		vo.setMemberEmail("test");
//		vo.setMemberBirth("2023-09-01");
//		vo.setMemberPointMin(200);
//		vo.setMemberPointMax(400)
		vo.setMemberJoinBegin("2023-01-01");
		vo.setMemberJoinEnd("2023-12-31");
		
		List<MemberDto> list = sqlSession.selectList("member.complexSearch", vo);
		log.debug("검색 결과 = {}개", list.size());
		for(MemberDto dto : list) {
			log.debug("dto = {}", dto);
		}
	}
}
