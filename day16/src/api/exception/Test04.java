package api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
//		Test02의 예제를 RuntimeException으로 처리해 코드 줄여보기
		
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
//		}catch(RuntimeException e){
		}catch(Exception e){//예외의 아버지(필살기 클래스)
//		}catch(Throwable e){//예외의 할아버지(error까지 예외처리를 해버리므로 사용 X)
			//무언가 문제가 생겼을 때
			System.err.println("프로그램 오류 발생");
		}
	}
}
