package api.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test06 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		int d_day = 100;
		
//		int day = c.get(Calendar.DATE);
//		c.set(Calendar.DATE, day + 99);
		c.add(Calendar.DATE, d_day - 1);
		
		Date d = c.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd E");
		System.out.println(fmt.format(d));
	}
}
