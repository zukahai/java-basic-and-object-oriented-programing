package models;

public class Student {
	private String name;
	private int age;

	public Student() {
		this.name = "";
		this.age = 0;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	public boolean equals(Student s) {
		if (this.age != s.getAge())
			return false;
		if (!this.name.equals(s.getName()))
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

}
