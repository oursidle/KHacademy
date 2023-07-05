package oop.inherit6;

public final class GalaxyFold4 extends Samsung {
	
	public GalaxyFold4(String number, String color) {
		super(number, color);
	}
	
	//고유 기능
	public void iris() {
		System.out.println("갤럭시폴드4 홍체인식 기능 실행");
	}

	//메소드 재정의
	@Override
	public void samsungPay() {
		System.out.println("갤럭시폴드4 삼성페이 기능 실행");
	}
	@Override
	public void call() {
		System.out.println("갤럭시폴드4 전화 기능 실행");
	}
	@Override
	public void sms() {
		System.out.println("갤럭시폴드4 문자 기능 실행");
	}
	
}
