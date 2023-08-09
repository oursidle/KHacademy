<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h2 style="color:#F7819F">${memberDto.memberId}님의 회원 정보</h2>

<table border="1" width="500">
	<tr>
		<th bgcolor="#f78fb3">닉네임</th>	
		<td bgcolor="#FBEFFB">${memberDto.memberNickname}</td>	
	</tr>	
	<tr>	
		<th bgcolor="#f78fb3">이메일</th>	
		<td bgcolor="#FBEFFB">${memberDto.memberEmail}</td>	
	</tr>
	<tr>
		<th bgcolor="#f78fb3">연락처</th>
		<td bgcolor="#FBEFFB">${memberDto.memberContact}</td>
	</tr>
	<tr>
		<th bgcolor="#f78fb3">생년월일</th>
		<td bgcolor="#FBEFFB">${memberDto.memberBirth}</td>
	</tr>
	<tr>
		<th bgcolor="#f78fb3">주소</th>
		<td bgcolor="#FBEFFB">
			[${memberDto.memberPost}] <br>
			${memberDto.memberAddr1} <br>
			${memberDto.memberAddr2} <br>
		</td>
	</tr>
	<tr>
		<th bgcolor="#f78fb3">등급</th>
		<td bgcolor="#FBEFFB">${memberDto.memberLevel}</td>
	</tr>
	<tr>
		<th bgcolor="#f78fb3">포인트</th>
<%-- 		<td bgcolor="#FBEFFB">${memberDto.memberPoint}</td> --%>
		<td bgcolor="#FBEFFB">
			<fmt:formatNumber value="${memberDto.memberPoint}"
									pattern="#,##0" ></fmt:formatNumber> pt
		</td>
	</tr>
	<tr>
		<th bgcolor="#f78fb3">가입일</th>
<%-- 		<td bgcolor="#FBEFFB">${memberDto.memberJoin}</td> --%>
		<td bgcolor="#FBEFFB">
					<fmt:formatDate value="${memberDto.memberJoin}"
								pattern="y년 M월 d일 E a h시 m분 s초"/>
	</tr>
	<tr>
		<th bgcolor="#f78fb3">마지막 로그인</th>
<%-- 		<td bgcolor="#FBEFFB">${memberDto.memberLogin}</td> --%>
		<td bgcolor="#FBEFFB">
			<fmt:formatDate value="${memberDto.memberLogin}"
						pattern="y년 M월 d일 E a h시 m분 s초"/>
	</tr>
	<tr>
		<th bgcolor="#f78fb3">마지막 변경일</th>
<%-- 		<td bgcolor="#FBEFFB">${memberDto.memberChange}</td> --%>
		<td bgcolor="#FBEFFB">
					<fmt:formatDate value="${memberDto.memberChange}"
								pattern="y년 M월 d일 E a h시 m분 s초"/>
	</tr>		
</table>

<h4><a href="password">비밀번호 변경</a></h4>
<h4><a href="change">개인정보 변경</a></h4>
<h5><a href="exit">회원탈퇴</a></h5>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>