package OOP;

class X1{
	
	int x = 111;
	
	static class Y extends X1
	{
		int y = x + 222;
	}
	
	class Z extends X1.Y
	{
		int z = y + 333;
		
	}

}

public class MainClass1 {

	public static void main(String[] args) {
		
		X1.Z z =  new X1().new Z();
		System.out.println(z.x);
		System.out.println(z.y);
		System.out.println(z.z);
	

	}

}
