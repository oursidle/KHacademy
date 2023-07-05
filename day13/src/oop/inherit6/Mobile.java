package oop.inherit6;

//최상위 클래스 - 휴대폰
public class Mobile {
	//공통 필드 - 접근 제한(private / protected)
	protected String number;
	protected String color;
	
	//Setter / Getter 메소드
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//생성자
	public Mobile(String number, String color) {
		this.setNumber(number);
		this.setColor(color);
	}
	
	//출력 메소드 - 재정의 금지 처리
	public final void show() {
		System.out.println("< 휴대폰 정보 >");
		System.out.println("번호: " + this.number);
		System.out.println("색상: " + this.color);
	}
	
	//공통 메소드
	public void call() {
		System.out.println("전화 기능");
	}
	public void sms() {
		System.out.println("문자 기능");
	}
}
