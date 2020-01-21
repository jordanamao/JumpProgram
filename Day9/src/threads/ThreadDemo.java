package threads;

public class ThreadDemo {

	public static void main(String[] args) {

		System.out.println("App started");

		
		/*
		//Version 1
		MyTask task2 = new MyTask();
		task2.executeTask();
		*/
	
		
		/*
		//task2 Version 2 -
		//Run in a new thread (extending Thread class)
			
		MyTask task2 = new MyTask();
		task2.start(); // will call thread run() method
		*/
		


		
		 // task2 Version 3 - Run in a new thread (implementing Runnable interface)
		  Runnable r = new MyTask();
		  Thread task2 = new Thread(r);
		  task2.start();
		 

		
		//task 3
		//Print documents
		for (int doc=1; doc <= 10; doc++) {

			System.out.println(" # Printing document #" + doc + " - Printer 1");
		}
		

	}

}
