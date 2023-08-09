<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h2 style="color:#F7819F">개인정보 변경</h2>

<form action="change" method="post">
	닉네임 <input type="text" name="memberNickname" value="${memberDto.memberNickname}" required required autocomplete="off"> <br><br>
	이메일 <input type="email" name="memberEmail" value="${memberDto.memberEmail}" required autocomplete="off"> <br><br>
	전화번호 <input type="tel" name="memberContact" value="${memberDto.memberContact}" required autocomplete="off"> <br><br>
	생년월일 <input type="date" name="memberBirth" value="${memberDto.memberBirth}" required autocomplete="off"> <br><br>
	주소 <br>
		<input type="text" name="memberPost" size="6" maxlength="6" placeholder="우편번호" value="${memberDto.memberPost}" required autocomplete="off"> <br>
		<input type="text" name="memberAddr1" size="50" placeholder="기본주소" value="${memberDto.memberAddr1}" required autocomplete="off"> <br>
		<input type="text" name="memberAddr2" size="50" placeholder="상세주소" value="${memberDto.memberAddr2}" required autocomplete="off"> <br>
	비밀번호 확인 <input type="password" name="memberPw" required required autocomplete="off"> <br><br>
	<button style="background-color:#f5cd79">변경</button>
</form>

<c:if test="${param.error != null}">
	<h4 style="color:red">비밀번호가 일치하지 않습니다.</h4>
</c:if>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>