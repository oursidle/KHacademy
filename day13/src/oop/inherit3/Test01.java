package oop.inherit3;

public class Test01 {
	public static void main(String[] args) {
		//Browser는 생성하면 안 됨(상속의 의미가 없음)
		
		Chrome chrome = new Chrome();
		chrome.setUrl("https://www.google.com");
		chrome.refresh();
		chrome.move();
		chrome.develop();
		chrome.chromeStore();
		
		System.out.println();
		
		Edge edge = new Edge();
		edge.setUrl("https://www.google.com");
		edge.refresh();
		edge.move();
		edge.fullScreen();
		
		System.out.println();
		
		Whale whale = new Whale();
		whale.setUrl("https://www.google.com");
		whale.refresh();
		whale.move();
		whale.papago();
		whale.naverSearch();
		
	}
}
