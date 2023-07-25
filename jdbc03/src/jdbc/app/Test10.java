package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test10 {
	public static void main(String[] args) {
		//비밀번호 변경 프로그램
		Scanner sc = new Scanner(System.in);
		
		MemberDto dto = new MemberDto();
		dto.setMemberId(sc.nextLine());
		dto.setMemberPw(sc.nextLine());
		sc.close();
		
		MemberDao dao = new MemberDao();
		boolean result = dao.updateMemberPassword(dto);
		
		if(result) {
			System.out.println("변경 완료");
		}else {
			System.out.println("회원 번호가 존재하지 않음");
			
		}
	}
}
