package array;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] data = new String[5];
		
		System.out.println("**나라 이름 입력:");
		for(int i=0; i < data.length; i++) {
			data[i] = sc.next();
		}
		sc.close();
		
		System.out.println("**나라 이름 출력:");
		for(int i=0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
