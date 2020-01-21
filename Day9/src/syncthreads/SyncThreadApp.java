package syncthreads;

public class SyncThreadApp {
	
	//main Thread

	public static void main(String[] args) {
		
		System.out.println("App started..");
		
		Printer p = new Printer();
		
		
		MyThread myRef = new MyThread(p);
		YourThread yourRef = new YourThread(p);
		
		myRef.start();
		yourRef.start();
		
		System.out.println("App finished.");

	}

}
