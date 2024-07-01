package abccc;

public class A {
	private int a;
	public static int b;
	public A() {
		System.out.println("Hello");
	}
	
	{
		System.out.println("Hai");
		a = 10;
	}
	
	static {
		System.out.println("abc");
	}
	
	//block
}
