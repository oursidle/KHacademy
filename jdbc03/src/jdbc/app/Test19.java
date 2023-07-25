package jdbc.app;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test19 {
	public static void main(String[] args) {
		
		int bookId = 1;
		
		BookDao dao = new BookDao();
		BookDto dto = dao.selectOne(bookId);
		
		if(dto == null) {
			System.out.println("해당 번호의 도서가 없습니다");
		}else {
			System.out.println("[" + dto.getBookId() + " 번호의 도서 정보입니다]");
			System.out.println("제목: " + dto.getBookTitle());
			System.out.println("작가: " + dto.getBookAuthor());
			System.out.println("출간일: " + dto.getBookPublicationDate());
			System.out.println("가격(달러): " + dto.getBookPrice());
			System.out.println("출판사: " + dto.getBookPublisher());
			System.out.println("장르: " + dto.getBookGenre());
		}
	}
}
