package api.file.single2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) throws IOException {
		
		int i = 16;
		
		byte[] readBuffer = new byte[i];
		File origin = new File("D:/origin.txt");
		FileInputStream readStream = new FileInputStream(origin);
		
		byte[] writeBuffer = new byte[i];
		File sample = new File("sample/copy2.txt");
		FileOutputStream writeStream = new FileOutputStream(sample);
		
		while(true) {
			int read = readStream.read(readBuffer);
			if(read == -1) break;
			System.out.print(read);
			System.out.print("\t");
			System.out.println(Arrays.toString(readBuffer));
			
			if(write.length() == 0) break;
			System.out.print(write);
			System.out.print("\t");
			System.out.println(Arrays.toString(writeBuffer));
		}
		readStream.close();
		writeStream.close();
	}
}
