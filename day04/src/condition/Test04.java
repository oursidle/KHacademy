package condition;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("예정 월: ");
		int month = sc.nextInt();
		
		System.out.print("기간(일): ");
		int days = sc.nextInt();
		
		System.out.print("인원수: ");
		int people = sc.nextInt();
		
		sc.close();
		
		int price = 100000;
		int discount;
		
		
		//계산
		int total = people * price * days;
		boolean summer = month >= 6 && month < 9;
		
		if (summer) {
			discount = total * 25 / 100;
		} else {
			discount = 0;
		}
		
		int result = total - discount;
		
		
		//출력
		System.out.println("정상사: " + total + "원");
		System.out.println("할인 금액: " + discount + "원");
		System.out.println("판매가: " + result + "원");
	}
}
