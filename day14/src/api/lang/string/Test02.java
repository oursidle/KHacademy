package api.lang.string;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String idInfo = "khacademy";
		String pwInfo = "student1234";
		
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.nextLine();
		
		if(id.equals(idInfo)) {
			System.out.print("비밀번호를 입력하세요: ");
			String pw = sc.nextLine();
			
			if(pw.equals(pwInfo)) {
				System.out.println("로그인 성공!");
			}else {
				System.out.println("로그인 실패!");
			}
		}else {
			System.out.println("로그인 실패!");
		}
		sc.close();
	}
}
