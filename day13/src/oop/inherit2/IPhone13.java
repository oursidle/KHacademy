package oop.inherit2;

//하위 클래스, 자식 클래스, 구현체
//= 실체 객체(제품)을 생성하기 위해 만드는 클래스
//= extends라는 키워드로 클래스를 지정하여 내용을 가져올 수 있음
public class IPhone13 extends IPhone {
	//필드 - 3개(상속받은 것)
	//메솓 - 2개(상속받은 것) + 1개(고유 기능)
	public void siri() {
		System.out.println("시리야");
	}
}
