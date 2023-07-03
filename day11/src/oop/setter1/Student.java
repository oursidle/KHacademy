package oop.setter1;

public class Student {
	public static void main(String[] args) {
		
		StudentData a = new StudentData();
		
		//[1] 잘못된 데이터 설정 가능
		// -> 데이터를 설정하는 부분에 조건을 추가
		a.setup("피카츄", -70);
		
		//[2] 하나의 정보만 바꿀 수 없음
		// -> 데이터를 하나만 설정할 수 있는 메소드를 만듦(setter 메소드)
		a.setup("피카츄", 50);//점수를 변경시 이름까지 적어야 한다
		a.show();
		
		a.setup("라이츄", 50);//이름을 변경시 점수까지 적어야 한다
		//a.score = 50;//잘못된 방법 (외부에서 필드에 직접 접근하면 안 됨)
		a.show();
		
	}
}
