package com.kh.spring13;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test3 {
	
	//application.properties에 작성된 정보를 불러와 사용
	@Autowired
	private JavaMailSender sender;
	
	@Test
	public void test() {
		//전송 메세지 - 상대방의 정보와 메일 내용을 설정
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("ourskim722@naver.com");
		message.setSubject("바보");
		message.setText("멍청이");
		
		//전송
		sender.send(message);
	}
}