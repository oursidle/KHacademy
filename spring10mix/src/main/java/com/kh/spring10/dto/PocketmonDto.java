package com.kh.spring10.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data//@Setter+@Getter+@ToString+@EqualsAndHashCode
//@Setter @Getter @ToString
@NoArgsConstructor
public class PocketmonDto {
	private int no;
	private String name;
	private String type;
	
}
