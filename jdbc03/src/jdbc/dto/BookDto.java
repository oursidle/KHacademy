package jdbc.dto;

import java.sql.Date;

public class BookDto {
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private String bookPublicationDate;
	private int bookPrice;
	private String bookPublisher;
	private int BookPageCount;
	private String bookGenre;
	
	public BookDto() {
		super();
	}

	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPublicationDate() {
		return bookPublicationDate;
	}
	public void setBookPublicationDate(String bookPublicationDate) {
		this.bookPublicationDate = bookPublicationDate;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	public int getBookPageCount() {
		return BookPageCount;
	}
	public void setBookPageCount(int BookPageCount) {
		this.BookPageCount = BookPageCount;
	}
	public String getBookGenre() {
		return bookGenre;
	}
	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	@Override
	public String toString() {
		return "BookDto [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor
				+ ", bookPublicationDate=" + bookPublicationDate + ", bookPrice=" + bookPrice + ", bookPublisher="
				+ bookPublisher + ", BookPageCount=" + BookPageCount + ", bookGenre=" + bookGenre + "]";
	}
}
