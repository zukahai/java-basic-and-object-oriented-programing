package models;

public class StudentIT extends Student {
	// name, age, lop, scoreCPP
	private float scoreCPP;
	
	public StudentIT() {
		super(); // Gọi hàm khởi tạo mặc định của lớp cha
		scoreCPP = 0;
	}
	
	public StudentIT(String name, int age, String lop, float scoreCPP) {
		super(name, age);
		this.scoreCPP = scoreCPP;
	}
	
	@Override
	public String toString() {
		return "StudentIT [name=" + super.getName() +
				", age=" + super.getAge()+
				", lop=" + super.getLop() +
				", scoreCPP=" + scoreCPP + "]";
	}

	public float getScoreCPP() {
		return scoreCPP;
	}

	public void setScoreCPP(float scoreCPP) {
		this.scoreCPP = scoreCPP;
	}
	
	public void hello() {
		System.out.println("Xin chào IT @@@@@@@");
	}
	
	public void hello(int n) {
		System.out.println("Xin chào abcbcbcbc " + n);
	}
	
	public void hello(String name) {
		System.out.println("Xin chào IT " + name);
	}
}