package date2;

public class Test01 {
	public static void main(String[] args) {
		//실수가 필요한 상황
		//Q: 국어 점수가 75점, 영어 점숫가 80점일 때의 평균은?
		
		//입력
		 int korean = 75;
		 int english = 80;
		 
		 //계산
		 int average = ( korean + english ) / 2;
		 
		 //출력
		 System.out.println(average);
		 
		 
		 //실수의 두 가지 종류
		 //-float, double
		 //-표시 가능한 숫자 자릿수 차이
		 //-double을 기본 값으로 가짐. float은 float인 것을 표시(F/f)
		 //-자릿수 제한으로 인해 부정확함
		 //-자바는 부동 소숫점 방식을 이용함
		 //-(중요) 계산에 실수아 한 개라도 있다면 결과는 실수
		 
		 float  a = 3.14123456789123456789f;
		 double b = 3.14123456789123456789;
		 System.out.println(a);
		 System.out.println(b);
		 
		 System.out.println(10 / 3);
		 System.out.println(10 / 3.0);
		 System.out.println(10.0 / 3);
		 System.out.println(10.0 / 3.0);
		 System.out.println(10 / 3f);//float
		 System.out.println(10 / 3d);//double
	}
}
