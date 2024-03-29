package jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.BoardDto;
import jdbc.dto.BookDto;
import jdbc.mapper.BookMapper;
import jdbc.util.JdbcUtils;

public class BookDao {
	
	public void insert(BookDto dto) {
		String sql = "insert into book(book_id, book_title, book_author, "
				+ "book_publication_date, book_price, book_publisher, "
				+ "book_page_count, book_genre"
				+ " ) values(book_seq.nextval, ?, ?, ?, ?, ?, ?, ?)";
		Object[] data = {dto.getBookTitle(), dto.getBookAuthor(),
				dto.getBookPublicationDate(), dto.getBookPrice(), dto.getBookPublisher(),
				dto.getBookPageCount(), dto.getBookGenre()
		};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		jdbcTemplate.update(sql, data);
	}
	
	public boolean updateBookPrice(BookDto dto) {
		String sql = "update book set book_price = ? where book_id = ?";
		Object[] data = {dto.getBookPrice(), dto.getBookId()};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	public boolean updateBookInfo(BookDto dto) {
		String sql = "update book set book_title = ?, book_author = ?,"
				+ " book_publisher = ? where book_id = ?";
		Object[] data = {
				dto.getBookTitle(), dto.getBookAuthor(), dto.getBookPublisher(),
				dto.getBookId()
		};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
	
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	public boolean delete(int bookId) {
		String sql = "delete book where book_id = ?";
		Object[] data = {bookId};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	private BookMapper mapper = new BookMapper();
	
	public List<BookDto> selectList(){
		String sql = "select * from book";
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.query(sql, mapper);
	}
	
	public BookDto selectOne(int bookId) {
		String sql = "select * from book where book_id = ?";
		Object[] data = {bookId};
		 
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		List<BookDto> list = jdbcTemplate.query(sql, mapper, data);
		
		return list.isEmpty() ? null : list.get(0);
	}
}
