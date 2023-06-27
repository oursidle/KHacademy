package loop3;

import java.util.Random;

public class Test02 {
	public static void main(String[] args) {
		//while의 활용
		//-  주사위가 6이 나올 때까지 던지는 코드
		
		Random r = new Random();
		
		while(true) {//=for(;;){
			int dice = r.nextInt(6) + 1;
			System.out.println(dice);
			
			//만약 주사위의 값이 6이라면 반복을 종료하도록 조건을 설정(필수)
			if(dice == 6) {
				break;
			}
		}
		
	}
}
