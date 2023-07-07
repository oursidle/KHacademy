package api.lang.string2;

public class Test01 {
	public static void main(String[] args) {
		//문자열의 구체적인 검사
		
		String name = "홍길동";
		
		//Q: 올바른 이름 형식인가?
		//[1] 모든 한글로 이루어져 있어야 함(글자 수 == 한글 개수)
		//[2] 2~7글자로 이루어져 있어야 함
		
		int count = 0;
		
		for(int i=0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if(ch >= '가' && ch <= '힣'	) {
				count++;
			}
		}
		
		boolean condition1 = name.length() == count;
		boolean condition2 = name.length() >= 2 && name.length() <= 7;
		
		System.out.println(condition1 && condition2);
	}
}
