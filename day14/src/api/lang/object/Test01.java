package api.lang.object;

//java.lang 패키지는 기초 필수 패키지로 import 없이 사용 가능함
public class Test01 {
	public static void main(String[] args) {
		//Object 클래스 사용법
		//= 클래스의 시조(조상)
		//= 클래스가 기본적으로 가져야 하는 스펙에 대한 정의가 있음
		
		Object a = new Object();
		Object b = new Object();
		
		//자바는 객체마다 고유한 일련번호를 부여하여 관리함(주소 X)
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		System.out.println(a.toString());
		System.out.println(b.toString());
	}
}
