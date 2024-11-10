package models;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public static int a = 100;
	
	public Time() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int toSecond() {
		return this.hour * 60 * 60 + this.minute * 60 + this.second;
	}
	
	public static Time toTime(int second) {
		second %= 24 * 60 * 60;
		int t = second;
		second = t % 60;
		t = (t - second) / 60;
		int minute = t % 60;
		t = (t - minute) / 60;
		return new Time(t, minute, second);
	}
	
	public Time add(Time t) {  // this,    t
		int second = this.toSecond() + t.toSecond();
		return this.toTime(second);
	}
	
	public Time distance(Time t) {
		int second = t.toSecond() - this.toSecond();
		second += (second < 0) ? 24 * 60 * 60: 0;
		return this.toTime(second);
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
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
	
	public static int func() {
		return a;
	}
}
