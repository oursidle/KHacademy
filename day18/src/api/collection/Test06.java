package api.collection;

import java.util.Scanner;
import java.util.ArrayList;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		
		String korean = "^[가-힣]{2,6}$";
	
		System.out.println("끝말잇기 게임 시-작!");
		String start = "자바";
		System.out.println(start);
		
		while(true) {
			String word = sc.nextLine();
			
			if(word.length() >= 2 || word.length() <= 6) {
				if(word.matches(korean)) {
					if(!word.isBlank()) {
						if(start.charAt(start.length()-1) == word.charAt(0)) {
							list.add(word);
							start = word;
						}else {
							sc.close();
							break;
						}
					}else { 
						sc.close();
						break;
					}
				}else {
					sc.close();
					break;
				}
			}else {
				sc.close();
				break;
			}
		}
		System.out.println("게임 오-버!");
		
		System.out.print("입력된 단어:");
		System.out.println(list);
		
	}
}
