package api.collection2;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test02_1 {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		Random r = new Random();
		
		while(set.size() < 6) {
			int num = r.nextInt(45)+1;
			set.add(num);
		}
		
		System.out.println("< 이번 주 로또 번호 >");
		System.out.println(set);
	}
}
