package random;

import java.util.Random;

public class Test03_1 {
	public static void main(String[] args) {
		//경우의 수: 발생할 수 있는 모든 상황
		//- 윷이 1개 : 경우의 수 2가지
		//- 윷이 2개 : 경우의 수 4가지
		//- 윷이 3개 : 경우의 수 8가지
		//- 윷이 4개 : 경우의 수 16가지
		
		Random r = new Random(); 
		
		int move = 0;
		int game = r.nextInt(16);
		
		switch(game){
		case 0:
			System.out.println("빽도"); 
			break;
		case 1,2,3:
			System.out.println("도");
			break;
		case 4,5,6,7,8,9:
			System.out.println("개");
			break;
		case 10,11,12,13:
			System.out.println("걸");
			break;
		case 14:
			System.out.println("윷");
			break;
		case 15:
			System.out.println("모");
			break;
		}
	}
}