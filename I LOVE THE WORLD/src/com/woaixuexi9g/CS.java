package com.woaixuexi9g;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class CS {
	public static void main(String args[]){
		Date date=new Date();
		Instant instant=Instant.ofEpochMilli(date.getTime());
		LocalDateTime ldt=LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		System.out.println(ldt);
		
		LocalDateTime ldt1=LocalDateTime.now();
		ZonedDateTime zdt=ldt1.atZone(ZoneId.systemDefault());
		Date date2=Date.from(zdt.toInstant());
		System.out.println(date2);
	}
}
