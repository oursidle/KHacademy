package oop.modifier2;

public class Account {
	public static void main(String[] args) {
		
		AccountData account1 = new AccountData("유재석", 3, 15, 100, 1500);
		AccountData account2  = new AccountData("강호동", 2, 5, 50, 250);
		AccountData account3 = new AccountData("신동엽", 2, 8, 80, 1000);
		
		account1.next();
		account1.show();
		
		account2.next();
		account2.show();
		
		account3.next();
		account3.show();
	}
}
