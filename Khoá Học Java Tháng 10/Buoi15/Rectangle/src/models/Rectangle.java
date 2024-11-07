package models;

import java.util.Scanner;

public class Rectangle {
	private float width;
	private float height;
	
	public Rectangle() {
		this.width = 0;
		this.height = 0;
	}
	
	public Rectangle(float width, float height) {
		this.width = width;
		this.height = height;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chiều dài: ");
		this.height = sc.nextFloat();
		System.out.print("Nhập chiều rộng: ");
		this.width = sc.nextFloat();
	}
	
	public float getArea() {
		return width * height;
	}
	
	public float getPerimeter() {
		return 2 * (width + height);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
}
