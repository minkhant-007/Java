package Day5;

import java.time.LocalDate;

public class LocalDate_Testing {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2016, 10, 6);
		LocalDate date3 = LocalDate.parse("2000-10-22");
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		System.out.println("Curent date:" + date1);
		System.out.println("Tomorrow:"+date1.minusDays(1));
		System.out.println("Yeserday:"+ date1.plusDays(1));
		System.out.println(date1.getYear());
		System.out.println(date1.getMonthValue());
		System.out.println(date1.getDayOfMonth());
//		System.out.println(date1.getMonth());
//		System.out.println(date1.getDayOfWeek());
		System.out.println(date1.isLeapYear());
		System.out.println(date1+"is equal to"+date2+":"+date1.equals(date2));
		
	
	}
}
