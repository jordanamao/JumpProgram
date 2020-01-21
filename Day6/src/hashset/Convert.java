package hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Convert {

	
	public static void main(String[] args) {
		// Create a empty hash set
		
		HashSet<String> h_set = new HashSet<String>();
		// use add() method to add values in the hash set
		
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("White");
		h_set.add("Pink");
		h_set.add("Yellow");
	
        System.out.println("Original Hash Set:" + h_set);
        
        //Creating an Array
        String [] new_array = new String[h_set.size()];
        h_set.toArray(new_array); //convert to Array
        
        //Displaying Array elements
        
        System.out.println("Array elements: ");
        for (String element : new_array) {
        	System.out.println(element);
        }
        
        //Create a TreeSet of HashSet elements prints out alphabetically
        Set<String> tree_set = new TreeSet<String>(h_set);
        
        //Display TreeSet elements
        System.out.println("TreeSet elements: ");
        for(String element : tree_set) {
        	System.out.println(element);
        }
        
        //Create a List from HashSet elements
        List<String> list = new ArrayList<String>(h_set);
        //Display ArrayList elemetnts
        System.out.println("ArrayList contains: " + list);
       
	}
	
}
