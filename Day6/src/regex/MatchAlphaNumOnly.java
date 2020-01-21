package regex;
import java.util.regex.*;

/*
 * Create a regular expression that accepts alphanumeric characters only, length must be six characters long.
 */

public class MatchAlphaNumOnly {

	public static void main(String[] args) {
		
		System.out.println("by character classes and qunatifiers...");
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "9Aae45")); //true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "9Aae485F")); //false
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "9Aae4#")); //false
		

	}

}
