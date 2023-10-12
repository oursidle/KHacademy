package com.kh.spring16;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring16.dto.CustomerDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test01 {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		sqlSession.insert("customer.add", CustomerDto.builder()
				.customerId("testuser6")
				.customerContact("010-1122-3344")
				.customerJoin("2022-10-12")
				.customerPurchase("2022-10-10")
				.customerMileage(10000)
				.customerLevel("VVIP")
				.build());
	}
}
