package multiarray;

public class JaggedArray {

	public static void main(String[] args) {

		//declaring a 2D array with odd columns
		int arr[][] = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[5];
		arr[2] = new int[1];

		//initialzing a jagged array
		int count = 0;
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j] = count++;}
		}


		//printing the data of a jagged array

		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {

				System.out.print(arr[i][j]+ " ");
			}

			System.out.println(); //new line
		}
	}

}
