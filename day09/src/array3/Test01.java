package array3;

public class Test01 {
	public static void main(String[] args) {
		//2차원 배열(3차원 배열, 4차원 배열, 다차원 배열, ...)
		
		//Q: 학생 100명의 시험점수를 저장해보세요
		//A: 변수 100개 or 1차원 배열 100칸
		int[] score1 = new int[100];
		
		//Q: 5개의 반에서 학생 10명씩 뽑아 얻은 시험점수를 저장해보세요
		//A: 변수 50개 or 1차원 배열 50칸 or 2차원 배열 1개
		int[][] score2 = new int[5][10];
		
		//Q: 3개의 학년의 5개의 반에서 학생 10명씩 뽑아 얻은 시험점수를 저장해보세요
		int[][][] score3 = new int[3][5][10];
		
		//Q: 2개 학교, 3개의 학년, 5개 반에서 학생 10명씩 뽑아 얻은 시험점수를 저장해보세요
		int[][][][] score4 = new int[2][3][5][10];
	}
}
