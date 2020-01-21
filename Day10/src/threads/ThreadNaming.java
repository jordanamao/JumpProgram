package threads;

//Java program to illustrate how to set the name 
//of a thread at time of thread creation



//we can create thread by creating the 
//objects of that class

class ThreadNaming extends Thread {
	
	ThreadNaming(String name){
		
		super(name);
		
	}
	
	@Override
	public void run() {
		System.out.println("Thread [" + getName() + "] is running .....");
	}
	

}
