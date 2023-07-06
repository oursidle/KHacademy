package oop.poly1;

public class GalaxyBook extends Laptop {
	@Override
	public void power() {
		System.out.println("갤럭시북의 전원 가능을 테스트합니다.");
	}
	@Override
	public void video() {
		System.out.println("갤럭시북의 동영상 재생 기능을 테스트합니다.");
	}
	@Override
	public void typing() {
		System.out.println("갤럭시북의 타이핑 기능을 테스트합니다.");
	}

}
