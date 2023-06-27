package random;

import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int size = 100;
		int count = 0;
		
		for(int i=0; i < size; i++) {
			int dice1 = r.nextInt(6) + 1;
			int dice2 = r.nextInt(6) + 1;
			
			if(dice1 == dice2) {
				count ++;
			}else {}
		}
		System.out.println("**더블 개수: " + count);
		
		double avg = (double)count / size * 100.0;
		
		System.out.println("**더블 확률: " + avg + " %");
	}
}
