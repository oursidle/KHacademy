<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h2 style="color:#F7819F">게시글 목록</h2>

<%-- 검색일 경우 검색어를 추가로 출력 --%>
<c:if test="${param.keyword != null}">
	<h3>&quot;${param.keyword}&quot;에 대한 검색 결과</h3>
</c:if>

<%-- 글쓰기는 로그인 상태인 경우에만 출력 --%>
<c:if test="${sessionScope.name != null}">
	<button style="background-color:#f5cd79">
		<a href="write">작성</a></button> <br><br>
</c:if>

<table border="1" width="800">
	<thead>
		<tr bgcolor="#f78fb3">
			<th>번호</th>
			<th width="40%">제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>좋아요</th>
			<th>작성일</th>		
		</tr>
	</thead>
	<tbody align="center">
		<c:forEach var="boardDto" items="${list}">
			<tr bgcolor="#FBEFFB">
				<td>${boardDto.boardNo}</td>
				<td align="left">
					<!-- 제목을 누르면 상세페이지로 이동 -->
					<a href="detail?boardNo=${boardDto.boardNo}">
						${boardDto.boardTitle}</a>
					
					<!-- 댓글이 있다면 개수를 표시 -->
					<c:if test="${boardDto.boardReplyCount > 0}">
						[${boardDto.boardReplyCount}]
					</c:if>
				</td>
				
				<%-- 사용자가 없으면 탈퇴한 사용자로 표시 --%>
<%-- 				<c:choose> --%>
<%-- 					<c:when test="${boardDto.boardWriter != null}"> --%>
<%-- 						<td>${boardDto.boardWriter}</td> --%>
<%-- 					</c:when> --%>
<%-- 					<c:otherwise> --%>
<!-- 						<td>(탈퇴한 사용자)</td> -->
<%-- 					</c:otherwise>	 --%>
<%-- 				</c:choose> --%>

				<td>${boardDto.boardWriterString}</td>
				
				<td>${boardDto.boardReadCount}</td>
				<td>${boardDto.boardLikeCount}</td>
				
				<td>${boardDto.getBoardCTimeString()}</td>
			</tr>
		</c:forEach>
	</tbody>
</table> <br><br>

<!-- 검색창 -->
<form action="list" method="get">
	<c:choose>
		<c:when test="${param.type == 'board_writer'}">
			<select name="type" required>
				<option value="board_title">제목</option>
				<option value="board_writer" selected>작성자</option>
			</select>
		</c:when>
		<c:otherwise>
			<select name="type" required>
				<option value="board_title">제목</option>
				<option value="board_writer">작성자</option>
			</select>
		</c:otherwise>
	</c:choose>
	<input type="search" name="keyword" placeholder="검색어 입력" value="${param.keyword}" required>
	<button style="background-color:#f5cd79">검색</button>	
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>