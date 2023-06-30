package array3;

import java.util.Random;

public class Test06 {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int size = 5;
		
		int[][] bingoList = new int[size][size];
		
		for(int i=1; i <= size*size; i++) {
			int j = r.nextInt(size);
			int k = r.nextInt(size);
			
			if(bingoList[j][k] == 0) {
				bingoList[j][k] = i;
			}else {
				i --;
			}

			
		//출력
		for(int j=0; j < bingoList[0].length; j++) {
			for(int k=0; k < bingoList[1].length; k++) {
				System.out.print(bingoList[j][k] + "\t");
			}
			System.out.println();
			System.out.println();
		}
	}
}
