package models;

import java.sql.Connection;
import java.util.ArrayList;
import java.sql.*;
import interfaces.IManager;

public class StudentManager implements IManager {
	private Connection connection;

	public StudentManager() {
		connection = ConnectJDBC.getConnection();
	}

	@Override
	public ArrayList<Student> getAll() {
		// TODO Auto-generated method stub
		ArrayList<Student> ans = new ArrayList<>();
		try {
			Statement statement = connection.createStatement();
			String query = "SELECT * FROM student";
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String masv = resultSet.getString("masv");
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");
				Student student = new Student(id, masv, name, address);
				ans.add(student);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ans;
	}

	@Override
	public boolean add(Student s) {
	    try {
	        String query = "INSERT INTO student (masv, name, address) VALUES (?, ?, ?)";
	        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
	            preparedStatement.setString(1, s.getMasv());
	            preparedStatement.setString(2, s.getName());
	            preparedStatement.setString(3, s.getAddress());

	            int rowsAffected = preparedStatement.executeUpdate();

	            if (rowsAffected > 0) {
	                return true; 
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return false;
	}


	@Override
	public boolean edit(String masv, Student s) {
	    try {
	        String query = "UPDATE student SET masv=?, name=?, address=? WHERE masv=?";
	        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
	            preparedStatement.setString(1, s.getMasv());
	            preparedStatement.setString(2, s.getName());
	            preparedStatement.setString(3, s.getAddress());
	            preparedStatement.setString(4, masv);

	            int rowsAffected = preparedStatement.executeUpdate();

	            if (rowsAffected > 0) {
	                return true; 
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return false;
	}


	@Override
	public boolean delete(String masv) {
        try {
            String query = "DELETE FROM student WHERE masv=?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, masv);
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

	@Override
	public ArrayList<Student> findByName(String name) {
	    ArrayList<Student> result = new ArrayList<>();
	    try {
	        String query = "SELECT * FROM student WHERE name LIKE ?";
	        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
	            preparedStatement.setString(1, "%" + name + "%");
	            ResultSet resultSet = preparedStatement.executeQuery();
	            while (resultSet.next()) {
	                int id = resultSet.getInt("id");
	                String masv = resultSet.getString("masv");
	                String studentName = resultSet.getString("name");
	                String address = resultSet.getString("address");
	                Student student = new Student(id, masv, studentName, address);
	                result.add(student);
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return result;
	}

	@Override
	public ArrayList<Student> findByAddress(String address) {
	    ArrayList<Student> result = new ArrayList<>();
	    try {
	        String query = "SELECT * FROM student WHERE address LIKE ?";
	        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
	            preparedStatement.setString(1, "%" + address + "%");
	            ResultSet resultSet = preparedStatement.executeQuery();
	            while (resultSet.next()) {
	                int id = resultSet.getInt("id");
	                String masv = resultSet.getString("masv");
	                String name = resultSet.getString("name");
	                Student student = new Student(id, masv, name, address);
	                result.add(student);
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return result;
	}


	@Override
	public Student findByMasv(String masv) {
	    Student result = null;
	    try {
	        String query = "SELECT * FROM student WHERE masv=?";
	        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
	            preparedStatement.setString(1, masv);
	            ResultSet resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	                int id = resultSet.getInt("id");
	                String name = resultSet.getString("name");
	                String address = resultSet.getString("address");
	                result = new Student(id, masv, name, address);
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return result;
	}


}
