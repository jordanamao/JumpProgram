package OOP;

abstract class X {
	
	static String s1 = "STATIC";
	String s2 = "NON-STATIC";
	abstract void methodX();
	
	
	static abstract class Y{
		String s1 = "NON-STATIC";
		static String s2 = "STATIC";
		abstract void methodY();
		
	}
	

}


