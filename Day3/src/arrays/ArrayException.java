package arrays;

public class ArrayException {

	public static void main(String[] args) {
		
		int arr[]= {50,60,70,80};
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
		}
        System.out.println(arr[-1]);
	}

}
