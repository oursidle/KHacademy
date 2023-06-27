package loop3;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int count = 0;
		
		System.out.println("*프로그램 시작*");
		
		while(true) {
			System.out.print("숫자 입력: ");
			int num = sc.nextInt();
			
			if(num == 0) {
				System.out.println("*프로그램 종료*");
				break;
			}else {
				total += num;
				count ++;
			}
		}
		sc.close();

		double avg = (double)total / count;
		
		System.out.println("합계: " + total);
		System.out.println("평균: " + avg);
	}
}
