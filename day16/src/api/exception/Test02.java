package api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//예외 처리 구문
//		try {
//			플랜 A 코드
//		}catch{
//			플랜 B 코드
//		}
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("금액: " );
			int money = sc.nextInt();
			
			System.out.print("인원: ");
			int people = sc.nextInt();
			
			sc.close();
			
			int price = money / people;//1인당 정산금액
			int remain = money % people;//자투리 금액
			
			System.out.println("1인당 지불 금액: " + price + "원");
			System.out.println(remain + "원은 지원!");
		}catch(ArithmeticException e){
			//플랜 B-1. 인원수를 0명으로 입력했을 때
			System.err.println("인원수는 0일 수 없습니다.");
		}catch(InputMismatchException e){
			//플랜 B-2. 입력을 잘못 했을 때
			System.err.println("숫자(정수)만 입력 가능합니다.");
			
			
		}
	}
}
