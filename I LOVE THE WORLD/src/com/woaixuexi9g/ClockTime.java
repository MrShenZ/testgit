package com.woaixuexi9g;

import java.sql.Date;
import java.time.Clock;
import java.time.Instant;

public class ClockTime {
	public static void main(String args[]){
		Clock clock=Clock.systemDefaultZone();
		long millis=clock.millis();
		Instant instant=clock.instant();
		try{
			Date date=(Date)Date.from(instant);
			System.out.println(date);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(clock+" "+millis+" "+instant);
	}
}
