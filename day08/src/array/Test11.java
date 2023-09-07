package array;

public class Test11 {
	public static void main(String[] args) {
		
		double[] height = new double[] {150.8, 180.2, 175.9, 162.7, 170.3};
		
		int minIndex = 0;
		for(int i=0; i < height.length; i++) {
			if(height[minIndex] > height[i]) {
				minIndex = i;
			}
		}
		
		System.out.println("가장 작은 키의 위치: " + minIndex);
		System.out.println("가장 작은 키의 값: " + height[minIndex]);
	}
}
