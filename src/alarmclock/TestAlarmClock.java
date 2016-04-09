package alarmclock;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public class TestAlarmClock {

	public static void main(String[] args) {
		AlarmClock alarm = new AlarmClock();
		AlarmProperties ap = alarm.in().minutes(5);
		System.out.println(ap);
		ap = alarm.on().thisYear().thisMonth().day(12).at().hour(22).minute(12);
		System.out.println(ap);
		ap = alarm.on().year(2016).month(12).day(12).at().hour(22).minute(12);
		System.out.println(ap);
		ap = alarm.today().at().hour(22).minute(12);
		System.out.println(ap);
		System.out.println();
		
		ap = alarm.every().weeks(2).on(Day.SUNDAY, Day.SATURDAY).at().hour(22).minute(12);
		System.out.println(ap);
		ap = alarm.every().week().on(Day.FRIDAY).at().hour(22).minute(12);
		System.out.println(ap);
		ap = alarm.on(Day.SATURDAY).at().hour(22).minute(12);
		System.out.println(ap);
		
//		int i = Calendar.SUNDAY;
//		System.out.println(Day.values()[(i-2 < 0) ? 6 : i-2]);
//		System.out.println();
//		
//		
//		System.out.println((Day.SATURDAY.ordinal()+2 > 7) ? 1 : Day.SATURDAY.ordinal()+2);
		
//		Day[] days = { Day.FRIDAY, Day.MONDAY, Day.SATURDAY, Day.SUNDAY, Day.THURSDAY, Day.TUESDAY, Day.WEDNESDAY };
//		List<Day> daysList = Arrays.asList(days);
//		Collections.sort(daysList);
//		for (Day d : daysList) {
//		    System.out.println(d);
//		}
		
	}
}
