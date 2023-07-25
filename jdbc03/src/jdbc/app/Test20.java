package jdbc.app;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test20 {
	public static void main(String[] args) {
		
		int boardNo = 1;
		
		BoardDao dao = new BoardDao();
		BoardDto dto = dao.selectOne(boardNo);
		
		if(dto == null) {
			System.out.println("해당 번호의 게시글이 없습니다");
		}else {
			System.out.println("[" + dto.getBoardNo() + " 번호의 게시글 정보입니다]");
			System.out.println("제목: " + dto.getBoardTitle());
			System.out.println("내용: " + dto.getBoardContent());
			System.out.println("작성자: " + dto.getBoardWriter());
			System.out.println("조회수: " + dto.getBoardReadCount());
		}
	}
}
