package condition2;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("예정 월: ");
		int month = sc.nextInt();
		System.out.print("인원 수: " );
		int people = sc.nextInt();
		System.out.print("숙박 일: ");
		int days = sc.nextInt();
		sc.close();
		
		int price = 100000;

		
		//계산
		int rate;
		if(month == 3 || month == 4 || month == 5) {
			rate = 20;
		}else if(month == 6 || month == 7 || month == 8) {
			rate = 10;
		}else if(month == 9 || month == 10 || month == 11) {
			rate = 30;
		}else {
			rate = 5;
		}
		
		int total = people * days * price;
		int discount = total * rate / 100;
		int totalPrice = total - discount;
		
		
		//출력
		System.out.println("정상가: " + total + "원");
		System.out.println("할인율: " + rate + "%");
		System.out.println("할인 금액: " + discount + "원");
		System.out.println("최종 금액: " + totalPrice + "원");
	}
}
