package oop.keyword6;

public class Test01 {
	public static void main(String[] args) {
		
		Member id1 = new Member("adminuser", "adminuser1234", "관리자");
		Member id2 = new Member("student", "student1234", "수강생");
		Member id3 = new Member("manager", "manager1234", "매니저");
		
		id1.show();
		id2.show();
		id3.show();
	}
}
