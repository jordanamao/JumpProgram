package streams;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author runjiamao
 *
 *The intermediate operation map converts each element
 *into another object via the given function
 *
 */

public class StreamsMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("name3", "", "Adam", "name10", "", "Alex");
		
		names.stream()
			.filter((s) -> s.startsWith("A"))
			.map(String::toUpperCase)
			.forEach(System.out::println);
			

	}

}
