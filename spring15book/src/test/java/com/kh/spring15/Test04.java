package com.kh.spring15;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.BookDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test04 {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		BookDto dto = new BookDto();
		dto.setBookId(9);
		dto.setBookTitle("Why Fish Don't Exist");
		dto.setBookAuthor("Miller, Lulu");
		dto.setBookPublicationDate("2021-04-06");
		dto.setBookPrice(16);
		dto.setBookPublisher("Simon & Schuster");
		dto.setBookPageCount(259);
		dto.setBookGenre("생물일반학");
		
		int count = sqlSession.update("book.edit", dto);
		boolean result = count > 0;
		log.debug("result = {}", result);
	}
}
