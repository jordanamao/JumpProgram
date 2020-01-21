package streams;

/**
 * 
 * 
 * 
 */

import java.util.stream.IntStream;

public class StreamReduce2 {
	

	public static void main(String[] args) {
		
		//To get the product of all elements
		// in given range excluding the rightmost element
		
		int product = IntStream.range(1,5)
					.reduce((num1,num2) -> num1 * num2)
					.orElse(-1);
		
		//Displaying the product
		System.out.println("The product is: " + product);
		
		
		
	}
}
