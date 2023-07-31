<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이미지 다루기</title>
</head>
<body>

	<h1>이미지 다루기</h1>
	
	<!-- 
		화면에 이미지 띄우기
		- 원하는 곳에 원하는 크기로 이미지를 띄우기 위한 태그
		- 일회성 태그이므로 종료 태그가 없음
		- 크기를 폭(width)과 높이(height)로 부여할 수 있음
		- 크기의 단위는 픽셀(px)
		- 비율 지정 가능
	 -->
	<img width="200" src="https://prugna.co.kr/web/product/big/202302/c61d6e1d37f6b88a692c4e02a8b9a16b.jpg">
	<img width="50%" src="https://prugna.co.kr/web/product/big/202302/c61d6e1d37f6b88a692c4e02a8b9a16b.jpg">
	<br><br>
	
	<!-- 
		내가 가진 이미지를 추가할 경우 /static에 저장한 뒤 호출
		- 'http://localhost:8080/' 이름으로 호출 가능
		- 경로를 중려 표현할 수 있으며 상대 경로도 가능
	 -->
	<img width="150" src="/apeach.gif">
	<br><br>
	<img width="150" src="apeach.gif">
	
	
</body>
</html>