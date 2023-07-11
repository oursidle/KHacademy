package api.time;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 시간(HH:mm): ");
		String input1 = sc.nextLine();
		System.out.print("종료 시간(HH:mm): ");
		String input2 = sc.nextLine();
		sc.close();
		
		int price = 1000;
		
		LocalTime start = LocalTime.parse(input1);
		LocalTime end = LocalTime.parse(input2);
		
		Duration duration = Duration.between(start, end);
		
		int hour = duration.toHoursPart();
		int minute = duration.toMinutesPart();
		
		int total = hour * price;
		
		System.out.println("이용시간: " + hour + "시간 " + minute + "분");
		System.out.println("이용요금: " + total + "원");
		
		
	}
}
