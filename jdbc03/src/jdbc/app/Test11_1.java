package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test11_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//회원 정보 수정
		String memerId = sc.nextLine();
//		String memberPw = sc.nextLine();
//		String memberPwRe = sc.nextLine();
		String memberNickname = sc.nextLine();
		String memberBirth = sc.nextLine();
		String memebrEmail = sc.nextLine();
		String memebrContact = sc.nextLine();
		sc.close();
		
		//비밀번호 DB 검사 및 비밀번호 일치 검사 들을 추가할 수 있음
		
		MemberDto dto = new MemberDto();
		dto.setMemberId(memerId);
		dto.setMemberNickname(memberNickname);
		dto.setMemberContact(memberBirth);
		dto.setMemberEmail(memebrEmail);
		dto.setMemberBirth(memebrContact);
		
		MemberDao dao = new MemberDao();
		boolean result = dao.updateMemberInfo(dto);
		
		if(result ) {
			System.out.println("변경 완료");
		}else {
			System.out.println("존재하지 않는 회원입니다");
		}
	}
}
