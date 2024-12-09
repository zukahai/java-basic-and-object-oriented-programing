package test;

import java.util.ArrayList;
import models.Student;
import models.StudentManager;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student(0, "24IT395", "Nguyễn Quang Vũ", 38, "Nam");
		StudentManager.create(s);

		ArrayList<Student> students = StudentManager.getAll();
		for (int i = 0; i < students.size(); i++)
			System.out.println(students.get(i));
	}

}
