package oop.constructor1;

public class StudentData {

	String name;
	int socre;
	
	//기본 생성자
	//- 생성만 하고 아무것도 하지 않음
	//- 생성자가 없으면 생성이 불가하므로 없다면 자동생성됨
	//StudentData(){}
	
	//- 생성자의 이름은 클래스 이름
	//- setup 메소드와 하는 일이 동일함
	//- 생성자도 오버로딩(overloading)이 가능함
	
	StudentData(String name){
		this.name = name;
		this.socre = 0;
	}
	StudentData(String name, int score){
		this.name = name;
		this.socre = score;
	}
}
