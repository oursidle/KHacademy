package com.kh.springhome.vo;

import lombok.Data;

//VO(Value Object)
//- 내 입맛대로 데이터를 모아 저장하는 클래스(DB 무관)
//- 등록하지 않고
@Data
public class PaginationVO {
	private String type, keyword;//검색 분류 및 키워드
	private int page = 1;//현재 페이지 번호(기본:1)
	private int size = 10;//보여줄 게시판의 글 수(기본:10)
	private int count;//전체 글 수
	private int navigatorSize = 10;//하단 네이게이터 표시 개수(기본:10)
	
	public boolean isSearch() {
		return type != null && keyword != null;
	}
	public int getBegin() {
		return (page - 1) / navigatorSize * navigatorSize + 1;
	}
	public int getEnd() {
		int end = getBegin() + navigatorSize - 1;
		return Math.min(getPageCount(), end);
	}
	public boolean isFirst() {
		return getBegin() == 1;
	}
	public String getPrevQueryString() {
		if(isSearch()) {//검색
			return "page="+(getBegin()-1)+"&type="+type+"&keyword="+keyword;
		}else {//목록
			return "page="+(getBegin()-1);
		}
	}
	
	public int getPageCount() {
		return (count - 1) / size + 1;
	}
	public boolean isLast() {
		return getEnd() >= getPageCount();
	}
	public String getNextQueryString() {
		if(isSearch()) {//검색
			return "page="+(getEnd()+1)+"&type="+type+"&keyword="+keyword;
		}else {//목록
			return "page="+(getEnd()+1);
		}
	}
	
	public String getQueryString(int page) {
		if(isSearch()) {//검색
			return "page="+(page)+"&type="+type+"&keyword="+keyword;
		}else {//목록
			return "page="+(page);
		}
	}
	
	public int getStartRow() {
		return getFinishRow() - (size - 1);
	}
	public int getFinishRow() {
		return page * size;
	}
}
