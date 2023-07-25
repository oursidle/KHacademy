package jdbc.app;

import java.util.List;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test15 {
	public static void main(String[] args) {
		BookDao dao = new BookDao();
		List<BookDto> list = dao.selectList();
		
		System.out.println("조회 결과 수: " + list.size());
		for(BookDto dto : list) {
			System.out.println(dto);
		}
		
		int bookId = 1;
		
		BookDto dto = dao.selectOne(bookId);
		
		if(dto == null) {
			System.out.println("찾으시는 번호의 도서가 없습니다");
		}else {
			System.out.println(dto.getBookId());
			System.out.println(dto.getBookTitle());
			System.out.println(dto.getBookAuthor());
			System.out.println(dto.getBookPrice());
		}
	}
}
