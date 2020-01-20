
public class Strings {

	public static void main(String[] args) {
		
		String text = "Hello world java";
		String text1 = "Hello world1";
		
		
		//extract substring "ll"
		//extract substring "world"
		//extract substring Java
		//generate error
		
		System.out.println(text.substring(2,4));
		System.out.println(text.substring(6,11));
		System.out.println(text.substring(12,16));
		//System.out.println(text.substring(5,1));
		System.out.println(text.indexOf('a'));
		System.out.println(text.length());
		System.out.println(text.charAt(text.length()-1));
		System.out.println(text.replace('l','r'));
		System.out.println("Hashcode: " + text.hashCode());
		System.out.println(text);
		
		String s1 = "pro";
		String s2 = "gram";
		System.out.println(s1 + s2);
		
		StringBuffer buff = new StringBuffer();
		buff.append("This");
		buff.append(" ");
		buff.append("is");
		System.out.println(buff.toString());
		
		System.out.println(text);
		
		
		//System.out.println(text);
		//text.toUpperCase();
		//System.out.println(text);
		//System.out.println(text.indexOf());
		
		//for from end to begin
		// get char
		// concat to result
		String  reverse = "";
		StringBuffer sb = new StringBuffer();
		for (int i = text.length()-1; i >=0; i--)
		{
			//reverse = reverse + text.charAt(i); //method1
		    sb.append(text.charAt(i)); //method2
		}
		
		//System.out.println(reverse);
		System.out.println(sb.toString());
		sb = new StringBuffer(text);
		System.out.println(new StringBuffer(text).reverse());
	}
}
