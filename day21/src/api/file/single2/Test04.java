package api.file.single2;

import java.io.File;

public class Test04 {
	public static void main(String[] args) {
		
//		파일 삭제는 가능하지만 디렉토리는 비어있는 것만 삭제가 가능
//		File target = new File("D:/dummy");
//		target.delete();
		
		File target = new File("D:/dummy");
		
		FileUtil.delete(target);
	}
}
