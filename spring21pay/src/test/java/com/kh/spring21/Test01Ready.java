package com.kh.spring21;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test01Ready {

	@Test
	public void test() throws URISyntaxException {
		//웹서버에서 PG사(제 3의 서버)로 요청을 보내기 위해선 다음 둘 중에 하나가 필요함
		//[1] RestTemplate
		//[2] WebClient
		
		//전송 도구 생성
		RestTemplate template = new RestTemplate();
		
		//주소 설정 (URL : 페이지 / URI : 페이지 + a (넓은 의미))
		URI uri = new URI("https://kapi.kakao.com/v1/payment/ready");
		
		//헤더 설정
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "KakaoAK 420ba43ae4229272c0f0f2fc7d3c2fca");
		headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
		
		//바디 설정
		MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
		body.add("cid", "TC0ONETIME");//가맹점 코드
		body.add("partner_order_id", UUID.randomUUID().toString());//가맹점 주문번호 / UUID 30자의 시리얼 번호 랜덤 추첨
		body.add("partner_user_id", "testuser1");//가맹점 회원 id(주문자)
		body.add("item_name", "아이스 아메리카노 T");//상품명
		body.add("quantity", "1");//상품 수량 **실제 수량은 DB에서 관리 예정
		body.add("total_amount", "3000");//상품 총액
		body.add("tax_free_amount", "0");//상품 비과세 금액
		body.add("approval_url", "http://localhost:8080/pay/success");//결제 성공 시 redirect url
		body.add("cancel_url", "http://localhost:8080/pay/cancel");//결제 취소 시 redirect url
		body.add("fail_url", "http://localhost:8080/pay/fail");//결제 실패 시 redirect url
		
		//요청 발송
		//HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(body, headers);
		HttpEntity entity = new HttpEntity(body, headers);
		
		Map response = template.postForObject(uri, entity, Map.class);
		//log.debug("response = {}", response);
		log.debug("url = {}", response.get("next_redirect_pc_url"));
	}
}
