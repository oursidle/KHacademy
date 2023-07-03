package oop.constructor3;

public class CharacterData {
	
	//멤버 필드
	String id;
	String job;
	int level;
	
	//멤버 생성자 - 생성 시 필요한 데이터를 강제하는 도구
	//- 반환형을 붙이지 않음 (붙이면 메소드가 됨)
	CharacterData(String id, String job){
		this(id, job, 1);
	}
	CharacterData(String id, String job, int level	){
		this.id = id;
		this.job = job;
		this.level = level;
	}
	
	//멤버 메소드
	void setId(String id) {
		this.id = id;
	}
	void setJob(String job) {
		switch(job) {
		case "전사":
		case "마법사":
		case "궁수":
			this.job = job;
		}
	}
	void setLevel(int level) {
		if(level < 1) return;
			this.level = level;
	}
	
	String getId() {
		return this.id;
	}
	String getJob() {
		return this.job;
	}
	int getLevel() {
		return this.level;
	}
	
	
	void show() {
		System.out.println("< 캐릭터 정보 >");
		System.out.println("아이디: " + this.getId());
		System.out.println("직업: " + this.getJob());
		System.out.println("레벨: " + this.getLevel());
		System.out.println();
	}
}
