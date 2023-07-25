package jdbc.app;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test08 {
	public static void main(String[] args) {
		
		BookDto dto = new BookDto();
		dto.setBookId(41);
		dto.setBookPrice(5400);
		
		BookDao dao = new BookDao();
		boolean result = dao.updateBookPrice(dto);
		
		if(result) {
			System.out.println("변경 완료");
		}else {
			System.out.println("도서 번호 없음");
		}
	}
}
