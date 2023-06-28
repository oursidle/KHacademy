package array;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//int[] scoreList = new int[] {0, 0, 0, 0, 0} -> 데이터를 넣고 시작할 때 사용 유리
		int[] scoreList = new int[5];
		
		for(int i=0; i < scoreList.length; i++) {
			System.out.print("점수: ");
			scoreList[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i=0; i < scoreList.length; i++) {
			if(scoreList[i] >= 90)
			System.out.println("성적 우수자 점수: " + scoreList[i]);
			}
		
		for(int i=0; i < scoreList.length; i++) {
			if(scoreList[i] < 60)
			System.out.println("재평가자 점수: " + scoreList[i]);
			}
		
		int student = 75;
		int rank = 1;//1등부터 시작
		
		for(int i=0; i < scoreList.length; i++) {
			if(scoreList[i] > student) {
				rank ++;//1등부터 시작해 student보다 높은 점수가 나올 시 ++
			}
		}
		System.out.println("예상 등수 = " + rank);
	}
}