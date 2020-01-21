package multiarray;

public class MatricesMultiply {

	public static void MultiplyMatrices(int arr1[][], int arr2[][]) {

		int arr3[][] = new int [arr1.length][arr1[0].length];

		for (int i=0; i<arr1.length; i++) {
			for (int j=0; j<arr1[i].length; j++) {
				arr3[i][j]=0;
				for(int k=0; k<arr1[j].length; k++) {
				     int sum = arr1[i][k] * arr2[k][j];
				     arr3[i][j]=arr3[i][j] + sum;
				}
			}
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
		int a[][] = {{1,1,1},{2,2,2},{3,3,3}};
		int b[][] = {{1,1,1},{2,2,2},{3,3,3}};

		MultiplyMatrices(a,b);
	}
}
