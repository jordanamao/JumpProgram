package OOP;

public class MainClass {

	public static void main(String[] args) {
		new X() {
			void methodX() {
				
				System.out.println(s1 + " " + s2);
			}
			
		}.methodX();
		
		new X.Y() {
			void methodY() {
				
				System.out.println(s1+ " " + s2);
			}
		
		}.methodY();

	}

}
