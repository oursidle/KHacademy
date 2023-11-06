package com.kh.spring22.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring22.dto.BookDto;

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
	public boolean delete(int bookId) {
		return sqlSession.delete("book.delteByBookId", bookId) > 0;
	}
	
	//상세 조회
	@Override
	public BookDto selectOne(int bookId) {
		return sqlSession.selectOne("book.findByBookId", bookId);
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
	public boolean editUnit(int bookId, BookDto bookDto) {
//		Map<String, Object> params = new HashMap<>();
		Map<String, Object> params = Map.of("bookId", bookId, "bookDto", bookDto);
		params.put("bookId", bookId);
		params.put("dto", bookDto);
		return sqlSession.update("book.change", params) > 0;
	}
	
	//도서명 검색
	@Override
	public List<BookDto> bookTitleList(String bookTitle) {
		return sqlSession.selectList("book.findByBookTitle", bookTitle);
	}
}
