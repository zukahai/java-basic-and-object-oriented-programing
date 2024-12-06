package models;
import java.security.PublicKey;
import java.sql.*;

public class ConnectSQL {
	public static Connection getConnection() {
		Connection conn = null;
		try{ 
			   String userName = "root";
			   String password = "";
			   String DatabaseName = "websell";
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
	
	public void showAll() {
        Connection conn = ConnectSQL.getConnection();

        String query = "SELECT * FROM users";

        PreparedStatement pstm = null;
        try {
            //Tạo đối tượng Statement
            pstm = conn.prepareStatement(query);

            //gán các giá trị vào tham số
//            pstm.setString(1, "ngoc");

            //Thực thi truy vấn và trả về đối tượng ResultSet
            ResultSet rs = pstm.executeQuery();

            //Duyệt kết quả trả về
            while (rs.next()){
                int id = rs.getInt("id");
                String username = rs.getString("phoneNumber");
                String password = rs.getString("password");
                String email = rs.getString("email");
                int role = rs.getInt("role");

                System.out.println(id + " - " + username + " - " + password + " - " + email + " " + role);
            }

            //Đóng kết nối
//            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        
	}
	
	public void insert() {
        Connection conn = ConnectSQL.getConnection();

        String query = "INSERT INTO users(id, username, password, email) " +
                "VALUES (null, ?,?,?)";

        PreparedStatement pstm = null;
        try {
            pstm = conn.prepareStatement(query);

            pstm.setString(1, "hung");
            pstm.setString(2, "123456789");
            pstm.setString(3, "hung@gmail.com");

            //Khi thực hiện các lệnh insert/update/delete sử dụng executeUpdate(), nó sẽ trả về số hàng bị tác động
            int row = pstm.executeUpdate();
            if(row != 0){
                System.out.println("Thêm thành công " + row);
            }

            //Đóng kết nối
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	public static void main(String[] args) {
		ConnectSQL connectSQL = new ConnectSQL();
		connectSQL.showAll();
	}
}
