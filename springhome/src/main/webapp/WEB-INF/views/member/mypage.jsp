<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<style>
	td{
		text-align: left;
	}
</style>

<div class="container w-600">
	<div class="row">
		<h2 style="color:#F7819F">${memberDto.memberId}님의 회원 정보</h2>
	</div>

	<div class="row">
		<table class="table table-slit">
			<tr>
				<th bgcolor="#ffb6c1">닉네임</th>	
				<td>${memberDto.memberNickname}</td>	
			</tr>	
			<tr>	
				<th bgcolor="#ffb6c1">이메일</th>	
				<td>${memberDto.memberEmail}</td>	
			</tr>
			<tr>
				<th bgcolor="#ffb6c1">연락처</th>
				<td>${memberDto.memberContact}</td>
			</tr>
			<tr>
				<th bgcolor="#ffb6c1">생년월일</th>
				<td>${memberDto.memberBirth}</td>
			</tr>
			<tr>
				<th bgcolor="#ffb6c1">주소</th>
				<td>
					[${memberDto.memberPost}] <br>
					${memberDto.memberAddr1} <br>
					${memberDto.memberAddr2} <br>
				</td>
			</tr>
			<tr>
				<th bgcolor="#ffb6c1">등급</th>
				<td>${memberDto.memberLevel}</td>
			</tr>
			<tr>
				<th bgcolor="#ffb6c1">포인트</th>
		<%-- 		<td bgcolor="#FBEFFB">${memberDto.memberPoint}</td> --%>
				<td>
					<fmt:formatNumber value="${memberDto.memberPoint}"
											pattern="#,##0" ></fmt:formatNumber> pt
				</td>
			</tr>
			<tr>
				<th bgcolor="#ffb6c1">가입일</th>
		<%-- 		<td bgcolor="#FBEFFB">${memberDto.memberJoin}</td> --%>
				<td>
							<fmt:formatDate value="${memberDto.memberJoin}"
										pattern="y년 M월 d일 E a h시 m분 s초"/>
			</tr>
			<tr>
				<th bgcolor="#ffb6c1">마지막 로그인</th>
		<%-- 		<td bgcolor="#FBEFFB">${memberDto.memberLogin}</td> --%>
				<td>
					<fmt:formatDate value="${memberDto.memberLogin}"
								pattern="y년 M월 d일 E a h시 m분 s초"/>
			</tr>
			<tr>
				<th bgcolor="#ffb6c1">마지막 변경일</th>
		<%-- 		<td bgcolor="#FBEFFB">${memberDto.memberChange}</td> --%>
				<td>
							<fmt:formatDate value="${memberDto.memberChange}"
										pattern="y년 M월 d일 E a h시 m분 s초"/>
			</tr>		
		</table>
	</div>

<div class="row right">
	<span><a href="password">비밀번호 변경</a></span>
	<span><a href="change">개인정보 변경</a></span>
	<span><a href="exit">회원탈퇴</a></span>
</div>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>