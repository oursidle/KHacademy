package api.lang.string;

import java.util.Scanner;

public class Test04_1 {
	//블랙리스트 방식
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사용할 닉네임을 입력하세요: ");
		String name = sc.nextLine();
		sc.close();
		
		if(name.length() < 2 && name.length() > 10) {
			System.out.println("닉네임은 2자 이상 10자 이하로 설정하세요.");
		}else if (name.contains("운영자")) {
				System.out.println("닉네임에 \'운영자\'는 포함될 수 없습니다.");
		}else {
			System.out.println("닉네임 설정이 완료되었습니다.");
		}
	}
}
