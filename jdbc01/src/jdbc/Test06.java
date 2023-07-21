package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("도서명: ");
		String bookTitle = sc.nextLine();

		System.out.print("작가명: ");
		String bookAuthor = sc.nextLine();
		
		System.out.print("출판일: ");
		String bookPublicationDate = sc.nextLine();
		
		System.out.print("가격: ");
		int bookPrice = sc.nextInt();
		sc.nextLine();
		
		System.out.print("출판사: ");
		String bookPublisher = sc.nextLine();
		
		System.out.print("페이지 수: ");
		int bookPageCount = sc.nextInt();
		sc.nextLine();
		
		System.out.print("장르: ");
		String bookGenre = sc.nextLine();
		
		sc.close();
		
		String sql = "insert into book("
				+ "book_id, book_title, book_author, book_publication_date,"
				+ "book_price, book_publisher, book_page_count, book_genre"
				+ ") values (book_seq.nextval, ?, ?, ?, ?, ?, ?, ?)";
		Object[] data = {
				bookTitle, bookAuthor, bookPublicationDate,
				bookPrice, bookPublisher, bookPageCount, bookGenre
		};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql, data);
		
		System.out.println("도서가 등록되었습니다.");
	}
}