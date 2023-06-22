package condition;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출생년도 4자리 입력: ");
		int birth = sc.nextInt();
		
		System.out.print("국밥 주문 개수 입력: ");
		int count = sc.nextInt();
		
		sc.close();
		
		int year = 2023;
		int price = 7500;
		
		
		//계산
		int age = year - birth + 1;
		int total = price * count;
		int discount;
		
		if(age >= 65) {
			discount = total * 30 / 100;
		} else {
			discount = 0;
		}
		int result = total - discount;
		
		
		//출력
		System.out.println("나이: " + age + "세");
		System.out.println("결제 금액: " + result + "원");
	}
}
