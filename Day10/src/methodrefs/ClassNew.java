package methodrefs;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ClassNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntStream.range(1,20).forEach(System.out::println);
		
		List<Integer> integers = IntStream
				.range(1, 100)
				.boxed()
				.collect(Collectors.toCollection(ArrayList::new));
		
		Optional<Integer> max = integers.stream().reduce(Math::max);
		
		max.ifPresent(System.out::println);

	}

}
