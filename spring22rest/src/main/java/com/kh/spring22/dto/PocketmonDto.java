package com.kh.spring22.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class PocketmonDto {
	private int no;
	private String name, type;
	
	public boolean isEmpty() {
		return no == 0 && name == null && type == null;
	}
}
