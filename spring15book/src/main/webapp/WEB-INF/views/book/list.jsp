<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form autocomplete="off">
	<div>도서번호<input type="text" name="bookId" value="${vo.bookId}"></div>
	<div>도서명<input type="text" name="bookTitle" value="${vo.bookTitle}"></div>
	<div>저자<input type="text" name="bookAuthor" value="${vo.bookAuthor}"></div>
	<div>출판사<input type="text" name="bookPublisher" value="${vo.bookPublisher}"></div>
	<div>
		출간일
		<input type="date" name="bookPublicationBegin" value="${vo.bookPublicationBegin}">
		~
		<input type="date" name="bookPublicationEnd" value="${vo.bookPublicationEnd}">
	</div>
	<div>
		판매가
		<input type="number" name="bookPriceMin" value="${vo.bookPriceMin}">
		~
		<input type="number" name="bookPriceMax" value="${vo.bookPriceMax}">
	</div>
	<div>
		페이지
		<input type="number" name="bookPageMin" value="${vo.bookPageMin}">
		~
		<input type="number" name="bookPageMax" value="${vo.bookPageMax}">
	</div>
	<div>
		장르
		<c:choose>
			<c:when test="${vo.bookGenreList.contains('Fiction')}">
				<input type="checkbox" name="bookGenreList" value="Fiction" checked>Fiction
			</c:when>
			<c:otherwise>
				<input type="checkbox" name="bookGenreList" value="Fiction">Fiction
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${vo.bookGenreList.contains('Fantasy')}">
				<input type="checkbox" name="bookGenreList" value="Fantasy" checked>Fantasy
			</c:when>
			<c:otherwise>
				<input type="checkbox" name="bookGenreList" value="Fantasy">Fantasy
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${vo.bookGenreList.contains('Classic')}">
				<input type="checkbox" name="bookGenreList" value="Classic" checked>Classic
			</c:when>
			<c:otherwise>
				<input type="checkbox" name="bookGenreList" value="Classic">Classic
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${vo.bookGenreList.contains('Dystopian')}">
				<input type="checkbox" name="bookGenreList" value="Dystopian" checked>Dystopian
			</c:when>
			<c:otherwise>
				<input type="checkbox" name="bookGenreList" value="Dystopian">Dystopian
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${vo.bookGenreList.contains('Romance')}">
				<input type="checkbox" name="bookGenreList" value="Romance" checked>Romance
			</c:when>
			<c:otherwise>
				<input type="checkbox" name="bookGenreList" value="Romance">Romance
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${vo.bookGenreList.contains('Modernist')}">
				<input type="checkbox" name="bookGenreList" value="Modernist" checked>Modernist
			</c:when>
			<c:otherwise>
				<input type="checkbox" name="bookGenreList" value="Modernist">Modernist
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${vo.bookGenreList.contains('Thriller')}">
				<input type="checkbox" name="bookGenreList" value="Thriller" checked>Thriller
			</c:when>
			<c:otherwise>
				<input type="checkbox" name="bookGenreList" value="Thriller">Thriller
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${vo.bookGenreList.contains('Mistery')}">
				<input type="checkbox" name="bookGenreList" value="Mistery" checked>Mistery
			</c:when>
			<c:otherwise>
				<input type="checkbox" name="bookGenreList" value="Mistery">Mistery
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${vo.bookGenreList.contains('Contemporary')}">
				<input type="checkbox" name="bookGenreList" value="Contemporary" checked>Contemporary
			</c:when>
			<c:otherwise>
				<input type="checkbox" name="bookGenreList" value="Contemporary">Contemporary
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${vo.bookGenreList.contains('Apocalyptic')}">
				<input type="checkbox" name="bookGenreList" value="Apocalyptic" checked>Apocalyptic
			</c:when>
			<c:otherwise>
				<input type="checkbox" name="bookGenreList" value="Apocalyptic">Apocalyptic
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${vo.bookGenreList.contains('Horror')}">
				<input type="checkbox" name="bookGenreList" value="Horror" checked>Horror
			</c:when>
			<c:otherwise>
				<input type="checkbox" name="bookGenreList" value="Horror">Horror
			</c:otherwise>
		</c:choose>
	</div>
	
	<!-- 정렬 -->
	<div>
		1차 정렬
		<select name="orederList">
			<option value="">선택</option>
			<option value="book_id asc">번호순</option>
			<option value="book_price desc">높은가격순</option>
			<option value="book_price asc">낮은가격순</option>
			<option value="book_publication_date desc">최근출간순</option>
		</select>
	</div>
	<div>
		2차 정렬
		<select name="orederList">
			<option value="">선택</option>
			<option value="book_id asc">번호순</option>
			<option value="book_price desc">높은가격순</option>
			<option value="book_price asc">낮은가격순</option>
			<option value="book_publication_date desc">최근출간순</option>
		</select>
	</div>
	<button type="submit">검색</button>
</form>


<hr>

<table border="1">
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>저자</th>
			<th>출판사</th>
			<th>출간일</th>
			<th>판매가</th>
			<th>페이지</th>
			<th>장르</th>
		</tr>
	</thead>
	<tbody>
        <c:forEach var="bookDto" items="${list}">
        <tr>
            <td>${bookDto.bookId}</td>
            <td>${bookDto.bookTitle}</td>
            <td>${bookDto.bookAuthor}</td>
            <td>${bookDto.bookPublisher}</td>
            <td>${bookDto.bookPublicationDate}</td>
            <td>${bookDto.bookPrice}</td>
            <td>${bookDto.bookPageCount}</td>
            <td>${bookDto.bookGenre}</td>
        </tr>
        </c:forEach>
    </tbody>
</table>