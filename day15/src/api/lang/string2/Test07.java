package api.lang.string2;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		//회원가입 + 정규표현식 검사
		Scanner sc = new Scanner(System.in);
		
		String memberId = sc.nextLine();
		String memberPw = sc.nextLine();
		String memberName = sc.nextLine();
		sc.close();
		
		Member member = new Member(memberId, memberPw, memberName);
		member.show();
	}
}