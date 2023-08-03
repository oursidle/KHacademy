<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${dto.bookId}번 도서</title>
</head>
<body>
	<h1>${dto.bookId}번 도서</h1>
		<c:choose>
			<c:when test="${dto != null}">
				<table border="1" width="800">
					<tr bgcolor="#fd79a8">
						<th width=14%>제목</th>
						<th width=14%>글쓴이</th>
						<th width=14%>출판일</th>
						<th width=14%>가격</th>
						<th width=14%>출판사</th>
						<th width=14%>페이지 수</th>
						<th width=14%>장르</th>
					</tr>
					<tr align="center">
						<td>${dto.bookTitle}</td>				
						<td>${dto.bookAuthor}</td>				
						<td>${dto.bookPublicationDate}</td>				
						<td>${dto.bookPrice}</td>				
						<td>${dto.bookPublisher}</td>				
						<td>${dto.bookPageCount}</td>				
						<td>${dto.bookGenre}</td>				
				</table>
			</c:when>
			<c:otherwise>
				<h1>도서 정보 없음!</h1>
				<img width="200" src="/sad.gif">
			</c:otherwise>
		</c:choose>
		
		<c:if test="${dto != null}">
			<h2><a href="edit?bookId=${dto.bookId}">수정하기</a></h2>
			<h2><a href="delete?bookId=${dto.bookId}">삭제하기</a></h2>
		</c:if>
		<h2><a href="list">목록보기</a></h2>
</body>
</html>