package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamsCount6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<Integer> array = Arrays.asList(-2,0,4,6,8);
		
		//Returns the stream starting with element n, skip(n)
		List<Integer> skip = array.stream().skip(2).collect(Collectors.toList());
		
		//Displaying the skip function,skips n elements
		System.out.println("The skip of all elements is " + skip);
		

	}

}
