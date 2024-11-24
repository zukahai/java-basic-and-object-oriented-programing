package models;

import java.util.Scanner;

public class Student {
	private String masv;
	private String name;
	private int age;
	
	public Student() {
		super();
		this.masv = "";
		this.name = "";
		this.age = 0;
	}
	
	public Student(String masv, String name, int age) {
		this.masv = masv;
		this.name = name;
		this.age = age;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập Masv: ");
		this.masv = sc.nextLine();
		System.out.print("Nhập Name: ");
		this.name = sc.nextLine();
		System.out.print("Nhập Age: ");
		this.age = sc.nextInt();
	}

	@Override
	public String toString() {
		return "Student [masv=" + masv + ", name=" + name + ", age=" + age + "]";
	}

	public String getMasv() {
		return masv;
	}

	public void setMasv(String masv) {
		this.masv = masv;
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
	
	public void test() {
		System.out.println("ABC");
	}
	
	public void test(int a) {
		System.out.println("AAAAAA");
	}
	
	public void test(String s) {
		System.out.println(s);
	}
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public int sum(int a, int b, int c) {
		return a + b + c;
	}
}
