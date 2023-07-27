package com.kh.spring06.dto;

//POJO 클래스
//= Plan Old Java Object
//= Spring에 등록하지 않아도 됨
public class BoardDto {
	 private int boardNo;
	 private String boardTitle;
	 private String boardContent;
	 private String boardWriter;
	 private String boardReadCount;
	
	 public BoardDto() {
		super();
	}

	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public String getBoardReadCount() {
		return boardReadCount;
	}
	public void setBoardReadCount(String boardReadCount) {
		this.boardReadCount = boardReadCount;
	}

	@Override
	public String toString() {
		return "BoardDto [boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ ", boardWriter=" + boardWriter + ", boardReadCount=" + boardReadCount + "]";
	}
}
