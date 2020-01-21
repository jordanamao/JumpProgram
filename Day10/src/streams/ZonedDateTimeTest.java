package streams;

import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZonedDateTimeTest zonedDateTimeTest = new ZonedDateTimeTest();
		zonedDateTimeTest.testZonedDatetTime();

	}
	
	public void testZonedDatetTime() {
		
		ZonedDateTime date1 = ZonedDateTime.parse("2018-12-28T10:15:30+05:30[Asia/Kolkata]");
		System.out.println("date1 " + date1);
		
		//converts timezones
		ZoneId id = ZoneId.of("Europe/Paris");
		System.out.println("Zoned:" + id);
		ZonedDateTime parisDateTime = date1.toInstant().atZone(id);
		System.out.println(parisDateTime);
		
		//adds four days
		ZonedDateTime newZoneDateTime =
				date1.plus(Period.ofDays(4));
		System.out.println(newZoneDateTime);
		
		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println("CurrentZone:" + currentZone);
	
		
	}

}
