package models;

public abstract class Student {
	private String maSv;
	private String name;
	private int age;
	
	public Student() {
		this.maSv = "";
		this.name = "";
		this.age = 0;
	}
	
	public Student(String maSv, String name, int age) {
		this.maSv = maSv;
		this.name = name;
		this.age = age;
	}
	
	public abstract float getAveScore();
	
	@Override
	public String toString() {
		return "Student [maSv=" + maSv + ", name=" + name + ", age=" + age + "]";
	}

	public String getMaSv() {
		return maSv;
	}

	public void setMaSv(String maSv) {
		this.maSv = maSv;
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
	
	public abstract void haha();
}
