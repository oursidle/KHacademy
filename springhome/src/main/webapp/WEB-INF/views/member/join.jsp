<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h2 style="color:#F7819F">회원가입</h2>

<form action="join" method="post" autocomplete="off">

	<span style="color:#574b90">아이디*</span> <input type="text" name="memberId" required> <br><br>
	<span style="color:#574b90">비밀번호*</span> <input type="password" name="memberPw" required> <br><br>
	<span style="color:#574b90">닉네임*</span> <input type="text" name="memberNickname" required> <br><br>
	<span style="color:#574b90">이메일</span> <input type="email" name="memberEmail"> <br><br>
	<span style="color:#574b90">연락처</span> <input type="tel" name="memberContact"> <br><br>
	<span style="color:#574b90">생년월일</span> <input type="date" name="memberBirth"> <br><br>
	<span style="color:#574b90">주소</span> <br>
	<input type="text" name="memberPost" placeholder="우편번호" size="6" maxlength="6"> <br><br>
	<input type="text" name="memberAddr1" placeholder="기본주소"> <br><br>
	<input type="text" name="memberAddr2" placeholder="상세주소"> <br><br>
	
	<button style="background-color:#f5cd79">JOIN</button>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
