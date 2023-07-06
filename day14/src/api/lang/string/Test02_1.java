package api.lang.string;

import java.util.Scanner;

public class Test02_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호를 입력하세요: ");
		String pw = sc.nextLine();
		sc.close();
		
		boolean isLogin = id.equalsIgnoreCase("khacademy") && pw.equals("student1234");
//		대문자 / 소문자 변환하여 비교
//		boolean isLogin = id.toLowerCase().equals("khacademy") && pw.equals("student1234");
		
		if(isLogin) {
			System.out.println("로그인 성공!");
		}else {
			System.out.println("로그인 실패!");
		}
	}
}
