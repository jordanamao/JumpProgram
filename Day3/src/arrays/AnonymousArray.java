package arrays;

public class AnonymousArray {

	static void printArray(int arr[]){
		//creating a method which receives an array as a parameter
		for (int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
	}
	
	public static void main(String args[]) {
		
		printArray(new int[] {10,22,44,66}); //passing anonymous array to method
	}

}
