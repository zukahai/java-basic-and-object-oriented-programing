package models;

import java.util.Scanner;

public class StudentBA extends Student{
	
	private double scoreMon1;
	
	public StudentBA() {
		super();
		this.scoreMon1 = 0;
	}
	
	public StudentBA(String maSv, String ten, String ngaySinh, String lop, double scoreMon1) {
		super(maSv, ten, ngaySinh, lop);
		this.scoreMon1 = scoreMon1;
	}
	
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập điểm môn 1: ");
		scoreMon1 = sc.nextDouble();
	}
	
	@Override
	public String toString() {
		return "StudentBA [maSv=" + super.getMaSv() + ", ten=" + super.getTen() + ", ngaySinh=" + super.getNgaySinh() + ", lop=" + super.getLop()
				 + ", scoreMon1=" + scoreMon1 +  "]";
	}

	public double getScoreMon1() {
		return scoreMon1;
	}

	public void setScoreMon1(double scoreMon1) {
		this.scoreMon1 = scoreMon1;
	}
	
}
