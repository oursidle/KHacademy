package jdbc.app;

import java.util.List;

import jdbc.dao.PocketmonDao;
import jdbc.dto.PocketmonDto;

public class Test13 {
	public static void main(String[] args) {
		//저장된 포켓몬스터를 모두 불러오겠다
		
		PocketmonDao dao = new PocketmonDao();
		List<PocketmonDto> list = dao.selectList();
		
		//list를 활용해서 하고 싶은 작업 진행(반복문, 조건, 출력)
		System.out.println("조회 결과 수: " + list.size());
		for(PocketmonDto dto : list) {
			System.out.println(dto);
		}
	}
}