package api.file.single2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;

public class Test03 {
	public static void main(String[] args) throws IOException {
		//파일 복사 프로그램(바이트 배열 - 버퍼 사용)
		
		//배열 준비
		byte[] buffer = new byte[10];
		
		//대상 준비
		File readTarget = new File("D:/origin.txt");
		File writeTarget = new File("sample/copy2.txt");
		
		//스트림 준비
		FileInputStream readStream = new FileInputStream(readTarget);
		FileOutputStream writeStream = new FileOutputStream(readTarget);
		
		//[읽을 파일] --> readTarget --> readStream --> [프로그램]
		//						  writeStream --> writeTarget --> [내보낼 파일]
		
		long count = 0L;//옮긴 글자수
		long total = readTarget.length();//전체 옮길 글자수
		DecimalFormat fmt = new DecimalFormat("#.##0.00");
		
		while(true) {
			int size = readStream.read(buffer);
			if(size == -1) break;
			writeStream.write(buffer, 0, size);
			count += size;
			double percent = count * 100.0 / total;
			System.out.println("[" + fmt.format(percent) + "%] " + count + " / " + total);
		}

		//파일 통로 정리
		readStream.close();
		writeStream.close();
	
	}
}