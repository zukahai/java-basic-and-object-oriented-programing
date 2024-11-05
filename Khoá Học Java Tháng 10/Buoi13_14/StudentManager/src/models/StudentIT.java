package models;

import java.util.Scanner;

public class StudentIT extends Student {
	private double scoreCPP;
	private double scoreJava;
	
	public StudentIT() {
		super(); // Hàm khởi tạo mặc định của Student()
		this.scoreCPP = 0;
		this.scoreJava = 0;	
	}
	
	public StudentIT(String maSv, String ten, String ngaySinh,
			String lop, double scoreCPP, double scoreJava) {
		super(maSv, ten, ngaySinh, lop); // Hàm khởi tạo có thuộc tính của Student()
		this.scoreCPP = scoreCPP;
		this.scoreJava = scoreJava;	
	}
	
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập điểm C++: ");
		scoreCPP = sc.nextDouble();
		System.out.print("Nhập điểm Java: ");
		scoreJava = sc.nextDouble();
	}
	
	@Override
	public String toString() {
		return "StudentIT [maSv=" + super.getMaSv() + ", ten=" + super.getTen() + ", ngaySinh=" + super.getNgaySinh() + ", lop=" + super.getLop()
				 + ", scoreCPP=" + scoreCPP + ", scoreJava= " + scoreJava +  "]";
	}

	public double getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(double scoreJava) {
		this.scoreJava = scoreJava;
	}
	

	public double getScoreCPP() {
		return scoreCPP;
	}

	public void setScoreCPP(double scoreCPP) {
		this.scoreCPP = scoreCPP;
	}
	
	
}
