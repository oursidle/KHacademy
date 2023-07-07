package api.lang.string;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] filter = new String[] {
				"수박씨", "신발끈", "개나리", "십장생", " 시베리아", "주옥", "조카", "게불"
		};
		
		String chat = sc.nextLine();

		for(int i=0; i < filter.length; i++) {
			chat = chat.replace(filter[i], "***");
		}
		sc.close();
		System.out.println(chat);
	}
}
