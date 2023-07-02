package date2;

public class Test02 {
	public static void main(String[] args) {
		//입력
		int cm = 180;
		int kg= 80;
		
		//계산
		//double m = cm / 100.0;  ->이것도 맞는 방법
		double m = (double)cm / 100;
		double bmi = kg / ( m * m );
		
		//출력
		System.out.println(bmi);
	}
}