package oop.method6;

public class StudentData {

	int grade;
	int room;
	String name;
	int korean;
	int english;
	int math;
	
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
		
		int total = this.korean + this.english + this.math;
		System.out.println( "총점 : " + total + "점");
		
		double avg = total / 3.0;
		System.out.println( "평균 : " + avg + "점");
		
		boolean pass = this.korean >= 40 && this.english >= 40
										&& this.math >= 40 && avg >= 60;
		if(pass) {
			System.out.println( "==통과==");
		}else {
		System.out.println( "==재평가==");
		}
		
		System.out.println();
	}
}
