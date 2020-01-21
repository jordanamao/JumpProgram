package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> items = Arrays.asList("abc", "bc", "efg", "abcd", "", "jkl");

	
		//List<String> filtered = items.stream()
			//	.filter(item -> !item.isEmpty())
			//	.collect(Collectors.toList());
		//filtered.forEach(System.out::println);
		
		items.stream().filter(item -> !item.isEmpty()).forEach(System.out::println);
	
		List.of("This ", "is ", "created", " by ", "stream()")
		.stream()
		.forEach(System.out::print);
		

	}

}
