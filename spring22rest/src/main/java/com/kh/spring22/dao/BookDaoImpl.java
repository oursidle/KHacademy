package com.kh.spring22.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring22.dto.BookDto;
import com.kh.spring22.error.NoTargetException;

@Repository
public class BookDaoImpl implements BookDao {

	@Autowired
	private SqlSession sqlSession;
	
	//조회
	@Override
	public List<BookDto> selectList() {
		return sqlSession.selectList("book.findAll");
	}
	
	//등록
	@Override
	public void insert(BookDto bookDto) {
		sqlSession.insert("book.save", bookDto);
	}
	
	//삭제
	@Override
	public void delete(int bookId) {
		int result = sqlSession.delete("book.delteByBookId", bookId);
		if(result == 0) throw new NoTargetException();
	}
	
	//상세 조회
	@Override
	public BookDto selectOne(int bookId) {
		BookDto bookDto = sqlSession.selectOne("book.findByBookId", bookId);
		if(bookDto == null) throw new NoTargetException();
		return bookDto;
	}
	
	//전체 수정
	@Override
	public boolean edit(int bookId, BookDto bookDto) {
		Map<String, Object> params = new HashMap<>();
		params.put("bookId", bookId);
		params.put("dto", bookDto);
		return sqlSession.update("book.edit", params) > 0;
	}
	
	//개별 수정
	@Override
	public void change(int bookId, BookDto bookDto) {
//		Map<String, Object> params = new HashMap<>();
		Map<String, Object> params = Map.of("bookId", bookId, "bookDto", bookDto);
//		params.put("bookId", bookId);
//		params.put("dto", bookDto);
		int result = sqlSession.update("book.change", params);
		if(result == 0) throw new NoTargetException();
	}
	
	//도서명 검색
	@Override
	public List<BookDto> bookTitleList(String bookTitle) {
		return sqlSession.selectList("book.findByBookTitle", bookTitle);
	}
}
