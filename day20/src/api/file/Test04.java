package api.file;

import java.io.File;

public class Test04 {
	public static void main(String[] args) {
		//경로(path)
		//= PC마다 설치된 디스크 환경 다름
		//= D:/와 같은 절대적인 위치는 다른 PC에서 인식하지 못 할 수 있음
		//= 다른 운영체게나 환경에서도 작동하는 경로를 설정하고 싶음
		
		//[1] 상대경로
		//- '.'은 현재 위치(current path)를 의미
		//- '..'은 상위 위치(parent path)를 의미
		//[2] System 클래스 활용
		
		
		//[1]
		File a = new File("./sample");//프로젝트 범위에서 경로를 탐색
		a.mkdirs();
		
		File b = new File("../dummy");
		b.mkdirs();
		
		
		//[2]
		System.out.println(System.getProperty("user.home"));//사용자 홈 폴더
		System.out.println(System.getProperty("user.dir"));//프로그램 실행 위치
		
		File c = new File(System.getProperty("user.home"), "dummy");
		c.mkdirs();
	}
}
