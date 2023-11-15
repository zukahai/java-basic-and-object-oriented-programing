package main;

import models.Student;
import models.StudentManager;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManager manager = new StudentManager();
		manager.getAll();
		manager.add(new Student(0, "21IT999", "Phan Thị Mỹ Linh", "Quảng Trị"));
	}

}
