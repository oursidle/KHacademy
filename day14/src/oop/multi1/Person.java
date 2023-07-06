package oop.multi1;

//핵심 상속(클래스 상속)은 extends 키워드로 구현 (1개만)
//부가 상속(인터페이스 상속)은 implements 키워드로 구현 (여러개. ','로 구분)
public class Person implements Singer, Programmer{

	@Override
	public void coding() {
		System.out.println("사람이 코딩을 합니다.");
	}
	@Override
	public void sing() {
		System.out.println("사람이 노래를 부릅니다.");
	}
}
