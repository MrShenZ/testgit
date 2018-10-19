package com.woaixuexi9g;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Date {
	public static void main(String args[]){
		LocalDate today=LocalDate.now();
		LocalDate tomorrow=today.plus(1, ChronoUnit.DAYS);
		LocalDate yesterday=tomorrow.minusDays(2);
		LocalDate inDay=LocalDate.of(2018, Month.JULY, 4);
		DayOfWeek dayOfWeek=inDay.getDayOfWeek();
		System.out.println(today);
		System.out.println(tomorrow);
		System.out.println(yesterday);
		System.out.println(inDay);
		System.out.println(dayOfWeek);
		String str=dayOfWeek.toString();
		String str1=str.toLowerCase();
		System.out.println(str1);
	}
	
}
