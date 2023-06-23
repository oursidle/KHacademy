package loop;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		//(주의) 도구 생성은 한 번만 한다
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			int a = sc.nextInt();
		}
		
		sc.close();
	}
}
