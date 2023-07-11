package api.time;

import java.time.LocalDate;
import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("기념일 입력(yyyy-MM-dd): ");
		String input = sc.nextLine();
		sc.close();

		LocalDate days = LocalDate.parse(input);
		
		LocalDate after100 = days.plusDays(100L);
		LocalDate after200 = days.plusDays(200L);
		LocalDate after300 = days.plusDays(300L);
		LocalDate afterYear = days.plusYears(1L);
		LocalDate after2Year = days.plusYears(2L);
		LocalDate after10Year = days.plusYears(10L);
		
		System.out.println("100일: " + after100);
		System.out.println("200일: " + after200);
		System.out.println("300일: " + after300);
		System.out.println("1주년: " + afterYear);
		System.out.println("2주년: " + after2Year);
		System.out.println("10주년: " + after10Year);
	}
}
