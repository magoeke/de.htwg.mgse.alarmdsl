package alarmclock;

public class TestAlarmClock {

	public static void main(String[] args) {
		AlarmClock alarm = new AlarmClock();
		alarm.in().minutes(5);
		alarm.on().thisYear().thisMonth().day(12).at().hour(22).minute(12);
		alarm.on().year(2016).month(12).day(12).at().hour(22).minute(12);
		alarm.today().at().hour(22).minute(12);
		
		alarm.every().weeks(2).on(Day.SATURDAY).at().hour(22).minute(12);
		alarm.every().week().on(Day.FRIDAY).at().hour(22).minute(12);
		alarm.on(Day.SATURDAY).at().hour(22).minute(12);
		
		
		
		alarm.printVars();
	}
}
