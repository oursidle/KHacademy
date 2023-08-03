<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
</head>
<body>

<h1>게시판 목록</h1>

<h2><a href="write">글쓰기</a></h2>

<table border="1" width="700">
   <thead>
      <tr>
         <th>번호</th>
         <th width="50%">제목</th>
         <th>작성자</th>
         <th>조회수</th>
         <th>이동</th>
      </tr>
   </thead>
   <tbody align="center">
      <c:forEach var="dto" items="${list}">
         <tr>
            <td>${dto.boardNo}</td>
            	<td align="left">
            		<a href="detail?boardNo=${dto.boardNo}">
            					${dto.boardTitle}</a>
            	</td>
            <td>${dto.boardWriter}</td>
            <td>${dto.boardReadCount}</td>
            <td>
            <a title="Go" href="detail?boardNo=${dto.boardNo}">이동</a>
            </td>
         </tr>
      </c:forEach>
   </tbody>
</table>