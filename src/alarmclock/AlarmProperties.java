package alarmclock;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class AlarmProperties {
	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute;
	private int weeks;
	private LinkedList<Day> days;
	
//	public AlarmProperties() { 
//	}
	
	public AlarmProperties(GregorianCalendar c) {
		days = new LinkedList<Day>();
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH)+1;
		day = c.get(Calendar.DAY_OF_MONTH);
		hour = c.get(Calendar.HOUR_OF_DAY);
		minute = c.get(Calendar.MINUTE);
		weeks = 0;
//		days.add(c.get(Calendar.DAY_OF_WEEK));
	}
	
	@Override
	public String toString() {
		return year +" " +month+ " " +day+" " +hour+" " +minute;
	}
}

