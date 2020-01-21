

package streams;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class StreamsMap2 {

	public static void main(String[] args) {
		
		Map<String, String> books = new HashMap<>();
		books.put("987-0201633610", "Design patterns");
		books.put("987-1617291999", "Java 8 in Action");
		books.put("987-0134685991", "Effective Java");
		
		
		//find the ISBN for the book with the title "Effective Java"
		
		
		Optional<String> optionalIsbn = books.entrySet().stream()
				.filter(e -> "Effective Java".equals(e.getValue()))
				.map(Map.Entry::getKey)
				.findFirst();
		
		optionalIsbn.ifPresent(System.out::println);
				
	}

}
