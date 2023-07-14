package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03_1 {
	public static void main(String[] args) {
		//투표함 만들기
		Map<String, Integer> vote = new HashMap<>();
		
		while(true) {
			//사용자가 투표한 내용을 투표함에 반영
			Scanner sc = new Scanner(System.in);
			System.out.println("당신의 아이돌에게 투표하세요!");
			String name = sc.nextLine();
			
			if(name.equals("종료")) {
				break;
			}
			
			name = name.replace(" ", "").toLowerCase();
			
			int count;
			if(vote.containsKey(name)) {
				count = vote.get(name);
			}else {
				count = 0;
			}
			count ++;
			vote.put(name, count);
			System.out.println("[" + name + "] 현재 " + count +"표 획득!");
		}
	
		
		//출력
		System.out.println(vote);
	}
}