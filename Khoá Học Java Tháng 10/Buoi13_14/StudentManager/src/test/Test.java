package test;

import java.util.ArrayList;

import models.Student;
import models.StudentBA;
import models.StudentIT;

public class Test {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		
		StudentIT s = new StudentIT();
		s.input();
		students.add(s);
		
		StudentBA p = new StudentBA();
		p.input();
		students.add(p);
		
		StudentIT o = new StudentIT();
		o.input();
		students.add(o);
		
		System.out.println("Danh sách sinh viên");
		
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		
		System.out.println("Danh sách sinh viên IT có điểm C++ lớn hơn 5");
		
		for (int i = 0; i < students.size(); i++) {
			Student st = students.get(i);
			if (st instanceof StudentIT) {
				StudentIT sIt = (StudentIT) st;
				if (sIt.getScoreCPP() > 5) {
					System.out.println(sIt);
				}
			}
		}
		
		System.out.println("Done");
		
		
	}
}
