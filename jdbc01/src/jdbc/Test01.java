package jdbc;

public class Test01 {
	public static void main(String[] args) {
		//JDBC(Java DataBase Connectivity)
		//= 자바를 이용해서 데이터베이스 작업을 하는 것
		//= 데이터베이스 구문을 프로그램에서 작성하여 처리하도록 중계
		
		//ex: 포켓몬스터 테이블에 데이터를 등록하는 작업
		
		//[1] 구문을 세미콜론을 제외하고 준비
		String sql = "insert into pokemon(no, name, type) "
	            + "values(43, '뚜벅초', '풀')";
		
		//DB에 대한 어떠한 정보도 없음
		//통신을 직접 구현할 것이 아니라면 도구가 필요함
		//프로젝트 우클릭 → Build path → Configure build path →Libraries 등록
	}
}
