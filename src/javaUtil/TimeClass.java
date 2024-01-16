package javaUtil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeClass {

	public static void main(String[] args) {
		LocalDateTime timePoint = LocalDateTime.now();
		System.out.println(timePoint);
		
		LocalDate ld1 = LocalDate.of(2012, Month.DECEMBER, 12);
		System.out.println(ld1);
		
		LocalTime lt1 = LocalTime.of(17, 18);
		System.out.println(lt1);
		
		LocalTime lt2 = LocalTime.parse("10:15:30");
		System.out.println(lt2);

		LocalDate theDate = timePoint.toLocalDate();
		System.out.println(theDate);
		
		Month theMonth = timePoint.getMonth();
		System.out.println(theMonth);
		
		System.out.println(theMonth.getValue());
		System.out.println(timePoint.getHour());
	}

}

/*
https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html
*/