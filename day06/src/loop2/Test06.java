package loop2;

public class Test06 {
	public static void main(String[] args) {
		//누적 합계 구하기
		
		//Q1: 10을 10번 더하면?
		int total = 0;
		
		for(int i=0; i < 10; i++) {
			total += 10;
		}
		System.out.println(total);
		
		
		//Q2: 1부터 10까지 더하면?
		int result = 0;
		
		for(int j=1; j <= 10; j++) {
			result += j;
		}
		System.out.println(result);
		
	}
}
