package jdbc.dto;

import java.sql.Date;

public class ProductDto {
	//필드: 조회 결과와 동일하게 구현
	private int no;
	private String name;
	private String type;
	private int price;
	private Date made;//java.sql.Date
	private Date expire;
	
	//기본 생성자 & setter, getter 메소드 & toString 재정의
	public ProductDto() {
		super();
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getMade() {
		return made;
	}
	public void setMade(Date made) {
		this.made = made;
	}
	public Date getExpire() {
		return expire;
	}
	public void setExpire(Date expire) {
		this.expire = expire;
	}

	@Override
	public String toString() {
		return "ProductDto [no=" + no + ", name=" + name + ", type=" + type + ", price=" + price + ", made=" + made
				+ ", expire=" + expire + "]";
	}
}
