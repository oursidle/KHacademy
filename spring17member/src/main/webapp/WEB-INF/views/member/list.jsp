<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" type="text/css" href="/css/commons.css">

<form autocomplete="off">
	<div class="container">
		<div class="row left">
			<h2>회원 조회</h2>
		</div>
		<div class="row left">
			아이디
			<input type="text" name="memberId" value="${vo.memberId}">
		</div>
		<div class="row left">
			닉네임
			<input type="text" name="memberNickname" value="${vo.memberNickname}">
		</div>
		<div class="row left">
			이메일
			<input type="text" name="memberEmail" value="${vo.memberEmail}">
		</div>
		<div class="row left">
			전화번호
			<input type="text" name="memberContact" value="${vo.memberContact}">
		</div>
		<div class="row left">
			생년월일
			<input type="date" name="memberBirthBegin" value="${vo.memberBirthBegin}">
			~
			<input type="date" name="memberBirthEnd" value="${vo.memberBirthEnd}">
		</div>		
		<div class="row left">
			우편번호
			<input type="text" name="memberPost" value="${vo.memberPost}" size="6" maxlength="6">
		</div>
		<div class="row left">
			기본주소
			<input type="text" name="memberAddr1" value="${vo.memberAddr1}">
		</div>
		<div class="row left">
			등급
			<c:choose>
				<c:when test="${vo.memberLevelList.contains('일반')}">
					<input type="checkbox" name="memberLevelList" value="일반" checked>일반
				</c:when>
				<c:otherwise>
					<input type="checkbox" name="memberLevelList" value="일반">일반
				</c:otherwise>
			</c:choose>
			<c:choose>
				<c:when test="${vo.memberLevelList.contains('VIP')}">
					<input type="checkbox" name="memberLevelList" value="VIP" checked>VIP
				</c:when>
				<c:otherwise>
					<input type="checkbox" name="memberLevelList" value="VIP">VIP
				</c:otherwise>
			</c:choose>
			<c:choose>
				<c:when test="${vo.memberLevelList.contains('관리자')}">
					<input type="checkbox" name="memberLevelList" value="관리자" checked>관리자
				</c:when>
				<c:otherwise>
					<input type="checkbox" name="memberLevelList" value="관리자">관리자
				</c:otherwise>
			</c:choose>
		</div>
		<div class="row left">
			포인트
			<input type="date" name="memberPointMin" value="${vo.memberPointMin}">
			~
			<input type="date" name="memberPointMax" value="${vo.memberPointMax}">
		</div>
		<div class="row left">
			가입 일자
			<input type="date" name="memberJoinBegin" value="${vo.memberJoinBegin}">
			~
			<input type="date" name="memberJoinEnd" value="${vo.memberJoinEnd}">
		</div>
		<div class="row left">
			마지막 로그인 일자
			<input type="date" name="memberLoginBegin" value="${vo.memberLoginBegin}">
			~
			<input type="date" name="memberLoginEnd" value="${vo.memberLoginEnd}">
		</div>
		<div>
			마지막 비밀번호 변경 일자
			<input type="date" name="memberChangeBegin" value="${vo.memberChangeBegin}">
			~
			<input type="date" name="memberChangeEnd" value="${vo.memberChangeEnd}">
		</div>
		
		<!-- 정렬 -->
		<div class="row left">
			1차 정렬
			<select name="orderList">
				<option value="">선택</option>
				<option value="member_birth desc">생년월일순</option>
				<option value="member_join desc">가입일순</option>
				<option value="member_login desc">마지막로그인일순</option>
				<option value="member_change desc">마지막비밀번호변경일순</option>
			</select>
		</div>
		<div class="row left">
			2차 정렬
			<select name="orderList">
				<option value="">선택</option>
				<option value="member_birth desc">생년월일순</option>
				<option value="member_join desc">가입일순</option>
				<option value="member_login desc">마지막로그인일순</option>
				<option value="member_change desc">마지막비밀번호변경일순</option>
			</select>
		</div>
		<div class="row left">
			<button type="submit">조회</button>
		</div>
	</div>
</form>

<hr>

<table border="1">
	<thead>
		<tr>
			<th>아이디</th>
			<th>닉네임</th>
			<th>이메일</th>
			<th>전화번호</th>
			<th>생년월일</th>
			<th>우편번호</th>
			<th>기본주소</th>
			<th>상세주소</th>
			<th>등급</th>
			<th>포인트</th>
			<th>가입일</th>
			<th>마지막 로그인 일자</th>
			<th>마지막 비밀번호 변경 일자</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="memberDto" items="${list}">
			<tr>
				<td>${memberDto.memberId}</td>
				<td>${memberDto.memberNickname}</td>
				<td>${memberDto.memberEmail}</td>
				<td>${memberDto.memberContact}</td>
				<td>${memberDto.memberBirth}</td>
				<td>${memberDto.memberPost}</td>
				<td>${memberDto.memberAddr1}</td>
				<td>${memberDto.memberAddr2}</td>
				<td>${memberDto.memberLevel}</td>
				<td>${memberDto.memberPoint}</td>
				<td>${memberDto.memberJoin}</td>
				<td>${memberDto.memberLogin}</td>
				<td>${memberDto.memberChange}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>