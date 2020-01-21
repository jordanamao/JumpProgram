package multiarray;

import java.util.Arrays;

/*
 * 
 * Declaration:  dataType[][] arrayRefVar;
 * Instantiation: int[][] arr = new int[3][3];//3 row and 3 column
 * Intializaiton: arr[0][0]=1; arr[0][1]=2; ...
 * 
 * 
 */
public class PrintMultiArray {

	public static void printMultiArray(int [][] arr){

		for ( int i =0; i<arr.length; i++) {

			for (int j=0; j<arr[i].length; j++) {

				System.out.print(arr[i][j]+" ");
			}

			System.out.println();

		}
	}

	public static void main(String[] args) {

		int arr[][] = {{1,3,5},{2,4,6},{3,4,5},{1,4,7}};

		/*
		  1  3  5
		  2  4  6
		  3  4  5
		 */

		printMultiArray(arr);

	}

}
