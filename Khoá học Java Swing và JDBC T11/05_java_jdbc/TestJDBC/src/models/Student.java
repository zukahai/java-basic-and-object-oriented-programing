package models;

public class Student {
	public String masv;
	private String name;
	private int age;
	private String gender;
	
	public static String university = "VKU";
	
	public Student() {
		this.masv = "";
		this.name = "";
		this.age = 0;
		this.gender = "Nam";
	}
	
	public Student(String masv, String name, int age, String gender) {
		this.masv = masv;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Student [masv=" + masv + ", name=" + name + ", age=" + age + ", gender=" + gender + ", university=" + university + "]";
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
}
