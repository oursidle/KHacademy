package com.kh.springhome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.mapper.MemberMapper;
import com.kh.springhome.vo.PaginationVO;

@Repository
public class AdminDaoImpl implements AdminDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public List<MemberDto> selectList() {
		String sql = "select * from member order by member_id desc";
		return jdbcTemplate.query(sql, memberMapper);
	}

	@Override
	public List<MemberDto> selectList(String type, String keyword) {
		String sql = "select * from member"
						+ " where instr("+type+", ?) > 0";
		Object[] data = {keyword};
		return jdbcTemplate.query(sql, memberMapper, data);
	}
	
	@Override
	public List<MemberDto> selectListByPage(int page) {
		int begin = (page-1) * 20 +1;
		int end = page * 20;
		
		String sql = "select * from ("
								+ " select rownum rn, TMP.* from("
									+ " select * from member"
								+") TMP"
							+ ") where rn between ? and ?";
		Object[] data = {begin, end};
		return jdbcTemplate.query(sql, memberMapper, data);
	}
	
	@Override
	public List<MemberDto> selectListByPage(String type, String keyword, int page) {
		int begin = (page-1) * 20 +1;
		int end = page * 20;
		
		String sql = "select * from ("
								+ " select rownum rn, TMP.* from("
									+ " select * from member"
									+ " where instr("+type+", ?) > 0"
								+ " )TMP"
							+ ") where rn between ? and ?";
		Object[] data = {keyword, begin, end};
		return jdbcTemplate.query(sql, memberMapper, data);
	}

	@Override
	public int countList(PaginationVO vo) {
		if(vo.isSearch()) {//검색
			String sql = "select count(*) from member where instr("+vo.getType()+", ?) > 0";
			Object[] data = {vo.getKeyword()};
			return jdbcTemplate.queryForObject(sql, int.class, data);
		}else {//목록
			String sql = "select count(*) from member";
			return jdbcTemplate.queryForObject(sql, int.class);
		}
	}

	@Override
	public List<MemberDto> selectListByPage(PaginationVO vo) {
		if(vo.isSearch()) {
			return selectListByPage(vo.getType(),vo.getKeyword(), vo.getPage());
		}else {
			return selectListByPage(vo.getPage());
		}
}

}