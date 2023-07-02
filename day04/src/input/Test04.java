package input;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입실시간 입력 : ");
		int enter = sc.nextInt();

		System.out.print("퇴실시간 입력 : ");
		int leave = sc.nextInt();
		
		sc.close();
		
		
		//계산
		int enterHour = enter / 100;
		int enterMin = enter % 100;
		
		int leaveHour = leave / 100;
		int leaveMin = leave % 100;
		
		int enterTime = enterHour * 60 + enterMin;
		int leaveTime = leaveHour * 60 + leaveMin;
		
		int time = leaveTime - enterTime;
		
		int hour = time / 60;
		int minute = time % 60;
		
		
		//출력
		System.out.println("수업에 참여한 시간은 " + hour + "시간 "+ minute + "분 입니다.");	
	}
}
