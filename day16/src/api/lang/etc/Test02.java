package api.lang.etc;

public class Test02 {
	public static void main(String[] args) {
		//Math 클래스
		//= 객체를 의도적으로 생성 불가 처리하고 전부 static 키워드를 사용
		//= 객체 없이 편하게 호툴이 가능하도록 구성
		
		//필드
		System.out.println(Math.PI);//원주율
		System.out.println(Math.E);//자연지수(Exp)
		
		//메소드
		System.out.println(Math.abs(10 - 20));//절대값(absolute)
		System.out.println(Math.abs(20 - 10));
		
		System.out.println(Math.round(1.4));//반올림
		System.out.println(Math.round(1.5));
		
		System.out.println(Math.floor(1.4));//버림
		System.out.println(Math.floor(1.5));
		
		System.out.println(Math.ceil(1.4));//버림
		System.out.println(Math.ceil(1.5));
		
		System.out.println(Math.pow(2, 10));//2의 10제곱
		
		System.out.println(Math.sqrt(9));//루트 9
		
		//Q: 피타고라스 정리의 따르면 직각삼각형에서 밑변^2 + 높이^2 = 빗변^2 이다.
		//밑변이 3이고 높이가 4일 때 빗변의 길이를 구하세요
		
//		double result1 = Math.pow(3, 2);
//		double result2 = Math.pow(4, 2);
//		double result3 = result1 + result2;
//		System.out.println(Math.pow(result3, 2));
		
		double result = Math.hypot(3, 4);
		System.out.println(result);
		
	}
}
