package oop.method5;

public class Product {
	public static void main(String[] args) {
		
		ProductData product1 = new ProductData();
		ProductData product2 = new ProductData();
		ProductData product3 = new ProductData();
		ProductData product4 = new ProductData();
		
		product1.setup("참이슬후레쉬", "주류", 1200, true, true);
		product2.setup("클라우드맥주", "주류", 3000, false, true);
		product3.setup("바나나킥", "과자", 1200, false, true);
		product4.setup("허니버터칩", "과자", 1200, true, false);
		
		product1.show();
		product2.show();
		product3.show();
		product4.show();
	}
}
