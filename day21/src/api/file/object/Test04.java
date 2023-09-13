package api.file.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Test04 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Test02에서 생성한 로또 번호를 확인
		
		File target = new File("sample/lotto.kh");
		
		FileInputStream stream = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(stream);
		ObjectInputStream obj = new ObjectInputStream(buffer);
	
		List<Integer> number = (List<Integer>) obj.readObject();
		System.out.println(number);

		obj.close();
	}
}
