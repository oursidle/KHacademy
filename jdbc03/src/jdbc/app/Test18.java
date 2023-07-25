package jdbc.app;

import java.util.List;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test18 {
	public static void main(String[] args) {
		//페이지 번호를 이용하여 회원 목록을 조회
		
		int page = 1;
		int size = 10;
		
		MemberDao dao = new MemberDao();
		List<MemberDto> list = dao.selectListByPage(page, size);
		
		
		if(list.isEmpty()) {
			System.out.println("표시할 항목이 없습니다");
		}else {
			for(MemberDto dto : list) {
				System.out.print("[" + dto.getMemberId() + "]");
				System.out.println(dto.getMemberNickname());
			}
		}
	}
}
