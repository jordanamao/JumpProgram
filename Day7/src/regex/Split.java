
package regex;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String source = "There are thirty_three big-apple";
		String[] tokens = source.split("\\s+|-|_"); //whitespace(s) or -
		
		for (String token: tokens) {
			System.out.println(token);
		}
		
		String date = "12-13-2010"; //mm-dd-yyyy
		//extract day, month and year from this String
		
		String[] tokens1 = date.split("\\s+|-");
		for (String token: tokens1 ) {
			System.out.println(token);
			
		}
	
	}

}
