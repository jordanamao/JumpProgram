package OOP;


class A{
	
	int i = 1;
	
	class B{
		
		int i = 2;
			
		class C extends A {
			
			void methodC() {
				
				System.out.println(i);
				
			}
			
		}
		
	}
	
}


public class MainClass3 {
	 public static void main (String[] args) {
		 
		 A.B.C obj = new A(). new B().new C();
		 
		 new A().new B().new C(). methodC();
	 }

}
