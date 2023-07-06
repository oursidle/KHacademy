package api.lang.object;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//'Object는 모든 클래스의 시작(조상)이다'에 대한 검증
		//= 모든 데이터는 Object로 업캐스팅이 가능함
		//= 모든 데이터는 Object로 보관이 가능함(= 아무거나)
		//= 즉, 자료형을 특정할 수 없다면 Object를 써도 됨
		
		//Object a = new Object();
		Object a = 10;
		Object b = "hello";
		Object c = new int[] {30, 50, 20, 10, 40};
		Object d = new Scanner(System.in);
		Student e = new Student();//내가 만든 클래스도 Object를 자동 상속함
		
		System.out.println(b instanceof String);
		System.out.println(d instanceof Scanner);
	}
}
