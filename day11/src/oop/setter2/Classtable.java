package oop.setter2;

public class Classtable {
	public static void main(String[] args) {
		
		ClasstableData class1 = new ClasstableData();
		ClasstableData class2 = new ClasstableData();
		ClasstableData class3 = new ClasstableData();
		
		class1.setup("자바 마스터과정", 90, 1000000, "온라인");
		class2.setup("파이썬 기초", 60, 600000, "온라인");
		class3.setup("웹 개발자 단기완성", 120, 1200000, "오프라인");
		
		class1.show();
		class2.show();
		class3.show();
		
	}
}
