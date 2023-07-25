package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.MemberDto;
import jdbc.util.JdbcUtils;

public class MemberDao {
	
	public void insert(MemberDto dto) {
		String sql = "insert into member("
				+ "member_id, member_pw, member_nickname, "
				+ "member_birth, member_email, member_contact"
				+ ") values (?, ?, ?, ?, ?, ?)";
		Object[] data = {dto.getMemberId(), dto.getMemberPw(), dto.getMemberNickname(),
				dto.getMemberBirth(), dto.getMemberEmail(), dto.getMemberContact()
			};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		jdbcTemplate.update(sql, data);
	}
	
	
	//비밀번호 변경 가능
	//[1] 기존 비밀번호와 신규 비밀번호를 입력받아 검사 후 변경(비권장)
	//		public boolean updateMemberPassword(MemberDto dto, String newPw){}
	//[2] 임시 비밀번호 변경하는 기능
	//		public boolean updateMemberPassword(String memebrId){}
	//[3] 아이디에 맞는 계정의 비밀번호를 변경하는 기능
	//		public boolean updateMemberPassword(String memebrId, String memebrPw){}
	public boolean updateMemberPassword(MemberDto dto) {//3
		String sql = "update member set member_pw = ? where member_id = ?";
		Object[] data = {
				dto.getMemberPw(), dto.getMemberId()
		};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	//회원 정보 변경
	public boolean updateMemberInfo(MemberDto dto) {
		String sql = "update member set"
				+ " member_nickname = ? , member_contact = ?,"
				+ " member_email = ?, member_birth = ?"
				+ " where member_id = ?";
		Object[] data = {
				dto.getMemberNickname(), dto.getMemberContact(),
				dto.getMemberEmail(), dto.getMemberBirth(), dto.getMemberId()
		};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	public boolean delete(String memberId) {
		String sql = "delete member where member_id = ?";
		Object[] data = {memberId};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.update(sql, data) > 0;
	}
}
