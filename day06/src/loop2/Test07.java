package loop2;

public class Test07 {
	public static void main(String[] args) {
		
		//Q: 30일 동안 매일 20개씩
		int total = 0;
		
		for(int i=1;i <= 30; i++) {
			System.out.println(i + " 일차: 20개");
			total += 20;
		}
		System.out.println("합계: " + total);
		
		
		//Q: 30일 동안 푸쉬업 처음 10개 이후 3개씩 추가
		int pushUp = 10;
		int all = 0;
		
		for(int j=1; j <= 30; j++) {
			pushUp= j * 3 + 7;
			System.out.println(j + "일차 : " + pushUp + "개");
			all += pushUp;//all을 pushUp 개수만큼 증가 처리
			pushUp += 3;//3개씩 증가
		}
		System.out.println("총 푸시업 개수: " + all);
	}
}
