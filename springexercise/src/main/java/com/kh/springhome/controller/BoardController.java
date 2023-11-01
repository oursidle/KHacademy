package com.kh.springhome.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.springhome.dao.BoardDao;
import com.kh.springhome.dto.BoardDto;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardDao boardDao;
	
	//등록
	@GetMapping("/write")
	public String write() {
		return "/WEB-INF/views/board/write.jsp";
	}
	@PostMapping("/write")
	public String write(
			@ModelAttribute BoardDto boardDto,
			HttpSession session) {
		int boardNo = boardDao.sequence();
		boardDto.setBoardNo(boardNo);
		
		String memberId = (String) session.getAttribute("name");
		boardDto.setBoardWriter(memberId);
		
		boardDao.insert(boardDto);
		
		return "redirect:detail?boardNo="+boardNo;
	}
	
	//목록
	@RequestMapping("/list")
	public String list(Model model) {
//		List<BoardDto> list = boardDao.selectList();
//		model.addAttribute("list", list);
		model.addAttribute("list", boardDao.selectList());
		return "/WEB-INF/views/board/list.jsp";
	}
	
	//상세
	@RequestMapping("/detail")
	public String detail(@RequestParam int boardNo, Model model) {
		BoardDto boardDto = boardDao.selectOne(boardNo);
		model.addAttribute("boardDto", boardDto);
		return "/WEB-INF/views/board/detail.jsp";
	}
}
