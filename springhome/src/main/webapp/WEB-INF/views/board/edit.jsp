<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h2 style="color:#F7819F">게시글 수정</h2>

<form action="edit" method="post" autocomplete="off">
	<input type="hidden" name="boardNo" value="${boardDto.boardNo}">
	<span style="color:#574b90">제목</span>
		<input type="text" name="boardTitle" value="${boardDto.boardTitle}" size="50" required> <br><br>
	<span style="color:#574b90">내용</span>
		<textarea name="boardContent" rows="10" cols="70">${boardDto.boardContent}</textarea>
		<br><br>
	<button style="background-color:#f5cd79">수정</button>
	<h4 style="color:#F7819F"><a href="detail?boardNo=${boardDto.boardNo}">취소</a></h4>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>