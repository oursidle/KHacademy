package api.collection2;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test02 {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		Random r = new Random();
		
		for(int i=0; i < 6; i++) {
			int num = r.nextInt(45)+1;
			if(set.contains(num)) {
				i --;
			}else {
				set.add(num);
			}
		}
		
		System.out.println("< 이번 주 로또 번호 >");
		System.out.println(set);
	}
}
