package cloning;

public class DeepClone {

	public static void main(String[] args) {
		
		Foo f1 = new Foo();
		
		f1.num = 7;
		f1.nums = new int[] {2,4,6,7,8};
		
		Foo f2 = (Foo) f1.clone();
		
		System.out.println(f2.num);
		
		for(int n: f2.nums)
			System.out.println(n);

	}

}
