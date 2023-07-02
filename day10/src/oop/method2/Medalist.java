package oop.method2;

public class Medalist {
	public static void main(String[] args) {
		
		MedalistData player1 = new MedalistData();
		MedalistData player2 = new MedalistData();
		MedalistData player3 = new MedalistData();
		
		player1.setup("진종오", "사격", "구분", 4, 2, 0);
		player2.setup("김수녕", "양궁", "하계", 4, 1, 1);
		player3.setup("전이경", "쇼트트랙", "동계", 4, 0, 1);
		
		player1.show();
		player2.show();
		player3.show();
	}
}
