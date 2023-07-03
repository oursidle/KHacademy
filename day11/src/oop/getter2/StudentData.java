package oop.getter2;

public class StudentData {
	
	//필드
	String name;//이름
	int grade;//학년
	int korean;//국어 점수
	int english;//영어 점수
	int math;//수학 점수
	
	//setter 메소드
	void setName(String name) {
		this.name = name;
	}
	void setGrade(int grade) {
		if(grade >= 1 && grade <= 6) {
			this.grade = grade;
		}
	}
	void setKorean(int korean) {
		if(korean >= 0 && korean <= 100) {
			this.korean = korean;
		}
	}
	void setEnglish(int english) {
		if(english < 0 || english > 100) return;
		this.english = english;
	}
	void setMath(int math) {
		if(!(math >= 0 || math <= 100)) return;
		this.math = math;
	}
	
	//getter 메소드
	String getName() {
		return this.name;
	}
	int getGrade() {
		return this.grade;
	}
	int getKorean() {
		return this.korean;
	}
	int getEnglish() {
		return this.english;
	}
	int getMath()	{
		return this.math;
	}
	int getTotal() {
		return this.getKorean() + this.getEnglish() + this.getMath();
	}
	double getAvg() {
		return getTotal() / 3.0;
	}
	String getLevel() {
		double average = this.getAvg();
		if(average >= 90) {
			return "A";
		}else if(average >= 80) {
			return "B";
		}else if(average >= 70) {
			return "C";
		}else {
			return "F";
			}
		}
	
	//setter 메소드
	void setup(String name, int grade, int korean, int english, int math) {
		this.setName(name);
		this.setGrade(grade);
		this.setKorean(korean);
		this.setEnglish(english);
		this.setMath(math);
	}
	
	//show 출력
	void show() {
		System.out.println("< 학생 성적 정보 >");
		System.out.println("이름: " + this.name);
		System.out.println("학년: " + this.grade);
		System.out.println("국어: " + this.korean + "점");
		System.out.println("영어: " + this.english + "점");
		System.out.println("수학: " + this.math + "점");
		System.out.println("총점: " + this.getTotal() + "점");
		System.out.println("평균: " + this.getAvg() + "점");
		System.out.println("등급: " + this.getLevel());
		System.out.println();
	}
}
