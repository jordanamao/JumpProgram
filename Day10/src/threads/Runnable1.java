package threads;

public class Runnable1 {

	public static void main(String[] args) {

		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread anonymous");
				for (int doc=1; doc <=1000; doc++) {
					System.out.println(" -Printing document #" + doc + " - Printer A");	
				}	
			}	
		}).start();

		new Thread(
				() -> {
					System.out.println("Thread with lambda");
					for (int doc=1; doc <=10; doc++) {
						System.out.println(" + Printing document #" + doc + " - Printer B");
					}
		

				}).start();
	}
}
