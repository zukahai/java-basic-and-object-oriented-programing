package model;

public class Student {
	private String masv;
	private String name;
	private int age;
	
	public Student() {
		masv = "253trưt";
		name = "user";
		age = 18;
	}
	
	public Student(String masv, String name, int age) {
		this.masv = masv;
		this.name = name;
		this.age = age;
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

	
	@Override
	public String toString() {
		return "Student [masv=" + masv + ", name=" + name + ", age=" + age + "]";
	}

	public void eat(String foodName) {
		System.out.println(name + " đang ăn " + foodName);
	}
}
