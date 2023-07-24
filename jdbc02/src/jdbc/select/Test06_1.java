package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.MemberDto;
import jdbc.mapper.MemberMapper;
import jdbc.util.JdbcUtils;

public class Test06_1 {
	public static void main(String[] args) {
		//로그인 프로그램
		//= SQL 구문: select * from member where member_id = ? (권장)
		//= SQL 구문: select * from member where member_id = ? and member_pw = ? (비추천)
		//= Primary key로 항목을 조회하는 것을 단일 조회라고 함
		//= 모든 테이블은 단일 조회가 가능해야 함
		//= 단일조회는 결과가 없거나 한 개임
		//회원 목록-List<MemberDto> , 회원 상세- MemberDto
		
		//데이터
		String memberId = "testuser1";
		String memberPw = "testuser1!";
		
		//DB 처리
//		MemberHelper helper = new MemberHelper();
//		Boolean result = helper.login(memberId, memberPw);
		
//		System.out.println("로그인 결과 = " + result);
	}
}
