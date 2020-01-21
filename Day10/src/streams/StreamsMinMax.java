package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamsMinMax {
	

	public static void main(String[] args) {
		
		
		List <Employee> empList = new ArrayList<Employee> ();
		for (int i = 0; i<300; i++) {
			
			empList.add(new Employee("A", 20000));
			empList.add(new Employee("B", 3000));
			empList.add(new Employee("C", 15002));
			empList.add(new Employee("D", 7856));
			empList.add(new Employee("E", 200));
			empList.add(new Employee("F", 50000));
			
		}
		
		
		long t1 = System.currentTimeMillis();
		System.out.println("Sequential Stream count:" + empList.stream().filter(e -> e.getSalary()>15000).count());
		
		
		long t2 = System.currentTimeMillis();
		System.out.println("Sequential Steam Time taken:" + (t2-t1));
		
		t1 = System.currentTimeMillis();
		System.out.println("Parallel Stream count:" + empList.parallelStream().filter(e-> e.getSalary() > 15000).count());
		
		t2 = System.currentTimeMillis();
		System.out.println("Parallel Stream Time taken:" + (t2-t1));
		
		
		
		Integer maxNumber = Stream.of(1,2,3,4,5,6,7,8,9)
			    .max(Comparator.comparing(Integer::valueOf))
			    .get();
		
		Integer minNumber = Stream.of(1,2,3,4,5,6,7,8,9)
							.min(Comparator.comparing(Integer::valueOf))
							.get();
		
		System.out.println("maxNumber = " + maxNumber);
		System.out.println("minNumber = " + minNumber);
		
		
		
		//Find max or min object by object property
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(1, "Mark", 36));
		employees.add(new Employee(2, "Alex", 46));
		employees.add(new Employee(3, "Brian", 52));
		employees.add(new Employee(3, "Duane", 26));
		
		Comparator<Employee> comparator = Comparator.comparing(Employee::getAge);
		
		//Get Min or Max Object
		
		Employee minObject = employees.stream().min(comparator).get();
		Employee maxObject = employees.stream().max(comparator).get();
		
		System.out.println("minObject = " + minObject);
		System.out.println("maxObject = " + maxObject);
		
		boolean anyMatch = employees.stream().anyMatch(e -> (e.getAge() >50));
		System.out.println("anyMatch:" + anyMatch);
		
		
	
	}

}

class Employee{
	
	private int id;
	private String name;
	private int age;
	
	private int salary;
	private String id2;
	
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
	public Employee(String id2, int salary){
		super();
		this.id2 = id2;
		this.salary = salary;
		
	}
	public Employee(int id, String name, int age){
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getId2() {
		return id2;
	}

	public void setId2(String id2) {
		this.id2 = id2;
	}
	

}
