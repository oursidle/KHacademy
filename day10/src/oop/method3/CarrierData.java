package oop.method3;

public class CarrierData {
	
	//멤버 필드{멤버 변수}
	String name;
	String item;
	int fee;
	int giga;
	int call;
	int sms;
	
	//멤버 메소드{매개 변수}{
	//			지역 변수	}
	void setup(String name, String item, int fee, int giga, int call, int sms) {
		this.name = name;
		this.item = item;
		this.fee = fee;
		this.giga = giga;
		this.sms = sms;
	}
	
	void show() {
		System.out.println("< 요금제 정보 >");
		System.out.println("통신사: " + this.name);
		System.out.println("상품명: " + this.item);
		System.out.println("월정액: " + this.fee + "원");
		System.out.println("데이터(GB): " + this.giga + "GB");
		System.out.println("통화(분): " + this.call + "분");
		System.out.println("문자(건): " + this.sms + "건");
		System.out.println();
	}
}
