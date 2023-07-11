package api.exception;

import java.time.LocalDate;
import java.util.Scanner;

public class Test06_2 {
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
			
			if(!input.matches("^(19[0-9]{2}|20[0-9]{2})-(0[0-9]|1[0-2])$")) {
				//형식에 맞지 않으면
				throw new Exception("시간 형식이 맞지 않습니다.");
			}
			
			int currentYear = LocalDate.now().getYear();
			int currentMonth = LocalDate.now().getMonthValue();
			
			//계산
			String[] part = input.split("-");//'-'를 구분자(delimiter)로 하여 분해
			int year = Integer.parseInt(part[0]);
			int month = Integer.parseInt(part[1]);
			if(year > currentYear || year == currentYear && month > currentMonth) {
				throw new Exception("미래의 시간은 입력할 수 없습니다.");
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