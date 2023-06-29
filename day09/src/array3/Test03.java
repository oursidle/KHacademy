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
		System.out.println(data.length);//2
		System.out.println(data[0].length);//3
		System.out.println(data[1].length);//3
		
		for(int k=0; k < data.length; k++) {
			for(int i=0; i < data[k].length; i++) {
				System.out.print(data[k][i] + "\t");
			}
			System.out.println();
		}
		
	}
}
