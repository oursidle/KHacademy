package condition;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		int year = 2023;
		
		System.out.print("출생년도 4자리를 입력하세요: ");
		int birth = sc.nextInt();
		sc.close();
		
		
		//계산
		int age = year - birth + 1;
		
		
		//출력
		if(age == 19) {
			System.out.println("이벤트 대상입니다.");
		}else {
			System.out.println("이벤트 대상이 아닙니다.");
		}
	}
}
