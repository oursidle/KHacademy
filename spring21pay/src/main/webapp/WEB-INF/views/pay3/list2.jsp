<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>결제 내역(계층형)</h1>

<c:forEach var="paymentListVO" items="${list}">
	<div style="border: 1px solid gray ; margin: 30px 0px;  padding: 10px">
		<div style="border: 1px solid #FA5882; padding: 10px" class="payment">${paymentListVO.paymentDto}</div>
		<hr>
		
		<%-- 전체취소 버튼은 잔여금액이 있을 때만 출력되어야 함 --%>
		<c:if test="${paymentListVO.paymentDto.paymentRemain > 0}">
			<a href="cancelAll?paymentNo=${paymentListVO.paymentDto.paymentNo}">전체(잔여) 금액 취소</a>
		</c:if>	
		
		<div style="border: 1px solid #FA5882; padding: 10px; margin-top:10px" class="payment-detail">
			<c:forEach var="paymentDetailDto" items="${paymentListVO.paymentDetailList}">
				<div style="border: 1px solid #ffb6c1; padding: 10px;  margin-top:10px" >
					${paymentDetailDto}
					<hr>
					
					<%-- 취소가 가능한 상황일 경우에만 개별내역취소 버튼을 출력 --%>
					<c:if test="${paymentDetailDto.paymentDetailStatus == '완료'}">
						<a href="cancel?paymentDetailNo=${paymentDetailDto.paymentDetailNo}">개별내역취소</a>
					</c:if>
				</div>
			</c:forEach>
		</div>
	</div>
</c:forEach>