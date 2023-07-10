package api.exception;

public class Test06 {
	public static void main(String[] args) {
		
		String today = "2023-7-10";
		
		String today1 = today.substring(0,4);
		String today2 = today.substring(5,7);
		int todayYear = Integer.parseInt(today1);
		int todayMonth = Integer.parseInt(today2);
		
		System.out.print("생년월일을 입력하세요(yyyy-mm-dd) : ");
		String birth = "2000-07-22";
		System.out.println(birth);
		
		String birth1 = birth.substring(0,4);
		String birth2 = birth.substring(5,7);
		int birthYear = Integer.parseInt(birth1);
		int birthMonth = Integer.parseInt(birth2);
		
		int koreanAge = todayYear - birthYear + 1;
		System.out.println("한국나이: " + koreanAge);
	}
}
