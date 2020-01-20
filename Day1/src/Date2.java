import java.util.Date;
import java.text.SimpleDateFormat;

public class Date2 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		//display date in mm/dd/yyyy format
		SimpleDateFormat sd = new SimpleDateFormat("MM - dd - yyyy H:m:s S z Z");
		System.out.println(sd.format(date));

		
		
	}
}


