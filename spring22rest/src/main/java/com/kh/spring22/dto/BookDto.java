package com.kh.spring22.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "도서")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BookDto {
	
	@Schema(description = "도서 번호(등록 시 X)")
	private int bookId;
	
	@Schema(description = "도서 제목", nullable = false, example = "제목")
	private String bookTitle;
	
	@Schema(description = "도서 저자", nullable = false, example = "저자")
	private String bookAuthor;
	
	@Schema(description = "도서 출판일", nullable = false, example = "1900-01-01~현재")
	private String bookPublicationDate;
	
	@Schema(description = "도서 가격", nullable = false, example = "가격")
	@Builder.Default
	private float bookPrice = -1f;
	
	@Schema(description = "도서 출판사", nullable = false, example = "출판사")
	private String bookPublisher;
	
	@Schema(description = "도서 페이지 수", nullable = false, example = "페이지 수")
	private int bookPageCount;
	
	@Schema(description = "도서 장르", nullable = false, example = "장르")
	private String bookGenre;
	
	@Schema(hidden = true)
	public boolean isEmpty() {
		return bookId == 0 && bookTitle == null && bookAuthor == null &&
					bookPublicationDate == null && bookPrice == 0 &&
					bookPublisher == null && bookPageCount == 0 && bookGenre == null;

	}
}