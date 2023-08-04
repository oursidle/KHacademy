<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
				<option>블랙</option>
				<option>화이트</option>
				<option>그레이</option>
				<option>레드</option>
				<option>블루</option>
			</select> <br><br>
		판매가 <input type="text" name="shirtPrice" value="${dto.shirtPrice}"> <br><br>
		상품종류
			<select name="shirtKind">
				<option>라운드</option>
				<option>브이넥</option>
				<option>정장</option>
			</select> <br><br>
		상품유형
			<select name="shirtType">
				<option>민소매</option>
				<option>반팔</option>
				<option>긴팔</option>
			</select> <br><br>
		상품재질 <input type="text" name="shirtMaterial" value="${dto.shirtMaterial}"> <br><br>
		판매수량 <input type="text" name="shirtStock" value="${dto.shirtStock}"> <br><br>
		<a href="detail?shirtNo=${dto.shirtNo}"><button style="background-color:#f5cd79">변경</button></a> <br><br>
	</form>
</body>
</html>