package date3;

import java.util.Calendar;

public class Test02 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		//입력
		int birth = 2003;
		int year = cal.get(Calendar.YEAR);
		
		//계산
		int age = year - birth + 1;
		boolean adult = age >= 20;
		
		//출력
		System.out.println(age);
		System.out.println(adult);
		
		//A부터 B 사이의 숫자 개수 구하는 공식 = B - A + 1
	}
}