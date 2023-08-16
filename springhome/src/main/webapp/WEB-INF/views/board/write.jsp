<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h2 style="color:#F7819F">게시글 작성</h2>

<form action="write" method="post" autocomplete="off">
	<span style="color:#574b90">제목</span> <input type="text" name="boardTitle" size="50" required> <br><br>
	<span style="color:#574b90">내용</span>
		<textarea name="boardContent" rows="10" cols="70" style="resize: none;" required></textarea> <br><br>
	<button style="background-color:#f5cd79">등록</button>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>