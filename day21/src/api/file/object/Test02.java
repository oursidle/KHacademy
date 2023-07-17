package api.file.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;

public class Test02 {
	public static void main(String[] args) throws IOException {
		Random r = new Random();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i < 6; i++) {
			int number = r.nextInt(45) + 1;
			if(list.contains(number)) {
				i --;
			}else {
				list.add(number);
			}
		}
		System.out.println(list);
		
		File target = new File("sample/lotto.kh");
		
		FileOutputStream stream = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(stream);
		ObjectOutputStream obj = new ObjectOutputStream(buffer);
		
		obj.writeObject(list);
		
		obj.close();
	}
}
