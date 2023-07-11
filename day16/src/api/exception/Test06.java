package api.exception;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("오늘 날짜를 입력하세요(yyyy-mm) : ");
			String date = sc.nextLine();

			String date1 = date.substring(0,4);
			String date2 = date.substring(5,7);
			int year1 = Integer.parseInt(date1);
			int month1 = Integer.parseInt(date2);
			
			if(year1 < 1900) {
				throw new Exception("1900년 이후로 입력하세요.");
			}
			if(month1 < 1 || month1 > 12) {
				throw new Exception("1월-12월 사이로 입력하세요");
			}
			if(year1 <= 0 || month1 <= 0) {
				throw new Exception("올바른 숫자를 입력하세요");
			}
			
			System.out.print("생년월일을 입력하세요(yyyy-mm) : ");
			String birth = sc.nextLine();
			sc.close();
			
			String birth1 = birth.substring(0,4);
			String birth2 = birth.substring(5,7);
			int year2 = Integer.parseInt(birth1);
			int month2 = Integer.parseInt(birth2);
			
			int koreanAge = year1 - year2 + 1;
			System.out.println("한국나이: " + koreanAge);
			
			int yearMonth1 = (year1 * 12 + month1);
			int yearMonth2 = (year2 * 12 + month2);
			int americanAge = (yearMonth1 - yearMonth2) / 12;
			
			if(year2 < 1900) {
				throw new Exception("1900년 이후로 입력하세요.");
			}
			if(month2 < 1 || month2 > 12) {
				throw new Exception("1월-12월 사이로 입력하세요");
			}
			if(yearMonth1 < yearMonth2) {
				throw new Exception("현재의 날짜로 입력하세요.");
			}
			if(year2 <= 0 || month2 <= 0) {
				throw new Exception("올바른 숫자를 입력하세요");
			}
			
			System.out.println("만나이: " + americanAge);
			
		}catch(Exception e) {
			if(e.getMessage() == null) {
				System.out.println("입력 형식에 맞게 입력하세요.");
			}else {
				System.err.println(e.getMessage());
			}
		}
	}
}