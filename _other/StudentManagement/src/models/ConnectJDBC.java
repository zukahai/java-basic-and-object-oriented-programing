package models;

import java.sql.*;

public class ConnectJDBC {
	public static Connection getConnection() {
		Connection conn = null;
		try{ 
			   String userName = "root";
			   String password = "";
			   String DatabaseName = "student_manager";
			   String url = "jdbc:mysql://localhost/" + DatabaseName;
			   Class.forName("com.mysql.cj.jdbc.Driver");
			   conn = DriverManager.getConnection(url, userName, password);
			   System.out.println("Ok");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void main(String[] args) {
		ConnectJDBC.getConnection();
	}
}
