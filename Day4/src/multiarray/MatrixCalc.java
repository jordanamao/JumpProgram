package multiarray;

public class MatrixCalc {

	public static void maxInRows(int arr[][]) { 

		for (int i=0; i < arr.length; i++) {

			int max = arr[i][0];
			
			for (int j=0; j<arr[i].length; j++) {

				if (max < arr[i][j]) {

					max = arr[i][j];
						
				}		
				
			}
			
			System.out.println("Max element of row "+ (i+1) + " = " + max);
		}

	}


	public static void columnSum(int arr[][]) {

		for (int j=0; j < arr[j].length; j++) {

			int sum = 0;
			for (int i=0; i < arr.length; i++) {
				sum = sum + arr[i][j];
				}

				System.out.println("sum of all columns is "+ (j+1) + " = " + sum);
			}
		}


public static void main(String[] args) {

	int arr[][]= {{1,3,5},{2,4,6},{3,4,5},{1,4,7}};

	maxInRows(arr);

	System.out.println("-----------------------");

	columnSum(arr);

}

}
