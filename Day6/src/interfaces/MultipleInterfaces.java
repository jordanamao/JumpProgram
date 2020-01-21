package interfaces;

public class MultipleInterfaces implements I1, I2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleInterfaces obj = new MultipleInterfaces();
		obj.method1();
		obj.method2();

	}
	
	@Override
	public void method1() {
		
		System.out.println("Hello from method 1");
		
	}
	
	@Override
	public void method2() {
		
		System.out.println("Hello from method 2");
		
	}
	
	

}
