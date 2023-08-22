package com.kh.springhome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.springhome.dao.BoardDao;
import com.kh.springhome.dao.MemberDao;
import com.kh.springhome.dto.BoardListDto;
import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.error.NoTargetException;
import com.kh.springhome.vo.PaginationVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private BoardDao boardDao;

	@RequestMapping("/home")
	public String home() {
		return "/WEB-INF/views/admin/home.jsp";
	}
	
	@RequestMapping("/member/list")
	public String memberList(@ModelAttribute PaginationVO vo, Model model) {
		int count = memberDao.countList(vo);
		vo.setCount(count);
		model.addAttribute("vo", vo);
		
		List<MemberDto> list = memberDao.selectListByPage(vo);
		model.addAttribute("list", list);
		
		return "/WEB-INF/views/admin/member/list.jsp";
	}
	
	@RequestMapping("/member/detail")
	public String memberDetail(@RequestParam String memberId, Model model) {
		//파라미터로 전달된 아이디의 회원정보를 조회하여 모델에 첨부
		MemberDto memberDto = memberDao.selectOne(memberId);
		model.addAttribute("memberDto", memberDto);
		
		List<BoardListDto> boardList = boardDao.selectListByBoardWriter(memberId);
		model.addAttribute("boardList", boardList);
		
		return "/WEB-INF/views/admin/member/detail.jsp";
	}
	
	@GetMapping("/member/edit")
	public String memberEdit(Model model, @RequestParam String memberId) {
		
		MemberDto memberDto = memberDao.selectOne(memberId);
		model.addAttribute("memberDto", memberDto);
		
		return "/WEB-INF/views/admin/member/edit.jsp";
	}
	@PostMapping("/member/edit")
	public String memberEdit(@ModelAttribute MemberDto memberDto) {
		boolean result = memberDao.updateMemberInfo(memberDto);
		if(result) {
			return "redirect:list";//상대경로
			//return "redirect:/admin/member/list";//절대경로
		}else {
			throw new NoTargetException("존재하지 않는 회원 ID");
		}
	}
}
