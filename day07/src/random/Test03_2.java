package random;

import java.util.Random;

public class Test03_2 {
	public static void main(String[] args) {
		//윷놀이게서만 가능한 방법
		//- 윷이 4개고, 윷 한 개당 경우의 수가 2가지(앞/뒤)
		//- 등: 0 / 배 - 1
		
		Random r = new Random();
		
		int a = r.nextInt(2);
		int b = r.nextInt(2);
		int c = r.nextInt(2);
		int d = r.nextInt(2);
		int total = a + b + c + d;
		
		switch(total) {
		case 0://뒤집힌 개수가 0 = 모
			System.out.println("모");
			break;
		case 1://뒤집힌 개수가 1 = 도/빽도
			if(a == 1) {
				System.out.println("빽도");
			}else {
				System.out.println("도");
			}
			break;
		case 2://뒤집힌 개수가 2 = 개
			System.out.println("개");
			break;
		case 3://뒤집힌 개수가 3 = 걸
			System.out.println("걸");
			break;
		case 4://뒤집힌 개수가 4 = 윷
			System.out.println("윷");
			break;
		}
	}
}