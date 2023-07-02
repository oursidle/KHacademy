package array;

import java.util.Scanner;

public class Test05_1 {
	public static void main(String[] args) {
		//배열과 반복문
		//- ex: 3개의 숫자를 입력받아 출력, 합계 구하기
		//- 배열에서는 크기가 정해지면 자동으로 length라는 버튼이 생긴다
		
		int[] data = new int[3];
		//data -------> [ 0 ][ 0 ][ 0 ] (length = 3)
		System.out.println(data.length);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력:");
		for(int i=0; i < data.length; i++) {
			data[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.println("숫자 출력:");
		for(int i=0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
