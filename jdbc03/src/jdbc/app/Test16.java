package jdbc.app;

import java.util.List;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test16 {
	public static void main(String[] args) {
		
		BoardDao dao = new BoardDao();
		List<BoardDto> list = dao.selectList();
		
		System.out.println("조회 결과 수: " + list.size());
		for(BoardDto dto : list) {
			System.out.println(dto);
		}
		
		int boardNo = 1;
		
		BoardDto dto = dao.select(boardNo);
		
		if(dto == null) {
			System.out.println("찾으시는 번호의 게시글이 없습니다");
		}else {
			System.out.println(dto.getBoardNo());
			System.out.println(dto.getBoardTitle());
			System.out.println(dto.getBoardContent());
			System.out.println(dto.getBoardWriter());
		}
	}
}
