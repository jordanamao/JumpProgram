package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		
		List<Person> friends;
		Person person;
		
		friends = new ArrayList<Person>();
		
		person = new Person ("Jane", 10, 'F');
		friends.add(person);
		person = new Person("Jack", 6, 'M');
		friends.add(person);
		
	
		Person p = friends.get(0);
		
		System.out.println(p);
		

	}

}
