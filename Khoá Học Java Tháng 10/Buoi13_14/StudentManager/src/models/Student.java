package models;

import java.util.Scanner;

public class Student {
	private String maSv;
	private String ten;
	private String ngaySinh;
	private String lop;
	
	public Student() {
		this.maSv = "";
		this.ten = "";
		this.ngaySinh = "";
		this.lop = "";
	}

	public Student(String maSv, String ten, String ngaySinh, String lop) {
		this.maSv = maSv;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.lop = lop;
	}

	@Override
	public String toString() {
		return "Student [maSv=" + maSv + ", ten=" + ten + ", ngaySinh=" + ngaySinh + ", lop=" + lop + "]";
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập mã sinh viên: ");
		maSv = sc.nextLine();
		System.out.print("Nhập tên: ");
		ten = sc.nextLine();
		System.out.print("Nhập ngày sinh: ");
		ngaySinh = sc.nextLine();
		System.out.print("Nhập lớp: ");
		lop = sc.nextLine();
	}

	public String getMaSv() {
		return maSv;
	}

	public void setMaSv(String maSv) {
		this.maSv = maSv;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}
	
	public void abc() {
		System.out.println("Đây là Student");
	}
}
