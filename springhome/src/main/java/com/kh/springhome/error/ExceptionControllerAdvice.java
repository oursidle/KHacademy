package com.kh.springhome.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
	컨트롤러를 간섭하여 예외 상황을 다르게 처리하도록 하는 객체
	- 등록 시 @ControllerAdvice 라고 등록
	- @RestController 를 간섭할 경우에는 @RestControllerAdvice 를 사용
	- 적용 대상을 옵션으로 지정
 */
//@ControllerAdvice(basePackages = {"com.kh.springhome.controller"})//패키지가 잘 나뉘어있을 경우 콕 집어 설정
@ControllerAdvice(annotations = {Controller.class})//패키지가 잘 나뉘어있지 않을 경우 '@Controller'로 지정된 것을 찾아 설정
public class ExceptionControllerAdvice {
	/**
		예외는 @ExceptionHandler 메소드로 처리 가능
		- 처리할 예회의 종류 지정 가능
		- 메소드의 형태는 컨트로러와 같음
		- try 구문의 catch 블록과 같은 역할을 수행
		- 이 메소드에는 컨트롤러처럼 매개변수를 선언하면 사용할 수 있다
			- Model, HttpSession 등 기본적인 컨트롤러의 도구 사용 가능
			- catch 처럼 예외 처리 객체를 선언할 수 있다
	 */
	@ExceptionHandler(Exception.class)//Exception이 발생됐을 때 이 Mapping을 사용하겠다
	public String error(Exception e) {
		e.printStackTrace();
		return "/WEB-INF/views/error/500.jsp";
	}
	/**
		내가 지정한 예외들을 처리하도록 추가 핸들러(처리기) 설정
	 */
	@ExceptionHandler(NoTargetException.class)
	public String noTarget(NoTargetException e) {
			return "/WEB-INF/views/error/noTarget.jsp";
	}
	@ExceptionHandler(AuthorityException.class)
	public String authority(AuthorityException e) {
		e.printStackTrace();
		return "/WEB-INF/views/error/authority.jsp";
	}
}

/**
	스프링이 인식하지 못 하는 예외
	- 실행은 됐지만 적용대상이 없음
*/

/**
	[1] 수정/삭제/상세 등에서 대상이 없는 경우
	[2] 권한 부족
 */