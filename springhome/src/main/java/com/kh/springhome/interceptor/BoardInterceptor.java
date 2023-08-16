package com.kh.springhome.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class BoardInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		String memberId = (String) session.getAttribute("name");
		boolean isLogin = memberId != null;
		
		if(isLogin) {
			return true;
		}else {
			response.sendRedirect(request.getContextPath() + "/member/login");
			return false;
		}
	}
}
