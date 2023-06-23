package condition;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		//과속 단속 카메라
				
		//speed = 자동차 속도
		//fast = 과속한 속도
		//limitSpeed = 제한 속도
		//penalty = 기본 벌금
		//add = 추가 벌금
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("자동차 속도: ");
		int speed = sc.nextInt();
		System.out.print("과속한 속도: ");
		int fast = sc.nextInt();
		sc.close();
			
		int limitSpeed = 50;
		int penalty = 30000;
		int add = 10000;
		
		//계산
		int totalPenalty;
		if(speed + fast > limitSpeed) {
			totalPenalty = penalty + add * (fast / 10) ;
		}else {
			totalPenalty = 0;
		}
		
		
		//출력
		System.out.println("벌금: " + totalPenalty + "원");
		}
}
