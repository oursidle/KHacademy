package com.kh.spring22.error;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice(basePackages = {"com.kh.spring22.restcontroller"})
//@RestControllerAdvice(annotations = {RestController.class})
public class ExceptionControllerAdvice {
	
	//[1] NoTargetException 발생 시 사용자에게 404 반환
	@ExceptionHandler(NoTargetException.class)
	public ResponseEntity<?> error404(Exception e){// ? = Object
		log.warn("404 발생", e);
		return ResponseEntity.notFound().build();
	}
	
	//[2] 그 외의 예외 발생 시 사용자에게 500 반환
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> error500(Exception e){
		log.error("오류 발생", e);
		return ResponseEntity.internalServerError().body("server error");
	}
}
