package oop.method6;

public class StudentData_1 {

	int grade;
	int room;
	String name;
	int korean;
	int english;
	int math;
	
	
	//문제점: show에서 너무 많은 일을 하고 있음
	//해결방법: 계산을 메소드가 할 수 있도록 추가 메소드 생성
	
	//[1] 총점을 구해주는 메소드
	//return : 반환 혹은 종료의 의미를 가짐
	//void : '결과물이 없음'이라는 의미를 가짐
	int getTotal() {
		return this.korean + this.english + this.math;
	}
	
	//[2] 평균을 구해주는 메소드
	double getAvg() {
		return this.getTotal() / 3.0;
	}
	
	//[3] 합격 / 불합격을 판정하는 메소드
	boolean getPass() {
		return this.korean >= 40 && this.english >= 40
					&& this.math >= 40 && this.getAvg() >= 60;
	}
	
	
	void setup(int grade, int room, String name, int korean,
													int english, int math) {
		this.grade = grade;
		this.room = room;
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	
	void show() {
		System.out.println("< 학생 성적 정보 >");
		System.out.println(this.grade + "학년 " + this.room + "반 "
														+ this.name);
		System.out.println( "국어 : " + this.korean + "점");
		System.out.println( "영어 : " + this.english + "점");
		System.out.println( "수학 : " + this.math + "점");
		System.out.println( "총점 : " + this.getTotal() + "점");
		System.out.println( "평균 : " + this.getAvg() + "점");
		
		if(this.getPass()) {
			System.out.println( "==통과==");
		}else {
		System.out.println( "==재평가==");
		}
		
		System.out.println();
	}
}
