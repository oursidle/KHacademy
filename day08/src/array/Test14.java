package array;

import java.util.Random;

public class Test14 {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int[] data = new int[] {10, 20, 30, 40, 50};
		
		for(int i=0; i < data.length; i++) {
			int after = r.nextInt(data.length);
			
			//같은 자리가 나오면 다시 뽑거나 작업을 무효화 시키도록 입력할 수 있음
			//무효화 시키는 방법이 더 효율적임
			//작업을 무효화 시키는 방법
			//if(i == after){
			//		i --;
			//		continue;
			
			//다른 자리가 나왔을 때 값이 적용되도록 입력하는 방법
			if(i != after) {
				int backup = data[i];
				data[i] = data[after];
				data[after] = backup;
			}
		}
		for(int i=0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}