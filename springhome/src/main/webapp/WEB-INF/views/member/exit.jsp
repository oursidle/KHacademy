<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<form action="exit" method="post">
	<div class="container w-400">
		<div class="row mt-30 mb-30">
			<h2 style="color:#F7819F">회원 탈퇴</h2>
		</div>
		<div class="row mt-30 mb-30">
			<input type="password" name="memberPw" required placeholder="비밀번호 입력">
		</div>
		<c:if test="${param.error != null}">
			<div class="row important">
				<h3 style="color: red;">비밀번호가 일치하지 않습니다</h3>
			</div>
		</c:if>
		<div class="row mt-30 mb-30">
	    	<button type="submit" class="btn btn-positive w-100" style="background-color: #ffb6c1; border-color: #ffb6c1;">확인</button>
	    </div>
	</div>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>