package models;

import java.util.Scanner;

public class Square extends Rectangle{
	public Square() {
		super();
	}
	
	public Square(float size) {
		super(size, size);
	}
	
	@Override
	public String toString() {
		return "Square [size=" + super.getHeight() + "]";
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập kích thước: ");
		float size = sc.nextFloat();
		setSize(size);
	}
	
	
	public float getSize() {
		return super.getHeight();
	}
	
	public void setSize(float size) {
		super.setHeight(size);
		super.setWidth(size);
	}
	
	
}
