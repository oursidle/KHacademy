package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("인원 수: ");
		int people = sc.nextInt();
		
		System.out.println("---------------------");
		
		ArrayList<String> list1 = new ArrayList<String>();
		for(int i=0; i < people; i++) {
			System.out.print("이름: ");
			String content = sc.next();
			list1.add(i, content);
		}
		
		System.out.println("---------------------");
		
		ArrayList<String> list2 = new ArrayList<String>();
		for(int i=0; i < people; i++) {
			System.out.print("항목: ");
			String content = sc.next();
			list2.add(i, content);
		}
		
		Collections.shuffle(list2);
		System.out.println("--------******-------");
		for(int i=0; i < list1.size(); i++) {
			System.out.println(list1.get(i) + " 결과는 " + list2.get(i));
		}
		
	}
}
