package api.exception;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
//		예외를 처리하며 발생하는 문제점을 추가적으로 해결
//		[1] 예외 처리하기 전 메세지(stack trace)를 보고 싶음
//		[2] 예외 처리 중 발생하는 경고를 없애고 싶음
//		-> finally 구문으로 해결 가능
//		-> 반드시 정리해야 하는 자원에 대한 코드를 작성
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("금액: " );
			int money = sc.nextInt();
			if(money < 0) {
				throw new Exception("금액이 음수일 수 없습니다.");
			}
			
			System.out.print("인원: ");
			int people = sc.nextInt();
			if(people < 0) {
				throw new Exception("인원은 음수일 수 없습니다.");
			}
			
			int price = money / people;//1인당 정산금액
			int remain = money % people;//자투리 금액
			
			System.out.println("1인당 지불 금액: " + price + "원");
			System.out.println(remain + "원은 지원!");
		}catch(Exception e){
			e.printStackTrace();//예외 처리를 하지 않은 것처럼 스택 추적 결과를 출력
		}finally {
			//플랜 A/B 중 어느 것이 실행되더라도 마지막에 반드시 실행되는 구문(선택)
			sc.close();
		}
	}
}
