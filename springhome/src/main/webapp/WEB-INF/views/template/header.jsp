<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나의 홈페이지</title>

<!-- css 파일을 불러오는 코드 -->
<!-- 아이콘 사용을 위한 Font Awesome 6 CDN -->
<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">

<!-- 구글 웹 폰트 사용을 위한 CDN-->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Gowun+Dodum&display=swap" rel="stylesheet">

<!-- 외부에서 만든 css 파일을 불러오는 코드 -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/layout.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/commons.css">
<!-- <link rel="stylesheet" type="text/css" href="/css/test.css"> -->

<%-- 
	절대경로를 설정하기 위한 스크립트 작성
	- 절대경로라는 개념은 백엔드에만 존재함. 따라서 자바 스크립트에서는 해당 경로를 알 수 있는 방법이 없음
	- window에 절대경로 값을 탑재시켜 사용
 --%>
 <script>
 	window.contextPath = "${pageContext.request.contextPath}";
 </script>

<!-- jQuery cdn -->
<script src="https://code.jQuery.com/jQuery-3.7.1.min.js"></script>

<!-- summernote cdn -->
<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>

</head>	
<body>
	<main>
	<header>
	 	<div class="logo">
                <img src="https://i.pinimg.com/564x/01/29/1c/01291c2fbcfa53dd37bda95d22284ea1.jpg" style="height: 80px; width: 100px">
        </div>
		<div class="tittle">
	        <h1 style="color:#FA5882"><a href="/">Homepage</a></h1>
	    </div>
	    <div class="etc"></div>
	</header>
	    <nav>
	        <ul class="menu center">
	        	<c:choose>
	        		<c:when test="${sessionScope.name != null}">
	        			<li>
	        				<a href="${pageContext.request.contextPath}/pocketmon/list">포켓몬</a>
	        				<ul>
	        					<li><a href="${pageContext.request.contextPath}/pocketmon/insert">+등록</a></li>
	        				</ul>
	        			</li>
			            <li><a href="${pageContext.request.contextPath}/member/mypage">마이페이지</a></li>
			            <li><a href="${pageContext.request.contextPath}/member/logout">로그아웃</a></li>
			            <li><a href="${pageContext.request.contextPath}/board/list">게시판</a></li>
			            	<c:if test="${sessionScope.level == '관리자'}">
			            		<li><a href="${pageContext.request.contextPath}/admin/home">관리자메뉴</a></li>
			            	</c:if>
	            	</c:when>
	            	<c:otherwise>
			            <li><a href="${pageContext.request.contextPath}/member/join">회원가입</a></li>
			            <li><a href="${pageContext.request.contextPath}/member/login">로그인</a></li>
			            <li><a href="${pageContext.request.contextPath}/board/list">게시판</a></li>
	            	</c:otherwise>  
	            </c:choose>
	        </ul>
	    </nav>
		<section>