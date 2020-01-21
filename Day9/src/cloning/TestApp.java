package cloning;

public class TestApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Test2 t1 = new Test2();
		t1.a = 10;
		t1.b = 20;
		t1.c.x = 30;
		t1.c.y = 40;
		
		Test2 t3 = (Test2)t1.clone();
		t3.a = 100;
		
		//Change in primitive type of t2 will not be reflected in t1 field 
		
		t3.c.x = 300;
		
		//Change in object type field of t2 will not be reflected  int1 field
		
		System.out.println(t1);
		System.out.println(t3);

	}

}
