package oop.method2;

public class MedalistData {
	
	//멤버 필드(member field) - 데이터
	String name;
	String category;
	String season;
	int gold, silver, bronze;
	
	//멤버 메소드(member method) - 코드
	void setup(String name, String category, String season,
											int gold, int silver, int bronze) {
		this.name = name;
		this.category = category;
		this.season = season;
		this.gold = gold;
		this.silver = silver;
		this.bronze = bronze;
	}
	
	void show() {
		System.out.println("< 메달리스트 정보 >");
		System.out.println("이름: " + this.name);
		System.out.println("종목: " + this.category);
		System.out.println("구분: " + this.season);
		System.out.println("메달 - 금: " + this.gold + " 은: " + this.silver + 
																		" 동: " + this.bronze);
		System.out.println();
	}
}
