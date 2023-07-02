package loop2;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int count = 0;
		
		System.out.print("공부한 일수 입력: ");
		int day = sc.nextInt();
		
		for(int i=1; i <= day; i++) {
			System.out.print(i + "일차 공부(시간): ");
			int hour = sc.nextInt();
			System.out.print(i + "일차 공부(분): ");
			int minute = sc.nextInt();
			
			int time = hour * 60 + minute;
			total += time;
			
			count ++;
		}
		sc.close();
		
		int hour = total / 60;
		int minute = total % 60;
		
		int avg = total / count;
		int hourAvg = avg / 60;
		int minAvg = avg % 60;
	
		
		System.out.println("총 공부 시간: " + hour + "시간 " + minute + "분");
		System.out.println("일 평균 공부 시간: 약 " + hourAvg + "시간 " + minAvg + "분");
	}
}