package jdbc.app;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test04 {
	public static void main(String[] args) {
		
		MemberDto dto = new MemberDto();
		dto.setMemberId("testuser2");
		dto.setMemberPw("Testuser2!");
		dto.setMemberNickname("테스트유저2");
		dto.setMemberBirth("2010-07-24");
		dto.setMemberEmail("test1234@test.com");
		dto.setMemberContact("01023456789");
		
		MemberDao dao = new MemberDao();
		dao.insert(dto);
		
		System.out.println("등록 완료!");
	}
}
