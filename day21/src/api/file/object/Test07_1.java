package api.file.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Test07_1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("게임 시작!");
		System.out.print("아이디를 설정하세요: ");
		
		String id = sc.nextLine();
		Player player = new Player(id, 0, 0);
		
		while(true) {
			System.out.print("1. 정보 출력 | 2. 레벨 업 | 3. 종료 : ");
			int num = sc.nextInt();
			int count;
			
			switch(num) {
			case 1:
				System.out.println("아이디: " + player.getId());
				System.out.println("레벨: " + player.getLevel());
				System.out.println("소지금: " + player.getMoney());
				continue;
			case 2:
				count = player.getLevel();
				count += 1;
				player.setLevel(count);
				System.out.println("레벨이 1 증가했습니다.");
				continue;
			case 3:
				sc.close();
				System.out.println("프로그램을 저장하였습니다.");
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			break;
		}
		
		File target = new File("sample/player.kh");
		
		if(!target.exists()) {
			target.createNewFile();
		}

		FileOutputStream stream = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(stream);
		ObjectOutputStream obj = new ObjectOutputStream(buffer);
			
		obj.writeObject(player);
		
		obj.close();
		buffer.close();
		stream.close();
	}
}
