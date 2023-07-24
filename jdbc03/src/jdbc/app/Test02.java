package jdbc.app;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test02 {
	public static void main(String[] args) {
		//게시글 등록 프로그램
		
		//데이터
//		String boardTitle = "꼬부기의 생일을 축하합니다";
//		String boardContent = "오늘을 꼬부기의 생일입니다. 모두 축하해주세요";
//		String boardWriter = "ohhhdoctor12";
		BoardDto dto = new BoardDto();
		dto.setBoardTitle("쉐이미의 생일을 축하합니다");
		dto.setBoardContent("오늘은 쉐이미의 생일입니다");
		dto.setBoardWriter("jiwooooo345");
		
		//처리
		BoardDao dao = new BoardDao();
		dao.insert(dto);
		
	
		System.out.println("등록 완료!");
	}
}
