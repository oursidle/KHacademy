<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<form action="findPw" method="post">
	<div class="container w-300">
		<div class="row">
			<h2 style="color:#FA5882">비밀번호 찾기</h2>
		</div>
		<div class="row left">
			<h4>아이디</h4>
			<input type="text" class="form-input w-100" name="memberId">
		</div>
		<div class="row left">
			<h4>이메일</h4>
			<input type="email" class="form-input w-100" name="memberEmail">
		</div>
		<div class="row">
			<button type="submit" class="btn btn-positive w-100" style="background-color: #ffb6c1; border-color: #ffb6c1;">찾기</button>
		</div>
	</div>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
