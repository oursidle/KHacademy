package condition2;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("작성 후 경과 시간(초): ");
		int second = sc.nextInt();
		sc.close();
		
		String upload;
		int minute;
		int hour;
		int day;
		int secMin = 60;
		int secHour = 3600;
		int secDay = 86400;
		
		//계산
		if(second < 10) {
			upload = "방금 전";
		}else if(second < secMin) {
			upload = second + "초 전";
		}else if(second < secHour) {
			minute = second / secMin;
			upload = minute + "분 전";
		}else if(second < secDay) {
			hour = second / secHour;
			upload = hour + "시간 전";
		}else {
			day = second / secDay;
			upload = day  + "일 전";
		}
		
		//출력
		System.out.println("업로드 시간: " +upload);
	}
}
