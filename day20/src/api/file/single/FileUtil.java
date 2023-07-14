package api.file.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
	//파일 복사 메소드
	public static void copy(File origin, File sample) throws IOException {
		FileInputStream inStream = new FileInputStream(origin);
		FileOutputStream outStream = new FileOutputStream(sample); 
		
		while(true) {
			int read = inStream.read();
			if(read == -1) break;
			outStream.write(read);
		}
		inStream.close();
		outStream.close();
	}
}
