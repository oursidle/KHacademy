package array3;

public class Test03 {
	public static void main(String[] args) {
		
//		float[][] data = new float[3][3];
//		
//		data[0][0] = 1.5f;		data[0][1] = 2.5f;		data[0][2] = 3.6f;
//		data[1][0] = 10.2f;		data[1][1] = 5.3f;			data[1][2] = 6.5f;
		
		float[][] data = new float[][] {
			{1.5f, 2.5f, 3.6f},
			{10.2f, 5.3f, 6.5f}
		};
		
		System.out.print(data[0][0] + "\t");
		System.out.print(data[0][1] + "\t");
		System.out.print(data[0][2] + "\t");
		System.out.println();
		
		System.out.print(data[1][0] + "\t");
		System.out.print(data[1][1] + "\t");
		System.out.print(data[1][2] + "\t");
		
	}
}
