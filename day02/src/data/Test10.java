package data;

public class Test10 {
	public static void main(String[] args) {
		//시간은 가장 작은 단위로 변환하여 푼다
		
		//입력
		int yesterdayHour = 2 , yesterdayMin = 45;
		int todayHour = 1 , todayMin = 50;
		
		//계산
		int yesterdayTime = yesterdayHour * 60 + yesterdayMin;
		int todayTime = todayHour * 60 + todayMin;
		
		int time = yesterdayTime + todayTime;
		
		int hour = time / 60;
		int minute = time % 60;
		
		//출력
		System.out.println(hour);
		System.out.println(minute);
	}
}