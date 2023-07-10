package api.lang.etc;

import java.io.IOException;

public class Test04 {
	public static void main(String[] args) throws IOException {
		//Runtime 클래스
		//= 직접 객체 생성은 안 되고 '생성 명령'을 사용할 수 있도록 구성
		//= 생성 방법을 제작자가 원하는 방향대로 진행하기 위해 이와 같이 구성
		//= 객체 개수 제한, 객체에 설정하는 정보 제한 등 다양한 목적이 있음
		
		//Runtime rt = new Runtime();//직접 생성
		Runtime rt = Runtime.getRuntime();//생성 의뢰
		
		//메소드
		//rt.exec("실행할 명령");
		//rt.exec("notepad");//메모장(Windows)
		//rt.exec("clac");//계산기(Windows)
		//rt.exec("mspaint");//그림판(Windows)
		rt.exec("cmd /c start https://www.google.com");
	}
}
