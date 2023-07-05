package oop.inherit7;

//추상 클래스를 상속받으면 추상 메소드를 해결(재정의)해야 함
public class Galaxy23s extends Galaxy {

	public Galaxy23s(String number, String color) {
		super(number, color);
	}

	@Override
	public void samsungPay() {
		
	}
	@Override
	public void call() {
		
	}
	@Override
	public void sms() {
		
	}
	//고유 기능
	public void bixby() {
		
	}

}