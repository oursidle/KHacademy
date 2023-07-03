package oop.setter1;

public class StudentData {

	//필드를 생성해야 클래스의 나머지 형태를 구성할 수 있음
	String name;
	int score;
	
	//메소드 - setup, show
	void setup(String name, int score) {
		this.setName(name);//내가 가지 setName 메소드에 name을 전달하며 호출
		this.setScore(score);//내가 가진 setScore 메소드에 score을 전달하며 호출
	}
	
	void show() {
		System.out.println(this.name);
		System.out.println(this.score);
		
	}
	
	//필드를 하나씩 변경할 수 있는 메소드 구현
	// -> setter 메소드
	// -  set + 필드명
	// - 설정 외 다른 작업을 하지 않음
	// - (중요) 올바른 데이터만 설정 가능하도록 필터링 처리를 함
	void setName(String name) {
		switch(name) {//문자열은 비교를 switch로 함(if로 하는 방법은 나중에 학습)
		case "피카츄":
		case "라이츄":
			this.name = name;
		}
	}
	
	void setScore(int score) {
		if(score >= 0 && score <= 100) {//전달받은 score을 비교하므로 this.score은 X
			this.score = score;
		}
	}
}
