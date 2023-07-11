package api.time;

import java.time.LocalDate;
import java.time.Period;

public class Test08 {
	public static void main(String[] args) {
		//java.time 패키지 (Java 8+)
		//- 완전히 새롭게 구축된 시간과 관련된 클래스의 모음
		//- 기존의 시간 클래스들은 날짜와 시간을 따로 생각할 수 없음
		//			-날짜만 쓸 때: LocalDate
		//			-시간만 쓸 때: LocalTime
		//			-날짜와 시간을 모두 쓸 때: LocalDateTime
		//- 월을 1~12로 관리하도록 개선됨
		//- 명령으로 단순화함
		//- 불변으로 관리하도록 설정함(=문자열). -> 다중 스레드 환경에서 안전
		
		//LocalDate 사용
		LocalDate a = LocalDate.of(2000, 1, 1);//수치
		System.out.println("a = " + a);
		System.out.println("연도 = " + a.getYear());
		System.out.println("월 = " + a.getMonthValue());
		System.out.println("일 = " + a.getDayOfMonth());
		
		LocalDate b = LocalDate.parse("2023-11-29");//해석
		System.out.println("b = " + b);
		
		LocalDate c = LocalDate.now();//현재
		System.out.println("c = " + c);
		
		//이전/이후 비교
		//= 수료 했습니까?
		//= 오늘은 수료일보다 이전입니까?
		System.out.println(c.isBefore(b));
		System.out.println(b.isAfter(c));
		
		//윤년
		System.out.println(a.isLeapYear());
		System.out.println(b.isLeapYear());
		System.out.println(c.isLeapYear());
		
		//계산
		//(Q): 수료일 100일 전은 언제입니까?
		LocalDate before100 = b.minusDays(100L);
		System.out.println(before100);
		
		//두 날짜의 차이(ex: 오늘과 수료일의 차이)
		//= 유틸리티 클래스인 Period를 사용하여 차이를 구한다
		Period period = Period.between(c, b);
		System.out.println(period);
		System.out.println(period.getYears());//남은 기간(연)
		System.out.println(period.getMonths());//남은 기간(월)
		System.out.println(period.getDays());//남은 기간(일)
	}
}
