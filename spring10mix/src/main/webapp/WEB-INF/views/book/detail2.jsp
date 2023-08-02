<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 상세 보기</title>
</head>
<body>
	<h1>도서 상세 정보</h1>
		<c:choose>
			<c:when test="${dto != null}">
				<!-- 
					리스트 태그
					-외부에 <ul> 또는 <ol>을 사용
						-<ul>은 순서가 없는 리스트(unorder list)
						-<ol>은 순서가 있는 리스트(order list)
					-내부 항목에 <li>를 사용(list item)
				 -->
				 <ul>
					<li>${dto.bookId}</li>
					<li>${dto.bookTitle}</li>
					<li>${dto.bookAuthor}</li>
					<li>${dto.bookPublicationDate}</li>
					<li>${dto.bookPrice}</li>
					<li>${dto.bookPublisher}</li>
					<li>${dto.bookPageCount}</li>
					<li>${dto.bookGenre}</li>
				 </ul>
			</c:when>
			<c:otherwise> 
				<h2>해당 도서는 존재하지 않습니다..</h2>
				<img width="200" src="/sad.gif">
			</c:otherwise>
		</c:choose>
</body>
</html>