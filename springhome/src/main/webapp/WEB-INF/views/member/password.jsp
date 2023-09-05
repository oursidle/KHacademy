<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<div class="container w-500">
	<div class="row">
		<h2 style="color:#F7819F">비밀번호 변경</h2>
	</div>
	
	<div class="row">
		<!-- 아이디는 세션에 있으므로 입력하거나 전송할 필요가 없다 -->
		<form action="password" method="post">
		<div class="row left" style="font-size:20px">
			<span style="color:#574b90">기본 비밀번호</span>
		</div>
		<div class="row">
			<input class="form-input w-100" type="password" name="originPw" required>
		</div>
		<div class="row left" style="font-size:20px">
			<span style="color:#574b90">변경 비밀번호</span>
		</div>
		<div class="row">
			<input class="form-input w-100"  type="password" name="changePw" required>
		</div>
		<div class="row">
			<button class="btn btn-positive" style="background-color:#ffb6c1; border-color:#ffb6c1">변경</button>
		</div>
		</form>
	</div>

	<div class="row">
		<c:if test="${param.error != null}">
			<h4 style="color:red">기존 비밀번호가 일치하지 않습니다</h4>
		</c:if>
	</div>
</div>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>