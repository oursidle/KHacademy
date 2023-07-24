package jdbc.app;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class test03 {
	public static void main(String[] args) {
		
		BookDto dto = new BookDto();
		dto.setBookId(12);
		dto.setBookTitle("신규도서");
		dto.setBookAuthor("신규저자");
		dto.setBookPublicationDate("2023-07-24");
		dto.setBookPrice(200);
		dto.setBookPublisher("신규출판사");
		dto.setBookPageCount(100);
		dto.setBookGenre("신규");
		
		BookDao dao = new BookDao();
		dao.insert(dto);
		
		System.out.println("등록 완료!");
	}
}
