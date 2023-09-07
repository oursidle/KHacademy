package array;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] data = new double[5];
		
		System.out.println("**실수 5개 입력:");
		for(int i=0; i < data.length; i++) {
			data[i] = sc.nextDouble();
		}
		sc.close();
		
		System.out.println("**실수 5개 출력:");
		for(int i=0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
