<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1 style="color: #FA5882;">쿠키 테스트</h1>

<%--
	JSP에서는 EL을 이용하여 쿠기 탐색 가능
	EL의 내장객체 중 cookie라는 이름의 내장객체가 존재, 이를 활용
--%>

<h2>popup 쿠키 유무 - ${cookie.popup != null}</h2>

<%-- 쿠키가 있을 때만 나오는 화면 구현 --%>
<c:if test="${cookie.popup == null}">
	<h2>팝업 화면</h2>
</c:if>
<h3><a href="create1">다시 보지 않기</a></h3>
<h3><a href="create2">7일 보지 않기</a></h3>
<h3><a href="create3">1일 보지 않기</a></h3>
<h3><a href="create4">오늘 보지 않기</a></h3>
<h3><a href="delete">보기</a></h3>

<%-- saveId라는 이름으로 아이디가 저장된 쿠키가 있을 경우의 로그인 화면 --%>
<form action="login" method="post">
	<input type="text" name="memberId" value="${cookie.saveId.value}">
	<br><br>
	
	<input type="password" name="memberPw">
	<br><br>
	
	<c:choose>
		<c:when test="${cookie.saveId != null}">
			<input type="checkbox" name="remember" value="ok" checked>아이디 저장	
		</c:when>
		<c:otherwise>
			<input type="checkbox" name="remember" value="ok">아이디 저장
		</c:otherwise>
	</c:choose>
	<br><br>
	
	<button type="submit">로그인</button>
</form>