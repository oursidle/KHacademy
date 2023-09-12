package api.file.single2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {
	
	//파일&디렉토리 복사 메소드
	//		-파일인 경우 버퍼를 이용하여 대량 복사 진행
	//		- 디렉토리인 경우 다음과 같은 절차를 거침
	//			1) 대상 위치 안에 원본 디렉토리 이름과 같은 디렉토리를 생성
	//			2) 원본 디렉토리 안에 있는 파일/디렉토리를 1번에서 만든 위치로 복사
	public static void copy(File origin, File target) throws IOException{
		if(origin.isFile()) {
			//읽기 위한 스트림 생성 및 조합
			FileInputStream readStream = new FileInputStream(origin);
			BufferedInputStream readBuffer = new BufferedInputStream(readStream);
			
			//쓰기 위한 스트림 생성 및 조합
			FileOutputStream writeStream = new FileOutputStream(target);
			BufferedOutputStream writeBuffer = new BufferedOutputStream(writeStream);
			
			//2GB 이내에서만 가능
			//byte[] data = readBuffer.readAllBytes();
			//writeBuffer.write(data);
			
			//무제한 가능
			while(true) {
				byte[] slice = new byte[8192];
				int size = readBuffer.read(slice);
				if(size == -1) break;
				writeBuffer.write(slice, 0, size);
			}
			
			//정리
			writeBuffer.close();
			writeBuffer.close();
			
		}else if(origin.isDirectory()) {
			//target이 없으면 생성
			if(!target.exists()) {
				target.mkdir();
			}
			
			//같은 이름으로  target 아래에 생성
			File dir = new File(target, origin.getName());
			dir.mkdirs();
			
			//origin의 내용물을 dir 내부에 복사
			File[] list = origin.listFiles();
			for(File file : list) {
				//파일이면 대상 폴더에 같은 이름으로 복사
				if(file.isFile()) {
					copy(file, new File(dir, file.getName()));//재귀호출
				}else if(file.isDirectory()) {
					//디렉토리면 대상 폴더에 하위 이름으로 생성
					copy(file, dir);//재귀호출
				}
			}
		}
	}
	
	
	//파일 폴더 삭제 메소드
	//- 일반 파일인 경우 그냥 삭제
	//- 디렉토리인 경우 내부의 모든 요소를 삭제한 뒤 디렉토리 삭제
	//		-내부에 있는 요소는 파일인지 디렉토리인지 알 수 없음
	//		-다시 검사해 삭제하도록 요청해야 함(재귀, recursive)
	public static void delete(File target) {
		if(target.isFile()	) {
			target.delete();
		}else if(target.isDirectory()) {//내용물을 지우고 다시 검사하여 처리 
			File[] list = target.listFiles();
			for(File file : list) {
				delete(file);//재귀 호출(같은 기능을 재호출)
			}
			target.delete();
		}
	}
}
