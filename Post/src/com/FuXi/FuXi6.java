package com.FuXi;

import java.util.Date;
import java.time.Clock;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class FuXi6 {
	public static void clock(){
		//用Clock获得系统默认时区
		Clock clock=Clock.systemDefaultZone();
		//获得微秒数
		long millis=clock.millis();
		//获得特定时间
		Instant instant=clock.instant();
		//创建老的Date
		Date date=Date.from(instant);
		System.out.println(millis+"\n"+instant+"\n"+date);
	}
	public static void localTimezone(){
		ZoneId time1=ZoneId.of("Brazil/East");
		System.out.println(time1.getRules());
		LocalTime now1=LocalTime.now();
		LocalTime now2=LocalTime.now(time1);
		System.out.println(now1+"  "+now2);
		System.out.println(now1.isBefore(now2));//<
		long hours=ChronoUnit.HOURS.between(now1, now2);//now2-now1
		long minutes=ChronoUnit.MINUTES.between(now1, now2);
		System.out.println(hours+"   "+minutes);
	}
	public static void localDate(){
		LocalDate time1=LocalDate.now();
		LocalDate tomorrow=time1.plus(1, ChronoUnit.DAYS);
		LocalDate yesterday=time1.minusDays(2);
		LocalDate time2=LocalDate.of(2018, Month.OCTOBER,13);
		DayOfWeek week=time2.getDayOfWeek();
		System.out.println(tomorrow+"\n"+yesterday+"\n"+time2+"\n"+week);
	}
	public static void localDateTimeDate(){
		//Date——>LocalDateTime
		Date date=new Date();
		Instant instant=Instant.ofEpochMilli(date.getTime());//获得毫秒和纳秒
		LocalDateTime ldt=LocalDateTime.ofInstant(instant, ZoneId.systemDefault());//加入时区获得本地日期时间
		System.out.println("LocalDateTime:"+ldt);
		//LocalDateTime——>Date
		LocalDateTime ldt1=LocalDateTime.now();
		ZonedDateTime zdt=ZonedDateTime.of(ldt1, ZoneId.systemDefault());//获得具有时区的日期时间
		Date date2=Date.from(zdt.toInstant());//Date得到转换为Instant的日期时间
		System.out.println("Date:"+date2);
	}
	public static void main(String args[]){
		FuXi6.clock();
		System.out.println("分界线——————————————————————————————");
		FuXi6.localTimezone();
		System.out.println("分界线——————————————————————————————");
		FuXi6.localDate();
		System.out.println("分界线——————————————————————————————");
		FuXi6.localDateTimeDate();
	}
}
