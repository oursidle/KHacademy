package jdbc.app;

import java.util.List;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test17 {
	public static void main(String[] args) {
		
		MemberDao dao = new MemberDao();
		List<MemberDto> list = dao.selectList();
		
		System.out.println("전체: " + list.size() + "개 항목");
		for(MemberDto dto : list) {
			System.out.println(dto);
		}
	}
}
