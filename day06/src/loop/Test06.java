package loop;

public class Test06 {
	public static void main(String[] args) {
		//반복 범위에 변화를 주어 다양한 반복을 구현
		
		//Q: 10부터 0까지 숫자가 줄어들도록 출력
		for(int i=10; i >= 0; i--) {
			System.out.println("i = " + i);
		}
		
		//Q; 10분의 1씩 숫자가 들어들도록 출력 -> 한 자리씩 검사할 때 많이 사용
		for(int i=12345; i > 0; i /= 10) {
			System.out.println(i);
			System.out.println(i % 10); //->오른쪽부터 하나씩 검사
		}
		
		//Q: 두 배씩 들어나는 반복문
		for(int i=1; i <= 1000; i *= 2)	{
			System.out.println(i);
		}
	}
}
