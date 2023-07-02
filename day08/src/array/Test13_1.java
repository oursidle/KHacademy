package array;

public class Test13_1 {
	public static void main(String[] args) {
		
		int[] data = new int[] {30, 50, 20, 10, 50};
		
		int left = 0;
		int right = data.length - 1;
		for(int i=0; i < data.length / 2; i++) {
			int backup = data[left];
			data[left] = data[right];
			data[right] = backup;
			
			left ++;
			right --;
			
			}
		for(int i=0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
