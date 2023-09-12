package com.kh.springhome.rest;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.springhome.dao.BoardLikeDao;
import com.kh.springhome.dto.BoardLikeDto;
import com.kh.springhome.vo.BoardLikeVO;

//@CrossOrigin
@RestController
@RequestMapping("/rest/like")
public class BoardLikeRestController {
	
	@Autowired
	private BoardLikeDao boardLikeDao;
	
	//구현해야 하는 기능
	//[1] 좋아요 설정/해제를 수행하는 매핑: 사용자가 좋아요 클릭 시 처리
	//[2] 좋아요 상태를 확인하는 매핑: 사용자 최초 화면에 표시할 좋아요 확인
	
	@RequestMapping("/check")
	public BoardLikeVO check(@ModelAttribute BoardLikeDto boardLikeDto,
										HttpSession session) {
		String memberId = (String)session.getAttribute("name");
		boardLikeDto.setMemberId(memberId);
		
		boolean isCheck = boardLikeDao.check(boardLikeDto);
		int count = boardLikeDao.count(boardLikeDto.getBoardNo());
		
		BoardLikeVO vo = new BoardLikeVO();
		vo.setCheck(isCheck);
		vo.setCount(count);
		
		return vo;//JSON방식으로 프론트에 전송
		
		//return isCheck ? "Y" : "N";//좋아요 여부 단순 확인(반환형 String)
	}
	
	@RequestMapping("/action")
	public BoardLikeVO action(@ModelAttribute BoardLikeDto boardLikeDto,
										HttpSession session) {
		String memberId = (String)session.getAttribute("name");
		boardLikeDto.setMemberId(memberId);
		
		boolean isCheck = boardLikeDao.check(boardLikeDto);
		if(isCheck) {
			//체크가 되어 있다면 체크 해제
			boardLikeDao.delete(boardLikeDto);
		}else {
			//체크가 되어 있지 않다면 체크 설정
			boardLikeDao.insert(boardLikeDto);
		}
		int count = boardLikeDao.count(boardLikeDto.getBoardNo());
		
		BoardLikeVO vo = new BoardLikeVO();
		vo.setCheck(!isCheck);
		vo.setCount(count);
		
		return vo;
	}
}
