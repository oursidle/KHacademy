<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<div class="container w-500">
	<div class="row left">
		<h2 style="color:#F7819F">개인정보 변경</h2>
	</div>
	
	<div class="row">
		<form action="change" method="post">
			<div class="row left" style="font-size:20px">
				<span style="color:#574b90">닉네임</span>
			</div>
			<div class="row">
				<input class="form-input w-100" type="text" name="memberNickname" value="${memberDto.memberNickname}" required required autocomplete="off">
			</div>
			
			<div class="row left" style="font-size:20px">
				<span style="color:#574b90">이메일</span>
			</div>
			<div class="row">
				<input class="form-input w-100" type="email" name="memberEmail" value="${memberDto.memberEmail}"autocomplete="off">
			</div>
			
			<div class="row left" style="font-size:20px">
				<span style="color:#574b90">전화번호</span>
			</div>
			<div class="row">
				<input class="form-input w-100" type="tel" name="memberContact" value="${memberDto.memberContact}" autocomplete="off">
			</div>	
			
			<div class="row left" style="font-size:20px">
				<span style="color:#574b90">생년월일</span>
			</div>
			<div class="row">
				<input class="form-input w-100" type="date" name="memberBirth" value="${memberDto.memberBirth}" autocomplete="off">
			</div>	
			
			<div class="row left" style="font-size:20px">
				<span style="color:#574b90">주소</span>
			</div>
			<div class="row">
				<input class="form-input left me-40" type="text" name="memberPost" size="15" maxlength="6" placeholder="우편번호" value="${memberDto.memberPost}" autocomplete="off">
				<button class="btn btn-neutrality ms-40">우편번호 찾기</button>
				<input class="form-input w-100" type="text" name="memberAddr1" size="50" placeholder="기본주소" value="${memberDto.memberAddr1}" autocomplete="off">
				<input class="form-input w-100" type="text" name="memberAddr2" size="50" placeholder="상세주소" value="${memberDto.memberAddr2}" autocomplete="off">
			</div>
			
			<div class="row left" style="font-size:20px">
				<span style="color:#574b90">비밀번호 확인</span>
			</div>
			<div class="row">
				<input class="form-input w-100" type="password" name="memberPw" required required autocomplete="off">
			</div>
			
			<div class="row">
				<button class="btn btn-positive" style="background-color:#ffb6c1; border-color:#ffb6c1">변경</button>
			</div>
		</form>
	</div>
	
	<div class="row">
		<c:if test="${param.error != null}">
			<h4 style="color:red">비밀번호가 일치하지 않습니다.</h4>
		</c:if>
	</div>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>