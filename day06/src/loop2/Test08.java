package loop2;

public class Test08 {
	public static void main(String[] args) {
		
		long money = 1000L;
		long total = 0L;
		
		for(int i=1; i <= 30; i++) {
			System.out.println(i + "일차 금액: " + money + "원");
			total += money;
			money *= 2;
		}
		System.out.println("30일 합계: " + total + "원");
	}
}

