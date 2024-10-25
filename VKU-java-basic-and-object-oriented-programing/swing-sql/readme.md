<div align="center">

# Thao tác với cơ sở dữ liệu

</div>
Trong SQL tạo database studentmamangement, tạo table student gồm các cột:

- **id**: int tự tăng
- **masv**: varchar, không trùng lặp
- **name**: varchar
- **address**: varchar

Tạo một Java Project StudentManager dùng để quản lí sinh viên, tương tác với cơ sở dữ liệu, bao gồm các chức năng như sau:
- Hiện thị danh sách sinh viên
- Thêm mới một sinh viên
- Xoá một sinh viên
- Chỉnh sửa thông tin **name** và **address** khi biết **masv** của sinh viên
- Tìm kiếm sinh và đưa ra danh sách sinh viên theo **masv**, **name** hoặc **address**

Sinh viên có thể triển khai code nhiều cách để đáp ứng được yêu cầu của chương trình, những một trong những cách tốt nhất là sẽ triển khai như sau:
- Tạo class **ConnectJDBC**:
    - Gồm phương thức static Connection getConnection() dùng để trả về 1 connection đến SQl
- Tạo class **Student** đại diện cho tập hợp những sinh viên.<br>Bao gồm:
    - Các thuộc tính:
        - **id**: int, đại diện cho id
        - **masv**: String, đại diện cho mã sinh viên
        - **name**: String, đại diện cho tên
        - **address**: đại diện cho địa chỉ
    - Các phương thức:
        - Phương thức khởi tạo mặc định, khởi tạo có thuộc tính
        - Các phương thức getter, setter
        - Phương thức toString

- Tạo interface **IManager** gồm các phương thức:
    - ArrayList\<Student> **getAll()**
    - boolean **add(Student s)**
    - boolean **edit(String masv, Student s)**
    - boolean **delete(String masv)**
    - ArrayList\<Student> **findByName(String name)**
    - ArrayList\<Student> **findByAddress(String address)**
    - Student **findByMasv(String masv)**
- Tạo class **StudentManager** implements **IManager**:
    - Định nghĩa lại các phương thức trong interface **IManager**
- Tạo class **Menu**:
    - Gồm các hàm và phương thức để thực hiện những chức năng của chương trình.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

<br>

**Tải File [StudentManager.zip](./StudentManagement.zip)**
<br>

Class **ConnectJDBC**
```java
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

```
<br>

Interface **IManager**

```java
package interfaces;

import java.util.ArrayList;

import models.Student;

public interface IManager {
	ArrayList<Student> getAll();
	boolean add(Student s);
	boolean edit(String masv, Student s);
	boolean delete(String masv);
	ArrayList<Student> findByName(String name);
	ArrayList<Student> findByAddress(String address);
	Student findByMasv(String masv);
}

```

<br>

Class **Student**

```java
package models;

import java.util.Scanner;

public class Student {
	private int id;
	private String masv;
	private String name;
	private String address;

	public Student() {
		this.id = 0;
		this.masv = "";
		this.name = "";
		this.address = "";
	}

	public Student(int id, String masv, String name, String address) {
		this.id = id;
		this.masv = masv;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", masv=" + masv + ", name=" + name + ", address=" + address + "]";
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Nhập mã sinh viên: ");
			this.masv = sc.nextLine();
			System.out.print("Nhập tên: ");
			this.name = sc.nextLine();
			System.out.print("Nhập địa chỉ: ");
			this.address = sc.nextLine();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMasv() {
		return masv;
	}

	public void setMasv(String masv) {
		this.masv = masv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
```

<br>

Class **StudentManager**

```java
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
			return ans;
		}
		return ans;
	}

	@Override
	public boolean add(Student s) {
		try {
			String query = "INSERT INTO student (masv, name, address) VALUES (?, ?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, s.getMasv());
			preparedStatement.setString(2, s.getName());
			preparedStatement.setString(3, s.getAddress());

			int rowsAffected = preparedStatement.executeUpdate();

			if (rowsAffected > 0) {
				return true;
			}
		} catch (SQLException e) {
			return false;
		}
		return false;
	}

	@Override
	public boolean edit(String masv, Student s) {
		try {
			String query = "UPDATE student SET masv=?, name=?, address=? WHERE masv=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, s.getMasv());
			preparedStatement.setString(2, s.getName());
			preparedStatement.setString(3, s.getAddress());
			preparedStatement.setString(4, masv);

			int rowsAffected = preparedStatement.executeUpdate();

			if (rowsAffected > 0) {
				return true;
			}
		} catch (SQLException e) {
			return false;
		}
		return false;
	}

	@Override
	public boolean delete(String masv) {
		try {
			String query = "DELETE FROM student WHERE masv=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, masv);
			int rowsAffected = preparedStatement.executeUpdate();
			if (rowsAffected > 0) {
				return true;
			}
		} catch (SQLException e) {
			return false;
		}
		return false;
	}

	@Override
	public ArrayList<Student> findByName(String name) {
		ArrayList<Student> result = new ArrayList<>();
		try {
			String query = "SELECT * FROM student WHERE name LIKE ?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
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
		} catch (SQLException e) {
			return result;
		}
		return result;
	}

	@Override
	public ArrayList<Student> findByAddress(String address) {
		ArrayList<Student> result = new ArrayList<>();
		try {
			String query = "SELECT * FROM student WHERE address LIKE ?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, "%" + address + "%");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String masv = resultSet.getString("masv");
				String name = resultSet.getString("name");
				Student student = new Student(id, masv, name, address);
				result.add(student);
			}
		} catch (SQLException e) {
			return result;
		}
		return result;
	}

	@Override
	public Student findByMasv(String masv) {
		Student result = null;
		try {
			String query = "SELECT * FROM student WHERE masv=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, masv);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");
				result = new Student(id, masv, name, address);
			}
		} catch (SQLException e) {
			return null;
		}
		return result;
	}

}
```

