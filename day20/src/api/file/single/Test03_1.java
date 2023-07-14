package api.file.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test03_1 {
	public static void main(String[] args) throws IOException {
		
		File origin = new File("D:/", "origin.txt");//절대경로(absolute path)
		FileInputStream inStream = new FileInputStream(origin);
		
		List<Integer> list = new ArrayList<>();
		
		File sample = new File("sample", "copy.txt");//상대경로(relative path)
		sample.createNewFile();
		FileOutputStream outStream = new FileOutputStream(sample); 
		
		for(int i=0; i < list.size(); i++) {
			outStream.write(list.get(i));
		}
		
		while(true) {
			int read = inStream.read();
			if(read == -1) break;
			list.add(read);
		}
		inStream.close();
		outStream.close();
	}
}
