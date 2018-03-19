package mybasics.session14.java8.concepts;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class DateTimeDemo {
	public static void main(String[] args) throws InterruptedException {
		Instant t1=Instant.now();
		System.out.println(t1);
		TimeUnit.SECONDS.sleep(1);
		 
		Instant t2=Instant.now();
		System.out.println(Duration.between(t1, t2));
		
		//local date,time,datetime
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		
	}

}
