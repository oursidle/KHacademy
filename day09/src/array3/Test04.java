package array3;

public class Test04 {
	public static void main(String[] args) {
		
		String[][] data = new String[][] {
			{"자바", "스프링", "안드로이드"},
			{"파이썬", "판다스", "장고"}
		};
		
		for(int i=0; i < data.length; i++) {
			for(int k=0; k < data[i].length; k++) {
				System.out.print(data[i][k] + "\t");
			}
			System.out.print("\n");
		}
	}
}
