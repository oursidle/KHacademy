package api.exception;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("생년월일을 입력하세요(yyyy-mm-dd).");
			String birth = sc.nextLine();
			sc.close();
			
			//substring: 범위 내 문자열 자르기
			String year = birth.substring(0,4);
			String month = birth.substring(5,7);
			String day = birth.substring(8,10);
			
			//int형으로 바꿔 앞에 0이 나올 시 제거될 수 있도록 함
			int birthYear = Integer.parseInt(year);
			int birthMonth = Integer.parseInt(month);
			int birthDay = Integer.parseInt(day);
			
			System.out.println("출생년도: " + birthYear);
			System.out.println("출생월 " + birthMonth);
			System.out.println("출생일: " + birthDay);
		}catch(StringIndexOutOfBoundsException e){
			//플랜 B-1 : 입력 길이가 짧을 때
			System.out.println("입력 형식에 맞게 작성해주세요.");
		}catch(NumberFormatException e){
			//플랜 B-2 : 숫자 변환이 안 될 때
			System.out.println("숫자로 입력해주세요.");
		}
	}
}
