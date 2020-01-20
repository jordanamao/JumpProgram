
public class Continue1 {
	
	//The continue statement is used in loop control structure
	//This feature is introduced since JDK 1.5

	public static void main(String[] args) {
		aa:
		for(int i=1; i<=3; i++) {
		
			for(int j=1; j<=3; j++) {
				
				if(i==2&&j==2) {
					
					continue aa;
				}
				
				System.out.println(i+" "+j);
			}
			
			
		}

	}

}
