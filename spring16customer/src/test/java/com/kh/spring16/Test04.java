package com.kh.spring16;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring16.dto.CustomerDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test04 {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		CustomerDto dto = new CustomerDto();
		dto.setCustomerNo(21);
		dto.setCustomerId("testuser21");
		dto.setCustomerContact("010-2121-2121");
		dto.setCustomerJoin("2023-10-12");
		dto.setCustomerPurchase("2023-10-12");
		dto.setCustomerMileage(20000);
		dto.setCustomerLevel("플래티넘");
		
		int count = sqlSession.update("customer.edit", dto);
		boolean result = count > 0;
		log.debug("result = {}", result);
	}
}
