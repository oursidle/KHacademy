package loop2;

public class Test03 {
	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i=1; i <= 99; i++) {
			boolean ten = i / 10 == 3 || i / 10 == 6 || i / 10 == 9;
			boolean one = i % 10 == 3 || i % 10 == 6 || i % 10 == 9;
			boolean clap = ten || one;
			if(clap) {
				count ++;
			}
		}
		System.out.println("박수 친 횟수: " + count);
	}
}
