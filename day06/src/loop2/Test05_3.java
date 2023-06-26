package loop2;

import java.util.Scanner;

public class Test05_3 {
	public static void main(String[] args) {
		//구구단 게임 - 콤보 쌓기
		
		Scanner sc =  new Scanner(System.in);
		System.out.print("단 입력: ");
		int dan = sc.nextInt();
		
		int combo = 0;
		
		System.out.println(dan + "단 결과: ");
		for(int i=1; i <= 9; i++) {
			System.out.print(dan + " X " + i + " = ");
			int times = sc.nextInt();
			
			if(times == dan * i) {
				System.out.println("정답!");
				combo ++;
				System.out.println("COMBO!! X " + combo);
			}else {
				System.out.println("오답!");
				combo = 0;
			}
		}
		
		sc.close();
	}
}
