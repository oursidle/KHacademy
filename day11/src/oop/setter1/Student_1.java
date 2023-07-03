package oop.setter1;

public class Student_1 {
	public static void main(String[] args) {
		
		StudentData a = new StudentData();
		
		//[1] 잘못된 데이터 설정 가능
		// -> 데이터를 설정하는 부분에 조건을 추가
		a.setup("피카츄", -70);
		a.show();
		
		//[2] 하나의 정보만 바꿀 수 없음
		// -> 데이터를 하나만 설정할 수 있는 메소드를 만듦(setter 메소드)
		a.setScore(50);
		a.show();
		
		a.setName("라이츄");
		a.show();
		
	}
}
