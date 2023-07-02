package loop3;

import java.util.Scanner;

public class Test05_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int set = 100;
		int count = 0;
		
		System.out.println("**게임 시작**");
		System.out.println("=모래는 " + set + "개=");
		System.out.println("<0~9 숫자를 입력>");
		
		while(true) {
			System.out.print("입력: ");
			int num = sc.nextInt();
			
			//입력한 숫자가 범위 밖일 때의 처리
			//두 번째 방법
			//원하는 경우가 아닐 때에는 처음으로 이동
		//if(num < 1 || num > 9) {
			if(!(num >= 1 && num <= 9)) {
				continue;//처음으로 이동
			}
			
			count ++;
			set -= num;
			
			if(set <= 0) {
				System.out.println("**게임 오버**");
				break;
			}
		}
		sc.close();
		
		System.out.println("< " + count + "번 도전함 >");
	}
}
