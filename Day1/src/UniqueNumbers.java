
public class UniqueNumbers {

	public static void main(String[] args) {
		
	int count = 0;
		
	for (int i=1; i<=4; i++) {
		
		for(int j=1; j<=4; j++) {
			
			for(int k=1; k<=4;k++) {
				
					if ( i != j && j != k && i != k ) 
					{
					    
						System.out.print(i);
						System.out.print(j);
						System.out.print(k);
						System.out.println();
						//System.out.println(i + "" + j + "" + k);
						count = count + 1;
					}
					else {}
				
			      }
			 }
	    }
	
	System.out.println("Total is: " + count);
	
	}
}
