package com.nutan.streamAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateTimee {

	public static void main(String[] args) 
	{
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		ZonedDateTime zone = ZonedDateTime.now();
		System.out.println(zone);
		
		ZoneId z = zone.getZone();
		System.out.println(z);
		
		System.out.println(z.getAvailableZoneIds());
		
		System.out.println("===============================");
		ZoneId ausTimeZone = ZoneId.of("Australia/Sydney");
        ZonedDateTime aus = ZonedDateTime.now(ausTimeZone);        
        System.out.println("Current Date and Time in Australia Time Zone: " + aus);
        
              
        
        ZoneId canadaTimeZone = ZoneId.of("Canada/Atlantic");
        ZonedDateTime canada = ZonedDateTime.now(canadaTimeZone);        
        System.out.println("Current Date and Time in Canada Time Zone: " + canada);
        
		
	}

}
