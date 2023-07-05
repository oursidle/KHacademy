package oop.inherit5;

//갤럭시 시리즈의 상위 클래스
public class Galaxy {
	//공통 필드
	//- 접근 제한에 주의
	//- private: 선언된 클래스 내에 정한 방식으로만 이용 가능
	//- protected: 자식 클래스(+패키지)의 자유로운 접근이 가능
	protected String color;
	protected String number;
	protected int price;
	
	//공통 메소드
	//- 메소드는 재정의가 가능함(override)
	//- 재정의는 기본적으로 허용되나, final 키워드가 선언되면 재정의가 불가능함
	public void call() {
		System.out.println("전화 기능");
	}
	public final void battery() {
		System.out.println("배터리 표시 기능");
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//생성자
	//- 생성 시의 필수 값을 지정
	//- 부모 클래스 내에서도 생성자가 필요함
	//- 자식 클래스의 객체 생성 시 자동으로 부모 클래스 내용이 자식 클래스 내부에 생성됨
	//- 반드시 초기화될 필요가 있는 필드에 대한 생성자가 있음
	//- (중요) 부모 클래스 생성자에 만족하는 생성자가 자식 클래스에 있어야 함
	public Galaxy(String color) {
		this.setColor(color);
	}
}
