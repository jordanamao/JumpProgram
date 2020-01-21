package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeException {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter your age: ");
		
		
		try {
			
			//scanner.close();
			int age = scanner.nextInt();
			System.out.println(age);
			String test = null;
			test.toString();
		
			
		} catch (InputMismatchException e) {
			
			System.out.println("This was the junk input:" + scanner.next());
			System.out.println("Input Mismatch Exception occured!");
			System.out.println("Enter a Integer for AGE:" );
			int age = scanner.nextInt();
			System.out.println("Age entered is:" + age);
			// e.printStackTrace()
			
			
		} catch (IllegalStateException e) {
			
			System.out.println("IllegalStateException occured! " + e.getMessage());
					
		} catch(NullPointerException e) {
			
			System.out.println("NullPointerException occured! " + e.getMessage());
		
		}
//			catch (Exception e) {
//			System.out.println("Exception occured!");
			//e.printStackTrace()			
//		}
			
		finally {
			System.out.println("input in finally block!");
		}
		
		System.out.println(" Reached after Try-Finally!");
		scanner.close();

	}

}
