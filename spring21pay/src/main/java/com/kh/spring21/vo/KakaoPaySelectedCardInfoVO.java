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
public class KakaoPaySelectedCardInfoVO {
	private String cardBin;//카드BIN
	private int installMonth;//할부 개월 수
	private String cardCorpName;//카드사 정보
	private String interestFreeInstall;//무이자할부 여부(Y/N)
}
