package api.file.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args	) throws IOException {
		//문자열 출력
		//= 문자열 출력은 반드시 인코딩이 필요
		//= Writer 계열의 클래스를 사용하여 처리
		
		File directory = new File("sample");//(디렉토리 생성)
		directory.mkdirs();
		
		File target = new File(directory, "string.kh");//(생성한 디렉토리에 파일 생성)
		//FileOutputStream stream = new FileOutputStream(target);
		FileWriter fw = new FileWriter(target);
		//BufferedOutputStream buffer = new BufferedOutputStream(stream);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Hello");
		bw.write("\n");
		bw.write("안녕하세요");
		bw.write("\n");
		bw.write("자바가 다 끝났어요");
		
		//정리(버퍼의 기본 크기인 8192가 다 차야 출력하므로 남은 용량 정리 필요)
		//bw.flush();//(잠시 정리)
		bw.close();//(완전 정리)
	}
}
