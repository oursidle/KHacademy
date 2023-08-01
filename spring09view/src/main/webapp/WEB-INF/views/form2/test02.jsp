<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 비밀번호 변경</title>
</head>
<body>
	<h1>회원 비밀번호 변경</h1>
	
	<form action="http://localhost:8080/member/password" method="post">
		아이디 <input type="text" name="memberId"> <br><br>
		기존 비밀번호 <input type="password" name="memberPw"> <br><br>
		변경 비밀번호 <input type="password" name="changePw"> <br><br>
		<button>수정</button>
	</form>
</body>
</html>