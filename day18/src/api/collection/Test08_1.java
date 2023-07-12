package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test08_1 {
	public static void main(String[] args) {
		
//		[Flow]
//		1. 인원수 선택
//					- 2~24명으로 설정 가능
//					- 개발 시 3명으로 고정
//		2. 이름과 항목 입력
//					- 이름과 항목은 다른 저장소를 사용
//					- 리스트 2개 필요
//					- 이름 먼저 입력
//					- 항목은 나주에 입력
//		3. 전체 결과 보기
//					- 이름은 그대로
//					- 항목은 섞고
//					- 두 개를 동시에 순서대로 출력
		
		Scanner sc = new Scanner(System.in);
		
		//[1] 인원 설정
		System.out.print("인원 수: ");
		int people = sc.nextInt();
		sc.nextLine();//엔터 제거
		
		//[2] 이름과 항목 입력
		List<String> names = new ArrayList<>();
		List<String> items = new ArrayList<>();
		
		for(int i=0; i < people; i++) {
			System.out.print("이름: ");
			names.add(sc.nextLine());
		}
		
		for(int i=0; i < people; i++) {
			System.out.print("항목: ");
			items.add(sc.nextLine());
		}
		sc.close();
		
		Collections.shuffle(items);
		
		//[3] 출력
		System.out.println("< 추첨 결과 >");
		for(int i=0; i < people; i++) {
			System.out.println(names.get(i) + " → " + items.get(i));
		}
	}
}
