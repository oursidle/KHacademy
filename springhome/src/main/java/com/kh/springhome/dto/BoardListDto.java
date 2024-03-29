package com.kh.springhome.dto;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import lombok.Data;

//게시판 목록만을 위한 DTO
@Data
public class BoardListDto {
	private String memberNickname;
	private int boardNo;
	private String boardWriter, boardTitle;
	private int boardReadCount, boardLikeCount, boardReplyCount;
	private Date boardCTime, boardUTime;
	private int boardGroup;
	private Integer boardParent;
	private int boardDepth;
	
	private int boardPage;
	
	//작성자 출력용 메소드
	public String getBoardWriterString() {
		if(boardWriter == null)
			return "(탈퇴한 사용자)";
		return memberNickname;
	}
	
	//날짜에 따라 다른 값을 반환한는 메소드
		public String getBoardCTimeString() {
			LocalDate current = LocalDate.now();//현재 날짜
			LocalDate cTime = boardCTime.toLocalDate();//작성일
			if(cTime.equals(current)) {//작성일 == 오늘
				Timestamp stamp = new Timestamp(boardCTime.getTime());
				LocalDateTime time = stamp.toLocalDateTime();
				LocalTime result = time.toLocalTime();
				return result.format(DateTimeFormatter.ofPattern("HH:mm"));
			}else {
				return cTime.toString();
			}
		}
}
