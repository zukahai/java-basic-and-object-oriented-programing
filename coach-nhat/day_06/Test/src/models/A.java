package models;

public class A {
	private int a;
	
	public A() {
		a = 0;
		System.out.println("Khởi tạo mặc định A");
	}
	
	public A(int a) {
		this.a = a;
		System.out.println("Khởi tạo có thuộc tính A");
	}
}
