package api.lang.string3;

public class Test02_2 {
	public static void main(String[] args) {
		//문자열 덧셈 성능 측정
		//- 싱글 스레드 환경에서는 StringBuilder가 효율적(잠금장치가 필요 없으니까)
		//- 멀티 스레드 환경에서는 StringBufferr가 효율적. 느리지만(잠금장치가 필요하니까) 안전
		
		long start = System.currentTimeMillis();//측정 시작
		
		StringBuilder builder = new StringBuilder();
		for(int i=0; i < 100000000; i++) {
			builder.append("*");
		}
		String star = builder.toString();
		
		long end = System.currentTimeMillis();//측정 종료
		
		long time = end - start;
		System.out.println("time = " + time);
	}
}
