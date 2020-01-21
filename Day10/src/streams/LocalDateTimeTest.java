package streams;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest {

	
	public static void main(String[] args) {
		LocalDateTimeTest localDateTime = new LocalDateTimeTest();
		localDateTime.testLocalDateTime();
	
	}
	
public void testLocalDateTime() {

	//Get the current date and time
	LocalDateTime currentTime = LocalDateTime.now();
	System.out.println("Current Date Time:" + currentTime);
	
	LocalDate date1 = currentTime.toLocalDate();
	System.out.println("data1: " + date1);
	
	Month month = currentTime.getMonth();
	int day = currentTime.getDayOfMonth();
	int seconds = currentTime.getSecond();
	
	System.out.println("Month:" + month + " day:" + "seconds:" + seconds);
	LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2018);
	System.out.println("date2: " + date2);
	
	//12 december 2014
	
	LocalDate date3 = LocalDate.of(2018, month.DECEMBER, 22);
	System.out.println("date3: " + date3);
	//22 hour 15 minutes
	LocalTime date4 = LocalTime.of(22,15);
	System.out.println("date4: " + date4);
	
	
}
	
}
