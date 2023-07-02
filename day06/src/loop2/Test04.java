package loop2;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		//소수 탐색 프로그램
		//소수는 나누기가 어려운 숫자를 일컬음
		//즉, 1이나 자기 자신을 제외하고 나누어 떨어지는 수가 없다는 듯
		//따라서 1이나 자기 자신을 제외하고 나누어 떨어지는 수가 있다는 그 수는 소수가 아님
		
		
		//입력
		Scanner sc  = new Scanner(System.in);
		System.out.print("2이상의 수 입력: " );
		int num = sc.nextInt();
		sc.close();
		
		int count = 0;
		
		//계산
		for(int i=1; i <= num; i++) {	//i가 1 부터 자기 자신까지의 나머지를 구함
			if(num % i == 0) {	//i가 1 부터 자기 자신까지의 나머지를 구함
				count ++;
				}
			}
		
		//출력
		System.out.println("num = "+ num);
		System.out.println("count = " + count);
		
		if(count == 2) {	//count가 2(1과 자기 자신)이면 소수
			System.out.println(num + "은 소수");
		}else {
			System.out.println(num + "은 소수가 아님");
		}
		
	}
}
