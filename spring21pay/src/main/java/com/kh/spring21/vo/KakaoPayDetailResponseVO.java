package com.kh.spring21.vo;

import java.sql.Date;
import java.util.List;

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
public class KakaoPayDetailResponseVO {
	private String tid;//결제 고유 번호
	private String cid;//가맹점 코드
	private String status;//결제 상태
	private String partnerOrderId;//가맹점 주문번호
	private String partnerUserId;//가맹점 회원 id
	private String paymentMethodType;//결제 수단
	private KakaoPayAmountVO amount;//결제 금액
	private KakaoPayAmountVO canceledAmount;//취소된 금액
	private KakaoPayAmountVO cancelAvailableAmount;//취소 가능 금액
	private String itemName;//상품 이름
	private String itemCode;//상품 코드
	private int quantity;//상품 수량
	private Date createdAt;//결제 준비 요청 시각
	private Date approvedAt;//결제 승인 시각
	private Date canceledAt;//결제 취소 시각
	private KakaoPaySelectedCardInfoVO selectedCardInfo;//결제 카드 정보
	
	//private KakaoPayPaymentActionDetailsVO[] paymentActionDetails;//결제/취소 상세
	private List<KakaoPayPaymentActionDetailVO> paymentActionDetails;//결제/취소 상세
}
