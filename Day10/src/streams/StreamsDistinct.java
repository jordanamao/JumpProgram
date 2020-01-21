package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Find all distinct elements
		Collection<String> list = Arrays.asList("A", "B", "C","D","A","B","C");
		
		
		//Get collection without duplicate i.e. distinct only
		List<String> distinctElements = list.stream()	
				.distinct()
				.collect(Collectors.toList());
		
		//Let's verify distinct elements
		System.out.println(distinctElements);

	}

}
