package api.collection3;

import java.util.Map;
import java.util.Set;

public class Test04 {
	public static void main(String[] args) {
		//Map의 전체 출력
		//Map<String, Integer> vote = new HashMap<>();
		Map<String, Integer> vote = Map.of("아이유", 5, "피카츄", 5, "영탁", 4, "마리오", 10);
		
		//Map에서 key만 보면 Set의 형태
		//-> key만 우선 추출해 출력하고, value는 필요 시 가져와 사용
		//-> 개별 데이터 출력에 특화되어 있음
		
		Set<String> names = vote.keySet();//vote의 key만 추출
		for(String name : names) {
			int count = vote.get(name);
			System.out.println("이름 = " + name + ", 득표수 = " + count);
		}
	}
}
