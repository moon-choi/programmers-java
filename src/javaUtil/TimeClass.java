package javaUtil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeClass {

	public static void main(String[] args) {
		LocalDateTime timePoint = LocalDateTime.now(); //타임존 개념이 필요없는 날짜와 시간 정보 모두를 나타내기 위해서
		System.out.println(timePoint); //2024-01-17T09:41:58.074
		
		LocalDate ld1 = LocalDate.of(2012, Month.DECEMBER, 12); //타임존 개념이 필요없는 날짜 정보를 나타내기 위해서
		//LocalDate ld1 = LocalDate.of(2012, 12, 12)
		System.out.println(ld1); //2012-12-12
		
		LocalTime lt1 = LocalTime.of(17, 18); //타임존 개념이 필요없는 시간 정보를 나타내기 위해서
		System.out.println(lt1); //17:18
		
		LocalTime lt2 = LocalTime.parse("10:15:30");
		System.out.println(lt2); //10:15:30

		LocalDate theDate = timePoint.toLocalDate();
		System.out.println(theDate); //2024-01-17
		
		//Date처럼 Month + 1 안해도 됌. 
		Month theMonth = timePoint.getMonth(); //LocalDateTime.now().getMonth();
		System.out.println(theMonth); //JANUARY
		
		System.out.println(theMonth.getValue()); //1
		System.out.println(timePoint.getHour()); //9 //LocalDateTime.now().getHour();
	}

}

/*
https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html
*/