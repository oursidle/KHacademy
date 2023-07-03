package oop.setter3;

public class Phone {
	public static void main(String[] args) {
		
		PhoneData phone1 = new PhoneData();
		PhoneData phone2 = new PhoneData();
		PhoneData phone3 = new PhoneData();
		PhoneData phone4 = new PhoneData();
		
		phone1.setup("갤럭시23s", "SK", 180, 0);
		phone2.setup("갤럭시23s", "KT", 175, 24);
		phone3.setup("아이폰14", "LG", 200, 30);
		phone4.setup("아이폰14", "SK", 199, 0);
		
		phone1.show();
		phone2.show();
		phone3.show();
		phone4.show();
		
	}
}
