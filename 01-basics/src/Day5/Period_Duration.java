package Day5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Scanner;

public class Period_Duration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate start = LocalDate.parse("2000-07-20");
		LocalDate end = LocalDate.parse("2022-08-29");
		int year = Period.between(start, end).getYears();
		System.out.println(year);
		int month = Period.between(start, end).getMonths();
		System.out.println(month);
		int day = Period.between(start, end).getDays();
		System.out.println(day);
		System.out.println("Between Start and End :"+year+" : " + month + " : "+ day);
		System.out.println("Enter date");
		int date = sc.nextInt();
		
	}
}
