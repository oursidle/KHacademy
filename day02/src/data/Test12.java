package data;

public class Test12 {
	public static void main(String[] args) {
		//입력
		int count = 5;
		int price = 1400;
		
		//계산
		int free = count  / 2;
		int pay = count - free;
		int total = price * pay;
		
		//출력
		System.out.println(free);
		System.out.println(total);
	}
}