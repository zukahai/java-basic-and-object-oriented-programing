package models;

import java.util.Vector;

public class Student {
	private String name;
	private String classString;
	private int age;
	private String gender;
	
	public Student() {
		this.name = "";
		this.classString = "";
		this.age = 0;
		this.gender = "";
	}
	
	public Student(String name, String classString, int age, String gender) {
		this.name = name;
		this.classString = classString;
		this.age = age;
		this.gender = gender;
	}
	
	public Vector convertVector() {
		Vector t = new Vector<>();
		t.add(name);
		t.add(classString);
		t.add(age);
		t.add(gender);
		return t;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", classString=" + classString + ", age=" + age + ", gender=" + gender + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassString() {
		return classString;
	}

	public void setClassString(String classString) {
		this.classString = classString;
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
}
