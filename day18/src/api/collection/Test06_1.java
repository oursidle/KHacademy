package api.collection;

import java.util.Scanner;
import java.util.ArrayList;

public class Test06_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("자바");
		
		while(true) {
			String start = list.get(list.size()-1);//마지막 기록을 추출
			
			System.out.println(start);
			String word = sc.nextLine();
			
			if(word.matches("^[가-힣]{2,6}$") == false) {
				break;
			}else if(start.charAt(start.length()-1) != word.charAt(0)) {
				break;
			}else {
				list.add(word);
			}
		}
		sc.close();
		System.out.println("게임 오-버!");
		
		System.out.println("<기록>");
		for(String total : list) {
			System.out.println("->" + total);
		}
	}
}
