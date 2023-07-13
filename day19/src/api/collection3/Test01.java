package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test01 {
	public static void main(String[] args) {
		//Map
		//= 세트 저장소(key-value 저장소)
		//= List, Set 한 개의 데이터를 저장하는 반면 Map은 두 개를 세트로 저장
		//= key는 이름, value는 값의 역할을 수행
		//= Set에 value가 붙어있는 형태
		
		//Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> map = new TreeMap<>();
		
		//추가 - put (데이터 개수가 달라 add X)
		map.put("유재석", 50);
		map.put("강호동", 53);
		map.put("유재석", 51);//key 중복 불가능 (기존 항목의 value 수정해 key 대입)
		map.put("박명수", 52);
		map.put("정준하", 52);//value 중복 가능
		
		//검색 - key/value contains 따로 존재 
		System.out.println(map.containsKey("유재석"));//--> true
		System.out.println(map.containsValue(50));//--> false
		
		//삭제 - remove
		//map.remove("노홍철");//미존재
		//map.remove("박명수");
		
		//추출 - get(key) --> value
		System.out.println(map.get("노홍철"));//null
		System.out.println(map.get("박명수"));
		
		//출력
		System.out.println(map);
		System.out.println(map.size());
	}
}
