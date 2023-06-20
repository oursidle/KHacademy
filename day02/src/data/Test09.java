package data;

public class Test09 {
	public static void main(String[] args) {
		//입력
		int money = 2000000;
		int year = 30;
		
		//계산
		int month = year * 12;
		int total = money * month;
		
		//출력
		System.out.println(total );
		
		
		//입력2
		long money2 = 10000000L;
		int year2 = 50;
		
		//계산2
		int month2 = year2 * 12;
		long total2 = money2 * month2;
		
		//출력2
		System.out.println(total2);
	}
}
