package com.kh.spring10.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ShirtDto {
	private int shirtNo;
	private String shirtName;
	private String shirtColor;
	private double shirtPrice;
	private String shirtKind;
	private String shirtType;
	private String shirtMaterial;
	private int shirtStock;
}
