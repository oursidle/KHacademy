package oop.setter3;

public class PhoneData {

	String name;//휴대폰 이름
	String carrier;//통신사
	int price;//판매가
	int contract;//약정(개월)
	
	
	void setName(String name) {
		this.name = name;
	}
	void setCarrier(String carrier) {
		switch(carrier) {
		case "SK":
		case "KT":
		case "LG":
			this.carrier = carrier;
		}
	}
	void setPrice(int price) {
		if(price < 0) {
			return;
		}else {
			this.price = price;
		}
	}
	void setContract(int contract) {
		switch(contract){
			case 0:
			case 24:
			case 36:
				this.contract = contract;
		}
	}
	
	
	//메소드 오버로딩(method overloading)
	void setup(String name, String carrier, int price) {
		this.setup(name, carrier, price, 0);
	}
	void setup(String name, String carrier, int price, int contract) {
		this.setName(name);
		this.setCarrier(carrier);
		this.setPrice(price);
		this.setContract(contract);
	}
	
	
	void show() {
		System.out.println("< 휴대폰 판매 정보 >");
		System.out.println("이름: " + this.name);
		System.out.println("통신사: " +this.carrier);
		
		if(contract == 0) {
			int discount = this.price * 5 / 100;
			int result = this.price - discount;
			System.out.println("판매가: " + result + "만원");
			System.out.println("(원가 " + this.price + "만원)");
		}else {
			int monthPrice = this.price / this.contract;
			System.out.print("판매가: " + this.price + "만원");
			System.out.println("(월 " + monthPrice + "만원)");
			
		}
		if(this.contract == 0) {
			System.out.println("(약정 없음)");
		}else {
			System.out.println("약정기간: " + this.contract + "개월");
		}
		System.out.println();
	}
}
