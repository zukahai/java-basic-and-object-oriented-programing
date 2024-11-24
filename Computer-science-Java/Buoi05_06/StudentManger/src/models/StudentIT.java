package models;

import java.util.Scanner;

public class StudentIT extends Student{
	private int scoreCpp;
	private int scoreJava;
	
	public StudentIT() {
		this.scoreCpp = 0;
		this.scoreJava = 0;
	}
	
	public StudentIT(String masv, String name, int age, int scoreCpp, int scoreJava) {
		super(masv, name, age);
		this.scoreCpp = scoreCpp;
		this.scoreJava = scoreJava;
	}
	
	public boolean equals(StudentIT obj) {
        if (!this.getMasv().equals(obj.getMasv()))
        	return false;
        if (!this.getName().equals(obj.getName()))
        	return false;
        if (this.getAge() != obj.getAge())
        	return false;
        if (this.getScoreCpp() != obj.getScoreCpp())
        	return false;
        if (this.getScoreJava() != obj.getScoreJava())
        	return false;
        return true;
    }
	
	public String toString() {
		return "StudentIT [masv=" + super.getMasv() + ", name=" + super.getName() + ", age=" + super.getAge() 
		+ ", scoreCpp=" + scoreCpp + ", scoreJava=" + scoreJava + "]";
	}
	
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập scoreCpp: ");
		this.scoreCpp = sc.nextInt();
		System.out.print("Nhập scoreJava: ");
		this.scoreJava = sc.nextInt();
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
	
	public void test() {
		System.out.println("XYZ");
	}
}
