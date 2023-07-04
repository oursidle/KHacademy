package oop.modifier2;

public class AccountData {
	//멤버 필드
	private String name;//예금주 이름
	private int period;//총 납입기간
	private int times;//현재 납입회차
	private int price;//월 납입금액
	private int balance;//총 잔액
	
	//멤버 생성자
	AccountData(String name, int period, int price){
		this(name, period, 1, price, 0);
	}
	AccountData(String name, int period, int times, int price, int balance){
		this.setName(name);
		this.setPeriod(period);
		this.setTimes(times);
		this.setPrice(price);
		this.setBalance(balance);
	}
	
	//멤버 메소드
	public void setName(String name) {
		this.name = name;
	}
	public void setPeriod(int period) {
		switch(period) {
		case 1: case 2: case 3: case 5: case 10:
			this.period = period;
		}
	}
	public void setTimes(int times) {
		if(times < 1) return;
		if(times > this.getTotal()) return;
		this.times = times;
	}
	public void setPrice(int price) {
		if(price <= 0) return;
		this.price = price;
	}
	public void setBalance(int balance) {
		if(balance <= 0) return;
		this.balance = balance;
	}
	
	public String getName() {
		return this.name;
	}
	public int getPeriod() {
		return this.period;
	}
	public int getTimes() {
		return this.times;
	}
	public int getPrice() {
		return this.price;
	}
	public int getBalance() {
		return this.balance;
	}
	public int getMonth() {
		return this.period * 12;
	}
	public int getTotal() {
		return this.getMonth() + 1;
	}
	//만기 여부 판정 메소드
	//(참고) 논리가 반환값인 Getter 메소드는 get이 아니라 is로 시작하도록 작명
	public boolean isMaturity() {
//		if(this.getTotal() == this.getTimes()) {  -> 이것도 맞는 방법
//			return true;
//		}else {
//			return false;
//		}
		return this.getTotal() == this.getTimes();
	}
	public void next() {
		if(this.isMaturity()) return;
		this.times ++;
		this.balance += this.price;
	}
	
	public int getRemainTimes() {
		return this.getTotal() - this.getTimes();
	}
	//만기 예상 금액
	//=현재 잔고 + 남은 횟수 * 월부금
	public int getFuture() {
		return this.balance + (this.getRemainTimes()) * this.getPrice();
	}
	
	
	public void show() {
		System.out.println("< 가입자 정보 >");
		System.out.println("예금주 이름: " + this.getName());
		System.out.println("총 납입기간: " + this.period + "년 (" + this.getMonth() + ")개월");
		System.out.println("현재 납입회차: (" + this.times + " / " + this.getTimes() + ")회차");
		System.out.println("월 납입금액: "  + this.getPrice() + "만원");
		System.out.println("총 잔액: " + this.getBalance() + "만원");
		System.out.println(" => 만기 여부: " + this.isMaturity());
		System.out.println();
		
		if(this.isMaturity()) {
			System.out.println("만기 O");
		}else {
			System.out.println("만기 X");
		}
	}
}