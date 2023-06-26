package loop2;

public class Test01 {
	public static void main(String[] args) {
		//카운트 측정, 합계 계산
		
		//(기존) 1 부터 100 사이의 홀수를 출력
		//(변경) 1 부터 100 사이의 홀수가 몇 개인가? -> 50개
		
		//1. 1 부터 100 사이의 홀수를 출력
		//2. 카운트 측정
		
		int count = 0; //최초 카운트 0으로 설정
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				count ++; //원하는 상황에 카운트 증가 코드 배치
			}
		}
		
		System.out.println(count); //반복 종료 후 카운트 사용
	}
}
