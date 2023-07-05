package oop.inherit5;

public class GalaxyFold4 extends Galaxy {
	public void show() {
		System.out.println("< 휴대폰 정보 >");
		//System.out.println("번호: " + this.number);//나의 번호
		//System.out.println("번호: " + super.number);//나의 부모 클래스의 번호
		System.out.println("번호: " + number);//this로 처리됨
	}

	//메소드 재정의(method override)
	//- 상속받은 메소드와 동일한 메소드를 만들고 해당 메소드가 실행되도록 하는 것
	//- 상속받은 메소드의 이용을 원치 않을 때 사용
	@Override//Annotation - 역할 부여 코드(해시태그)
	public void call() {
		System.out.println("갤럭시 폴드4의 통화기능 실행");
	}
	
	//부모 클래스에 생성자가 있다면 자식 클래스도 생성자가 있어야 함
	//- 부모 클래스가 필요로 하는 값을 전달해야 함
	public GalaxyFold4(String color) {
		super(color);
	}
}
