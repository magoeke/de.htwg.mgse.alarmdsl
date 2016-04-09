package alarmclock;

public class TestAlarmClock {

	public static void main(String[] args) {
		AlarmClock alarm = new AlarmClock();
		alarm.in().minutes(5);
		alarm.on().thisYear().thisMonth().today().at().hour(22).minute(12);
		alarm.at().hour(22).minute(12);
		
		
		
		
		alarm.printVars();
	}
}
