<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 수정</title>
</head>
<body>
	<h1 style="color:#e66767">상품 수정</h1>

	<form action="edit" method="post">
		<input type="hidden" name="shirtNo" value="${dto.shirtNo}"> <br><br>
		상품명 <input type="text" name="shirtName" value="${dto.shirtName}"> <br><br>
		상품색상
			<select name="shirtColor" >
				<%--
					EL의 특징
					- 외따옴표, 쌍따옴표 모두 문자열로 취급
					- 문자열도 비교연산이 가능
				 --%>
				<c:choose>
					<c:when test="${dto.shirtColor == '블랙'}">
						<option selected>블랙</option>
					</c:when>
					<c:otherwise>
						<option>블랙</option>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${dto.shirtColor == '화이트'}">
						<option selected>화이트</option>
					</c:when>
					<c:otherwise>
						<option>화이트</option>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${dto.shirtColor == '그레이'}">
						<option selected>그레이</option>
					</c:when>
					<c:otherwise>
						<option>그레이</option>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${dto.shirtColor == '레드'}">
						<option selected>레드</option>
					</c:when>
					<c:otherwise>
						<option>레드</option>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${dto.shirtColor == '블루'}">
						<option selected>블루</option>
					</c:when>
					<c:otherwise>
						<option>블루</option>
					</c:otherwise>
				</c:choose>
			</select> <br><br>
		판매가 <input type="text" name="shirtPrice" value="${dto.shirtPrice}"> <br><br>
		상품종류
			<select name="shirtKind">
				<c:choose>
					<c:when test="${dto.shirtKind == '라운드'}">
						<option selected>라운드</option>
					</c:when>
					<c:otherwise>
						<option>라운드</option>
					</c:otherwise>
				</c:choose>
				<c:choose>
						<c:when test="${dto.shirtKind == '브이넥'}">
							<option selected>브이넥</option>
						</c:when>
						<c:otherwise>
							<option>브이넥</option>
						</c:otherwise>
					</c:choose>
				<c:choose>
					<c:when test="${dto.shirtKind == '정장'}">
						<option selected>정장</option>
					</c:when>
					<c:otherwise>
						<option>정장</option>
					</c:otherwise>
				</c:choose>
			</select> <br><br>
		상품유형
			<select name="shirtType">
				<c:choose>
					<c:when test="${dto.shirtType == '민소매'}">
						<option selected>민소매</option>
					</c:when>
					<c:otherwise>
						<option>민소매</option>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${dto.shirtType == '반팔'}">
						<option selected>반팔</option>
					</c:when>
					<c:otherwise>
						<option>반팔</option>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${dto.shirtType == '긴팔'}">
						<option selected>긴팔</option>
					</c:when>
					<c:otherwise>
						<option>긴팔</option>
					</c:otherwise>
				</c:choose>
			</select> <br><br>
		상품재질 <input type="text" name="shirtMaterial" value="${dto.shirtMaterial}"> <br><br>
		판매수량 <input type="text" name="shirtStock" value="${dto.shirtStock}" required> <br><br>
		<a href="detail?shirtNo=${dto.shirtNo}"><button style="background-color:#f5cd79">변경</button></a> <br><br>
	</form>
</body>
</html>