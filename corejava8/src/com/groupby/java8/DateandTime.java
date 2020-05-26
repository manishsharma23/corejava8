package com.groupby.java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateandTime {
	public static void main(String[] args) {
		LocalDate ldate = LocalDate.now();
		System.out.println("local date ..." + ldate);
		
		LocalDate ldateny = LocalDate.now(ZoneId.of("America/Chicago"));
		System.out.println("ldateny date America/Chicago ..." + ldateny);
		

		LocalTime ltime = LocalTime.now();
		System.out.println("local time ...." + ltime);
		

		LocalTime ltimeNY = LocalTime.now(ZoneId.of("America/Chicago"));
		System.out.println("ny time ...." + ltimeNY);
	}
}
