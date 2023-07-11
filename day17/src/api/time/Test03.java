package api.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test03 {
	public static void main(String[] args) {
		//Calendar 클래스
		//= 추상 클래스, 객체 생성 불가
		//= Date에 비해 가진 정보 多
		//= Date로 변환 가능
		
		//Calendar c = new Calendar(); --> X
		//Calendar c = new GregorianCalendar();//업캐스팅 --> X
		Calendar c = Calendar.getInstance();// --> O(생성 위탁)
		
		Date d = c.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd E H:mm:ss");
		System.out.println(fmt.format(d));
		
		
	}
}
