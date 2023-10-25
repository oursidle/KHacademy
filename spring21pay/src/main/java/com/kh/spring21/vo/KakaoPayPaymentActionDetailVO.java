package com.kh.spring21.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class KakaoPayPaymentActionDetailVO {
	private String aid;//Request 고유 번호
	private String approvedAt;//거래시간
	private int amount;//결제/취소 총액
	private int pointAmount;//결제/취소 포인트 금액
	private int discountAmount;//할인 금액
	private int greenDeposit;//컵 보증금
	private String paymentActionType;//결제 타입 : PAYMENT(결제), CANCEL(결제취소), ISSUED_SID(SID 발급) 중 하나
	private String payload;//Request로 전달한 값
}
