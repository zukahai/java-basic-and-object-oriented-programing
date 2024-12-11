package models;

import java.util.Scanner;
import java.util.Vector;

public class Student {
	private int id;
	public String masv;
	private String name;
	private int age;
	private String gender;
	
	
	public Student() {
		this.id = 0;
		this.masv = "";
		this.name = "";
		this.age = 0;
		this.gender = "Nam";
	}
	
	public Student(int id, String masv, String name, int age, String gender) {
		this.id = id;
		this.masv = masv;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", masv=" + masv + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập Mã SV: ");
		this.masv = sc.nextLine();
		System.out.println("Nhập Tên: ");
		this.name = sc.nextLine();
		System.out.println("Nhập Age: ");
		this.age = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập Gender: ");
		this.gender = sc.nextLine();
		
	}
	
	public Vector convertVector() {
		Vector v = new Vector<>();
		v.add(this.id);
		v.add(this.masv);
		v.add(this.name);
		v.add(this.getAge());
		v.add(this.gender);
		return v;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
