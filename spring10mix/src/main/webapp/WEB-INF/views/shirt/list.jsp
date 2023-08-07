<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록</title>
</head>
<body>
	<h1 style="color:#e66767">상품 목록</h1>
	<a href="add"><button style="background-color:#f5cd79">등록</button></a> <br><br>

	<table border="1" width="500">
		<thead align="center">
			<tr bgcolor="#f78fb3">
				<th>상품번호</th>
				<th>상품명</th>
				<th>판매가</th>
				<th>상세보기</th>	
			<tr>
		</thead>
		<tbody align="center">
			<c:forEach var="dto" items="${list}">
				<tr>
					<td  bgcolor="#F8E0EC">${dto.shirtNo}</td>
					<td><span style="color:#574b90">${dto.shirtName}</span></td>
					<td>${dto.shirtPrice}</td>
					<td>
							<a href="detail?shirtNo=${dto.shirtNo}"><button style="background-color:#f5cd79">GO</button></a>
					</td>
				<tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>