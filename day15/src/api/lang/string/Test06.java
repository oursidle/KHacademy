package api.lang.string;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String start = "바나나";
		System.out.println("쿵쿵따 게임 시-작!");
		
		
//		if(word.length() != 3) {
//			System.out.println("게임 오버!");
//		}else if(start.charAt(2) != word.charAt(2)) {
//			System.out.println("게임 오버!");
//		}else {
//			System.out.println("쿵쿵따!");
//		}
		
		
		while(true) {
			System.out.println(start);
			String word = sc.nextLine();
			
			boolean condition1 = word.length() == 3;
			boolean condition2 = start.charAt(2) == word.charAt(0);
			if(condition1 && condition2) {
				System.out.println("쿵쿵따!");
				start = word;
			}else {
				System.out.println("게임 오버!");
				break;
			}
		}
		sc.close();
	}
}
