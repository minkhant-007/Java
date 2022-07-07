package Day5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Formatting_Date {
	public static void main(String[] args) {
		DateTimeFormatter time1 = DateTimeFormatter.BASIC_ISO_DATE;
		DateTimeFormatter time2 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter time3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime datetime = LocalDateTime.now();
	}
}
