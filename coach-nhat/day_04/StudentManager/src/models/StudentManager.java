package models;

import java.util.ArrayList;

public class StudentManager {
	private ArrayList<Student> students;

	public StudentManager() {
		this.students = new ArrayList<>();
	}

	public StudentManager(ArrayList<Student> students) {
		this.students = students;
	}
	
	public void add(Student s) {
		students.add(s);
	}
	
	public ArrayList<Student> search(String name) {
		/*
		 * Mình cần lấy tên của từng Student để so sánh với name
		 * */
		ArrayList<Student> ans = new ArrayList<>();
		
		for (int i = 0; i < students.size(); i++) {
			// lấy Student ở chỉ số i trong ArrayList students
			Student t = students.get(i); 
			// So sánh tên
			if (t.getName().equals(name))
				ans.add(t);
		}
		
		return ans;
	}
	
	public void displayCPP() {
		for (int i = 0; i < students.size(); i++) {
			// lấy Student ở chỉ số i trong ArrayList students
			Student t = students.get(i); 
			
			if (t instanceof StudentIT) {
				// Ép kiểu Student về StudentIT
				((StudentIT)t).disPlayScoreCPP();
			}
			
		}
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

}
