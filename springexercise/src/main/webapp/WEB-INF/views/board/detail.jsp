<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h2>${boardDto.boardNo}번 게시글</h2>

<table border="1" width="600">
	<tr>
		<th width="25%">작성자</th>
		<td>${boardDto.boardWriter}</td>
	</tr>
	<tr>
		<th>제목</th>
		<td>${boardDto.boardTitle}</td>
	</tr>
	<tr>
		<th height="150">내용</th>
		<td>${boardDto.boardContent}</td>
	</tr>
	<tr>
		<th>작성일</th>
		<td>
			<fmt:formatDate value="${boardDto.boardCtime}" pattern="y년 M월 d일 E a h시 m분 s초"/>
		</td>
	</tr>
	<tr>
		<th>최근 수정일</th>
		<td>
			<fmt:formatDate value="${boardDto.boardUtime}" pattern="y년 M월 d일 E a h시 m분 s초"/>
		</td>
	</tr>
	<tr>
		<td colspan="2" align="right">
			조회수 ${boardDto.boardReadcount}
			좋아요 ${boardDto.boardLikecount}
			댓글 ${boardDto.boardReplycount}
		</td>
	</tr>
	
	<tr>
		<td colspan="2" align="right">
			<a href="write">글쓰기</a>
			<a href="#">답글쓰기</a>
			<a href="#">수정하기</a>
			<a href="#">삭제하기</a>
			<a href="list">목록보기</a>
		</td>
	</tr>
</table>


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>