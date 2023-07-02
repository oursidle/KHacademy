package condition3;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("연도: ");
		int year = sc.nextInt();
		System.out.print("월: ");
		int month = sc.nextInt();
		sc.close();
		
		
		//계산
		int days;
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			days = 31;
			break;
		case 4: case 6: case 9: case 11:
			days = 30;
			break;
		default: 
			boolean leapYear = year % 200 == 0 || year % 4 == 0 && year % 100 != 0;
			if(leapYear) {
				days = 29;
			}else {
				days = 28;
			}
			break;
		}
			
		
		//출력
		System.out.println(days + "일");
		
		
		
		 
	}
}
