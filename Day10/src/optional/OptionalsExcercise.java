package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalsExcercise {

	public static void main(String[] args) {

		List<Optional<String>> listOfOptionals = Arrays.asList(Optional.empty(), Optional.of("foo"), Optional.empty(), Optional.of("bar"));
	
	     List <String> strings = listOfOptionals
	    		 .stream()
	    		 //.filter(e -> e.isPresent)
	    		 .filter(Optional::isPresent)
	    		 .map(e -> e.get())
	    		 .collect(Collectors.toList());
	     
	     System.out.println(strings);
	}
	
}


// - Create a stream based on listOfOptionals
// - filter list based on Optional having a value
// - get the values from filtered Optional
// - collect them into a List
// - display the final list 