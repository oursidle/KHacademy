package oop.keyword3;

//문제점
//[1] 내부 구조 복잡 -> 필드 제거
//[2] 객체 생성 必 -> static 키워드 추가
public class Calculator{
	//static 키워드가 붙으면 객체 생성이 필요하지 않음(메모리 고정)
	public static int plus(int left, int right) {
		return left + right;
	}
}
