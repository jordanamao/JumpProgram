
public class forloop {
	
	public static void pyramid1(){
		
		for (int i=0; i < 6; i++) {
			for (int j=0; j <=i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}		
	}
	
	public static void pyramid2(){
		
	for (int i=6; i>=0; i--){
			for (int j=0; j<i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}		
	}
	
	
		
	public static void main(String[] args) {
		
		pyramid1();
		System.out.println();
		pyramid2();
	
	}

}
