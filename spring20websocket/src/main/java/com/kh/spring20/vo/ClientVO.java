package com.kh.spring20.vo;

import java.io.IOException;
import java.util.Map;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

//웹소켓 통신에서 사용자를 조금 더 편하게 관리하기 위한 클래스
@Data
@EqualsAndHashCode(of = "session")//session 필드가 동일(완전 동일)하면 같은 객체라고 판단
@ToString(of = {"memberId", "memberLevel"})//출력 시 작성한 항목만 출력
public class ClientVO {
	@JsonIgnore//Json으로 변환하는 과정에서 에서 해당 필드는 제외(21번 째 줄)
	private WebSocketSession session;
	private String memberId, memberLevel;
	
	//session은 반드시 있어야 하므로 생성자로 설정
	public ClientVO(WebSocketSession session) {
		this.session = session;
		Map<String, Object> attr = session.getAttributes();
		this.memberId = (String) attr.get("name");
		this.memberLevel = (String) attr.get("level");
	}
	
	public boolean isMember() {
		return memberId != null && memberLevel != null;
	}
	public void send(TextMessage message) throws IOException {
		session.sendMessage(message);
	}
}
