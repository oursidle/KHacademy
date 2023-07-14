package api.collection5;

import java.util.Stack;

public class Test01 {
	public static void main(String[] args) {
		//이용 방법이 정해져 있는 저장소
		
		Stack<String> stack = new Stack<>();
		
		//추가
		stack.push("구글");
		stack.push("네이버");
		stack.push("카카오");
		stack.push("KH정보교육원");
		
		//확인
		System.out.println(stack.peek());//가장 최신 데이터 출력
		
		//제거(Last In First Out)
		stack.pop();
		System.out.println(stack.peek());
		
		stack.pop();
		System.out.println(stack.peek());
		
		System.out.println(stack);
	}
}
