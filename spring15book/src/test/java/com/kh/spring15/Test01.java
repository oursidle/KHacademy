package com.kh.spring15;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.BookDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test01 {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
//		BookDto dto = new BookDto();
//		dto.setBookTitle("트렌드 코리아 2024");
//		dto.setBookAuthor("김난도");
//		dto.setBookPublicationDate("2023-10-12");
//		dto.setBookPrice(19000);
//		dto.setBookPublisher("미래의 창");
//		dto.setBookPageCount(950);
//		dto.setBookGenre("경제");
		
//		BookDto dto = BookDto.builder().bookTitle("테스트서적").build();
		
		sqlSession.insert("book.add", BookDto.builder()
				.bookTitle("테스트서적")
				.bookAuthor("테스트저자")
				.bookPublicationDate("2023-10-12")
				.bookPrice(10000)
				.bookPublisher("테스트출판사")
				.bookPageCount(100)
				.bookGenre("테스트장르")
				.build());
	}
}
