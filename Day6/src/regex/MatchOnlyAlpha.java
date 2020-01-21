package regex;
import java.util.regex.*;


/*
 * Create a regular expression that accepts alpha characters only, starting with W
 * Its length must be eight characters long.
 * 
 */
public class MatchOnlyAlpha {

	public static void main(String[] args) {
		
		
		System.out.println("by character classes and qunatifiers...");
		System.out.println(Pattern.matches("[W][a-zA-Z]{7}", "WAaeejsi")); //true
		System.out.println(Pattern.matches("[W][a-zA-Z]{7}", "wAae485F4")); //false
		System.out.println(Pattern.matches("[W][a-zA-Z]{7}", "aAae4#er")); //false

	}

}
