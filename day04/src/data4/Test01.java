package data4;

public class Test01 {
	public static void main(String[] args) {
		//글자(문자열)
		//[1] 컴퓨터는 전자제품이다
		//[2] 컴퓨터는 사람이 쓴다
		//[3] 컴퓨터는 미국인이 만들었다(영어권 글자만 교육)
		//-ASCII코드라고 부름(128개)
		//[4] 유럽인은 ASCII 코드로 글자를 다 쓰지 못 한다
		//-ASCII 코드를 확장하여 246개로 만든다(확장 ASCII 코드)
		//[5] 전 세계 사람들도 각자 쓰는 언어가 있다(자체 코드를 사용)
		//[6] 마이크로소프트가 윈도우를 개발하며 개발한 방식
		//-CP949(MS949)
		//[7] 옛날 글자를 제외하고 자주 쓰는 것만 모아 유니코드를 개발
		//-한글은 11,172자를 포함
		//-완성된 글자마다 번호를 부여하여 무식하게 처리(창제원리 무시)
		//-UTF-8 이라는 형태로 사용
		
		char a = 'H';
		char b = '밥';
		System.out.println(a);
		System.out.println(b);
		//따옴표를 사용해 한 문자만을 저장
		
		int c = b;
		System.out.println(c);
		System.out.println((int)a);
		//문자열은 숫자로 구성되어 있으며, int를 사용해서 출력이 가능함
	}
}
