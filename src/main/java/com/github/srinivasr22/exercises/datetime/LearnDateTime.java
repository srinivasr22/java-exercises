package com.github.srinivasr22.exercises.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;



public class LearnDateTime {
	public static void main(String... args) {
		Instant now = Instant.now();
		System.out.println(now);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LocalDateTime ld = LocalDateTime.now();
		DateTimeFormatter df = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println(df.format(ld));
	}
}
