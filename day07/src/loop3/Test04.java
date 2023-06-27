package loop3;

import java.util.Random;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int set = 1000;
		int count = 0;
		
		System.out.println("**게임 시작**");
		System.out.println("< 1~" + set + "까지의 숫자 중 맞춰보세요 >");

		for(int i=0; i < set; i++) {
			int num = r.nextInt(set) + 1;
			
			while(true) {
				System.out.print("숫자 입력: ");
				int user = sc.nextInt();
				count ++;
				
				if(num == user) {
					System.out.println("==정답입니다==");
					break;
				}else if(num > user) {
					System.out.println("<업>");
				}else {
					System.out.println("<다운>");
				}
			}
			break;
		}
		sc.close();
		
		System.out.println("**게임 종료**");
		System.out.println("< " + count + " 번만에 맞추셨습니다 >" );
	}
}
