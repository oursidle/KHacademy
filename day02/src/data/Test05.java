package data;

public class Test05 {
	public static void main(String[] args) {
		// 변수를 의미있는 이름으로 작성하여 만들기
		
		//[1] 문제에서 주어진 값을 먼저 저장
		int noodlePrice = 7000;//snake기법: 대소문자 구분X / camel기법: 대소문자 구분O
		int champonPrice = 8000;
		int noodleCount = 2;
		int champonCount = 3;
		
		//[2] [1]번의 데이터로 계산
		int noodleTotal = noodlePrice * noodleCount;
		int champonTotal = champonPrice * champonCount;
		int total = noodleTotal + champonTotal;
		
		//[3] [1],[2]번의 데이터로 문제에서 원하는 결과를 출력
		System.out.println(noodleTotal);
		System.out.println(champonTotal);
		System.out.println(total);
	}
}
