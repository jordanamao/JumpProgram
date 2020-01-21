package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamsReduce4 {

	public static void main(String[] args) {
		

	List<Integer> array = Arrays.asList(-2,0,4,6,8);
		
		//Finding top three of all elements
		List<Integer> limit = array.stream().limit(3).collect(Collectors.toList());
		
		//Displaying the limit function
		System.out.println("The sum of all elements is " + limit);
	}

}
