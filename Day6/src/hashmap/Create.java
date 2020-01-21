package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Create {
	public static void main (String args[]) {
		
		HashMap <Integer,String> hash_map = new HashMap <Integer, String>();
		
		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");
		
		System.out.println("Size of the hash map: " + hash_map.size());
		
		for (Map.Entry x:hash_map.entrySet()) {
			System.out.println(x.getKey()+ " " + x.getValue());
			
		}
		
		//remove all mappings
		hash_map.clear();
		System.out.println("The New map: " + hash_map);
		
	}

}
