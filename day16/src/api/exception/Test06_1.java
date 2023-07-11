package api.exception;

import java.time.LocalDate;
import java.util.Scanner;

public class Test06_1 {
	public static void main(String[] args) {
		//[1] 입력이 너무 짧은 경우 ->감지 가능
		//[2] 숫자 변환이 올바로 되지 않는 경우 -> 감지 가능
		//[3] 생년월일을 미래의 값으로 입력하는 경우 -> 감지 불가능
		//[4] 월을 1~12로 입력하지 않은 경우 -> 감지 불가능
		//[5] 연도가 1900 미만인 경우 -> 감지 불가능
		
		try {
			//입력
			Scanner sc = new Scanner(System.in);
			
			System.out.print("출생년월 입력(yyyy-mm) : ");
			String input = sc.nextLine();
			sc.close();
			
			int currentYear = LocalDate.now().getYear();
			int currentMonth = LocalDate.now().getMonthValue();
			
			//계산
			String[] part = input.split("-");//'-'를 구분자(delimiter)로 하여 분해
			int year = Integer.parseInt(part[0]);
			int month = Integer.parseInt(part[1]);
			if(year > currentYear || year == currentYear && month > currentMonth) {
				//연/월이 미래일 경우
				throw new Exception("미래의 시간은 입력할 수 없습니다.");
			}
			if(year < 1900) {
				//연도가 1900년 미만이라면
				throw new Exception("1900년 미만은 입력할 수 없습니다.");
			}
			if(month < 1 || month > 12) {
				//월이 1~12가 아니라면
				throw new Exception("월은 1~12 안에서 입력할 수 있습니다.");
			}
			
			//한국나이 계산
			int koreanAge = 2023 - year + 1;
			
			//만나이 계산
			//= 시간은 무조건 작은 단위로 변환해서 계산한다
			//= 개월 수 / 12
			int totalMonth = (currentYear - year) * 12 + (currentMonth - month);
			int globalAge = totalMonth / 12;
			
			//출력
			System.out.println("한국나이: " + koreanAge + "살");
			System.out.println("만나이: " + globalAge + "살");
		}catch(Exception e) {
			if(e.getMessage() == null) {
				System.err.println("프로그램 오류 발생");
			}else {
				System.out.println("오류: " + e.getMessage());
			}
		}
	}
}