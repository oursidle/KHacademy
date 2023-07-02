package array2;

public class Test02 {
	public static void main(String[] args) {
		//버블 정렬(Bubble sort)
		
		int[] data = new int[] {30, 50, 20, 10, 40};
		
		for(int k=1; k < data.length; k++) {
		//for(int i=0; i < data.length; i++) { ->틀린 코드
			for(int i=0; i < k; i++) {
				System.out.println("k = "+k+", i = "+i);
				if(data[i] > data[k]) {
					int backup = data[i];
					data[i] = data[k];
					data[k] = backup;
				}
			}
		}
		
		for(int i=0; i < data.length; i++) {
			System.out.println(data[i]);
		}
			
	}
}
