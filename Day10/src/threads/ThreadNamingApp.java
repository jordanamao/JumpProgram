package threads;

public class ThreadNamingApp {

	
	// creating two threads
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadNaming t1 = new ThreadNaming ("TT-RR-1");
		ThreadNaming t2 = new ThreadNaming ("AA-YY-2");
		
		//Now changing the name of threads.
		t1.setName("ALPHA");
		t2.setName("BETA");
		
		// getting the above created threads names
		System.out.println("Thread 1:" + t1.getName());
		System.out.println("Thread 2:" + t2.getName());
		
		
		t1.start();
		t2.start();
		

	}

}
