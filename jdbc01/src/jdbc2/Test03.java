package jdbc2;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("변경할 번호: ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		
		System.out.print("제목: ");
		String boardTitle = sc.nextLine();
		
		System.out.print("내용: ");
		String boardContent = sc.nextLine();
		
		sc.close();
		
		String sql = "update board set"
				+ " board_title = ?, board_content = ? where board_no = ?";
		Object[] data = { boardTitle, boardContent, boardNo };
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		int result =  jdbcTemplate.update(sql, data);
		
		if(result > 0) {
			System.out.println("변경 완료");
		}else {
			System.out.println("변경 실패");
		}
	}
}
