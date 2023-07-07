package api.lang.string2;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String id = sc.nextLine();
		String regex = "^[a-z][a-z0-9\\-_]{4,19}$";
		
		boolean isValid = id.matches(regex);
		
		if(isValid) {
			System.out.println("사용 가능한 아이디입니다.");
		}else {
			System.out.println("사용 불가능한 아이디입니다.");
		}
		
		
	}
}
