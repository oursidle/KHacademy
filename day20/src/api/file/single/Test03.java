package api.file.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException {
		
		File origin = new File("D:/", "origin.txt");//절대경로(absolute path)
		FileInputStream inStream = new FileInputStream(origin);
		
		File sample = new File("sample", "copy.txt");//상대경로(relative path)
		sample.createNewFile();
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
