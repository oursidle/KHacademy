package api.lang.test1;

import java.util.Properties;

public class Test02 {
	public static void main(String[] args) {
		//객체 생성
		Properties prop = new Properties();
		
		//기능 사용
		//- key = hello, value = world인 데이터 저장
		prop.setProperty("hello", "world");
		//- key = :good, vlaue = bye인 데이터 저장
		prop.setProperty("good", "bye");
		
		//- 객체의 요약 정도 = toString9();
		System.out.println(prop.toString());
		
		//-key = hello인 데이터릐 value를 활인
		String value = prop.getProperty("hello");
		System.out.println(prop.getProperty(value));
	}
}
