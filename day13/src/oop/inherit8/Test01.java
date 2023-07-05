package oop.inherit8;

public class Test01 {
	public static void main(String[] args) {
	//추상 클래스는 객체(인스턴스)를 생성 불가
		
		Warrior warrior = new Warrior("warrior");
		warrior.show();
		warrior.attack();
		warrior.move();
		warrior.shop();
		System.out.println();
	
		Magician magician = new Magician("magician");
		magician.show();
		magician.attack();
		magician.move();
		magician.shop();
		System.out.println();
	
		Archer archer = new Archer("archer");
		archer.show();
		archer.attack();
		archer.move();
		archer.shop();
	}
}
