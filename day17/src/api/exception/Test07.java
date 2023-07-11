package api.exception;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
//		예외를 처리하며 발생하는 문제점을 추가적으로 해결
//		[1] 예외 처리하기 전 메세지(stack trace)를 보고 싶음
//		-> e.printStackTrace();
//		-> 개발 완료 후 삭제하거나 다른 코드로 치환
//		[2] 예외 처리 중 발생하는 경고를 없애고 싶음
		
		try {
			Scanner sc = new Scanner(System.in);
			
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
			
			sc.close();
			
			int price = money / people;//1인당 정산금액
			int remain = money % people;//자투리 금액
			
			System.out.println("1인당 지불 금액: " + price + "원");
			System.out.println(remain + "원은 지원!");
		}catch(Exception e){
			e.printStackTrace();//예외 처리를 하지 않은 것처럼 스택 추적 결과를 출력
		}
	}
}
