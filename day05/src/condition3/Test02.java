package condition3;

public class Test02 {
	public static void main (String[] args) {
		//switch-case 구문
		
		//입력 - 월 정보
		int month = 9;
		
		
		switch(month) {//month 에 있는 값을 토대로 실행 지점을 찾겠다
		case 12, 1, 2: //month 가 2인 경우 실행할 곳
			System.out.print("겨울");
			break;
		case 3, 4, 5://month 가 3인 경우 실행할 곳
			System.out.println('봄');
			break;
		case 6, 7, 8:
			System.out.println("여름");
			break;
		default:
			System.out.println("가을");
		}
	}
}
