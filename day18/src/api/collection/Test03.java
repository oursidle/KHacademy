package api.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		
		while(true) {
			System.out.print("나라 이름: ");
			String nation = sc.nextLine();
			
			if(!list.contains(nation)) {
				list.add(nation);
			}else {
				sc.close();
				break;
			}
		}
		System.out.println("게임 오-버!");
		System.out.print("입력된 나라 개수: ");
		System.out.println(list.size());
	}
}
