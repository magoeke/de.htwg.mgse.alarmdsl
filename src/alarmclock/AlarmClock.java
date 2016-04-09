package alarmclock;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;

public final class AlarmClock {
	private LinkedList<GregorianCalendar> allAlarms;
	
	public AlarmClock() {
		allAlarms = new LinkedList<GregorianCalendar>();
	}
	
	public MinuteScope in(){
		return new MinuteScope();
	}
	
	public YearScope on() {
		return new YearScope(new GregorianCalendar());
	}
	
	public TimeWrapperScope on(Day day) {
		return new TimeWrapperScope(new GregorianCalendar());
	}
	
	public WeekScope every() {
		return new WeekScope(new GregorianCalendar());
	}
	
	public TimeWrapperScope today() { 
		return new TimeWrapperScope(new GregorianCalendar()); 
	}
	
	public final class MinuteScope{
		private MinuteScope() { }
		public AlarmProperties minutes(int minutes){
			GregorianCalendar c = new GregorianCalendar();
			c.add(Calendar.MINUTE, minutes);
			return new AlarmProperties(c);
		}
	}
	
	public final class YearScope{
		private GregorianCalendar c;
		private YearScope(GregorianCalendar c) { this.c = c;}
		public MonthScope year(int year){
			c.set(Calendar.YEAR, year);
			return new MonthScope(c);
		}
		
		public MonthScope thisYear() { return new MonthScope(c); }
	}
	
	public final class MonthScope{
		private GregorianCalendar c;
		private MonthScope(GregorianCalendar c) { this.c = c;}
		
		public DayScope month(int month){
			c.set(Calendar.MONTH, month);
			return new DayScope(c);
		}
		
		public DayScope thisMonth() { return new DayScope(c); }
	}
	
	public final class DayScope{
		private GregorianCalendar c;
		private DayScope(GregorianCalendar c) { this.c = c;}
		public TimeWrapperScope day(int day){
			c.set(Calendar.DAY_OF_MONTH, day);
			return new TimeWrapperScope(c);
		}
	}
	
	public final class TimeWrapperScope {
		private GregorianCalendar c;
		private TimeWrapperScope(GregorianCalendar c) { this.c = c;}
		public HourScope at() {
			return new HourScope(c);
		}
	}
	
	public final class HourScope {
		private GregorianCalendar c;
		private HourScope(GregorianCalendar c) { this.c = c;}
		public TimeMinuteScope hour(int hour){
			c.set(Calendar.HOUR_OF_DAY, hour);
			return new TimeMinuteScope(c);
		}
	}
	
	public final class TimeMinuteScope {
		private GregorianCalendar c;
		private TimeMinuteScope(GregorianCalendar c) { this.c = c;}
		public void minute(int minute){
			c.set(Calendar.MINUTE, minute);
//			return new TimeMinuteScope(c);
		}	
	}
	
	public final class WeekScope {
		private GregorianCalendar c;
		private WeekScope(GregorianCalendar c) { this.c = c;}
		public DayWrapperScope weeks(int week){
//			c.set(Calendar.MINUTE, minute);
			return new DayWrapperScope(c);
		}
		public DayWrapperScope week(){
//			c.set(Calendar.MINUTE, minute);
			return new DayWrapperScope(c);
		}
	}
	
	public final class DayWrapperScope {
		private GregorianCalendar c;
		private DayWrapperScope(GregorianCalendar c) { this.c = c;}
		public TimeWrapperScope on(Day day){
			return new TimeWrapperScope(c);
		}
		
	}
	
}
