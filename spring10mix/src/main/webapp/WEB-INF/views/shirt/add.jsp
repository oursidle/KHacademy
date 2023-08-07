<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 등록</title>
</head>
<body>
	<h1 style="color:#e66767">상품 등록</h1>	
	<form action="add" method="post"	>
		<span style="color:#574b90">상품명:</span> <input name="shirtName" required> <br><br>
		<span style="color:#574b90">상품색상:</span>
			<!-- 
				option에 value를 주면 표시되는 값과 다르게 전송함			
			 -->
			<select name="shirtColor" required>
				<option value="">선택하세요</option>
				<option>블랙</option>
				<option>화이트</option>
				<option>그레이</option>
				<option>레드</option>
				<option>블루</option>
			</select><br><br>
		<span style="color:#574b90">판매가:</span> <input name="shirtPrice" required> <br><br>
		<span style="color:#574b90">상품종류:</span>
			<select name="shirtKind" required>
				<option value="">선택하세요</option>
				<option>라운드</option>
				<option>브이넥</option>
				<option>정장</option>
			</select> <br><br>
		<span style="color:#574b90">상품유형:</span>
			<select name="shirtType" required>
				<option value="">선택하세요</option>
				<option>민소매</option>
				<option>반팔</option>
				<option>긴팔</option>
			</select> <br><br>
		<span style="color:#574b90">상품재질:</span> <input name="shirtMaterial"> <br><br>
		<span style="color:#574b90">판매수량:</span> <input name="shirtStock" required> <br><br>
		<button style="background-color:#f5cd79">등록</button>
	</form>
	<a href="list"><button style="background-color:#f5cd79">목록</button></a>
</body>
</html>