package oop.keyword6;

public class Member {
	
	//필드
	private final String id;
	private String pw;
	private String name;
	
	
	//메소드
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//public String getPwMasking() {
	//	return "" + this.pw.charAt(0) + this.pw.charAt(1) + "**********";
	//} -> 맞는 방법
	public String getPwMasking() {
		String total = "";
		for(int i=0; i < this.pw.length(); i ++) {
			if(i <= 1) {
				total += this.pw.charAt(0);
			}else {
				total += "*";
			}
		}
		return total;
	}

	public void show() {
		System.out.println("< 회원 정보 >");
		System.out.println("아이디: " + this.getId());
		System.out.println("비밀번호: " + this.getPwMasking());
		System.out.println("닉네임: " + this.getName());
		System.out.println();
	}
	
	
	//생성자
	public Member(String id, String pw, String name) {
		this.id = id;
		this.pw = getPw();
		this.name = getName();
	}
	
	
}
