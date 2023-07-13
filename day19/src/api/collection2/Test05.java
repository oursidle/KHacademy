package api.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test05 {
	public static void main(String[] args) {
		Set<String> boy = Set.of("범죄도시3", "늑대사냥", "드림", "퍼펙트게임");
		Set<String> girl = Set.of("파수꾼", "늑대사냥", "리바운드", "익스트랙션2", "드림");
		
		Set<String> both = new TreeSet<>();
		both.addAll(boy);
		both.retainAll(girl);
		System.out.println("모두 본 영화: " + both);
		
		//1. (a - b) ∪ (b - a)
		Set<String> only1 = new TreeSet<>();
		only1.addAll(boy);
		only1.removeAll(girl);
		Set<String> only2 = new TreeSet<>();
		only2.addAll(girl);
		only2.removeAll(boy);
		
		Set<String> each = new TreeSet<>();
		each.addAll(only1);
		each.addAll(only2);
		System.out.println("한 명만 본 영화: " + each);
		
		//2. (a ∪ b ) - (a ∩ b)
		Set<String> each2 = new TreeSet<>();
		each2.addAll(boy);
		each2.addAll(girl);
		each2.removeAll(both);
		System.out.println("한 명만 본 영화: " + each2);
		
		//Set도 전체 출력 가능
		//= 확장 반복(foreach)으로 가능
		for(String name : both) {
			System.out.println("name = " + name);
		}
	}
}
