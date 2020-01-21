package exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Student {

	private int age;
	private String name;


	public int getAge() {
		return age;
	}
	public void setAge(int age) throws AgeInputException{

		if(age <=0)
			throw new AgeInputException("Age should be greater than Zero");
		this.age = age;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}



	public static void main(String[] args) throws AgeInputException {

		Scanner scanner = new Scanner(System.in);

		Student student = new Student();

		System.out.print(" Enter the Student's name:" );
		String name = scanner.nextLine();

		student.setName(name);

		System.out.print(" Enter the Student's Age: ");
		int age;
		
		

		try {
			
			age = scanner.nextInt();
			student.setAge(age);       //Handling the Age exception

		} catch (InputMismatchException e) {

			System.out.println("This was the junk input:" + scanner.next());
			System.out.println("Input Mismatch Exception occured!");
			System.out.println("Enter a Integer for AGE:" );
			age = scanner.nextInt();
			student.setAge(age);
			System.out.println("Age entered is:" + age);}
		// e.printStackTrace()

		catch(Exception e) {

			System.out.println(e.getMessage());
			System.out.println("Age cannot be Zero! Please try again");
			System.out.println("Age has to be integer.");
			System.out.println(" Enter the Student's Age: ");
			age = scanner.nextInt();
			student.setAge(age); //Propagate the exception
		}

		//student.setAge(age)
		System.out.println(student);
		scanner.close();


	}


}
