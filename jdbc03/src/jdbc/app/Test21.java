package jdbc.app;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test21 {
	public static void main(String[] args) {
		
		String memberId = "testuser1";
		
		MemberDao dao = new MemberDao();
		MemberDto dto = dao.selectOne(memberId);
		
		if(dto == null) {
			System.out.println("해당 아이디의 고객 정보가 없습니다");
		}else {
			System.out.println("[" + dto.getMemberId() + " 아이디의 고객 정보입니다]");
			System.out.println("비밀번호: " + dto.getMemberPw());
			System.out.println("닉네임: " + dto.getMemberNickname());
			System.out.println("생년월일: " + dto.getMemberBirth());
			System.out.println("이메일: " + dto.getMemberEmail());
			System.out.println("연락처: " + dto.getMemberContact());
			System.out.println("등급: " + dto.getMemberLevel());
			System.out.println("포인트: " + dto.getMemberPoint());
			System.out.println("가입일: " + dto.getMemberJoin());
		}
	}
}
