package array3;

import java.util.Random;

public class Test05 {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int[][] diceList = new int[6][5];
		int[] totalList = new int[diceList.length];
		
		int count = 0;
		for(int k=0; k < diceList.length; k++) {
			for(int i=0; i < diceList[1].length; i++) {
				diceList[k][i] = r.nextInt(6)+1;
				System.out.println((k+1) + "- " + (i+1) + " 결과: " + diceList[k][i]);
				 count += diceList[k][i];
				}
			System.out.println("------------------");
			}
		
		double avg = (double)count / (diceList[0].length + diceList[1].length);
		
		System.out.println("***평균: " + avg + " ***");
	}
}
