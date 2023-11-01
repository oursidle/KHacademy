package com.kh.springhome;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LoggingTest1 {
	//로깅(Logging): 로그(Log)를 작성하는 행위
	//로그(Log): 프로그램 상태에 대한 기록
	//로그를 남기는 방법:
	//		- System.out.println() 또는 System.err.println() 사용
	//		- 로깅 라이브러리 사용:
	//				- java.util.logging 패키지
	//				- Log4J: Spring Legacy 기본 기술
	//				- Logback: Spring Boot 기본 기술
	
	//로거(Logger)를 생성하여 로깅을 처리할 수 있도록 구현
	private Logger log = LoggerFactory.getLogger(LoggingTest1.class);
	
	@Test
	public void test() {
		//System.out.println("메세지");
		log.trace("메세지1");
		log.debug("메세지2");
		log.info("메세지3");
		log.warn("메세지4");
		log.error("메세지5");
	}
}
