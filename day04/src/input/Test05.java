package input;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		int tteok = 3000;
		int fried = 500;
		int sundae = 2000;
		int rate = 10;
		
		System.out.println("<주문 정보>");
		System.out.print("떡볶이(3000원) 주문 개수: ");
		int tteokCount = sc.nextInt();
		System.out.print("튀김(500원) 주문 개수: ");
		int friedCount = sc.nextInt();
		System.out.print("순대(2000원) 주문 개수: ");
		int sundaeCount = sc.nextInt();
		
		sc.close();
		
		
		//계산
		int tteokPrice = tteok * tteokCount;
		int friedPrice = fried * friedCount;
		int sundaePrice = sundae * sundaeCount;
		
		int total = tteokPrice + friedPrice + sundaePrice;
		int discount = total * rate / 100;
		int totalPrice = total - discount;
		
		
		//출력
		System.out.println("<결제 정보>");
		System.out.println("총 금액: " + total + "원");
		System.out.println("- 할인 금액(10%): " + discount + "원");
		System.out.println("=> 결제 금액: " + totalPrice + "원");
	}
}
