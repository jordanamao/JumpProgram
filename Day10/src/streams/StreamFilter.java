package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//print only even numbers
		list.stream()
			.filter(n -> n%2 == 0)
			.forEach(System.out::println);
		
		//Find even numbers in stream and collect to a new list
		List<Integer> evenNumbers = list.stream()
				.filter(n -> n%2 == 0)
				.collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		//Filter even numbers and get squares
		List<Integer> squares = evenNumbers.stream().map( m -> m*m)
				.collect(Collectors.toList());
		
		  System.out.println(squares);
		  
		  

	}

}
