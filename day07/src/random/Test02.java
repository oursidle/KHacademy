package random;

import java.util.Random;

public class Test02 {
	public static void main(String[] args) {

		Random r = new Random();
		
		int lotto = r.nextInt(45) + 1;
		System.out.println("로또 번호:" + lotto);
		
		int two1 = r.nextInt(90) + 10;//B(99) - A(10) + 1 = 90
		int two2 = r.nextInt(90) + 10;
		System.out.println("두 자리 수: " + two1 + ", " + two2); 
		
		int otp = r.nextInt(1000000);//B(999999) - A(0) + 1 = 1000000
		System.out.println("OTP 번호: " + otp);
		//Format f = new DecimalFormat("000000");
		//System.out.println(f.format(otp));
		
		int fB = r.nextInt(2);
		System.out.print("앞/뒤: ");
		if(fB == 0) {
			System.out.println("앞");
		}else {
			System.out.println("뒤");
		}
		
		int rsp = r.nextInt(3);
		System.out.print("가위/바위/보: ");
		if(rsp == 0) {
			System.out.println("가위");
		}else if(rsp == 1){ 
			System.out.println("바위");
		}else {
			System.out.println("보");
		}
	}
}
