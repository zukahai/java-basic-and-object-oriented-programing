package models;

import java.sql.Connection;

public class ConnectSQL {
	private Connection conn = null;
	public static ConnectSQL instance = null;
	
	private ConnectSQL() {
		// kết nối
		System.out.println("Kết nối sql");
		//this.conn = ///
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

	public void setConn(Connection conn) {
		this.conn = conn;
	}
}
