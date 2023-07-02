package random;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		//랜덤(Random)
		//- 무엇이 나올지 알 수 없는 형태의 값
		//- 나올 수 있는 범위와 형태를 지정할 수 있어야 함
		//- (ex : 주사위, 1 부터 6 사이의 정수 / 로또, 1 부터 45 사이의 정수)
		//- 도구를 이용해 원하는 형태기 나오도록 처리함
		
		//랜덤 도구 생성
		Random r = new Random();
		
		int a = r.nextInt();//무작위로 int 타입의 숫자 한 개를 추첨
		System.out.println("a = " + a);
		
		int b  = r.nextInt(6);
		System.out.println("b = " + b);//무작위로 0부터 6개의 int 타입 숫자 한 개를 추첨
		
		//최종 형태
		//int number = r.nextInt(개수) + 시작값;
		
		int dice = r.nextInt(6) + 1;//1부터 6개의 int 타입 숫자 한 개를 추첨
		System.out.println("dice = " + dice);
	}
}
