package models;

import java.util.Scanner;

public class Sach {
	private String maSach;
	private String ngayNhap;
	private int donGia;
	private int soLuong;
	
	
	public Sach() {
		this.maSach = "";
		this.ngayNhap = "";
		this.donGia = 0;
		this.soLuong = 0;
	}

	public Sach(String maSach, String ngayNhap, int donGia, int soLuong) {
		this.maSach = maSach;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}
		
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập mã sách: ");
		this.maSach = sc.nextLine();
		
		System.out.print("Nhập ngày nhập: ");
		this.ngayNhap = sc.nextLine();
		
		System.out.print("Nhập đơn giá: ");
		this.donGia = sc.nextInt();
		
		System.out.print("Nhập số lượng: ");
		this.soLuong = sc.nextInt();
		
	}



	@Override
	public String toString() {
		return "Sach [maSach=" + maSach + ", ngayNhap=" + ngayNhap + ", donGia=" + donGia + ", soLuong=" + soLuong
				+ "]";
	}



	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	
	public String getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	
	public int getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	
	public int getSoLuong() {
		return soLuong;
	}
	
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
}
