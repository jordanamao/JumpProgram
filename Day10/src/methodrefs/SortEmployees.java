package methodrefs;

import java.util.Arrays;

public class SortEmployees {

	public static void main(String[] args) {
		
		Employee[] employees = {
				new Employee("David"),
				new Employee("Naveen"),
				new Employee("Alex"),
				new Employee("Richard")};
		
			System.out.println("Before Sorting Names: "+ Arrays.toString(employees));
			Arrays.sort(employees, Employee::nameCompareLength);
			System.out.println("After Sorting Names: " + Arrays.toString(employees));
		}
	}

class Employee {
	
	String name;
	Employee(String name){
		this.name = name;
	}
	
	public static int nameCompare(Employee a1, Employee a2) {
		return a1.name.compareTo(a2.name);
		//return (a1.name.compareTo(a2.name))*-1; (descending)
		
	}
	
	public static int nameCompareLength(Employee a1, Employee a2) {
		if (a1.name.length() <= a2.name.length()) {
			return -1;
		}
		
		else return 1;
	}
	
	
	public String toString() {
		return name;
	}
	
}
