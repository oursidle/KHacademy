package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MemberDto dto = new MemberDto();
		dto.setMemberId(sc.nextLine());
		dto.setMemberNickname(sc.nextLine());
		dto.setMemberContact(sc.nextLine());
		dto.setMemberEmail(sc.nextLine());
		dto.setMemberBirth(sc.nextLine());
		sc.close();
		
		MemberDao dao = new MemberDao();
		boolean result = dao.updateMemberInfo(dto);
		
		if(result ) {
			System.out.println("변경 완료");
		}else {
			System.out.println("회원 번호가 없습니다");
		}
	}
}
