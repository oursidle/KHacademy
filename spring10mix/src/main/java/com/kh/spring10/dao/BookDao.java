package com.kh.spring10.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring10.dto.BookDto;
import com.kh.spring10.mapper.BookMapper;

@Repository//영속성 제어 객체로 Spring에 등록
public class BookDao {
	
	@Autowired//사용 등록
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private BookMapper mapper;
	
	public void insert(BookDto dto) {
		String sql = "insert into book ("
				+ " book_id, book_title, book_author, book_publication_date,"
				+ " book_price, book_publisher, book_page_count, book_genre"
				+ " ) values (?, ?, ?, ?, ?, ?, ?, ?)";
		Object[] data = {
				dto.getBookId(), dto.getBookTitle(), dto.getBookAuthor(),
				dto.getBookPublicationDate(), dto.getBookPrice(), dto.getBookPublisher(),
				dto.getBookPageCount(), dto.getBookGenre()
			};
		jdbcTemplate.update(sql, data);
	}
	
	public List<BookDto> selectList(){
		String sql = "select * from book order by book_id desc";
		return jdbcTemplate.query(sql, mapper);
	}
	
	public BookDto selectOne(int  bookId) {
		String sql = "select * from book where book_id = ?";
		Object[] data = {bookId};
		List<BookDto> list = jdbcTemplate.query(sql, mapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
	
	public boolean update(BookDto dto) {
		String sql = "update book"
				+ " set"
				+ " book_title = ?, book_author = ?,"
				+ " book_publication_date = ?, book_price = ?, book_publisher = ?,"
				+ " book_page_count = ?, book_genre = ?"
				+ " where book_id = ?";
		Object[] data = {
				dto.getBookTitle(), dto.getBookAuthor(), dto.getBookPublicationDate(),
				dto.getBookPrice(), dto.getBookPublisher(),
				dto.getBookPageCount(), dto.getBookGenre(),
				dto.getBookId()
			};
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	public boolean delete(int bookId) {
		String sql = "delete book where book_id = ?";
		Object[] data = {bookId};
		return jdbcTemplate.update(sql, data) > 0;
	}
}
