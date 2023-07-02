package random;

import java.util.Random;

public class Test04_1 {
	public static void main(String[] args) {
		//만약 더블일 경우 한 턴을 더 던지게 하려면?
		//= 반복 횟수를 증가시키려면?
		//= 재추첨
		
		Random r = new Random();
		
		int size = 100;
		int count = 0;
		
		for(int i=0; i < size; i++) {
			int dice1 = r.nextInt(6) + 1;
			int dice2 = r.nextInt(6) + 1;
			
			if(dice1 == dice2) {
				count ++;
				//반복문을 1회 증가시키는 코드를 추가
				//따라서 밖에서 반복을 한 번 더 던지게 만들기 위해 i를 하나 줄임
				i --;
			}else {}
		}
		System.out.println("**더블 개수: " + count);
		
		double avg = (double)count / size * 100.0;
		System.out.println("**더블 확률: " + avg + " %");
	}
}
