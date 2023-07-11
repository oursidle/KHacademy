package api.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test09_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("기념일 입력: ");
		String input = sc.nextLine();
		sc.close();

//		LocalDate days = LocalDate.parse(input, 해석기준);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("y년 M월 d일");
		LocalDate date = LocalDate.parse(input, fmt);
		
		LocalDate after100 = date.plusDays(100L);
		LocalDate after200 = date.plusDays(200L);
		LocalDate after300 = date.plusDays(300L);
		LocalDate afterYear = date.plusYears(1L);
		LocalDate after2Year = date.plusYears(2L);
		LocalDate after10Year = date.plusYears(10L);
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("y년 M월 d일 E요일");
		System.out.println("100일: " + after100.format(fmt2));
		System.out.println("200일: " + after200.format(fmt2));
		System.out.println("300일: " + after300.format(fmt2));
		System.out.println("1주년: " + afterYear.format(fmt2));
		System.out.println("2주년: " + after2Year.format(fmt2));
		System.out.println("10주년: " + after10Year.format(fmt2));
	}
}
