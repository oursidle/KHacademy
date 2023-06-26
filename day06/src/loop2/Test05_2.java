package loop2;

import java.util.Scanner;

public class Test05_2 {
	public static void main(String[] args) {
		//구구단 게임 결과
		
		Scanner sc =  new Scanner(System.in);
		System.out.print("단 입력: ");
		int dan = sc.nextInt();
		
		int countPlus = 0;
		int countMinus = 0;
		
		System.out.println(dan + "단 결과: ");
		for(int i=1; i <= 9; i++) {
			System.out.print(dan + " X " + i + " = ");
			int times = sc.nextInt();
			
			if(times == dan * i) {
				System.out.println("정답!");
				countPlus ++;
			}else {
				System.out.println("오답!");
				countMinus ++;
			}
		}
		
		sc.close();
		
		System.out.println("<맞힌 개수: " + countPlus + " >");
		System.out.println("<틀린 개수: " + countMinus + " >");
	}
}
