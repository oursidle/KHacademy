package com.kh.spring10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10.dao.BookDao;
import com.kh.spring10.dto.BookDto;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookDao dao;
	
	@RequestMapping("/detail")
	public String detail(@RequestParam int bookId, Model model) {
		BookDto dto = dao.selectOne(bookId);
		model.addAttribute("dto", dto);
		return "/WEB-INF/views/book/detail.jsp";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<BookDto> list = dao.selectList();
		model.addAttribute("list", list);
		return "/WEB-INF/views/book/list.jsp";
	}
	
	//등록
	//- 등록은 주소를 두 개로 나눠서 작성
	//- Get(입력), POST(처리)
	// -@GetMapping, @PstMapping 어노테이션 사용
	
	//@RequestMappint("/insert")
	//@RequestMappint(value="/insert", method=RequestMethod.GET)
	@GetMapping("/insert")
	public String insert() {
		return "/WEB-INF/views/book/insert.jsp";
	}
	
	//@RequestMapping(value="/insert", method="RequestMethod.POST)
	@PostMapping("/insert")
	public String insert(@ModelAttribute BookDto dto) {
		dao.insert(dto);
		//더이상 할 작업이 없으므로 다른 페이지로 강제 이동(리다이렉트, redirect)
		//변환되는 문자열이 redirect:로 시작하면 스프링이 리다이렉트로 처리
		return "redirect:list";//절대경로
	}
	
	@GetMapping("/edit")
	public String edit(@RequestParam int bookId, Model model) {
		BookDto dto = dao.selectOne(bookId);
		model.addAttribute("dto", dao.selectOne(bookId));
		return "/WEB-INF/views/book/edit.jsp";
	}
	
	@PostMapping("/edit")
	public String edit(@ModelAttribute BookDto dto) {
		boolean result = dao.update(dto);
		if(result) {
			return "redirect:detail?bookId="+dto.getBookId();
		}else {
			return "redirect:에러페이지";
		}
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam int bookId) {
		boolean result = dao.delete(bookId);
		if(result) {
			return "redirect:list";
		}else {
			return "redirect:에러페이지";
		}
	}
}