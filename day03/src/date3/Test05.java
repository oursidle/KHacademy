package date3;

public class Test05 {
	public static void main(String[] args) {
		//결론
		//=30세 이상 && (짝수 해이면서 짝수년생 || 홀수 해이면서 홀수년생)
		//= condition1 && (condition2 || condition3)
		
		//입력
		int birth = 1985;
		int year = 2023;
		
		//계산
		//boolean condition1 = 30세 이상인가?;
		//boolean condition2 = 짝수년도 && 짝수년생;
		//boolean condition3 = 홀수년도 && 홀수년생;
		//=boolean condition = (condition1 && condition2 || condition3);
		int age = year - birth + 1;
		boolean condition1 = age >= 30;
		
		boolean condition2Year = year % 2 == 0;
		boolean condition2Birth = birth % 2 == 0;
		boolean condition2 = condition2Year && condition2Birth;
		
		boolean condition3Year = year % 2 != 0;
		boolean condition3Birth = birth % 2 != 0;
		boolean condition3 = condition3Year && condition3Birth;
		
		boolean condition = (condition1 && condition2 || condition3);
		
		//출력		
		System.out.println(condition);
	}
}