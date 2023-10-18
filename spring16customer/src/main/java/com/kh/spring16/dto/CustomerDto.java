package com.kh.spring16.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class CustomerDto {
	private int customerNo;
	private String customerId, customerContact, customerJoin, customerPurchase;
	private int customerMileage;
	private String customerLevel;
}
