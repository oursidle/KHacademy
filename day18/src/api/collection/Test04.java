package api.collection;

import java.util.ArrayList;
import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i < 6; i++) {
			int number = r.nextInt(45)+1;
			if(list.contains(number)) {
				i --;
			}else {
				list.add(number);
			}
		}
		System.out.print("로또 번호: ");
		System.out.println(list);
	}
}
