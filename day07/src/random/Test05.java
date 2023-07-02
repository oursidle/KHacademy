package random;

import java.util.Random;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("***게임 시작***");
		
		int right = 0;
		int wrong = 0;
		int count = 3;
		
		for(int i=0; i < 10; i++) {
			int dan = r.nextInt(8) + 2;
			int times = r.nextInt(9) + 1;
			
			System.out.print(dan + " X " + times + " = ");
			
			int result = sc.nextInt();
			
			if(result == dan * times) {
				//System.out.println("정답");
				right ++;
			}else {
				//System.out.println("오답");
				wrong ++;
				count --;
				if(count == 0) {
					System.out.println("===실패===");
					break;
				}
			}
		}
		sc.close();
		
		System.out.println("***게임 끝***");
		System.out.println("<정답 개수: " + right + " >"); 
		System.out.println("<오답 개수: " + wrong + " >"); 
	}
}
