package oop.inherit6;

public class Apple extends Mobile {
	
	public Apple(String number, String color) {
		super(number, color);
	}
	
	//공통 기능
	public void siri() {
		System.out.println("음성인식 기능 실행");
	}
}
