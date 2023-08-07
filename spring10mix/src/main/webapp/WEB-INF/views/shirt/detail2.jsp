<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품상세</title>
<style>
	li::marker{
		content: '💜';
		color: #574b90;
	}
</style>
</head>
<body>
	
	<c:choose>
		<c:when test="${shirtDto != null}">
			<h1 style="color:#e66767"> ${shirtDto.shirtNo}번 상품상세</h1>
			<ul>
				<li><span style="color:#574b90">상품명:</span> ${shirtDto.shirtName}</li>
				<li><span style="color:#574b90">상품색상:</span> ${shirtDto.shirtColor}</li>
				<li><span style="color:#574b90">판매가:</span> ${shirtDto.shirtPrice}</li>
				<li><span style="color:#574b90">상품종류:</span> ${shirtDto.shirtKind}</li>
				<li><span style="color:#574b90">상품유형:</span> ${shirtDto.shirtType}</li>
				<li><span style="color:#574b90">상품재질:</span> ${shirtDto.shirtMaterial}</li>
				<li><span style="color:#574b90">판매수량:</span> ${shirtDto.shirtStock }</li>
				<li><span style="color:#574b90">보유사이즈:</span>
					<c:forEach var="sizeDto" items="${sizeList}">
						${sizeDto.shirtSizeName}
					</c:forEach>
				</li>
			</ul>
		</c:when>
		<c:otherwise>
			<h1>죄송합니다, 해당 상품은 존재하지 않습니다.</h1>
		</c:otherwise>
	</c:choose>
	<c:if test="${dto != null}">
		<a href="edit?shirtNo=${shirtDto.shirtNo}"><button style="background-color:#f5cd79">수정</button></a>
		<a href="delete?shirtNo=${shirtDto.shirtNo}"><button style="background-color:#f5cd79">삭제</button></a>
	</c:if>
	<a href="list"><button style="background-color:#f5cd79">목록</button></a>
</body>
</html>