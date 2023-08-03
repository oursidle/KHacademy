<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- 
for(PocketmonDto dto : list) {
	System.out.println(dto.getName());
}

<c:forEach var="dto" items="${list}">
	<h2>${dto}</h2>
</c:forEach>
 -->
 
 <h1>포켓몬스터 목록</h1>
 <h2><a href="insert">신규등록</a></h2>
 
 <table border="1">
 	<thead>
 		<tr>
 			<th>번호</th>
 			<th>이름</th>
 			<th>속성</th>
 			<th colspan="2">보러가기</th>
		<tr>
	</thead>
 	<tbody>
 		<c:forEach var="dto" items="${list}">
 		<tr>
 			<td>${dto.no}</td>
 			<td>${dto.name}</td>
 			<td>${dto.type}</td>
 			<td><a href="/pocketmon/detail?no=${dto.no}">Go(절대)</a></td>
 			<td><a href="detail?no=${dto.no}">Go(상대)</a></td>
		</tr>
 		</c:forEach>
 	</tbody>
 </table>
