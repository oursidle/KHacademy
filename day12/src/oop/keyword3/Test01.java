package oop.keyword3;

public class Test01 {
	public static void main(String[] args) {
		//static 메소드는 클래스명으로 집접 호출이 가능
		int result = Calculator.plus(10, 20);
		System.out.println("result = " + result);
	}
}
