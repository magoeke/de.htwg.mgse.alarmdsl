package alarmclock;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import alarmclock.AlarmClock.WeekAndDayMemorie;

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
	
	public AlarmProperties(GregorianCalendar c, WeekAndDayMemorie wadm) {
		days = new LinkedList<Day>();
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH)+1;
		day = c.get(Calendar.DAY_OF_MONTH);
		hour = c.get(Calendar.HOUR_OF_DAY);
		minute = c.get(Calendar.MINUTE);
		weeks = 0;
//		days.add(c.get(Calendar.DAY_OF_WEEK));
		if(wadm != null) {
			weeks = wadm.getWeeks();
			days = wadm.getDays();
		} else {
			days.add(Day.values()[(c.get(Calendar.DAY_OF_WEEK)-2 < 0) ? 6 : Calendar.DAY_OF_WEEK-2]);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Year: ").append(year).append(" Month: ").append(month);
		sb.append(" Day: ").append(day).append(" Hour: ").append(hour);
		sb.append(" Minute: ").append(minute).append(" Weeks: ").append(weeks).append(" Days: ");
		
		for(Day day: days) {
			sb.append(day).append(" ");
		}
		
		return sb.toString();
	}
}

