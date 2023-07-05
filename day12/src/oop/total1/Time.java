package oop.total1;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	
	public int getHour() {
		return hour * 60 * 60;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute * 60;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	public int getTime() {
		return getHour() + getMinute() + getSecond();
	}
	public int getTimeHour() {
		return getTime() / 60 / 60 % 60;
	}
	public int getTimeMinute() {
		return getTime()  / 60 % 60;
	}
	public int getTimeSecond() {
		return getTime() % 60;
	}
	
	public void show() {
		System.out.println("< 시간 >");
		System.out.println(getTimeHour() + "시간 " + getTimeMinute() + "분 "
																				+ getTimeSecond() + "초");
		System.out.println();
	}
	
	
	public Time(int second) {
		this(0, 0, second);
	}
	public Time(int minute, int second) {
		this(0, minute, second);
	}
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
}
