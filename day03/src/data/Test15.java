package data;

public class Test15 {
	public static void main(String[] args) {
		//입력
		int people = 3;
		int days = 7;
		int price = 100000;
		int rate = 25;
		
		//계산
		int stayPrice = ( people * price ) * rate / 100;
		int totalPrice = stayPrice * people * days;
		
		//출력
		System.out.println(totalPrice);
	}
}