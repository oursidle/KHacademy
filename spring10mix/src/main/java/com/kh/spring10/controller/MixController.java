package com.kh.spring10.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MixController {
	//목표: 컨트롤러에서 계산한 값을 JSP에서 출력
	//- 전달하는 매개체가 필요
	//- Model을 매개 변수에 선언하면 자동으로 사용할 수 있도록 스프링이 제공
	//- 선언한 Model에 key=value 형태로 데이터로 저장하면 JSP로 넘어감
	@RequestMapping("/test01")
	public String test01(Model model) {
		//계산 코드(비즈니스 로직)
		Random r = new Random();
		int dice = r.nextInt(6)+1;
		//model에 추가
		//model.addAttribute(이름, 값)
		
		//JSP에서 dice라는 이름으로 사용할 수 있도록 값을 전달한다
		model.addAttribute("dice", dice);
		return "/WEB-INF/views/test01.jsp";
	}
}
