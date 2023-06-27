package random;

import java.util.Random;

public class Test03 {
	public static void main(String[] args) {
		
		Random r = new Random(); 
		
		int move = 0;
		int game = r.nextInt(6);
		
		if(game == 0) {
			System.out.println("빽도");
			move -= 1;
		}else if(game == 1)	{
			System.out.println("도");
			move += 1;
		}else if(game == 2) {
			System.out.println("개");
			move += 2;
		}else if(game == 3) {
			System.out.println("걸");
			move += 3;
		}else if(game == 4) {
			System.out.println("윷");
			move += 4;
		}else {
			System.out.println("모");
			move += 5;
		}
		System.out.println(move);
		
//		switch(game){
//			case 0: System.out.println("빽도"); break;
//			case 1: System.out.println("도"); break;
//			case 2: System.out.println("개"); break;
//			case 3: System.out.println("걸"); break;
//			case 4: System.out.println("윷"); break;
//			case 5: System.out.println("모"); break;
	}
}
