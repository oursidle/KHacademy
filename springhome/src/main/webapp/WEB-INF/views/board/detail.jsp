<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<div class="container w-800">

<div class="row">
	<h2 style="color:#FA5882">${boardDto.boardNo}번 게시글</h2>
</div>

<div class="row left">
	<table class="table table-slit">
		<tr>
			<th width="120" bgcolor="#ffb6c1">번호</th>	
			<td>${boardDto.boardNo}</td>	
		</tr>	
		<tr>
			<th bgcolor="#ffb6c1">제목</th>	
			<td>${boardDto.boardTitle}</td>	
		</tr>
		<tr>
			<th bgcolor="#ffb6c1">작성자</th>	
			<td>
				${writerDto.memberNickname}
				<%-- 탈퇴한 사용자가 아닐 경우 닉네임을 옆에 추가로 출력 --%>
				<c:if test="${writerDto != null}">
					(${boardDto.boardWriterString})
				</c:if>
			</td>		
		</tr>
		<tr height="100">
			<th bgcolor="#ffb6c1">내용</th>	
			<td >${boardDto.boardContent}</td>	
		</tr>
		<tr>
			<th bgcolor="#ffb6c1">조회수</th>
			<td>${boardDto.boardReadCount}</td>	
		</tr>	
		<tr>
			<th bgcolor="#ffb6c1">좋아요</th>	
			<td>${boardDto.boardLikeCount}</td>	
		</tr>	
		<tr>
			<th bgcolor="#ffb6c1">작성일</th>	
			<td>
				<fmt:formatDate value="${boardDto.boardCTime}" pattern="y년 M월 d일 E a h시 m분 s초"/>
			 </td>	
		</tr>
		<tr>
			<th bgcolor="#ffb6c1">마지막 수정일</th>	
			<td>
				<fmt:formatDate value="${boardDto.boardUTime}" pattern="y년 M월 d일 E a h시 m분 s초"/>
			 </td>	
		</tr>
	</table>
</div>

<button class="btn btn-positive" style="background-color:#ffb6c1; border-color:#ffb6c1">❤️</button> <br><br>

<button class="btn btn-positive" style="background-color:#ffb6c1; border-color:#ffb6c1"><a href="write">글쓰기</a></button>
<button class="btn btn-positive" style="background-color:#ffb6c1; border-color:#ffb6c1"><a href="write?boardParent=${boardDto.boardNo}">답글쓰기</a></button>
<button class="btn btn-positive" style="background-color:#ffb6c1; border-color:#ffb6c1"><a href="?">댓글쓰기</a></button> <br><br>

<div class="row right">
	<span><a href="list">목록보기</a><span>
	
	 <%-- 수정/삭제는 소유자일 경우에만 나와야 한다 --%>
	<c:if test="${boardDto.boardWriter == sessionScope.name}">
		<span><a href="edit?boardNo=${boardDto.boardNo}">수정하기</a></span>
		<span><a href="delete?boardNo=${boardDto.boardNo}">삭제하기</a></span>
	</c:if>
</div>

</div>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>