package com.kh.spring15;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.BookDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test05 {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		BookDto dto = new BookDto();
		dto.setBookId(11);
		int count = sqlSession.delete("book.del", dto);
		boolean result = count > 0;
		log.debug("result = {}", result);
	}
}
