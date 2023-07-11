package api.time;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Test10_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 시간(HH:mm): ");
		String input1 = sc.nextLine();
		System.out.print("종료 시간(HH:mm): ");
		String input2 = sc.nextLine();
		sc.close();
		
		LocalTime start = LocalTime.parse(input1);
		LocalTime end = LocalTime.parse(input2);
		
		Duration duration = Duration.between(start, end);
		long time = duration.getSeconds()	;
		
		long hour = time / (60 * 60);
		long minute = time / 60 % 60;
		
		int pricePerHour = 1000;
		float pricePerMinute = pricePerHour / 60f;
		float totalPrice = pricePerMinute * time;
		
		System.out.println("이용시간: " + hour + "시간 " + minute + "분");
		System.out.println("이용요금: " + (int)Math.floor(totalPrice) + "원");
		
		
	}
}
