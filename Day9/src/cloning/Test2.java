package cloning;

public class Test2 implements Cloneable{
	
	int a, b;
	
	Test c = new Test();
	
	public Object clone() throws CloneNotSupportedException{
		
		
		Test2 t2 = (Test2) super.clone(); //shallow copy
		
		//deep copy
		t2.c = new Test();
		
		t2.c.x = c.x;
		t2.c.y =c.y;
		

		return t2;
	


	
	}

	@Override
	public String toString() {
		return "Test2 [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
