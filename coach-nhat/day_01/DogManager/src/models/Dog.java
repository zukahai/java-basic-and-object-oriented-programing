package models;

import java.util.Scanner;

public class Dog {
	private String name;
	private int age;
	private String color;
	
	public Dog() {
		this.name = "";
		this.age = 0;
		this.color = "";
	}
	
	public Dog(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	public void input() {
		/*
		 * 2\n
		 * 
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập tên: ");
		name = sc.nextLine();
		System.out.print("Nhập tuổi: ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhập màu sắc: ");
		color = sc.nextLine();
	}
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", color=" + color + "]";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
}
