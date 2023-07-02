package array;

public class Test04 {
	public static void main(String[] args) {
		
		//String 배열 생성하면 null 값으로 생성됨
		//참조형은 null을 참조함
		
		String[] s = new String[3];
		
		s[0] = "자바";
		s[1] = "파이썬";
		s[2] = "루비";
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
	}
}
