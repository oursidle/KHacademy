package com.kh.spring10.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BoardDto {
	private int BoardNo;
	private String BoardTitle;
	private String BoardContent;
	private String BoardWriter;
	private int BoardReadCount;
}
