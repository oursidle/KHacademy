package oop.keyword4;

import java.util.Random;

public class Robot {
	//[1] 제곱 계산 기능
	public static int square(int n){
		return n * n;
	}
	public static double square(double n) {
		return n * n;
	}
	
	//[2] 삼각형 넓이 계산 기능
	public static float triangle(int width, int height) {
		return (float)width * height / 2;
	}
	public static double triangle(double width, double height) {
		return (double)width * height / 2;
	}

	//[3] 원의 넓이를 구하는 메소드
	public static float circle(int radius) {
		return square(radius) * 3.14f;
	}
	public static double circle(double radius) {
		return square(radius) * 3.14;
	}
	
	//[4] 배열을 선택정렬하는 메소드
	public static void sort(int[] data) {
		//선택정렬
		for(int k=0; k < data.length-1; k++) {
			int minIndex = k;//k번 위치의 값이 가장 작다고 가정
			for(int i = k+1; i < data.length; i++) {//뒤에 있는 데이터와 비교
				if(data[minIndex] > data[i]) {//더 작은 값이 있다면
					minIndex = i;//교체
				}
			}
			int backup = data[minIndex];
			data[minIndex] = data[k];
			data[k] = backup;
		}
	}
	
	//[5] 배열을 뒤집는 메소드(reverse)
	public static void reverse(int[] data) {
		int left = 0;
		int right = data.length - 1;
		
		for(int i=0; i < data.length / 2; i++) {
			int backup = data[left];
			data[left] = data[right];
			data[right] = backup;
			
			left ++;
			right --;
			
		}
	}
	
	//[6] 배열을 무작위로 섞는 메소드(shuffle)
	public static void shuffle(int[] data) {
		//셔플(뒤섞기)
		//- 같은 자리 제거
		//- 같은 자리가 나오면 재추첨
		//- 같은 자리가 나오면 하던 작업 무효화
		Random r = new Random();
	
		for(int i=0; i < data.length; i++) {
		//[i] <---> [0~4]
			int index = r.nextInt(data.length);
		
			if(i != index) {
				int backup = data[i];
				data[i] = data[index];
				data[index] = backup;
			}
		}
	}
	
	//[7] 배열을 출력하는 메소드
	public static void print(int[] data) {
		for(int i=0; i < data.length; i++) {
			System.out.println(data[i]);
			System.out.println("\t");
		}
		System.out.println();
	}
}
