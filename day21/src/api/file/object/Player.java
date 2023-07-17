package api.file.object;

import java.io.Serializable;

//캐릭터 클래스
//= 입출력이 가능하도록 마킹 처리
public class Player implements Serializable{
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
	
	public Player(String id, int level, int money) {
		super();
		this.setId(id);
		this.setLevel(level);
		this.setMoney(money);
	}
	
	
}
