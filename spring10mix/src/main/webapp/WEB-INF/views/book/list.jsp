<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h1>도서 목록</h1>

<table border="1">
	<thead>
		<tr>
			<th>제목</th>
			<th>지은이</th>
			<th>출판사</th>
			<th>가격</th>
			<th>보기</th>
		<tr>
	</thead>
	<tbody>
		<c:forEach var="dto" items="${list}">
		<tr>
			<td>${dto.bookId}</td>
			<td>${dto.bookAuthor}</td>
			<td>${dto.bookPublisher}</td>
			<td>${dto.bookPrice}</td>
			<td><a href="detail?bookId=${dto.bookId}">GO</a></td>
		<tr>
		</c:forEach>
	</tbody>
</table>