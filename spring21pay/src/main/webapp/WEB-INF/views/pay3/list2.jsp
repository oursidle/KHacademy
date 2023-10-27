<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>결제 내역(계층형)</h1>

<c:forEach var="paymentListVO" items="${list}">
	<div style="border: 1px solid gray ; margin: 30px 0px;  padding: 10px">
		<div style="border: 1px solid #FA5882; padding: 10px" class="payment">${paymentListVO.paymentDto}</div>
		<div style="border: 1px solid #FA5882; padding: 10px; margin-top:10px" class="payment-detail">
			<c:forEach var="paymentDetailDto" items="${paymentListVO.paymentDetailList}">
				<div style="border: 1px solid #ffb6c1; padding: 10px;  margin-top:10px" >
					${paymentDetailDto}
					<hr>
					
					<%-- 취소가 가능한 상황일 경우에만 개별내역취소 버튼을 출력 --%>
					<c:if test=${paymentDetailDto.paymentDetailStatus == '완료'}>
						<a href="cancel?paymentDetailNo=${paymentDetailDto.paymentDetailNo}">개별내역취소</a>
					</c:if>
				</div>
			</c:forEach>
		</div>
	</div>
</c:forEach>