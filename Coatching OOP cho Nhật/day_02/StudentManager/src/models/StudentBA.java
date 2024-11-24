package models;

public class StudentBA extends Student{
	private float scoreABC;
	
	public StudentBA() {
		super(); // Gọi hàm khởi tạo mặc định của lớp cha
		scoreABC = 0;
	}
	
	public StudentBA(String name, int age, String lop, float scoreABC) {
		super(name, age, lop);
		this.scoreABC = scoreABC;
	}

	@Override
	public String toString() {
		return "StudentBA [name=" + super.getName() +
				", age=" + super.getAge()+
				", lop=" + super.getLop() +
				", scoreABC=" + scoreABC + "]";
	}

	public float getScoreABC() {
		return scoreABC;
	}

	public void setScoreABC(float scoreABC) {
		this.scoreABC = scoreABC;
	}
}
