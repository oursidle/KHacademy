<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- 
	* 템플릿 페이지(template page)
	: 매번 페이지 코드를 복사할 수 없으니 미리 만든 것을 불러오도록 설정하는 것
	- 절대 경로를 사용
 --%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h2 style="color:#fba164">반갑습니다 :)</h2>
<img width="90%" src="https://i.pinimg.com/originals/d2/11/77/d21177861d4c3ee30af8ee649a033b91.jpg">

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>