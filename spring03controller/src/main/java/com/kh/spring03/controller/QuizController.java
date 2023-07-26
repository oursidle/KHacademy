package com.kh.spring03.controller;

import java.time.LocalDate;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController//애노테이션(Annotation) - 역할 정의
public class QuizController {
	Random r = new Random();
	
	@RequestMapping("/dice")
	public String dice() {
		int dice = r.nextInt(6)+1;
		return "주사위 번호: " + dice;
//		System.out.println("주사위 번호: " + dice); -> 사용자에게 보이지 않음
	}
	
	@RequestMapping("/lotto")
	public String lotto() {
		int lotto = r.nextInt(45)+1;
		return "로또 번호: " + lotto;
	}
	
	//(추가) 스프링은 역할을 명시하는 것을 선호한다
	//- @RequestParam을 변수 앞에 붙여 파라미더임을 표시
	@RequestMapping("/square")
	public String quare(@RequestParam int number) {
		return number + "의 제곱: " + (number * number);
	}
	
	//(추가) 연도가 주어지지 않으면 실행을 하지 않을 것인가?
	//- 파라미더가 없어도 실행되어야 하는 상황(ex: 기본값)
	//- 만약 birth가 제공되지 않는다면 성인 요금을 부여
	//- @RequestParam에 required=false 옵션을 주면 없어도 됨
	//- @RequestParam에 defaultValue를 설정하여 기본값을 지정(문자열)
	@RequestMapping("/subway")
	public String subway(
			@RequestParam(required = false, defaultValue = "2000") int birth) {
		int age = LocalDate.now().getYear() - birth + 1;
		int price;
		if(age >= 65 || age < 8) {
			price = 0;
		}else if(age >= 20) {
			price = 1250;
		}else if(age >= 14) {
			price = 720;
		}else {
			price = 450;
		}
		return "지하철 요금은 " + price + "원";
	}
	
	@RequestMapping("/leap")
	public String leap(@RequestParam int year) {
		boolean is4 = year % 4 == 0;
		boolean isNot100 = !(year % 100 == 0);
		boolean is400 = year % 400 == 0;
		boolean leapYear = is400 || is4 && isNot100;
		if(leapYear) {
			return year + "년은 윤년입니다";
		}else {
			return year+"년은 윤년이 아닙니다";
		}
	}
	
	@RequestMapping("/circle")
	public String circle(@RequestParam int r) {
		double area = Math.PI * r * r;
		return "원의 넓이: " + area;
	}
}