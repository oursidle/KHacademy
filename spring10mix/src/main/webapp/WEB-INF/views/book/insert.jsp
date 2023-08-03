<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 등록</title>
</head>
<body>
	<h1>도서 등록</h1>

	<form action="insert" method="post">
		제목 <input name="bookTitle"> <br><br>
		글쓴이 <input name="bookAuthor"> <br><br>
		출판일 <input type="date" name="bookPublicationDate"> <br><br>
		가격 <input name="bookPrice"> <br><br>
		출판사 <input name="bookPublisher"> <br><br>
		페이지 수 <input name="bookPageCount"> <br><br>
		장르 <input name="bookGenre"> <br><br>
		<button style="background-color:#F2F5A9">
			<a href="list">등록하기</a>
		</button>
	</form>
	
</body>
</html>