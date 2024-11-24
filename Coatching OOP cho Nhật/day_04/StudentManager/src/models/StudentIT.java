package models;

public class StudentIT extends Student{
	private double scoreCpp;
	
	public double getScoreCpp() {
		return scoreCpp;
	}

	public void setScoreCpp(double scoreCpp) {
		this.scoreCpp = scoreCpp;
	}

	public void disPlayScoreCPP() {
		System.out.println(scoreCpp);
	}
}
