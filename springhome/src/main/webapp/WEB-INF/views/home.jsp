<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- 
	* 템플릿 페이지(template page)
	: 매번 페이지 코드를 복사할 수 없으니 미리 만든 것을 불러오도록 설정하는 것
	- 절대 경로를 사용
 --%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<div class="container w-500">
	<div class="row">
		<img width="100%" src="${pageContext.request.contextPath}/images/background_pink.jpg">
	</div>
</div>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>