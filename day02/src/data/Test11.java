package data;

public class Test11 {
	public static void main(String[] args) {
		//입력
		int gameStartHour = 9 , gameStartMin = 40;
		int gameEndHour = 12 , gameEndMin = 25;
		
		//계산
		int startTime = gameStartHour * 60 + gameStartMin;
		int endTime = gameEndHour *60 + gameEndMin;
		
		int useTime = endTime - startTime;
		//System.out.println(useTime);
		
		int useHour = useTime / 60;
		int useMin = useTime % 60;
		
		//이용시간 출력
		System.out.println(useHour);
		System.out.println(useMin);
		
		
		//입력
		int price = 1200;
		int pricePerMin = price / 60;
		
		//계산
		int usePrice = useTime * pricePerMin;
		
		//이용요금 출력
		System.out.println(usePrice);
	}
}