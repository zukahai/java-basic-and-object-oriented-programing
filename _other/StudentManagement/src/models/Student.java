package models;

import java.util.Scanner;

public class Student {
	private int id;
	private String masv;
	private String name;
	private String address;

	public Student() {
		this.id = 0;
		this.masv = "";
		this.name = "";
		this.address = "";
	}

	public Student(int id, String masv, String name, String address) {
		this.id = id;
		this.masv = masv;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", masv=" + masv + ", name=" + name + ", address=" + address + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMasv() {
		return masv;
	}

	public void setMasv(String masv) {
		this.masv = masv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}