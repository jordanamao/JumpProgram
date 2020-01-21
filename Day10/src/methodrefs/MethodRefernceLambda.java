package methodrefs;

import java.util.ArrayList;
import java.util.List;

public class MethodRefernceLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Jack");
		names.add("Jill");
		names.forEach(p -> {System.out.println(p);});

	}
}
