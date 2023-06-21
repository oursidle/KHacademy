package date3;

public class Test02 {
	public static void main(String[] args) {
		//입력
		int birth = 2003;
		int year = 2023;
		
		//계산
		int age = year - birth + 1;
		boolean adult = age >= 20;
		
		//출력
		System.out.println(age);
		System.out.println(adult);
		
		//A부터 B 사이의 숫자 개수 구하는 공식 = B - A + 1
	}
}