package api.file.single;

import java.io.File;
import java.io.IOException;

public class Test03_2 {
	public static void main(String[] args) throws IOException {
		
		File origin = new File("D:/", "origin.txt");//절대경로(absolute path)
		File sample = new File("sample", "copy.txt");//상대경로(relative path)

		FileUtil.copy(origin, sample);
	}
}
