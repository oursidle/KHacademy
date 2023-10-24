package com.kh.spring21;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.kh.spring21.configuration.KakaoPayProperties;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test06Approve {

	@Autowired
	private RestTemplate template;
	
	@Autowired
	private HttpHeaders headers;
	
	@Autowired
	private KakaoPayProperties kakaoProperties;
	
	@Test
	public void test() throws URISyntaxException {
		URI uri = new URI("https://kapi.kakao.com/v1/payment/approve");
				
		MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
		body.add("cid", kakaoProperties.getCid());//가맹점 코드
		body.add("tid", "T537691351b66fd4faa3");//결제 고유번호
		body.add("partner_order_id", "aa2b0cff-cf8e-476d-a557-53b457329051");//가맹점 주문번호
		body.add("partner_user_id", "testuser1");//가맹점 회원(주문자)
		body.add("pg_token", "3747042bdf54f74fa70e");//결제승인 요청을 인증하는 토큰
		
		HttpEntity entity = new HttpEntity(body, headers);
		
		Map response = template.postForObject(uri, entity, Map.class);
		
	}
}
