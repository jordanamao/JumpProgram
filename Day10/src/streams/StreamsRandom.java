package streams;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * 
 * @author runjiamao
 *
 */

public class StreamsRandom {

	public static void main(String[] args) {
	
		Random random = new Random();
		
		//Five random integers
		random.ints(5,1,50).sorted().forEach(System.out::println);
		
		
		//Five random doubles between 0 (inclusive) and 0.5 (exclusive)
		random.doubles(5, 0, 0.5).sorted().forEach( System.out::println);
		
		//Boxing long to long so they can be collected
		List<Long> longs = random.longs(5).boxed().collect(Collectors.toList());
		System.out.println(longs);

	}

}
