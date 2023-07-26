package com.kh.spring03.controller;

import java.util.Random;
import java.util.Scanner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//애노테이션(Annotation) - 역할 정의
public class QuizController {
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	
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
	
	@RequestMapping("/square")
	public String quare() {
		int square = sc.nextInt();
		return square + "의 제곱: " + (square * square);
	}
	
	@RequestMapping("/subway")
	public String subway() {
		int year = 2023;
		int birth = sc.nextInt();
		int subway = year - birth + 1;
		if(subway >= 65 || subway < 8) {
			return "지하철 요금: 무료";
		}else if(subway >= 20) {
			return "지하철 요금: 1250원";
		}else if(subway >= 14) {
			return "지하철 요금: 720원";
		}else {
			return "지하철 요금: 450원";
		}
	}
	
	@RequestMapping("/leap")
	public String leap() {
		int year = sc.nextInt();
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
	public String circle() {
		double r = sc.nextDouble();
		return "원의 넓이: " + (r * r * 3.14);
	}
}