package alarmclock;

public class TestAlarmClock {

	public static void main(String[] args) {
		AlarmClock alarm = new AlarmClock();
		alarm.in().minutes(5);
		alarm.on().thisYear().thisMonth().day(12).at().hour(22).minute(12);
		alarm.on().year(2016).month(12).day(12).at().hour(22).minute(12);
		alarm.on().today().at().hour(22).minute(12);
		alarm.at().hour(22).minute(12); // maybe delete this possibility
		
		
		
		
		
		
		alarm.printVars();
	}
}
