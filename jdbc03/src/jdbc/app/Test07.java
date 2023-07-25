package jdbc.app;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test07 {
	public static void main(String[] args) {
		
		BoardDto dto = new BoardDto();
		dto.setBoardNo(1);
		dto.setBoardTitle("흔들풍선의 생일을 축하합니다");
		dto.setBoardContent("오늘은 흔들풍선의 생일입니다. 모두 축하해주세요");
		
		BoardDao dao = new BoardDao();
		boolean result = dao.update(dto);
		
		if(result) {
			System.out.println("변경 완료");
		}else {
			System.out.println("게시글 수정 완료");
		}
	}
}
