package oop.constructor3;

public class Character {
	public static void main(String[] args) {
		
		CharacterData character1 = new CharacterData("헤라클래스", "전사", 50);
		CharacterData character2 = new CharacterData("포세이돈", "마법사", 20);
		CharacterData character3 = new CharacterData("아프로디테", "마법사");
		
		character1.show();
		character2.show();
		character3.show();
	}
}
