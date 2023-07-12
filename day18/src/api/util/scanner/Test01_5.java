package api.util.scanner;

import java.util.Scanner;

public class Test01_5 {
	public static void main(String[] args) {
		//Scanner 클래스
		//= 문자열 입력 및 분석 클래스
		//= 키보드 입력은 기능 중 일부분
		//= 파일 외 홈페이지도 읽어올 수 있음(웹 크롤링)
		
		String sample = "떴다떴다 비행기\n날아라 날아라\n높이높이 날아라\n우리비행기";
		//System.out.println(sample);
		
		//[1] 단어별로 읽기(띄어쓰기, 개행, 공백 기준) .next() --> sample의 단어 7개
		//	.hasNext(): 읽을 수 있는 단어가 있는지 판정
		//[2] 줄별로 읽기 .nextLine() --> sample의 줄 4줄
		//.hasNextLine(): 읽을 수 있는 줄이 있는지 판정
		
		//Q: .next()와 .nextLine()을 섞어쓰면?
		//A: 섞어 쓰면 문제가 발생함(.next() 다음에 .nextLine()을 쓰면 발생)
		
		Scanner sc = new Scanner(sample);
		
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.nextLine());//버리는 명령으로 사용
		System.out.println(sc.nextLine());
		
		sc.close();
		
	}
}
