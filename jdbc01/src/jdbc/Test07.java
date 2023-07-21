package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("게시글 제목: ");
		String boardTitle = sc.nextLine();
		
		System.out.print("게시글 내용: ");
		String boardContent = sc.nextLine();
		
		System.out.print("게시글 작성자: ");
		String boardWriter = sc.nextLine();
		
		sc.close();
		
		String sql = "insert into board("
				+ "board_no, board_title, board_content, board_writer,"
				+ "board_readcount"
				+ ") values(board_seq.nextval, ?, ?, ?, 0)";
		Object[] data = {
				boardTitle, boardContent, boardWriter
		};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql, data);
		
		System.out.println("게시글이 등록되었습니다.");
	}
}

/*
게시글 제목: 수댕이의 입양을 축하합니다
게시글 내용: 수댕이가 트레이너를 꿈꾸는 멋진 소년에게 입양을 가게 되었습니다. 수댕이의 행복을 위해 우리 모두 축하해줍시다
게시글 작성자: doctoroh12
*/