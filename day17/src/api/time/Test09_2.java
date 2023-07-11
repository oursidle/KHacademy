package api.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test09_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("기념일 입력: ");
		String input = sc.nextLine();
		sc.close();

//		LocalDate days = LocalDate.parse(input, 해석기준);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("y년 M월 d일");
		LocalDate date = LocalDate.parse(input, fmt);
		
		long[] days = new long[] {
				100L, 200L, 300L, 365L, 400L, 500L, 600L, 700L,
				365*2L, 800L, 900L, 1000L, 365*3L, 365*4L, 365*5L ,365*6L ,365*7L,
				365*8L ,365*9L ,365*10L
		};
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("y년 M월, d일 E요일");
		for(int i=0; i < days.length; i++) {
			LocalDate future = date.plusDays(days[i]);
			System.out.println(days[i] + "일 뒤 = " + future.format(fmt2));
		}
	}
}
