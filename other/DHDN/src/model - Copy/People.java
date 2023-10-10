package model;

public class People {
	private String msv;
	private String ten;
	private int tuoi;
	
	public People() {
		msv = "253trưt";
		ten = "user";
		tuoi = 18;
	}
	
	public People(String masv, String name, int age) {
		this.msv = masv;
		this.ten = name;
		this.tuoi = age;
	}
	
	public String getMasv() {
		return msv;
	}

	public void setMasv(String masv) {
		this.msv = masv;
	}

	public String getName() {
		return ten;
	}

	public void setName(String name) {
		this.ten = name;
	}

	public int getAge() {
		return tuoi;
	}

	public void setAge(int age) {
		this.tuoi = age;
	}

	
	@Override
	public String toString() {
		return "Student [masv=" + msv + ", name=" + ten + ", age=" + tuoi + "]";
	}

	public void eat(String foodName) {
		System.out.println(ten + " đang ăn " + foodName);
	}
}
