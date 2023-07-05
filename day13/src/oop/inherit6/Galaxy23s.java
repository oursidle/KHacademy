package oop.inherit6;

//클래스에 final이 선언되면 하위 상속이 불가능
public final class Galaxy23s extends Samsung {

	public Galaxy23s(String number, String color) {
		super(number, color);
	}
	
	//고유 기능
	public void bixby() {
		System.out.println("갤럭시23s 음성인식 기능 실행");
	}

	//메소드 재정의
	@Override
	public void samsungPay() {
		System.out.println("갤럭시23s 삼성페이 기능 실행");
	}
	@Override
	public void call() {
		System.out.println("갤럭시23s 전화 기능 실행");
	}
	@Override
	public void sms() {
		System.out.println("갤럭시23s 문자 기능 실행");
	}
	
}
