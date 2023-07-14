package api.file;

import java.io.File;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		File target = new File(sc.nextLine());
		
		if(target.isFile()) {//파일이면 이름 + 확장자 + 크기
			System.out.println("< 파일 정보 >");
			System.out.println("이름: " + target.getName());
			
			//확장자는 파일의 마지막 '.' 뒤에 있는 값이며, 없을 수 있음
			int index = target.getName().lastIndexOf(".");
			String extension;
			if(index == -1) {
				extension = "없음";
			}else {
				extension = target.getName().substring(index + 1);
			}
			System.out.println("확장자: " + extension);
			
			System.out.println("크기: " + target.length() + " byte");
		}else if(target.isDirectory()) {//디렉토리면 목록[파일/폴더]
			File[] list = target.listFiles();
			for(File file : list) {
				if(file.isFile()) {
					System.out.print("[파일]");
				}else if(file.isDirectory()) {
					System.out.print("[폴더]");
				}
				System.out.println(file.getName());
			}
		}else {//없으면
			System.out.println("존재하지 않는 파일 또는 폴더");
		}
		
	}
}
