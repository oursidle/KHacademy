package jdbc2;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("변경할 번호: ");
		int bookId = sc.nextInt();
		sc.nextLine();
		
		System.out.print("제목: ");
		String bookTitle = sc.nextLine();
		
		System.out.print("가격: ");
		int bookPrice = sc.nextInt();
		sc.nextLine();
		
		sc.close();
		
		
		String sql = "update book set"
				+ " book_title = ?,  book_price = ? where book_id = ?";
		Object[] data = { bookTitle, bookPrice, bookId };
		
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		
		int result = jdbcTemplate.update(sql, data);
		
		if(result > 0) {
			System.out.println("변경 완료");
		}else {
			System.out.println("변경 실패");
		}
	}
}