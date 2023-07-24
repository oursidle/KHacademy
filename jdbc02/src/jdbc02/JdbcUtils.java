package jdbc02;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//JDBC의 연결 작업을 쉽게 처리할 수 있도록 도와주는 도움 클래스
public class JdbcUtils {

	//연결 정보 상수로 저장
	public static final String driver = "oracle.jdbc.OracleDriver";
	public static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String username = "C##KH";
	public static final String passwaord = "KH";

	//실행 도구 생성 메소드
	public static JdbcTemplate getJdbcTemplate() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(driver);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(passwaord);
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate;
	}
}
