package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test08 {
	public static void main(String[] args) {
		//TIP: 오라클에 추가하는 문자열은 null이든 ""이든 모두 null로 추가됨
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디: ");//영문 소문자로 시작하며, 숫자를 포함한 8~25글자
		String memberId = sc.nextLine();
		
		System.out.print("비밀번호: ");//영문 대/소문자, 숫자, 특수문자(!@#$) 포함한 8~20 글자
		String memberPw = sc.nextLine();
		
		System.out.print("닉네임: ");//영문 대/소문자, 숫자, 완성된 한글 포함한 2~10글자
		String memberNickname = sc.nextLine();
		
		System.out.print("생년월일: ");//yyyy-MM-dd
		String memberBirth = sc.nextLine();
		
		System.out.print("이메일: ");//입력 필수 X
		String memberEmail = sc.nextLine();
		
		System.out.print("전화번호: ");//'-' 사용 X
		String memberContact = sc.nextLine();
		
		System.out.print("등급: ");//일반, VIP, 관리자 中
		String memberLevel = sc.nextLine();
		
//		System.out.print("포인트: ");//0이상으로 설정 (미 입력 시 0)
//		int memberPoint = sc.nextInt();
//		sc.nextLine();
		
//		System.out.print("가입일: ");//yyyy-MM-dd (미 지정 시 현재 시각으로 설정)
//		String memberJoin = sc.nextLine();
		
		sc.close();
		
		String sql = "insert into member("
				+ "member_id, member_pw, member_nickname, member_birth,"
				+ "member_email, member_contact, member_level"
				+") values(?, ?, ?, ?, ?, ?, ?)";
		Object[] data = {
				memberId, memberPw, memberNickname, memberBirth,
				memberEmail, memberContact, memberLevel
		};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("C##KH");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql, data);
		
		System.out.println("회원 정보가 등록되었습니다.");
	}
}

/*
아이디: testjdbc1234
비밀번호: TESTjdbc1234!
닉네임: JDBC테스트1
생년월일: 2023-07-21
이메일: jdbc1234@test.com
전화번호: 01012345678
등급: 일반
포인트: 100
가입일: 2022-07-21
*/