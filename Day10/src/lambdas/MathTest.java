package lambdas;


public class MathTest {

	public static void main(String[] args) {
		
		MathTest tester = new MathTest();
		//with type declaration
		MathOperation addition = (int a, int b) -> a+b;
		//without type declaration
		MathOperation subtraction = (a,b) -> a-b;
		//with return statement along with curly braces
		MathOperation multiplication = (int a, int b) -> {return a*b;};
		//without return statement and without curly braces
		MathOperation divison = (int a, int b) -> a/b;
		
		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
		System.out.println("10 X 5 = " + tester.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + tester.operate(10, 5, divison));
		

	}

	private int operate(int a, int b, MathOperation mathOperation) {
		
		return mathOperation.operation(a, b);
	}
}
