package hashset;

import java.util.HashSet;

public class RemoveAll {

	public static void main(String[] args) {
		
		HashSet<String> h_set = new HashSet<String>();
		// use add() method to add values in the hash set
		
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("White");
		h_set.add("Pink");
		h_set.add("Yellow");
	
        System.out.println("Original Hash Set:" + h_set);
        //Remove all elements that match the collection passed in 
        h_set.removeAll(h_set);
        
        //clear() method removes all the elements from a hash set
        // and the set becomes empty.
        h_set.clear();
        
        System.out.println("Hash Set after removing all the elements " + h_set);
	}

}
