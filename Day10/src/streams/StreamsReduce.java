package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("Chuck", "Jim", "Adam", "Brian", "Duane", "Alex");
		
		Optional<String> reduced = names.stream()
				.reduce((s1,s2) -> s1 + "#" + s2);
			
				reduced.ifPresent(System.out::println);	
	}

}
