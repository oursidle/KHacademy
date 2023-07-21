package jdbc2;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test01 {
	public static void main(String[] args) {
		//포켓몬스터 정보 수정(Update)
		//- 포켓몬스터 항목: no, name, type
		//= 전체, 개별 모두 변경 가능
		//= 반드시 한 개의 항목은 바꾸지 않으며, 일반적으로 PK(Primary key)를 변경하지 않음
		
		//데이터 준비
		int no = 100;
		String name = "피카츄";
		String type = "전기";
		
		//수정 구문
		String sql = "update pocketmon set name = ?, type = ? where no = ?";
		Object[] data = { name, type, no };
		
		//실행 명령 INSERT와 동일
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		//실제 완료 여부 확인 불가능
		//= update는 실행 여부와 완료 여부가 같지 않음
		//= 따라서 실제로 적용된 행의 개수 확인 필요함
		//- update의 결과를 저장하여 확인 후 판정
		int result = jdbcTemplate.update(sql, data);
		System.out.println("result = " + result);
		
		if(result > 0) {
			System.out.println("임무 완료!");
		} else {
			System.out.println("임무 실패..");
		}
	}
}
