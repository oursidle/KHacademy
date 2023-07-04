package oop.keyword4;

public class Test01 {
	public static void main(String[] args) {
		
		int a = Robot.square(11);
		System.out.println("a = " + a);
		
		double b = Robot.triangle(3, 7);
		System.out.println("b = " + b);
		
		double c = Robot.circle(5);
		System.out.println("c = " + c);
		
		//(주의) 참조형 데이터는 리모콘만 전달하면 외부에서 직접 제어 가능함
		int[] data = new int[] {30, 50, 20, 10, 40};
		Robot.sort(data);//리모콘 전달(call-by-reference)
		Robot.print(data);
		
		Robot.reverse(data);
		Robot.print(data);
		
		Robot.shuffle(data);
		Robot.print(data);
		
	}
}
