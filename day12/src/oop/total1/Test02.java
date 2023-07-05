package oop.total1;

public class Test02 {
	public static void main(String[] args) {
		
	//1번 계산
	Time_Explain a = new Time_Explain(3, 20, 0);
	Time_Explain b = new Time_Explain(1, 50, 30);
	Time_Explain c = TimeCalculator.plus(a, b);
	c.show();
	
	//2번 계산
	Time_Explain d = new Time_Explain(4000);
	Time_Explain e = new Time_Explain(1, 10, 0);
	Time_Explain f = TimeCalculator.minus(d, e);
	f.show();
	
	}
}
