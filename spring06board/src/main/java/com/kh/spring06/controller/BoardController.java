package com.kh.spring06.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring06.dao.BoardDao;
import com.kh.spring06.dto.BoardDto;

@RestController
public class BoardController {
	
	@Autowired
	private BoardDao dao;
	
	//@ModelAttribute는 필드에 값을 채우는 명령
	@RequestMapping("/insert")
	public String insert(
			@ModelAttribute BoardDto dto) {
		dao.insert(dto);
		return "게시글 등록 완료!";
	}
	
	//@Autowired는 위에서 이미 받았으므로 또 선언하지 않음
	@RequestMapping("/update")
	public String update(
			@ModelAttribute BoardDto dto) {
		boolean result = dao.update(dto);
		
		if(result) {
			return "게시글 정보 변경 완료";
		}else {
			return "해당 번호의 게시글은 존재하지 않습니다";
		}
	}
}
