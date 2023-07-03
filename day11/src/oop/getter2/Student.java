package oop.getter2;

public class Student {
	public static void main(String[] args) {
		
	StudentData student1 = new StudentData();
	StudentData student2 = new StudentData();
	StudentData student3 = new StudentData();
	
	student1.setup("마리오", 1, 90, 80, 70);
	student2.setup("루이지", 1, 85, 85, 83);
	student3.setup("쿠파", 3, 70, 60, 55);
	
	student1.show();
	student2.show();
	student3.show();
	}
}
