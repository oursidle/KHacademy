package jdbc.app;

import java.sql.Date;

import jdbc.dao.ProductDao;
import jdbc.dto.ProductDto;

public class Test05 {
	public static void main(String[] args) {
		
		ProductDto dto = new ProductDto();
		dto.setName("새콤달콤");
		dto.setType("사탕");
		dto.setPrice(500);
		dto.setMade(Date.valueOf("2023-06-24"));
		dto.setExpire(Date.valueOf("2023-08-24"));
		
		ProductDao dao = new ProductDao();
		dao.insert(dto);
		
		System.out.println("등록 완료!");
	}
}
