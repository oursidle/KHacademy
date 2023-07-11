package api.exception;

public class Test10 {
	public static void main(String[] args) {
		//Calculator의 메소드를 호출하는 상황
		//- 예외 처리 구문을 바깥에 한 번만 만드는 것이 이상적임
		//- throws(예외 전가)처리가 된 메소드는 플랜 B를 준비하고 불러야 함
		//[1] 나도 예외를 처리하지 않겠다(플랜 B 같은 건 없다
		//[2] 예외를 처리하겠다(try~catch 구분 사용)
		
		try {
			int result = Calculator.div(10, 0);
			System.out.println("result = " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
