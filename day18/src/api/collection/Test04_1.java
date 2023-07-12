package api.collection;

import java.util.ArrayList;
import java.util.Random;

public class Test04_1 {
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(list.size() < 6) {
			int number = r.nextInt(45)+1;
			if(!list.contains(number)) {
				list.add(number);
			}
		}
		System.out.print("로또 번호: ");
		System.out.println(list);
	}
}
