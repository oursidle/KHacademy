package oop.multi2;

public class Kickboard implements Electronic, Transportation{

	@Override
	public void move() {
		System.out.println("전동킥보드가 이동합니다.");
	}
	@Override
	public void on() {
		System.out.println("전동킥보드가 켜집니다.");
	}
	@Override
	public void off() {
		System.out.println("전동킥보드가 꺼집니다.");
	}
}
