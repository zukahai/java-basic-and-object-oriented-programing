package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

public class StudentManager {
	
	private ArrayList<Student> students;
	
	public StudentManager() {
		this.students = this.getAll();
	}
	
	// Lấy dữ liệu từ bảng sinh viên
	public ArrayList<Student> getAll() {
		
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
	
	// Thêm dữ liệu vào từ bảng sinh viên
	public void create(Student s) {
		
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
				students.add(s);
			} else {
				System.out.println("Thêm lỗi");
			}
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	// Sửa dữ liệu
	public void update(int id, Student s) {
		try {
			Connection conn = ConnectSQL.getConnected();
			String query = "UPDATE students SET masv=?, name=?, age=?, gender=? WHERE id=?";
			PreparedStatement ptsm = conn.prepareStatement(query);
			ptsm.setString(1, s.getMasv());
			ptsm.setString(2, s.getName());
			ptsm.setInt(3, s.getAge());
			ptsm.setString(4, s.getGender());
			ptsm.setInt(5, id);
			
			int row = ptsm.executeUpdate();
			if (row > 0) {
				System.out.println("Sửa thành công " + s);
			} else {
				System.out.println("Sửa bị lỗi");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
	// Xoá sinh viên
	public void  delete(int id) {
		try {
			Connection conn = ConnectSQL.getConnected();
			String query = "DELETE FROM students WHERE id=?";
			PreparedStatement ptsm = conn.prepareStatement(query);
			ptsm.setInt(1, id);
			
			int row = ptsm.executeUpdate();
			if (row > 0) {
				System.out.println("Xoá thành công ");
			} else {
				System.out.println("Xoá bị lỗi");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
	}
	
	public ArrayList<Student> search(String text) {
		ArrayList<Student> students = new ArrayList<>();
		Connection conn = ConnectSQL.getConnected();
		String query = "SELECT * FROM students WHERE id LIKE ? OR masv LIKE ? OR name LIKE ? OR gender LIKE ? OR age LIKE ?";
		PreparedStatement ptsm;
		try {
			ptsm = conn.prepareStatement(query);
			text = "%" + text + "%";
			ptsm.setString(1, text);
			ptsm.setString(2, text);
			ptsm.setString(3, text);
			ptsm.setString(4, text);
			ptsm.setString(5, text);
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return students;
		
	}

	// Tìm sinh viên dựa vào id
	public Student find(int id) {
		this.students = getAll();
		for (Student s: students)
			if (s.getId() == id) {
				return s;
			}
		return null;
	}
	
	
	// Hiển thị danh sách sinh viên
	public void display() {
		this.students = getAll();
		for (Student s: students) {
			System.out.println(s);
		}
	}
	
	public Vector convertToVector() {
		this.students = getAll();
		Vector vData = new Vector<>();
		for (Student s: students)
			vData.add(s.convertVector());
		return vData;
	}
	
	public Vector convertToVector(ArrayList<Student> students) {
		Vector vData = new Vector<>();
		for (Student s: students)
			vData.add(s.convertVector());
		return vData;
	} 
}
