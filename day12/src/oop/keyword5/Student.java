package oop.keyword5;

public class Student {
	//필드에 final 키워드를 붙이면 에러가 발생함
	//- 생성과 동시에 초기값으로 잠김
	//- 생성자가 반드시 필요하며, final 항목에 값을 넣어야 함
	//- final 항복은 setter 메소드 생성이 불가능함
	private final String name;
	private final int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
}
