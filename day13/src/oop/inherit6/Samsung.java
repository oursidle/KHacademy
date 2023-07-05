package oop.inherit6;

public class Samsung extends Mobile {
	public Samsung(String number, String color) {
		super(number, color);
	}
	//갤럭시 공통 기능
	public void samsungPay() {
		System.out.println("삼성페이 기능");
	}
}
