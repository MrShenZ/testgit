package com.woaixuexi9g;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Time {
	public static void main(String args[]){
		ZoneId zone1=ZoneId.of("Europe/Berlin");
		ZoneId zone2=ZoneId.of("Asia/Shanghai");
		System.out.println(zone1.getRules());
		System.out.println(zone2.getRules());
		
		LocalTime time1=LocalTime.now(zone1);
		LocalTime time2=LocalTime.now(zone2);
		System.out.println(time1+" "+time2);
		
		System.out.println(time1.isBefore(time2));
		
		long hours=ChronoUnit.HOURS.between(time1, time2);
		long minutes=ChronoUnit.MINUTES.between(time1, time2);
		System.out.println(hours+" "+minutes);
		
	}
}
