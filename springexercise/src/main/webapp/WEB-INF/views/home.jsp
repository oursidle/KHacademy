<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- 
	매번 페이지 코드를 복사할 수 없으니 미리 만든 것을 불러오도록 설정
	- 템플릿 페이지(template page)라고 부름
	- 절대경로를 사용할 것
--%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h2>환영합니다!</h2>
<img src="https://i.pinimg.com/564x/ec/59/3a/ec593abf2062648d0c8c7ce9808c75f2.jpg">

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>