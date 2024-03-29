<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h2>로그인</h2>

<form action="login" method="post" autocomplete="off">
	<input type="text" name="memberId" placeholder="아이디" required> <br><br>
	<input type="password" name="memberPw" placeholder="비밀번호" required> <br><br>
	<button>로그인</button>
</form>

<%--
	EL은 출력을 쉽게 하기 위한 언어이므로 여러 데이터를 쉽게 접근할 수 있다
	파라미터를 읽고 싶을 경우 param이라는 내장 객체를 사용할 수 있다
	param을 이용하여 파라미터를 비교할 수 있다
--%>
<c:if test="${param.error != null}">
	<h3 style="color:red">아이디 또는 비밀번호가 일치하지 않습니다</h3>
</c:if>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>