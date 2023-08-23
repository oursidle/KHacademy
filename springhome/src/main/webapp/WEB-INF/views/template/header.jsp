<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나의 홈페이지</title>
</head>
<body style="background-color:#fedcdd">
	<%-- header(상단), body/section, footer 必
			sidebar--%>
	
	<div align="center">
		<h1 style="color:#FA5882">💖나의 홈페이지💖</h1>
		<hr>
			<%--
				JSP에서 세선에 저장된 값을 확인하려면 EL의 내장객체를 사용
				sessionScope 내장객체를 사용하면 HttpSession의 값을 조회할 수 있다
			 --%>
			<span style="color:#8DA4D0">회원 번호 = ${pageContext.session.id},</span> <br>
			<span style="color:#8DA4D0">회원 ID = ${sessionScope.name}</span> <br>
			<span style="color:#8DA4D0">회원 Level = ${sessionScope.level}</span> <br>
			<%-- 
			이 페이지는 조각일 뿐이므로 어디서 실행될지 알 수 없음
			따라서 경로는 무조건 절대경로여야 함
			 --%>
			<c:choose>
				<c:when test="${sessionScope.name != null}">
					<a href="/">홈</a>
					<a href="/member/mypage">마이페이지</a>
					<a href="/member/logout">로그아웃</a>
					<a href="/board/list">게시판</a>
					
					<%-- 관리자인 경우 추가 메뉴 출력 --%>
					<c:if test="${sessionScope.level == '관리자'}">
						<a href="/admin/home">[관리자 메뉴]</a>
					</c:if>
				</c:when>
				<c:otherwise>
					<a href="/">홈</a>
					<a href="/member/join">회원가입</a>
					<a href="/member/login">로그인</a>
					<a href="/board/list">게시판</a>
				</c:otherwise>
			</c:choose>
		<hr>