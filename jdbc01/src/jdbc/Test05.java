package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test05 {
	public static void main(String[] args) {
		//계좌 개설 프로그램
		//= 계좌를 개설한다는 것은 Account 테이블에 테이터를 INSERT 하는 것
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("예금주 명 입력: ");
		String accountOwner = sc.nextLine();
		
		System.out.print("예금기간(년): ");
		int accountPeriod = sc.nextInt();
		
		int accoutRound = 0;
		System.out.println("납입 회차(회): " + accoutRound);
		
		System.out.print("1회 예금액(만원): ");
		int accountPayment = sc.nextInt();

		int accountBalance = 0;
		System.out.println("잔액(만원): "+ accountBalance);
		
		sc.close();
		
		String sql = "insert into Account("
				+ "account_owner, account_period, account_round,"
				+ "account_payment, account_balance"
				+ ") values(?, ?, ?, ?, ?)";
		Object[] data = {
				accountOwner, accountPeriod, accoutRound,
				accountPayment, accountBalance
		};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql, data);
		
		System.out.println("계좌가 개설되었습니다.");
		
	}
}
