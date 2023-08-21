<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h2 style="color:#F7819F">${boardDto.boardNo}번 게시글</h2>

<table border="1" width="500">
	<tr>
		<th width="120" bgcolor="#f78fb3">번호</th>	
		<td bgcolor="#FBEFFB">${boardDto.boardNo}</td>	
	</tr>	
	<tr>
		<th bgcolor="#f78fb3">제목</th>	
		<td bgcolor="#FBEFFB">${boardDto.boardTitle}</td>	
	</tr>
	<tr>
		<th bgcolor="#f78fb3">작성자</th>	
		<td bgcolor="#FBEFFB">
			${writerDto.memberNickname}
			<%-- 탈퇴한 사용자가 아닐 경우 닉네임을 옆에 추가로 출력 --%>
			<c:if test="${writerDto != null}">
				(${boardDto.boardWriterString})
			</c:if>
		</td>		
	</tr>
	<tr height="100">
		<th bgcolor="#f78fb3">내용</th>	
		<td bgcolor="#FBEFFB" >${boardDto.boardContent}</td>	
	</tr>
	<tr>
		<th bgcolor="#f78fb3">조회수</th>
		<td bgcolor="#FBEFFB">${boardDto.boardReadCount}</td>	
	</tr>	
	<tr>
		<th bgcolor="#f78fb3">좋아요</th>	
		<td bgcolor="#FBEFFB">${boardDto.boardLikeCount}</td>	
	</tr>	
	<tr>
		<th bgcolor="#f78fb3">작성일</th>	
		<td bgcolor="#FBEFFB">
			<fmt:formatDate value="${boardDto.boardCTime}" pattern="y년 M월 d일 E a h시 m분 s초"/>
		 </td>	
	</tr>
	<tr>
		<th bgcolor="#f78fb3">마지막 수정일</th>	
		<td bgcolor="#FBEFFB">
			<fmt:formatDate value="${boardDto.boardUTime}" pattern="y년 M월 d일 E a h시 m분 s초"/>
		 </td>	
	</tr>
</table> <br><br>
<button style="background-color:#f5cd79">❤️</button> <br><br>

<button style="background-color:#f5cd79"><a href="write">글쓰기</a></button>
<button style="background-color:#f5cd79"><a href="write?boardParent=${boardDto.boardNo}">답글쓰기</a></button>
<button style="background-color:#f5cd79"><a href="?">댓글쓰기</a></button> <br><br>


<h3><a href="list">목록보기</a></h3>

 <%-- 수정/삭제는 소유자일 경우에만 나와야 한다 --%>
<c:if test="${boardDto.boardWriter == sessionScope.name}">
	<h4><a href="edit?boardNo=${boardDto.boardNo}">수정하기</a></h4>
	<h4><a href="delete?boardNo=${boardDto.boardNo}">삭제하기</a></h4>
</c:if>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>