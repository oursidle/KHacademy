package oop.poly1;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("*노트북을 선택하세요.");
		System.out.print("1, 맥북    2. 갤럭시북    : ");
		int type = sc.nextInt();

		Laptop laptop;
		if(type == 1) {
			laptop = new MacBook();//MacBook ---> Laptop(업캐스팅)
		}else {
			laptop = new GalaxyBook();//GalaxyBook ---> Laptop(업캐스팅)
		}
		
		System.out.println("*테스트할 기능을 선택하세요.");
		System.out.print("1. 전원    2. 동영상 재생    3. 타이핑    : ");
		int action = sc.nextInt();

		if(action == 1) {
			laptop.power();
		}else if(action == 2){
			laptop.video();
		}else {
			laptop.typing();
		}
	}
}
