package api.lang.string3;

public class Test02 {
	public static void main(String[] args) {
		//문자열 덧셈 성능 측정
		
		long start = System.currentTimeMillis();//측정 시작
		
		String star = "";
		for(int i=0; i < 100000; i++) {
			star += "*";
		}
		
		long end = System.currentTimeMillis();//측정 종료
		
		long time = end - start;
		System.out.println("time = " + time);
	}
}
