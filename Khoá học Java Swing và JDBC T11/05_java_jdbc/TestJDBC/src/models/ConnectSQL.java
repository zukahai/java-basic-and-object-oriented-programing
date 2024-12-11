package models;

import java.sql.Connection;
import java.sql.DriverManager;

public final class ConnectSQL {
	private Connection conn = null;
	private static ConnectSQL instance = null;
	
	private ConnectSQL() {
		try{ 
			   String userName = "root";
			   String password = "";
			   String DatabaseName = "studentmanager";
			   String url = "jdbc:mysql://localhost/" + DatabaseName;
			   Class.forName("com.mysql.cj.jdbc.Driver");
			   this.conn = DriverManager.getConnection(url, userName, password);
			   System.out.println("Đã kết nối tới SQL");
		} catch (Exception e) {
			// TODO: handle exception
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static ConnectSQL getInstance() {
		if (instance == null) {
			instance = new ConnectSQL();
		}
		return instance;
	}
	
	public static Connection getConnected() {
		instance = getInstance();
		return instance.getConn();
	}

	public Connection getConn() {
		return conn;
	}

}
