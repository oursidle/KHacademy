package api.collection;

import java.util.ArrayList;

public class Test02 {
	public static void main(String[] args) {
		//List 저장소
		//= 순서가 있는 저장소
		//= 선형구조(시작지점과 끝지점이 있는 형태)
		//= ArrayList, LinkedList, Vector
		
		//자료형(Generic Type)을 지정하지 않으면 경고
		//ArrayList list = new ArrayList();
		
		//자료형을 생성하면서 생성
		//ArrayList<String> list = new ArrayList<String>(); --> String 전용 저장소
		ArrayList<String> list = new ArrayList<String>();
		
		//자료형을 지정하면서 생성
		//ArrayList<String> list- new ArrayLisy<>();
		
		//데이터 추가
		//ist.add(100);//Generic Typer와 일치하지 않는 데이터 추가 불가
		list.add("유재석");//0
		list.add("이효리");//1
		list.add("김채원");//2
		list.add("유태오");//3
		list.add("지수");//4
		
		//데이터를 다루는 여러가지 명령들
		//[1] 데이터 개수 확인
		System.out.println(list.size());
		
		//[2] 특정 데이터 유무 확인
		System.out.println(list.contains("유재석"));
		System.out.println(list.contains("강호동"));
		
		//특정 데이터 위치 확인
		System.out.println(list.indexOf("유재석"));
		System.out.println(list.indexOf("강호동"));
		
		//[4] 데이터 삭제
		list.remove("지수");
		list.remove(0);//0번 위치(유재석) 삭제
		
		//출력
		System.out.println("list = " + list);
				
	}
}
