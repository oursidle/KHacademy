package api.file.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//문자열 파일 입출력
		//= 문자열은 byte 또는 char와 상호변환 가능
		
		String s1 = "Hello 안녕하세요";
		
		byte[] b1 = s1.getBytes();//기본 설정
		System.out.println(Arrays.toString(b1));//(양수: 아스키코드/음수: 유니코드)
		
		//(유니코드 표현 방식)
		byte[] b2 = s1.getBytes("MS949");
		byte[] b3 = s1.getBytes("UTF-8");
		
		System.out.println(Arrays.toString(b2));
		System.out.println(Arrays.toString(b3));
		
		String s2 = new String(b2, "MS949");//(자바는 기본적으로 UTF=8로 인코딩)
		String s3 = new String(b3/*, "UTF-8" */);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
	}
}
