package oop.method1;

//클래스
public class PlayerData {

	//멤버 필드(멤버 변수) - 데이터 저장
	int rank;
	String name;
	String nation;
	int score;
	
	//멤버 메소드 - 공통 코드
	//void 이름(){코드}
	//출력용 메소드
	void show () {
		//this = 클래스의 멤버를 위미(내 거)
		System.out.println("순위: " + this.rank);
		System.out.println("이름: " + this.name);
		System.out.println("국가: " + this.nation);
		System.out.println("골: " + this.score);
	}
	//초기화용 메소드
	//- 설정될 값을 알 수 없으므로 외부에서 전달받아 초기화
	//-> 매개변수
	void setup(int rank, String name, String nation, int score) {
		this.rank = rank;
		this.name = name;
		this.nation = nation;
		this.score = score;
	}
}
