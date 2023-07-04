package oop.keyword5;

public class Test01 {
	public static void main(String[] args) {
		//불변 처리(final)
		//- 변수는 하나의 값만 저장이 가능하고, 다른 값이 들어오면 값을 덮어씀
		//- 최초 이후의 대입을 금지하고 싶다면 final 키워드를 추가하면 됨
		//- 값의 변경을 원천봉쇄하기 위해 사용
		
		//int a = 10;
		
		final int a;
		a = 10;
		//a = 20;//금지
		//a = 30;//금지
		
		System.out.println("a = " + a);
	}
}
