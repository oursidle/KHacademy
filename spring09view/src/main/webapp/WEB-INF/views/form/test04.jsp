<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
	<h1>회원 가입</h1>

	<form action="http://localhost:8080/member/join">
		아이디 : <input name="memberId"> <br><br>
		비밀번호 : <input name="memberPw"> <br><br>
		닉네임 : <input name="memberNickname"> <br><br>
		생년월일 : <input name="memberBirth"> <br><br>
		이메일 : <input name="memberEmail"> <br><br>
		연락처 : <input name="memberContact"> <br><br>
		등급 : <input name="memberLevel"> <br><br>
		포인트 : <input name="memberPoint"> <br><br>
		가입일 : <input name="memberJoin"> <br><br>
		<button>회원 가입</button>
	</form>
</body>
</html>