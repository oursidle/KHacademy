package oop.inherit7;

//추상 클래스(abstract class)
//= 상속 관계에서 추상적인 개념을 정의하기 위해 만들어진 클래스
//= 부모 클래스
//= 일반적인 클래스와 같이 필드, 메소드, 생성자를 가짐
//= (중요) 추상 클래스는 추상 메소드를 가짐
public abstract class Mobile {
	//공통 필드
	protected String number;
	protected String color;
	
	//setter, getter 메소드 생략
	
	//생성자
	public Mobile(String number, String color) {
		this.number = number;
		this.color = color;
	}
	
	//전화기라면 통화(call) 기능이 있어야 하나 구체적인 내용은 알 수 없음
	public abstract void call();
	
	//전화기라면 문자(sms) 기능이 있어야 하나 구체적인 내용은 알 수 없음
	public abstract void sms();
}