package oop.method6;

public class Student {
	public static void main(String[] args) {
		
		StudentData student1 = new StudentData();
		StudentData student2 = new StudentData();
		StudentData student3 = new StudentData();
		StudentData student4 = new StudentData();
		
		student1.setup(1, 1, "마리오", 50, 60, 50);
		student2.setup(1, 1, "루이지", 60, 90, 50);
		student3.setup(1, 2, "쿠파", 70, 70, 80);
		student4.setup(1, 2, "요시", 80, 85, 35);
		
		student1.show();
		student2.show();
		student3.show();
		student4.show();
	}
}