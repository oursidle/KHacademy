package api.collection3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test02 {
	public static void main(String[] args) {
		Map<String, String> info = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		
		info.put("admin", "admin1234");
		info.put("teacher", "teacher1234");
		info.put("student", "student1234");
		info.put("manager", "manager1234");
		
		System.out.print("아이디를 입력하세요: ");
		String id = sc.nextLine();
		System.out.print("비밀번호를 입력하세요: ");
		String pw = sc.nextLine();
		sc.close();
		
		if(info.containsKey(id)) {
			if(info.containsValue(pw)) {
				System.out.println("로그인 성공!");
			}else {
				System.out.println("로그인 실패!");
			}
		}else {
			System.out.println("로그인 실패!");
		}
	}
}
