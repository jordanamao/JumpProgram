package annotations;

class B{
	
	void show(){
		System.out.println("Show in B");
	}	
}



public class AnnotationsDemo extends B {
	
	@Override
	public void show() {
		System.out.println("Show in Demo");
	}
	
	public static void main(String[] args) {
		
		AnnotationsDemo demo = new AnnotationsDemo();
		demo.show();
		
	}	
	
}
