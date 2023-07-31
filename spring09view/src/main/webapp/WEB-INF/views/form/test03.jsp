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
	
	<!-- 
		input은 여러 가지의 입력을 처리할 수 있다.
		- type이라는 속성을 통해 입력창의 형태를 바꿀 수 있다.
		- type의 기본값은 text이다
		
		-(참고) 반드시 입력해야 하는 값은 required="required" 속성 추가
	 -->
	
	<form action="http://localhost:8080/save">
		번호 : <input name="bookId"> <br><br>
		제목 : <input type="text" name="bookTitle" required="required"> <br><br>
		글쓴이 : <input type="text" name="bookAuthor"> <br><br>
		출판일 : <input type="date" name="bookPublicationDate"> <br><br>
		가격 : <input type="number" name="bookPrice"> <br><br>
		출판사 : <input type="text" name="bookPublisher"> <br><br>
		<!-- 1~1000 사이에서 1씩 증가/감소하며 시작값은 1 -->
		페이지 수 : <input type="number" name="bookPageCount"
								 min="1" max="100" step="1" value="1"> <br><br>
			<!-- 장르 : <input type="text" name="bookGenre"> <br><br> -->
			<!-- 
				select를 이용하여 선택 가능한 입력창을 만들 수 있다
				- option 태그를 안에 넣어서 그 중에 고를 수 있도록 만든다
			 -->
		장르 : <select name="bookGenre">
				<option>자기계발</option>
				<option>수험서</option>
				<option>무협지</option>
				<option>IT</option>
				<option>판타지</option>
				<option>공포</option>
				<option>추리</option>
				</select>
				<br><br>
		<button>도서 등록</button>
	</form>

</body>
</html>