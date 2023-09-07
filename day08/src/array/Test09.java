package array;

import java.util.Random;

public class Test09 {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int[] lottoList = new int[45];
		
		for(int i=0; i < 1000; i++) {
			int lotto = r.nextInt(45) + 1;
			lottoList[lotto-1] ++;
		}
		
		for(int i=0; i < lottoList.length; i++) {
			System.out.println( (i+1) + " 나온 횟수 = " + lottoList[i] );
		}
	}
}
