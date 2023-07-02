package array2;

public class Test02_1 {
	public static void main(String[] args) {
		//버블 정렬(Bubble sort)
		
		int[] data = new int[] {30, 50, 20, 10, 40};
		
		for(int k=data.length-2; k >= 0; k--) {
			for(int i=0; i <= k; i++) {
				if(data[i] > data[i+1]) {
					int backup = data[i];
					data[i] = data[i+1];
					data[i+1] = backup;
				}
			}
		}
		
		for(int i=0; i < data.length; i++) {
			System.out.println(data[i]);
		}
			
	}
}
