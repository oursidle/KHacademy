package api.lang.string;

import java.util.Scanner;

public class Test08_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] filter = new String[] {
				"수박씨", "신발끈", "개나리", "십장생", " 시베리아", "주옥", "조카", "게불"
		};
		
		String chat = sc.nextLine();
		String star = "*";

		for(int i=0; i < filter.length; i++) {
			int count = filter[i].length();
			chat = chat.replace(filter[i], star.repeat(count));
		}
		sc.close();
		System.out.println(chat);
	}
}
