package practice;

import java.time.*;

public class DateAndTime {
	public static void main(String[] args) {
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		LocalDate date1 = LocalDate.of(2015, 1, 20);
		// there are other method signatures, method overloading
		
		LocalTime time1 = LocalTime.of(2, 47);
		// there are other method signatures, method overloading
		
		LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);
		// there are other method signatures, method overloading
		// LocalDateTime time = LocalDateTime.of
		// has a bunch of different methods
		
		date1 = date1.plusDays(2);
		// adds 2 to the date making it 22 instead of 20
		date1 = date1.plusWeeks(1);
		date1 = date1.plusMonths(1);
		date1 = date1.plusYears(5);
		
		// you can also go backwards in time
		LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time3 = LocalTime.of(5, 15);
		LocalDateTime dateTime3 = LocalDateTime.of(date3, time3);
		System.out.println(dateTime3);
		dateTime3 = dateTime3.minusDays(1);
		dateTime3 = dateTime3.minusHours(10);
		dateTime3 = dateTime3.minusSeconds(30);
		
		// Periods
		Period annually = Period.ofYears(1);
		Period quarterly = Period.ofMonths(3);
		Period everyWeek = Period.ofWeeks(1);
		Period everyOtherDay = Period.ofDays(2);
		
		
		
	}

}
