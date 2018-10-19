package com.woaixuexi9g;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTime {
	public static void main(String args[]){
		LocalDateTime dateTime=LocalDateTime.of(2018,Month.APRIL,3,10,1,5);
		DayOfWeek week=dateTime.getDayOfWeek();
		System.out.println(dateTime+"    "+week.toString().toLowerCase());
	} 
}
