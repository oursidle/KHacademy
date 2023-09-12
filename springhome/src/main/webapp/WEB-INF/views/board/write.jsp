<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<script src="/js/boardWrite.js"></script>
<script>

</script>

<form action="write" method="post" autocomplete="off">
	<div class="container w-500">
	
	<div class="row center">
		<c:choose>
			<c:when test="${isReply}">
				<h2 style="color:#F7819F">답글 작성</h2>
			</c:when>
			<c:otherwise>
				<h2 style="color:#F7819F">게시글 작성</h2>
			</c:otherwise>
		</c:choose>
	</div>
	
	<%-- 답글일 때만 추가 정보를 전송 --%>
	<c:if test="${isReply}">
		<input type="hidden" name="boardParent" value="${originDto.boardNo}">
	</c:if>
		<c:choose>
			<c:when test="${isReply}">
				<div class="row left">
	                <label>제목</label>
	                <input type="text" name="boardTitle" value="RE:${originDto.boardTitle}" class="form-input w-100">
	            </div>
			</c:when>
			<c:otherwise>
				<div class="row left">
	                <label>제목</label>
	                <input type="text" name="boardTitle" class="form-input w-100">
	            </div>
			</c:otherwise>
		</c:choose>
		<div class="row left">
            <label>내용</label>
            <textarea name="boardContent" class="form-input fixed w-100"></textarea>
        </div>
        <div class="row right">
                <button class="btn btn-positive" style="background-color:#ffb6c1; border-color:#ffb6c1">작성</button>
                <a href="/board/list" class="btn">목록</a>
        </div>
     </div>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>