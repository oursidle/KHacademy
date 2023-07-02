package oop.method5;

public class ProductData {

	String name;
	String type;
	int price;
	boolean ship;
	boolean event;
	
	void setup(String name, String type, int price) {
		this.setup(name, type, price, false, false);
	}
	
	void setup(String name, String type, int price,
							boolean ship, boolean event) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.ship = ship;
		this.event = event;
	}
	
	void show() {
		System.out.println("< 상품 정보 >");
		System.out.println("이름 : " + this.name);
		System.out.println("분류 : " + this.type);
		
		if(this.event) {
			System.out.println("가격 : " + this.price * 90 / 100 + "원");
			System.out.print("원래가격 : " + this.price + "원");
			System.out.println();
		}else {
			System.out.println("가격 : " + this.price);
		}
		
		if(this.ship) {
			System.out.println("* 새벽배송 가능(+2500)");
		}else {
			System.out.println("* 새벽배송 불가능");
		}
		System.out.println();
	}
}
