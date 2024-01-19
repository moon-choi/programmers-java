package javaUtil;

import java.util.Calendar;

public class CalendarClass {

	public static void main(String[] args) {
		//Calendar의 getInstance 메소드.
		Calendar cal = Calendar.getInstance(); //Calendar는 추상클래스여서 인스턴스 못만듦.
		//자식클래스(Gregorian Calendar)의 인스턴스를 만들어서 리턴해줌.
		
		System.out.println(cal.get(Calendar.YEAR)); //Calendar가 제공하는 상수
		System.out.println(cal.get(Calendar.MONTH) + 1); //Calendar 월은 0부터 시작.
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR)); //4
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); //16
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
		
		cal.add(Calendar.HOUR, 5); //Calendar의 add 메소드.
		System.out.println(cal.get(Calendar.HOUR)); //9
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); //21
	}

}
