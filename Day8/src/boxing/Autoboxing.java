package boxing;

public class Autoboxing {

	public static void main(String[] args) {
	
		Integer i = 10;
		
		int value = Integer.parseInt("100012");
		
		System.out.println(value);
		
		String valueText = value + "";
		
		String valueText1 = Integer.toString(value);
		
		Float floatValue = Float.parseFloat("3.444444");
		System.out.println(floatValue);
		
		
		Boolean flag = true;
		boolean flagPrimitive = false;
		
		flag = flagPrimitive;
		flagPrimitive = flag;

	}

}
