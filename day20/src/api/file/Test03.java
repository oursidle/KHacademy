package api.file;

import java.io.File;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException, InterruptedException {//-> 예외 전가
		//파일 또는 디렉토리 생성 or 삭제
		//(주의) 디렉토리는 비어있을 경우에만 삭제 가능
		
		File target = new File("D:/dummy");
		//File target = new File("D:/dummy/a/b/c");
		
		//파일로 생성: createNewFile()
		//target.createNewFile();
		
		//디렉토리로 생성: mkdir() or mkdirs()
		//target.mkdir();//중간 경로가 없을 때는 생성을 하지 않는 명령
		target.mkdirs();//중간 경로가 없으먄 생성해주는 명령
		
		Thread.sleep(5000);//5초 정지
		
		//파일, 디렉토리 모두 삭제는 동일
		//(주의) 디렉토리는 비어있는 것만 삭제 가능
		target.delete();
	}
}
