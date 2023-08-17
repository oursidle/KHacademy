package com.kh.springhome.dto;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import lombok.Data;

@Data
public class BoardDto {
	private int boardNo;//실제로는 Long 형태를 사용
	private String boardWriter, boardTitle, boardContent;
	private int boardReadCount, boardLikeCount, boardReplyCount;
	private Date boardCTime, boardUTime;
	private int boardGroup;
	private Integer boardParent;
	private int boardDepth;
	
	//작성자 출력용 메소드
	public String getBoardWriterString() {
		if(boardWriter == null)
			return "(탈퇴한 사용자)";
		return boardWriter;
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


//자바에서 시간 처리 방법
//1. java.time 패키지
//				LocalDate
//				LocalTime
//				LocalDateTime
//2. java.util.Date
//3. java.util.Calendar
//4. java.sql.Date