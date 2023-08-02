<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h1>게시판 목록</h1>

<table border="1">
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>보기</th>
		<tr>
	</thead>
	<tbody>
		<c:forEach var="dto" items="${list}">
		<tr>
			<td>${dto.boardNo}</td>
			<td>${dto.boardTitle}</td>
			<td>${dto.boardWriter}</td>
			<td><a href="detail?boardNo=${dto.boardNo}">Go</a></td>
		</tr>
		</c:forEach>
	</tbody>
</table>