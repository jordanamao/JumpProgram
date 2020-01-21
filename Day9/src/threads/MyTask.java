package threads;



// Verson 1 - Run Sequential run

/*
public class MyTask {
	
	public void executeTask() {
		
		for (int doc=1; doc <= 10; doc++) {
			
			System.out.println(" * Printing document #" + doc + " - Printer 2");
			
		}
		
	}
}
*/



/*
//MyTask IS-A Thread
//Version 2 - Run in a new thread (extending Thread Class)
public class MyTask extends Thread{
	@Override
	public void run(){
	for (int doc=1; doc<=10; doc++){
	
		System.out.println(" * Printing document #" + doc + " - Printer 2");
		}
		
	  }
	
	}
*/




  //Verson 3 - Run in a new thread (implementing Runnable interface)
  class OtherClass{
  
  }
  
  public class MyTask extends OtherClass implements Runnable{
  	@Override
  	public void run(){
  		for( int doc=1; doc <=10; doc++){
  			System.out.println(" * Printing document #" + doc + " - Printer 2");
  			}
  		}
  	}

 


 


 

