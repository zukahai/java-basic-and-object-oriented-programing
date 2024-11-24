package models;

public class Student {
	// Tính chất đóng gói: private, default, protected, public
	
	// Các thuộc tính
	private String name;
	private int age;
	private String lop;
	
	public int abc;
	
	// Hàm khởi tạo mặc định
	public Student() {
		name = "Hải";
		age = 25;
		lop = "18IT5";
	}
	// Hàm khởi tạo có thuộc tính
	public Student(String name, int age, String lop) {
		this.name = name;
		this.age = age;
		this.lop = lop;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", lop=" + lop + "]";
	}
	// Các phương thức
	public void hocBai() {
		System.out.println("Học bài");
	}
	
	public void diNgu() {
		System.out.println("Đi ngủ");
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
