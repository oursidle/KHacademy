package oop.modifier1;

public class StudentData {
	//필드의 접근을 차단(private)
	//필드를 원활하게 관리하기 위함
	//- 같은 클래스 내부에서는 접근 가능
	private String name;
	private int score;
	
	//필드를 제외한 나머지는 공개(public)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		if(score < 0 || score > 100)
			return;
		this.score = score;
	}
	
	//생성자도 public
	public StudentData() {}
	public StudentData(String name, int socre) {
		this.setName(name);
		this.setScore(socre);
	}
	
	public void show() {
		System.out.println("< 학생 정보 >");
		System.out.println("이름: " + this.name);
		System.out.println("점수: " + this.score);
		System.out.println();
	}
}
