package test;

import java.util.ArrayList;

import models.Student;
import models.StudentManager;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManager manager = new StudentManager();
		
		Student s1 = new Student("Hải", 25);
		Student s2 = new Student("Nam", 21);
		Student s3 = new Student("Hải", 22);
		Student s4 = new Student("Hải", 44);
		
		
		manager.add(s1);
		manager.add(s2);
		manager.add(s3);
		manager.add(s4);
		
		ArrayList<Student> ans = manager.search("Nam");
		for (int i = 0; i < ans.size(); i++)
			System.out.println(ans.get(i));
		
	}
}
