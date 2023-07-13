package api.collection2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test03 {
	public static void main(String[] args) {
		//좋아요 이력 관리 프로그램
		//= 비슷한 것들: 팔로우, 좋아요, 추천, 싫어요, 즐겨찾기, 구독, 알람, ...
		//토글(Toggle): 두 가지 상태를 왔다갔다 하는 것(ex: 스위치)
		
		Set<Integer> post = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("글 번호: ");
		while(true) {
			int like = sc.nextInt();
			if(like <= 0) {
				break;
			}else if(post.contains(like)) {
				post.remove(like);
				System.out.println("❤");
			}else {
				post.add(like);
				System.out.println("♥");
			}
		}
		sc.close();
		
		System.out.println("0번 글 없음");
		System.out.println("좋아요 누른 글: " + post);
	}
}
