package oop.setter2;

public class ClasstableData {

	String name;//강좌명
	int time;//강의시간
	int price;//수강료
	String type;//구분
	
	
	void setup(String name, int time, int price, String type) {
		this.name = name;
		this.setTime(time);
		this.setPrice(price);
		this.setType(type);
	}
	
	
	void setName(String name){
		this.name = name;
	}
	void setTime(int time) {
		if(time % 30 == 0 && time > 0) {
			this.time = time;
		}
	}
	void setPrice(int price) {
		if(price >= 0) {
			this.price = price;
		}
	}
	//void setPrice(int price){ //조건이 많으면 이 방법이 효율적임
	//		if(price < 0){
	//		return; //반환은 없지만 중지하세요
	//		}
	//		this.price = price;
	
	void setType(String type) {
		switch(type) {
		case "온라인":
		case "오프라인":
		case "혼합":
			this.type = type;
		}
	}
	
	
	void show() {
		System.out.println("< 학원 강의 요금표 >");
		System.out.println("강좌명: " + this.name);
		System.out.println("강의 시간: " + this.time + "시간");
		System.out.println("수강료: " + this.price + "원");
		System.out.println("구분: " + this.type);
		System.out.println();
	}
	
}
