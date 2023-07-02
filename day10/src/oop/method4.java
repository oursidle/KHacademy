package oop.method4;

public class Menu {
	public static void main(String[] args) {
		
	MenuData Menu1 = new MenuData();
	MenuData Menu2 = new MenuData();
	MenuData Menu3 = new MenuData();
	MenuData Menu4 = new MenuData();
	
	Menu1.setup("아메리카노", "음료", 2500, true);
	Menu2.setup("모카라떼", "음료", 3500, false);
	Menu3.setup("치즈케이크", "디저트", 5000, true);
	Menu4.setup("마카롱", "디저트", 3000, false);
	
	Menu1.show();
	Menu2.show();
	Menu3.show();
	Menu4.show();
	}
}
