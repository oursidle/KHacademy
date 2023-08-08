<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나의 홈페이지</title>
</head>
<body>
	<%-- header(상단), body/section, footer 必
			sidebar--%>
	
	<div align="center">
		<h1 style="color:#FA5882">💖내가 만든 홈페이지💖</h1>
		<hr>
			<%-- 
			이 페이지는 조각일 뿐이므로 어디서 실행될지 알 수 없음
			따라서 경로는 무조건 절대경로여야 함
			 --%>
			<a href="/">홈</a>
			<a href="member/join">회원가입</a>
			<a href="member/login">로그인</a>
			<a href="board/list">게시판</a>
		<hr>