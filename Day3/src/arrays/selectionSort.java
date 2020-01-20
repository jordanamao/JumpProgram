package arrays;

import java.util.Arrays;

public class selectionSort {
	
	public static void selectionSort(int[] arg) {
		
		for (int i = 0; i < arg.length -1 ; i++) {
			
			int smallIndex = i;
			
			for (int j = i + 1; j < arg.length ; j++) {
				
				if (arg[j] < arg[smallIndex]) {
					
					smallIndex = j;		
				}
			
			}
			
			int smallerNumber = arg[smallIndex];
			arg[smallIndex] = arg[i];
			arg[i] = smallerNumber;	 	
		
		}
		
		 System.out.println(Arrays.toString(arg));
		
	}
	
	public static void main(String[] args) {
		
		int [] myArray = {45,12,85,32,89,39,69,44,42,1,6,8};
		selectionSort(myArray);
		

	}

}
