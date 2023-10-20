<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h2>자유 게시판</h2>

<table border="1" width="800">
	<thead>
		<tr>
			<th>번호</th>
			<th width="40%">제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
			<th>좋아요</th>
		</tr>
	</thead>
	<tbody align="center">
		<c:forEach var="boardDto" items="${list}">
			<tr>
				<td>${boardDto.boardNo}</td>
				<td align="left">
					<!-- 제목을 누르면 상세페이지로 이동 -->
					<a href="detail?boardNo=${boardDto.boardNo}">
						${boardDto.boardTitle}
					</a>
				</td>
				<td>${boardDto.boardWriter}</td>
				<td>${boardDto.boardCtime}</td>
				<td>${boardDto.boardReadcount}</td>
				<td>${boardDto.boardLikecount}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>