package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.BookDto;
import jdbc.mapper.BookMapper;
import jdbc.util.JdbcUtils;

public class Test04 {
	public static void main(String[] args) {
		
		String sql = "select * from book order by book_id desc";
		
		BookMapper mapper = new BookMapper();
		JdbcTemplate jdbcTemplate =JdbcUtils.getJdbcTemplate();
		List<BookDto> list = jdbcTemplate.query(sql, mapper);
		
		System.out.println("조회수: " + list.size());
		for(BookDto dto : list) {
			System.out.println(dto);
		}
	}

}