<br>

Class **Menu**

```java
package models;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private StudentManager manager;

	public Menu() {
		this.manager = new StudentManager();
	}

	public Menu(StudentManager manager) {
		this.manager = manager;
	}
	
	private int choice() {
		System.out.println();
		System.out.println("+----------- Menu -----------+");
		System.out.println("| 1. Xem danh sách sinh viên |");
		System.out.println("| 2. Thêm sinh viên          |");
		System.out.println("| 3. Sửa thông tin sinh viên |");
		System.out.println("| 4. Xoá sinh viên           |");
		System.out.println("| 5. Tìm kiếm sinh viên      |");
		System.out.println("| 6. Thoát                   |");
		System.out.println("+----------------------------+");
		System.out.print("Nhập lựa chọn của bạn: ");
		Scanner sc = new Scanner(System.in);
		try {
			return sc.nextInt();
		} catch (Exception e) {
			return 0;
		}
	}
	
	private int choice(int subChoice) {
		if (subChoice == 5) {
			System.out.println("+------ Tìm kiếm ------+");
			System.out.println("| 1. Theo mã sinh viên |");
			System.out.println("| 2. Theo tên          |");
			System.out.println("| 3. Theo địa chỉ      |");
			System.out.println("+----------------------+");
		}
		System.out.print("Nhập lựa chọn của bạn: ");
		Scanner sc = new Scanner(System.in);
		try {
			return sc.nextInt();
		} catch (Exception e) {
			return 0;
		}
	}
	
	public void displayAll() {
		ArrayList<Student> students = manager.getAll();
		displayArrayList(students);
	}
	
	public void addStudent() {
		Student student = new Student();
		student.input();
		boolean success = manager.add(student);
		if (success) {
			System.out.println("Thêm thành công");
		} else {
			System.out.println("Thêm thất bại");
		}
	}
	
	public void editStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập mã sinh viên của sinh viên cần sửa: ");
		String masv = sc.nextLine();
		Student student = manager.findByMasv(masv);
		if (student == null) {
			System.out.println("Mã sinh viên không đúng!");
			return;
		}
		
		Student newStudent = new Student();
		newStudent.input();
		
		boolean success = manager.edit(masv, newStudent);
		if (success)
			System.out.println("Sửa thành công");
		else
			System.out.println("Sửa thất bại");
	}
	
	public void deleteStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập mã sinh viên của sinh viên cần xoá: ");
		String masv = sc.nextLine();
		Student student = manager.findByMasv(masv);
		if (student == null) {
			System.out.println("Mã sinh viên không đúng!");
			return;
		}
		
		boolean success = manager.delete(masv);
		
		if (success)
			System.out.println("Xoá thành công");
		else
			System.out.println("Xoá thất bại");
		
	}
	
	public void searchStudent(int choice) {
		Scanner sc = new Scanner(System.in);
		boolean success;
		if (choice == 1) {
			System.out.print("Nhập mã sinh viên của sinh viên cần tìm kiếm: ");
			String masv = sc.nextLine();
			Student student = manager.findByMasv(masv);
			if (student != null) {
				System.out.println("Tìm kiếm thành công");
				System.out.println(student);
			} else {
				System.out.println("Không tìm thấy");
			}
		}
		
		if (choice == 2) {
			System.out.print("Nhập tên của sinh viên cần tìm kiếm: ");
			String name = sc.nextLine();
			ArrayList<Student> students = manager.findByName(name);
			displayArrayList(students);
		}
		
		if (choice == 3) {
			System.out.print("Nhập địa chỉ của sinh viên cần tìm kiếm: ");
			String address = sc.nextLine();
			ArrayList<Student> students = manager.findByAddress(address);
			displayArrayList(students);
		}
	}
	
	public void displayArrayList(ArrayList<Student> students) {
		if (students.size() == 0) {
			System.out.println("Danh sách rỗng");
		} else {
			System.out.println("Danh sách sinh viên");
			for (Student student: students)
				System.out.println(student);
		}
	}
	
	public void run() {
		int c, c2;
		do {
			c = choice();
			switch (c) {
				case 1: 
					displayAll();
					break;
				case 2:
					addStudent();
					break;
				case 3:
					editStudent();
					break;
				case 4:
					deleteStudent();
					break;
				case 5:
					c2 = choice(c);
					searchStudent(c2);
					break;
			}
		} while(c != 6);
		System.out.println("Kết thúc");
	}
	
	
}
```

<br>

Class **Main**

```java
package main;

import models.Menu;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu = new Menu();
		menu.run();
	}
}
```

**Tải File [StudentManager.zip](./StudentManagement.zip)**

</details>
<br>    
