<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${dto.boardNo}번 게시글 수정</title>
</head>
<body>
	<h1>게시글 정보 수정</h1>

	<!-- 
		번호의 경우 전송은 하지만 수정은 불가해야 한다
		1. 입력창에 readonly 속성 추가
		2. 입력창을 숨김으로 생성
	 -->
	 
	 <form action="edit" method="post">
<%-- 게시글 번호 <input type="text" name="boardNo" value="${dto.boardNo}" readonly> <br><br> --%>	 
		<input type="hidden" name="boardNo" value="${dto.boardNo}">
		제목 <input type="text" name="boardTitle" value="${dto.boardTitle}"><br><br>
		<!-- (참고) textarea에는 value가 없다 -->
		내용 <textarea name="boardContent">${dto.boardContent}</textarea><br><br>
		작성자 <input type="text" name="boardWriter" value="${dto.boardWriter}" readonly><br><br>
		<button>수정하기</button>
	 </form>
	 <h2><a href="list">돌아가기</a></h2>
</body>
</html>