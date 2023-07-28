package com.kh.spring08.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring08.dao.MemberDao;
import com.kh.spring08.dto.MemberDto;

@RestController//컨트롤러 설정
@RequestMapping("/member")//공용주소
public class MemberController {

	@Autowired
	private MemberDao dao;
	
	//C
	@RequestMapping("/join")
	public String join(
			@ModelAttribute MemberDto dto) {
		dao.insert(dto);
		return "회원 등록 완료";
	}
	
	//R
	@RequestMapping("/list")
	public String list() {
		List<MemberDto> list = dao.selectList();
		StringBuffer buffer = new StringBuffer();
		for(MemberDto dto : list) {
			buffer.append(dto.getMemberId());
			buffer.append("[");
			buffer.append(dto.getMemberLevel());
			buffer.append("]");
		}
		return buffer.toString();
	}
	
	//R
	@RequestMapping("/detail")
	public String detail(@RequestParam String MemberId) {
		MemberDto dto = dao.selectOne(MemberId);
		if(dto == null) {
			return "존재하지 않는 회원입니다";
		}else {
			StringBuffer buffer = new StringBuffer();
			buffer.append("아이디: " + dto.getMemberId());
			return buffer.toString();
		}
	}
	
	//U
	//비밀번호를 변경할 때는 아이디와 변경될 비밀번호가 필요
	//그러나 여러가지 확인을 위해 추가 정보를 요구할 수 있음
	//ex, 기존 비밀번호(O), 비밀번호 확인(X)
	@RequestMapping("/password")
	public String password(
			@RequestParam String memberId,//아이디
			@RequestParam String memberPw,//기본 비밀번호
			@RequestParam String changePw) {//바꿀 비밀번호
		//일단 아이디로 DB의 회원정보를 불러온다
		MemberDto originDto = dao.selectOne(memberId);
		if(originDto == null) {
			return "존재하지 않는 아이디입니다";
		}
		if(originDto.getMemberPw().equals(memberPw)) {//비밀번호가 일치한다면
			MemberDto changeDto = new MemberDto();
			changeDto.setMemberId(memberId);
			changeDto.setMemberPw(changePw);
			dao.updateMemberPw(changeDto);
			return "변경 완료";
		}else {
			return "비밀번호가 일치하지 않습니다";
		
		}
	}
	
	//U
	@RequestMapping("/change")
	public String change(@ModelAttribute MemberDto changeDto) {
		//비밀번호 검사를 위한 회원 정보 조회
		MemberDto originDto = dao.selectOne(changeDto.getMemberId());
		if(originDto == null) {
			return "존재하지 않는 아이디입니다";
		}
		if(originDto.getMemberPw().equals(changeDto.getMemberPw()) == false){
			return "비밀번호가 맞지 않습니다";
		}
		//다 통과한 경우
		dao.updateInfo(changeDto);
		return "변경 완료";
	}
	
	//D
	//회원은 탈퇴 시에도 비밀번호를 검사해야 한다
	@RequestMapping("/exit")
	public String exit(@ModelAttribute MemberDto inputDto) {
		MemberDto originDto = dao.selectOne(inputDto.getMemberId());
		if(originDto == null) {
			return "아이디 없음";
		}
		if(originDto.getMemberPw().equals(inputDto.getMemberPw()) == false){
			return "비밀번호가 맞지 않습니다";
		}
		dao.delete(inputDto.getMemberId());
		return "안녕히가세요";
	}
}
