package models;

public class StudentIT extends Student{
	private int scoreCpp;
	private int scoreJava;
	
	public StudentIT() {
		super();
		this.scoreCpp = 0;
		this.scoreJava = 0;
	}
	
	public StudentIT(String masv, String name, int age, int scoreCpp, int scoreJava) {
		super(masv, name, age);
		this.scoreCpp = scoreCpp;
		this.scoreJava = scoreJava;
	}
	
	public String toString() {
		return "StudentIT [masv=" + super.getMasv() + ", name=" + super.getName() + ", age=" + super.getAge() 
		+ ", scoreCpp=" + scoreCpp + ", scoreJava=" + scoreJava + "]";
	}


	public int getScoreCpp() {
		return scoreCpp;
	}

	public void setScoreCpp(int scoreCpp) {
		this.scoreCpp = scoreCpp;
	}

	public int getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}
}
