
public class DateUtils {
public static int comparetwodates(MyDate date1,MyDate date2) {
	if(date1.getYear()>date2.getYear()) {
		return 1;
	}
	if(date1.getYear()<date2.getYear()) {
		return -1;
	}
	if(date1.getYear()==date2.getYear()) {
		if(date1.getMonth()>date2.getMonth()) {
			return 1;
		}
		if(date1.getMonth()<date2.getMonth()) {
			return -1;
		}
		if(date1.getMonth()==date2.getMonth()) {
			if(date1.getDay()>date2.getDay()) {
				return 1;
			}
			if(date1.getDay()<date2.getDay()) {
				return -1;
			}
		}
	}
	return 0;
	
}
public static void SwapDay(MyDate date1,MyDate date2) {
	MyDate tmp = new MyDate();
	tmp.setDay(date1.getDay());
	date1.setDay(date2.getDay());
	date2.setDay(tmp.getDay());
}
public static void SwapMonth(MyDate date1,MyDate date2) {
	MyDate tmp = new MyDate();
	tmp.setMonth(date1.getMonth());
	date1.setMonth(date2.getMonth());
	date2.setMonth(tmp.getMonth());
}
public static void SwapYear(MyDate date1,MyDate date2) {
	MyDate tmp = new MyDate();
	tmp.setYear(date1.getYear());
	date1.setYear(date2.getYear());
	date2.setYear(tmp.getYear());
}
public static void SwapDate(MyDate date1,MyDate date2) {
	SwapDay( date1, date2);
	SwapMonth( date1, date2);
	SwapYear(date1, date2);
}
public static void SortDate(MyDate [] date) {
	for(int i=0;i<date.length-1;i++) {
		for(int j=0;j<date.length-i-1;j++) {
			if(comparetwodates( date[j], date[j+1])>0) {
				SwapDate(date[j], date[j+1]);
			}
		}
	}
}
}
