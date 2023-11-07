package com.kh.spring22.dao;

import java.util.List;

import com.kh.spring22.dto.BookDto;

public interface BookDao {
	List<BookDto> selectList();
	void insert(BookDto bookDto);
	void delete(int bookId);
	BookDto selectOne(int bookId);
	boolean edit(int bookId, BookDto bookDto);
	void change(int bookId, BookDto bookDto);
	List<BookDto> bookTitleList(String bookTitle);
	List<BookDto> selectListByPage(int page, int size);
}
