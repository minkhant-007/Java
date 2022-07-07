package Day5;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalTime_Testing {
	public static void main(String[] args) {
		LocalTime date1 = LocalTime.now();
		LocalTime date2 = LocalTime.of(11, 03,45);
		LocalTime date3 = LocalTime.parse("02:30");
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		System.out.println(date2.minusHours(1).getHour());
		System.out.println(date1.getHour());
		System.out.println(date1.getMinute());
		
		LocalDateTime obj1 = LocalDateTime.now();
		LocalDateTime obj2 = LocalDateTime.of(2000, Month.JULY, 20, 10, 30,05);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1.getMinute());
		System.out.println(obj2.getHour());
		System.out.println(obj1.getMonthValue());
//		System.out.println(obj1.getMonth());
		System.out.println(obj1.getSecond());
		System.out.println(obj1.getYear());
		System.out.println(obj1.getDayOfYear());
	}
}
