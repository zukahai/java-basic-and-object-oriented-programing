package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentManager {
	public static ArrayList<Student> getAll() {
		ArrayList<Student> students = new ArrayList<>();
		try {
			Connection conn = ConnectSQL.getConnected();
			String query = "SELECT * FROM students";
			PreparedStatement ptsm = conn.prepareStatement(query);
			ResultSet rs = ptsm.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String masv = rs.getString("masv");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String gender = rs.getString("gender");
				
				Student student = new Student(id, masv, name, age, gender);
				students.add(student);
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return students;
	}
	
	public static void create(Student s) {
		
		try {
			Connection conn = ConnectSQL.getConnected();
			String query = "INSERT INTO students (id, masv, name, age, gender) VALUES (NULL, ?, ?, ?, ?)";
			PreparedStatement ptsm = conn.prepareStatement(query);
			ptsm.setString(1, s.getMasv());
			ptsm.setString(2, s.getName());
			ptsm.setInt(3, s.getAge());
			ptsm.setString(4, s.getGender());
			
			int row = ptsm.executeUpdate();
			if (row > 0) {
				System.out.println("Thêm thành công " + s);
			} else {
				System.out.println("Thêm lỗi");
			}
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
