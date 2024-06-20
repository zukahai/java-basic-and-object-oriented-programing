package models;

public class Student {
	// private -> default -> protected -> public
	private String name;
	private int age;
	private String lop;
	
	
	public Student() {
		this.name = "";
		this.age = 0;
		this.lop = "";
	}
	
	public Student(String name, int age, String lop) {
		this.name = name;
		this.age = age;
		this.lop = lop;
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void hello() {
		System.out.println("Xin chào");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", lop=" + lop + "]";
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
	
	public String getLop() {
		return lop;
	}
	
	public void setLop(String lop) {
		this.lop = lop;
	}

}

/*
 * Tính đa hình:
 * - Ghi đè phương thức: override
 * - Nạp chồng phương thức: overload
 * 
 * 
 * 
 * 
 * Tạo 1 class Animal có 2 thuộc tính:
 * 	name: String
 * 	soChan: int
 * 
 * Tạo 1 class Cat kế thừa Animal có thêm 1 thuộc tính
 * 	mauLong: String
 * 
 * Tạo 1 class Fish kế thừa Animal có thêm 1 thuộc tính
 * 	isNuocNgot: boolean
 * 
 * 
 * 
 * */
