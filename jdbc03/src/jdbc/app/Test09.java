package jdbc.app;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test09 {
	public static void main(String[] args) {
		
		BookDto dto = new BookDto();
		dto.setBookId(41);
		dto.setBookTitle("명탐정 코난");
		dto.setBookAuthor("아오야마 고쇼");
		dto.setBookPublisher("서울문화사");
		
		BookDao dao = new BookDao();
		boolean result = dao.updateBookInfo(dto);
		
		if(result) {
			System.out.println("변경 완료");
		}else {
			System.out.println("도서 번호 없음");
		}
	}
}
