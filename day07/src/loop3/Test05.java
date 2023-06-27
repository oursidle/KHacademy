package loop3;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int set = 1000000;
		int count = 0;
		
		System.out.println("**게임 시작**");
		System.out.println("=모래는 " + set + "개=");
		System.out.println("<0~9 숫자를 입력>");
		
		while(true) {
			System.out.print("입력: ");
			int num = sc.nextInt();
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
