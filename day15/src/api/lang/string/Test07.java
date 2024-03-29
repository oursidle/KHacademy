package api.lang.string;

public class Test07 {
	public static void main(String[] args) {
		//문자열 편집
		//= 주어진 문자열을 원하는 목적에 맞게 변형시키는 것
		//= 문자열은 불변이므로 편집 시 신규 문자열을 생성함
		
		//대소문자 변환
		String url = "HTTP://WWW.NAVER.COM";
		
		System.out.println(url.toLowerCase());//소문자로 변형(신규 문자열 생성)
		
		System.out.println(url);
		url = url.toLowerCase();
		System.out.println(url);
		
		url = url.toUpperCase();
		System.out.println(url);
		
		//불필요한 공백 제거(유의미한 첫 글자의 앞과 마지막 글자의 뒤)
		String google = "				http://google.com					";
		System.out.println(google.trim());//아스키 코드의 공백만 제거(기존)
		System.out.println(google.strip());//유니코드의 공백도 제거(신규)
		
		//문자열 치환(찾아서 바꾸기)
		String line = "나는 고기가 좋아요";
		System.out.println(line.replace("고기", "자바"));
		System.out.println(line.replace("고기", "자바").replace("좋아", "싫어"));
		
	}
}
