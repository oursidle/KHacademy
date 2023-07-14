package api.file;

import java.io.File;

public class Test01 {
	public static void main(String[] args) {
		//파일(File) 제어
		//- 파일이란 무엇인가? : 글자를 저장하는 저장소
		//									- 파일이 크다 = 보관하는 글자가 많다
		//									- 글자 하나 당 1byte (자바에서 byte로 사용됨)
		//- 폴더란 무엇인가? : 파일을 구분하기 위한 장치
		//								= 디렉토리(directory)
		//								- 크기가 없음 (내부 파일의 합계)
		//- 자바에서 파일과 폴더는 어떻게 처리하는가?
		//						- java.io 패키지 (블로킹 방식) : 한 번에 하나씩 처리 (순차적 관리 가능)
		//						- java.nio 패키지 (논블로킹 방식) : 한 번에 다중 처리 (순차적 관리 불가능)
		//- 글자를 주고맏는 것 => 입출력
		
		//File 클래스 객체 생성
		File a = new File("D:/test.txt");
		File b = new File("D:/", "test.txt");
		
		//파일 정보 분석
		System.out.println(a.exists());//파일의 유무 확인
		System.out.println(b.exists());
		
		System.out.println(a.isDirectory());//디렉토리인지 확인
		
		System.out.println(a.isFile());//파일인지 확인
		
		if(a.isFile()) {
			System.out.println(a.getName());//이름 확인
			System.out.println(a.getPath());//위치 확인
			System.out.println(a.length());//파일 크기 확인(=들어있는 글자 개수)
			System.out.println(a.lastModified());//최종 수정 시각
		}
		
		//디렉토리도 File 클래스로 제어한다
		File c = new File("D:/");
		File d = new File("d:\\");
		
		if(c.isDirectory()) {
			System.out.println(c.getName());
			System.out.println(c.getPath());
			System.out.println(c.length());//(주의) 디렉토리의 크기는 의미가 없음
			
			//디렉토리는 내부에 존재하는 요소들을 추출할 수 있음
			String[] names = c.list();//이름만 추출
			File[] files = c.listFiles();//파일 객체를 추출(이름 + 나머지 정보)
			for(File file : files) {
				System.out.println(file);
			}
		}
	}
}
