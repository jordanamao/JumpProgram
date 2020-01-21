package multiarray;
/*
 * The addition of two matrices;
 * 
 * |1 3 4| + |1 3 4| = |2 6 8|
 * |3 4 5| + |3 4 5|   |6 8 10|
 * 
 */

public class MatricesAdd {


	public static void addMatrices(int arr1[][], int arr2[][]) {

		int arr3[][] = new int [arr1.length][arr1[0].length];

		for (int i=0; i<arr1.length; i++) {
			for (int j=0; j<arr1[i].length; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];}
		}

		for (int i=0; i<arr3.length; i++) {
			for (int j=0; j<arr3[i].length; j++) {
				System.out.print(arr3[i][j]+ " ");
			}
			System.out.println(); //new line
		}	
	}
	public static void main(String[] args) {
		
		//creating two matrices
		int a[][] = {{1,3,4},{3,4,5}};
		int b[][] = {{1,3,4},{3,4,5}};

		addMatrices(a,b);
	}

}


