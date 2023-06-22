package input;

import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException  {
		//표준 입력
		//- System.in을 사용하여 처리
		//-사용자가 입력해주기를 기다려야 한다
		//-ASCII 코드를 입력받는다
		
		int a = System.in.read();
		System.out.println("a = " + a);
		
		int b = System.in.read();
		System.out.println("a = " + b);
		
		int c = System.in.read();
		System.out.println("a = " + c);
		
		int d = System.in.read();
		System.out.println("a = " + d);
		
		}
}
