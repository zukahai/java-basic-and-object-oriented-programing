package models;

public class B extends A{
	private int b;
	public B() {
		System.out.println("Khởi tạo mặc định B");
	}
	
	public B(int b) {
		super(b);
		this.b = b;
		System.out.println("Khởi tạo có thuộc tính B");
	}
}
