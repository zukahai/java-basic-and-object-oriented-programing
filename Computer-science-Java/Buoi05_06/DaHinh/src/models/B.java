package models;

public class B extends A{
	public void test() {
		System.out.println("AAA");
	}
	
	public void func() {
		this.test();
		super.test();
	}
}
