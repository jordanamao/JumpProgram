package arrays;

import java.util.Arrays;

public class range {

	public static void main(String[] args) {
		int temp;
		int [] myArray = {45,12,85,32,89,39,69,44,42,1,6,8};
		
		for (int i = 0; i < myArray.length-1; i++ ) {
			
			//for (int j = 0; j < myArray.length-i-1; j++) {
			for (int j=i; j >=0; j--) {
			
				if (myArray[j] > myArray[j+1]){
					temp = myArray[j];
					myArray[j] = myArray[j+1];
					myArray[j+1] = temp;
					}
				}
			}	
		
     int range = myArray[(myArray.length-1)] - myArray[0];	
	 System.out.println(Arrays.toString(myArray));  //look at selection sort
	 System.out.println("The range is " + range);

	}

}
