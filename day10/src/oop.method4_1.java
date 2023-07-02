package oop.method4;

public class MenuData {
	
	String name;
	String type;
	int price;//할인 전 금액
	boolean event;
	
	//setup을 두 종류로 구현(method overloading)
	//[1] 3개의 데이터가 들어오면 이벤트는 안 하는 것으로 처리
	//[2] 4개의 데이터가 들어오면 이벤트를 설정하는 것으로 처리
	void setup(String name, String type, int price) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.event = false;
	}
	
	void setup(String name, String type,
								int price, boolean event) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.event = event;
	}
	
	
	void show() {
		System.out.println("< 커피숍 메뉴 정보 >");
		System.out.print("이름: " + this.name);
		if(this.event) {
			System.out.print(" (행사중)");
		}
		System.out.println();
		
		System.out.println("분류: " + this.type);
		
		if(this.event) {
			System.out.print("가격: " + this.price*80/100 + "원");
			System.out.println("(원가: " + this.price + "원)");
		}else {
			System.out.println("가격: " + this.price + "원");
		}
		//System.out.println("행사여부: " + this.event);
		System.out.println();
	}
}
