package arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class shuffle {
	

		public static void main(String[] args) {
			
	
			List<String> list_Strings = new ArrayList<String>();
	
			List<Person> friends;
			Person person;
			
			list_Strings.add("Red");
			list_Strings.add("Green");
			list_Strings.add("Orange");
			list_Strings.add("White");
			list_Strings.add("Black");
			
			
			System.out.println("List before shuffling:" + list_Strings);
			Collections.shuffle(list_Strings);
			System.out.println("List after shuffling:" + list_Strings);
		

	}

}
