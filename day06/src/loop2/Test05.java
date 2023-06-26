package loop2;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		// 구구단 게임 정답
		
		Scanner sc =  new Scanner(System.in);
		System.out.print("단 입력: ");
		int dan = sc.nextInt();
		sc.close();
		
		System.out.println(dan + "단 결과: ");
		
		for(int i=1; i <= 9; i++) {
			int times = dan * i;
			System.out.println(dan + "X " + i + " = " + times);
		}
	}
}
