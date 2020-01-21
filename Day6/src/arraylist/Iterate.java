package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Iterate {

	public static void main(String[] args) {
		
		//Create a list and add some colors to the list
		List<String> list_Strings = new ArrayList<String>();
		
		//Person p = new Person("Jack", 22, 'M');
		//list_Strings.add(p); //error
		
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		
		
		
		//Print the list
		for(String element: list_Strings) {
			System.out.print(element);
		}	
	}
	
	List<Person> list2 = new ArrayList<Person>();
	Person p = new Person("Jack", 22, 'M');
	

}
