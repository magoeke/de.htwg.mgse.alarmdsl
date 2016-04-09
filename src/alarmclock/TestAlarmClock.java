package alarmclock;

import java.util.LinkedList;

public class TestAlarmClock {

	public static void main(String[] args) {
		AlarmBuilder alarm = new AlarmBuilder();
		LinkedList<AlarmProperties> apl = new LinkedList<AlarmProperties>();
		apl.add(alarm.in().minutes(5));
		apl.add(alarm.on().thisYear().thisMonth().day(12).at().hour(22).minute(12));
		apl.add(alarm.on().year(2016).month(12).day(12).at().hour(22).minute(12));
		apl.add(alarm.today().at().hour(22).minute(12));
		apl.add(alarm.on(Day.SATURDAY).at().hour(22).minute(12));
		
		apl.add(alarm.every().weeks(2).on(Day.SUNDAY, Day.SATURDAY).at().hour(22).minute(12));
		apl.add(alarm.every().week().on(Day.FRIDAY).at().hour(22).minute(12));
		
		for(AlarmProperties ap : apl) {
			System.out.println(ap);
		}
	}
}
