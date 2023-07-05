package oop.inherit3;

//상위 클래스
public class Browser {
	//필드
	private String url;
	
	//setter, getter 메소드
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	//메소드(공통)
	public void refresh() {
		System.out.println("새로고침");
	}
	public void move() {
		System.out.println("페이지 이동");
	}
}
