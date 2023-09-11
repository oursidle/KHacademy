package com.kh.springhome.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.kh.springhome.dto.ReplyDto;
import com.kh.springhome.mapper.ReplyMapper;

public class ReplyDaoImpl implements ReplyDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private ReplyMapper replyMapper;
	
	@Override
	public int sequence() {
		String sql = "select reply_seq.nextval from dual";
		return jdbcTemplate.queryForObject(sql, int.class);
	}

	@Override
	public void insert(ReplyDto replyDto) {
		String sql = "insert into reply("
								+ "reply_no, reply_writer, reply_content, reply_origin"
							+ ") values (?, ?, ?, ?)";
		Object[] data = {replyDto.getReplyNo(), replyDto.getReplyWriter(),
				 					replyDto.getReplyContent(), replyDto.getReplyOrigin()
		};
		jdbcTemplate.update(sql, data);
	}

}
