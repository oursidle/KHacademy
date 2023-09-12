package api.file.object;

import java.io.Serializable;

//캐릭터 클래스
//= 입출력이 가능하도록 마킹 처리
public class Player_1 implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	private int level;
	private int money;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public Player_1(String id, int level, int money) {
		super();
		this.setId(id);
		this.setLevel(level);
		this.setMoney(money);
	}
	
	public void show() {
		System.out.println("< 캐릭터 정보 >");
		System.out.println("아이디: " + this.getId());
		System.out.println("레벨: " + this.getLevel());
		System.out.println("소지금: " + this.getMoney());
	}
	
}
