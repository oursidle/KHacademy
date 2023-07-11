package api.time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
	public static void main(String[] args) {
		
		Date a = new Date();
		
		SimpleDateFormat fmt1 = new SimpleDateFormat("y년 M월 d일");
		SimpleDateFormat fmt2 = new SimpleDateFormat("a h시 m분");//24시간 'H', 12시간 'h'
		SimpleDateFormat fmt3 = new SimpleDateFormat("H:mm:ss");//day of week(요일)
		SimpleDateFormat fmt4 = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
		
		System.out.println(fmt1.format(a));
		System.out.println(fmt2.format(a));
		System.out.println(fmt3.format(a));
		System.out.println(fmt4.format(a));
		
	}
}
