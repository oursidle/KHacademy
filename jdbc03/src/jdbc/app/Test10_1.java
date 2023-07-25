package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test10_1 {
	public static void main(String[] args) {
		//비밀번호 변경 프로그램
		Scanner sc = new Scanner(System.in);
		
		String memberId = sc.nextLine();
		String memberPw = sc.nextLine();
		String memberPwRe = sc.nextLine();
		
		if(memberPw.equals(memberPwRe)) {
			MemberDto dto = new MemberDto();
			dto.setMemberId(sc.nextLine());
			dto.setMemberPw(sc.nextLine());
			sc.close();
			
			MemberDao dao = new MemberDao();
			boolean result = dao.updateMemberPassword(dto);
			
			if(result) {
				System.out.println("비밀번호가 변경되었습니다");
			}else {
				System.out.println("존재하지 않는 아이디입니다.");
			}
		}else {
			System.out.println("비밀번호가 확인과 일치하지 않습니다");
		}
	}
}
