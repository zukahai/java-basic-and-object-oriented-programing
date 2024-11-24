package models;

public class Student {
	private String name;
	private int age;
	private double height;

	public Student() {
		this.name = "";
		this.age = 0;
		this.height = 0;
	}

	public Student(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", height=" + height + "]";
	}

	public boolean equals(Student s) {
		if (this.age != s.getAge())
			return false;
		if (!this.name.equals(s.getName()))
			return false;
		if (this.height != s.getHeight())
			return false;
		return true;
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
