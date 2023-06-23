package condition2;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		sc.close();

		int price;
		
		//계산
		if(age >= 65 || age < 8) {
			price = 0;
		}else if(age < 14) {
			price = 450;
		}else if(age < 20) {
			price = 720;
		}else {
			price = 1250;
		}
		
		
		//출력
		System.out.println("지하철 요금: " + price + " 원");
	}
}
