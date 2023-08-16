package com.kh.springhome.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardDto {
	private int boardNo;//실제로는 Long 형태를 사용
	private String boardWriter, boardTitle, boardContent;
	private int boardReadCount, boardLikeCount, boardReplyCount;
	private Date boardCTime, boardUTime;
}
