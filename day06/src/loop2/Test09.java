package loop2;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		
		int odd = 0;
		int even = 0;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		for(int i=1; i <= 10; i++) {
			System.out.print("숫자 입력" + "(" + i + ") : ");
			int num = sc.nextInt();
			if(num % 2 != 0) {
				odd ++;
			}else if(num % 2 == 0) {
				even ++;
			}else {}
			count += num;
		}
		sc.close();
		
		double  avg = count / 10.0;
		
		System.out.println("홀수 개수: " + odd);
		System.out.println("짝수 개수: " + even);
		System.out.println("전체 합계: " + count);
		System.out.println("전체 평균: " + avg);
	}
}
