package condition2;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		//인바디 측정기
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("신장(cm): ");
		float height = sc.nextFloat();
		System.out.print("체중(kg): ");
		float weigh = sc.nextFloat();
		sc.close();
		
		
		//계산
		float heightM = height / 100;
		float bmi = weigh / (heightM * heightM);
		
		String result;
		if(bmi < 18.5F) {
			result = "저체중";
		}else if(bmi < 23F) {
			result = "정상";
		}else if(bmi < 25F) {
			result = "과체중";
		}else if(bmi < 30F) {
			result = "경도비만";
		}else {
			result = "중증도비만";
		}
		
		
		//출력
		System.out.println("BMI 수치: " + bmi);
		System.out.println("결과: " + result);
	}
}
