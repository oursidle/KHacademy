package date3;

public class Test07 {
	public static void main(String[] args) {
		//윤년 계산기 프로그램
		
		//입력
		int year = 2000;
		
		//계산
		//[1] 4의 배수면 윤년(include condition)
		//[2] 100의 배수가 아니여야 함(exclude condition)
		//[3] 400의 배수면 윤년(include condition)
		//boolean leapYear = 3 || 2 && 1;
		boolean is4 = year % 4 == 0;
		boolean isNot100 = year % 100 != 0;
		//boolean inNot100 = !(year % 100 == 0); ->이것도 맞는 방법
		boolean is400 = year % 400 == 0;
		
		boolean leapYear = is400 || is4 && isNot100; 
		
		//출력
		System.out.println(leapYear);
	}
}
