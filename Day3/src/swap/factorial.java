package swap;

public class factorial {
	
	
	public static int factorial(int n) {
		
		int result = 1;
		for (int i = n; i >=1; i--){
			result = result * i; 
		}
		
		return result;
	}
	
	public static int factorialRecursion(int n) {
		
		int result;
		if (n>1) {
		result = n * factorialRecursion(n-1);
		return result;
		}
		
		else  {return 1;}
		
		//one liner
		//return (n == 0) ? 1 : n*factorial(n-1);
		
	}

		
	public static void main(String[] args) {
		System.out.println("result is: " + factorial(5));
		System.out.println("result is: " + factorial(3));
		System.out.println("result is: " + factorialRecursion(5));
		System.out.println("result is: " + factorialRecursion(3));
	}
		
}
