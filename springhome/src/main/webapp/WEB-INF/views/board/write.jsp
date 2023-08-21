<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<c:choose>
	<c:when test="${isReply}">
		<h2 style="color:#F7819F">답글 작성</h2>
	</c:when>
	<c:otherwise>
		<h2 style="color:#F7819F">게시글 작성</h2>
	</c:otherwise>
</c:choose>

<form action="write" method="post" autocomplete="off">
	<%-- 답글일 때만 추가 정보를 전송 --%>
	<c:if test="${isReply}">
		<input type="hidden" name="boardParent" value="${originDto.boardNo}">
	</c:if>
	
	<c:choose>
		<c:when test="${isReply}">
			<span style="color:#574b90">제목</span>
				<input type="text" name="boardTitle" value="RE:${originDto.boardTitle}" size="50" required> <br><br>
		</c:when>
		<c:otherwise>
			<span style="color:#574b90">제목</span> <input type="text" name="boardTitle" size="50" required> <br><br>
		</c:otherwise>
	</c:choose>
	<span style="color:#574b90">내용</span>
		<textarea name="boardContent" rows="10" cols="70" style="resize: none;" required></textarea> <br><br>
	<button style="background-color:#f5cd79">등록</button>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>