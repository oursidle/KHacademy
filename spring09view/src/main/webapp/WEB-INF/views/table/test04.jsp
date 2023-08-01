<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KH대학 시간표</title>
</head>
<body>
	<h1>KH대학 시간표</h1>
	
	<table border="1" width="700">
		<thead>
			<tr align="center">
				<th></th>
				<th width="17%" bgcolor="#f8a5c2">월</th>
				<th width="17%" bgcolor="#f8a5c2">화</th>
				<th width="17%" bgcolor="#f8a5c2">수</th>
				<th width="17%" bgcolor="#f8a5c2">목</th>
				<th  width="17%"bgcolor="#f8a5c2">금</th>
			</tr>
		</thead>
		
		<tbody>
			<tr align="center">
				<th bgcolor="#f78fb3">1교시</th>
				<td rowspan="3" bgcolor="#f7d794">자바기초</td>
				<td rowspan="6" bgcolor="#63cdda">공강</td>
				<td colspan="2" bgcolor="#e77f67">파이썬 기초</td>
				<td rowspan="6" bgcolor="#63cdda">공강</td>
			</tr>
			
			<tr align="center">
				<th bgcolor="#f78fb3">2교시</th>
				<td></td>
				<td></td>
			</tr>
			
			<tr align="center">
				<th bgcolor="#f78fb3">3교시</th>
				<td rowspan="3" bgcolor="#BCF5A9">웹 개발 기초</td>
				<td></td>
			</tr>
			
			<tr align="center">
				<th bgcolor="#f78fb3">4교시</th>
				<td></td>
				<td></td>
			</tr>
			
			<tr align="center">
				<th bgcolor="#f78fb3">5교시</th>
				<td rowspan="2" bgcolor="#A9E2F3">데이터베이스</td>
				<td></td>
			</tr>
			
			<tr align="center">
				<th bgcolor="#f78fb3">6교시</th>
				<td></td>
				<td bgcolor="#D0A9F5">인공지능 심화</td>
			</tr>
		</tbody>
	</table>
</body>
</html>