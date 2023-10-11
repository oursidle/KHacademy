<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h2 style="color:#F7819F">${memberDto.memberId} 님의 상세정보</h2>

<table border="1" width="500">
	<tr>
		<th width="25%" bgcolor="#f78fb3">닉네임</th>
		<td bgcolor="#FBEFFB">${memberDto.memberNickname	}</td>
	</tr>
	<tr>
		<th bgcolor="#f78fb3">전화번호</th>
		<td bgcolor="#FBEFFB">${memberDto.memberContact}</td>
	</tr>
	<tr>
		<th bgcolor="#f78fb3">생년월일</th>
		<td bgcolor="#FBEFFB">${memberDto.memberBirth}</td>
	</tr>
	<tr>
		<th bgcolor="#f78fb3">이메일</th>
		<td bgcolor="#FBEFFB">${memberDto.memberEmail}</td>
	</tr>
	<tr>
		<th bgcolor="#f78fb3">주소</th>
		<td bgcolor="#FBEFFB">
			[${memberDto.memberPost}] <br>
			${memberDto.memberAddr1} <br>
			${memberDto.memberAddr2}
		</td>
	</tr>
	<tr>
		<th bgcolor="#f78fb3">포인트</th>
		<td bgcolor="#FBEFFB">${memberDto.memberPoint}</td>
	</tr>
	<tr>
		<th bgcolor="#f78fb3">가입일</th>
		<td bgcolor="#FBEFFB">${memberDto.memberJoin}</td>
	</tr>
	<tr>
		<th bgcolor="#f78fb3">마지막로그인</th>
		<td bgcolor="#FBEFFB">
			<fmt:formatDate value="${memberDto.memberLogin}"
									pattern="y년 M월 d일 E a h시 m분 s초"/>
		</td>
	</tr>
	<tr>
		<th bgcolor="#f78fb3">정보변경일</th>
		<td bgcolor="#FBEFFB">
				<fmt:formatDate value="${memberDto.memberChange}"
								pattern="y년 M월 d일 E a h시 m분 s초"/>
		</td>
	</tr>
</table>

<h2>활동 내역</h2>

<table border="1" width="500">
	<thead>
		<tr>
			<th width="75%">제목</th>
			<th>작성일</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="boardListDto" items="${boardList}">
			<tr>
				<td>
					<a href="${pageContext.request.contextPath}/board/detail?boardNo=${boardListDto.boardNo}">
						${boardListDto.boardTitle}
					</a>
				<td>${boardListDto.boardCTime}</td>
			</tr>	
		</c:forEach>
	</tbody>
</table>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>