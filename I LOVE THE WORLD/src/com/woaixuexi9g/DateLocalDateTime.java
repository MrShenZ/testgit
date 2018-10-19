package com.woaixuexi9g;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateLocalDateTime {
	public static void main(String args[]){
		//Date转换为LocalDateTime
		Date date=new Date();
		Instant instant=Instant.ofEpochMilli(date.getTime());
		System.out.println(instant);
		LocalDateTime ldt=LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		System.out.println(ldt);
		ldt=LocalDateTime.of(ldt.getYear(),ldt.getMonthValue(),ldt.getDayOfMonth(),23,59,59);
		System.out.println(ldt+"wo awo aw d ");
		
		//LocalDateTime转换为Date
		LocalDateTime ldt1=LocalDateTime.now();
		ZonedDateTime zdt=ldt1.atZone(ZoneId.systemDefault());
		System.out.println(zdt);
		Date date2=Date.from(zdt.toInstant());
		System.out.println(date2);
	}
}
