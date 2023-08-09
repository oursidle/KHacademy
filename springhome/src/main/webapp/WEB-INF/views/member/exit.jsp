<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h2 style="color:#F7819F">회원 탈퇴</h2>

<form action="exit" method="post">
	비밀번호 확인 <input type="password" name="memberPw" required> <br><br>
	<button style="background-color:#f5cd79">확인</button>
</form>

<c:if test="${param.error != null}">
	<h4 style="color:red">비밀번호가 일치하지 않습니다</h4>
</c:if>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>