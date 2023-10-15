<div align="center">

# Tính kế thừa trong lập trình hướng đối tượng
</div>

### Ví dụ 1

Tạo class **ElectronicDevice** đùng để biểu diễn cho các thiết bị điện tử. <br>Bao gồm:
- Các thuộc tính:
    **manufacturer**: String, dùng để đại diện cho nhà sản xuất của thiết bị điện tử.
    **price**: long, dùng để đại diện cho giá của thiết bị điện tử.
- Các phương thức:
    - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính.
    - Các phương thức **getter**, **setter** và **toString()**
    - Phương thức **input()** cho phép nhập thông tin của thiết bị điện tử đó.

Tạo class **Laptop** dùng để biểu diễn các máy tính xách tay. Kế thừa class **ElectronicDevice**<br>Bao gồm:
- Các thuộc tính:
    - **screenSize**: String, dùng để đại diện cho kích thước màn hình của máy tính xách tay đó.
- Các phương thức:
     - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính.
    - Các **getter** và **setter** cho các thuộc tính **color** va **breed**
    - Ghi đè lại phương thức **toString()** và **input()**


<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>
<br>

**ElectronicDevice.java**
 
```java
package model;

import java.util.Scanner;

public class ElectronicDevice {
	private String manufacturer;
	private long price;
	
	public ElectronicDevice() {
		this.manufacturer = "";
		this.price = 0;
	}
	
	public ElectronicDevice(String manufacturer, long price) {
		this.manufacturer = manufacturer;
		this.price = price;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Manufacturer: ");
		this.manufacturer = sc.nextLine();
		System.out.print("Price: ");
		this.price = sc.nextLong();
	}
	
	public String toString() {
		return "ElectronicDevice [manufacturer = " + manufacturer + ", price = " + price + "]";
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
}
```
<br>

**Laptop.java**

```java
package model;

import java.util.Scanner;

public class Laptop extends ElectronicDevice{
	private String screenSize;
	
	public Laptop() {
		super();
		this.screenSize = "";
	}
	
	public Laptop(String manufacturer, long price, String screenSize) {
		super(manufacturer, price);
		this.screenSize = screenSize;
	}
	
	public String toString() {
		return "Laptop [manufacturer = " + super.getManufacturer() + ", price = " + super.getPrice() + ", screenSize = " + screenSize + "]"; 
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.print("Screen Size: ");
		this.screenSize = sc.nextLine();
		
	}

	public String getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
}
```
<br>

**Test.java**

```java
package model;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectronicDevice laptop = new Laptop();
		laptop.input();
		System.out.println(laptop);
	}
}

```

</details>
<br>
      

### Ví dụ 2

Tạo class **Animal** để biểu diễn tập hợp các động vật.<br> Bao gồm:
- Các thuộc tính
    - **name**: String, dùng để đại diện cho tên của động vật đó
    - **age**: int, dùng để đại diện cho tuổi của động vật đó.
- Các phương thức
    - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính.
    - Các phương thức **getter**, **setter** và **toString()**
    - Phương thức **input()** cho phép nhập thông tin của động vật đó.
    - **getYearOfBirth()**: Lấy năm sinh của động vật đó.

Tạo class **Cat** để biểu diễn cho tập hợp mèo. Kế thừa class **Animal**.<br> Bao gồm:
- Các thuộc tính
    - **color**: String, dùng để đại diện cho màu lông của con mèo
    - **breed**: String, dùng để đại diện cho giới tính của mèo
- Các phương thức:
    - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính.
    - Các **getter** và **setter** cho các thuộc tính **color** va **breed**
    - Ghi đè lại phương thức **toString()**
    - Phương thức **equalBreed(Cat c)** kiểm tra xem 2 con mèo các cùng giới tính không?

**Thực hiện các hành động sau:**
- Khởi tạo thông tin 2 con mèo
- In ra thông tin 2 con mèo đó
- In ra năm sinh của con mèo thứ 2
- Kiểm tra xem 2 con mèo có cùng giới tính không


<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>
<br>

**Animal.java**

```java
package model.animal;

import java.time.LocalDate;

public class Animal {
	private String name;
	private int age;

	public Animal() {
		this.name = "";
		this.age = 0;
	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int getYearOfBirth() {
		// Lấy năm hiện tại
		LocalDate date = LocalDate.now();
		int year = date.getYear();
		
		return year - age;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
```

<br>

**Cat.java**

```java
package model.animal;

public class Cat extends Animal {
	private String color;
	private String breed;

	public Cat() {
		super();
		this.color = "";
		this.breed = "";
	}

	public Cat(String name, int age, String color, String breed) {
		super(name, age);
		this.color = color;
		this.breed = breed;
	}
	
	public boolean equalBreed(Cat c) {
		String breed1 = this.breed;
		String breed2 = c.getBreed();
		return breed1.equals(breed2);
	}

	@Override
	public String toString() {
		return "Cat [name=" + super.getName() + ", age=" + super.getAge() + ", color=" + color + ", breed=" + breed
				+ "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

}
```

<br>

**Main.java**

```java
package model.animal;

public class Main {
	public static void main(String[] args) {
		Animal cat1 = new Cat("Cat 1", 1, "black", "male");
		Animal cat2 = new Cat("Cat 2", 2, "white", "female");
		
		System.out.println(cat1);
		System.out.println(cat2);
		
		boolean equals = ((Cat)cat1).equalBreed((Cat)cat2);
		
		if (equals)
			System.out.println(cat1.getName() + " cùng giống loài với " + cat2.getName());
		else
			System.out.println(cat1.getName() + " không cùng giống loài với " + cat2.getName());
	}
}
```

</details>
<br>

### Ví dụ 3

Tạo class **Person** để biểu diễn tập hơn nhiều đối tượng người.<br> Bao gồm:
- Các thuộc tính
    - **name**: String, dùng để đại diện cho tên của người đó
    - **age**: int, dùng để đại diện cho tuổi của người đó
    - **address** : String, dùng để đại diện cho địa chỉ của người đó.

- Các phương thức
    - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính.
    - Các phương thức **getter**, **setter** và **toString()**
    - Phương thức **input()** cho phép nhập thông tin của người đó.
    - **getYearOfBirth()**: Lấy năm sinh của người đó.
    - **getUpperName()**: Lấy tên in hoa của người đó.
    - **checkAge(int n)**: Kiểm tra xem người đó đã đủ **n** tuổi chưa.

Tạo class **Student** để biểu diễn tập hơn nhiều đối tượng người. Kế thừa lớp **Person**<br> Bao gồm thêm:
- Các thuộc tính
    - **studentId**: String, dùng để đại diện cho mã sinh viên của người đó
    - **nameSchool**: String, dùng để đại diện cho tên trường học của sinh viên đó.
- Các phương thức
    - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính.
    - Các **getter** và **setter** cho các thuộc tính **studentId** và **nameSchool**
    - Ghi đè lại phương thức **toString()** và **input()**
    - Phương thức **checkStudentId()** kiểm tra xem sinh viên đó có mã sinh viên bắt đầu bằng **23IT** không?

**Thực hiện các hoạt động sau:**
- Cho phéo nhập vào một đối tương sinh viên.
- In ra thông tính của sinh viên đó.
- Kiểm tra xem sinh viên đó có đủ **18** tuổi không?
- In ra tên viên hoa của sinh viên đó.
- Kiểm tra sinh viên đó có phải có mã sinh viên bắt đầu bằng **23IT** không?

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

<br>

**Person.java**

```java
package model.person;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	private String address;

	public Person() {
		this.name = "";
		this.age = 0;
		this.address = "";
	}

	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập Name: ");
		this.name = sc.nextLine();
		System.out.print("Nhập Age: ");
		this.age = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhập Address: ");
		this.address = sc.nextLine();
	}
	
	public int getYearOfBirth() {
		LocalDate date = LocalDate.now();
		int nowYear = date.getYear();
		return nowYear - age;
	}
	
	public String getUpperName() {
		return name.toUpperCase();
	}
	
	public boolean checkAge(int n) {
		return age >= n;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

**Student.java**

```java
package model.person;

import java.util.Scanner;

public class Student extends Person {
	private String studentId;
	private String nameSchool;

	public Student() {
		super();
		this.studentId = "";
		this.nameSchool = "";
	}

	public Student(String name, int age, String address, String studentId, String nameSchool) {
		super(name, age, address);
		this.studentId = studentId;
		this.nameSchool = nameSchool;
	}

	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập StudentId: ");
		this.studentId = sc.nextLine();
		System.out.print("Nhập NameSchool: ");
		this.nameSchool = sc.nextLine();
	}
	
	public boolean checkStudentId() {
		return this.studentId.startsWith("23IT");
	}

	@Override
	public String toString() {
		return "Student [name=" + super.getName() + ", age=" + super.getAge() + ", address=" + super.getAddress()
				+ ", studentId=" + studentId + ", nameSchool=" + nameSchool + "]";
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getNameSchool() {
		return nameSchool;
	}

	public void setNameSchool(String nameSchool) {
		this.nameSchool = nameSchool;
	}

}
```

<br>

**Main.java**

```java
package model.person;

public class Main {
	public static void main(String[] args) {
		Person person = new Student();
		
		// Nhập thông tin sinh viên
		person.input();
		
		// In ra thông tin sinh viên
		System.out.println(person);
		
		// Kiểm tra sinh viên đủ 18 tuổi chưa
		int age = 18;
		if (person.checkAge(age))
			System.out.println(person.getName() + " đã đủ " + age + " tuổi");
		else
			System.out.println(person.getName() + " chưa đủ " + age + " tuổi");
		
		// In ra tên viết hoa
		System.out.println("Tên viết hoa: " + person.getUpperName());
		
		// Kiếm tra mã sinh viên có bắt đầu bằng 23IT không
		if (((Student)person).checkStudentId())
			System.out.println("Sinh viên " + person.getName() + " có mã sinh viên là " + ((Student)person).getStudentId() +
					" bắt đầu bằng 23IT");
		else
			System.out.println("Sinh viên " + person.getName() + " có mã sinh viên là " + ((Student)person).getStudentId() +
					" không bắt đầu bằng 23IT");
		
	}
}
```

</details>
<br>

### Ví dụ 4

Tạo class **Rectangle** dùng để biểu diễn cho các hình chữ nhật. <br> Bao gồm:
- Các thuộc tính:
    - **width**: float, đại diện co chiều rộng của hình chữ nhật.
    - **height**: float, đại diện cho chiều dài cho hình chữ nhật
- Các phương thức:
     - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính.
    - Các phương thức **getter**, **setter** và **toString()**
    - Phương thức **input()** cho phép nhập thông tin của hình chữ nhật.
    - Phương thức **getArea()** để lấy diện tích của hình chữ nhật
    - Phương thức **getPerimeter()** để lấy chu vi của hình chữ nhật

Tạo class **Square** dùng để biểu diễn các hình vuông, kế thừa lớp **Rectangle**.<br> Bao gồm:
- Các phương thức:
    - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính.
    - Các **getter** và **setter** cho các thuộc tính **side**
    - Ghi đè lại phương thức **toString()** và **input()**

**Thực hiện các thao tác sau từ trên xuông dưới:**
- Khởi tạo một hình vuông có kích thước là 10
- In ra thông tin của hình vuông.
- In ra chu vi của hình vuông.
- In ra diện tích của hình vuông.
- Sửa lại kích thước hinh vuông là 20
- In ra thông tin của hình vuông.
- In ra chu vi của hình vuông.
- In ra diện tích của hình vuông.
- Nhập vào thông tin một hình vuông
- In ra chu vi của hình vuông.
- In ra diện tích của hình vuông.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

<br>

***Rectangle.java**
```java
package model.reactangle;

import java.util.Scanner;

public class Rectangle {
	private float width;
	private float height;

	public Rectangle() {
		this.width = 0;
		this.height = 0;
	}

	public Rectangle(float width, float height) {
		this.width = width;
		this.height = height;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập Width: ");
		this.width = sc.nextFloat();
		System.out.print("Nhập Height: ");
		this.height = sc.nextFloat();
	}
	
	public float getArea() {
		return width * height;
	}
	
	public float getPerimeter() {
		return 2 * (width + height);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

}
```

<br>

**Square.java**
```java
package model.reactangle;

import java.util.Scanner;

public class Square extends Rectangle{

	public Square() {
		super();
	}

	public Square(float side) {
		super(side, side);
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập Side: ");
		float side = sc.nextFloat();
		this.setSide(side);
	}
	
	public String toString() {
		return "Square [side=" + super.getWidth() + "]";
	}
	
	public float getSide() {
		return super.getWidth();
	}
	
	public void setSide(float side) {
		super.setHeight(side);
		super.setWidth(side);
	}
	
}
```

<br>

**Main.java**
```java
package model.reactangle;

public class Main {
	public static void main(String[] args) {
		System.out.println("Kích thước 10");
		Rectangle square = new Square(10);
		System.out.println(square);
		System.out.println("Chu vi: " + square.getPerimeter());
		System.out.println("Diện tích: " + square.getArea());
		
		System.out.println("\nKích thước 20");
		((Square)square).setSide(20);
		System.out.println(square);
		System.out.println("Chu vi: " + square.getPerimeter());
		System.out.println("Diện tích: " + square.getArea());
		
		System.out.println("\nNhập thông tin");
		square.input();
		System.out.println("Chu vi: " + square.getPerimeter());
		System.out.println("Diện tích: " + square.getArea());
	}
}

```

</details>
<br>

### Ví dụ 5

Tạo class **User** dùng để biểu diễn các người dùng trong hệ thống. <br> Bao gồm:
- Các thuộc tính:
    - **userId**: String, dùng của diện id của người dùng.
    - **username**: String, dùng đại diện cho tên đăng nhập của người dùng.
    - **password**: String, dùng đại diện cho mật khẩu của người dùng.
    - **email**: String, dùng đại diện cho email của người dùng.
- Các phương thức:
    - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính.
    - Các phương thức **getter**, **setter** và **toString()**
    - Phương thức **input()** cho phép nhập thông tin của người dùng.

Tạo class **Customer** dùng để biểu diễn các khách hành, kế thừa class **User**.<br> Bao gồm:
- Các thuộc tính
    - **shippingAddress**: String, dùng đại diện cho địa chỉ nhân hàng.
- Các phương thức:
    - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính.
    - Các **getter** và **setter** cho các thuộc tính **shippingAddress**
    - Ghi đè lại phương thức **toString()** và **input()**

Tạo class **Admin** dùng để biểu diễn các người quản lí, kế thừa class **User**.<br> Bao gồm:

- Các thuộc tính:
    **permissions**: ArrayList<String>, danh sách các quyền của người quản lí đó.
- Các phương thức:
    - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính.
    - Các **getter** và **setter** cho các thuộc tính **permissions**
    - Ghi đè lại phương thức **toString()** và **input()**

**Tạo một Menu và chương trình có các tính năng như sau**
1. Thêm 1 **User**
    1.1. Thêm 1 **Customer**
    1.2. Thêm 1 **Admin**
2. In ra danh sách tất cả **User**
3. Sắp xếp các **User** sao cho các **Admin** ở trên các **Customer**
4. Đăng nhập (Nhập và **username** và **password**, kiểm tra xem tài khoản này có thể đăng nhập không, nếu có thể in ra User đang đăng nhập).

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

<br>

**User.java**
```java
package model.user;

import java.util.Scanner;

public class User {
	private String userId;
	private String username;
	private String password;
	private String email;

	public User() {
		this.userId = "";
		this.username = "";
		this.password = "";
		this.email = "";
	}

	public User(String userId, String username, String password, String email) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập UserId: ");
		this.userId = sc.nextLine();
		System.out.print("Nhập Username: ");
		this.username = sc.nextLine();
		System.out.print("Nhập Password: ");
		this.password = sc.nextLine();
		System.out.print("Nhập Email: ");
		this.email = sc.nextLine();
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email
				+ "]";
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
```
<br>

**Customer.java**
```java
package model.user;

import java.util.Scanner;

public class Customer extends User {
	private String shippingAddress;

	public Customer() {
		super();
		this.shippingAddress = "";
	}

	public Customer(String userId, String username, String password, String email, String shippingAddress) {
		super(userId, username, password, email);
		this.shippingAddress = shippingAddress;
	}

	@Override
	public String toString() {
		return "Customer [userId=" + super.getUserId() + ", username=" + super.getUsername() + ", password="
				+ super.getPassword() + ", email=" + super.getEmail() + ", shippingAddress=" + shippingAddress + "]";
	}

	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập Shipping Address: ");
		this.shippingAddress = sc.nextLine();
	}

}
```

<br>

**Admin.java**
```java
package model.user;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User {
	private ArrayList<String> permissions;

	public Admin() {
		super();
		this.permissions = new ArrayList<>();
	}

	public Admin(String userId, String username, String password, String email, ArrayList<String> permissions) {
		super(userId, username, password, email);
		this.permissions = permissions;
	}
	
	@Override
	public String toString() {
		return "Admin [userId=" + super.getUserId() + ", username=" + super.getUsername() + ", password="
				+ super.getPassword() + ", email=" + super.getEmail() + ", permissions=" + permissions + "]";
	}
	
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số lượng quyền: ");
		int numberPermissions = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= numberPermissions; i++) {
			System.out.print("Quyền thứ nhất " + i + ": ");
			permissions.add(sc.nextLine());
		}
	}

	public ArrayList<String> getPermissions() {
		return permissions;
	}

	public void setPermissions(ArrayList<String> permissions) {
		this.permissions = permissions;
	}

}
```

<br>

**UserManager.java**
```java
package model.user;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UserManager {
	private ArrayList<User> users;

	public UserManager() {
		this.users = new ArrayList<>();
	}

	public UserManager(ArrayList<User> users) {
		this.users = users;
	}
	
	public void add(User user) {
		for (User u: users)
			if (u.getUserId().equals(user.getUserId())) {
				System.out.println("UserID đã tồn tại, chưa thể thêm");
				return;
			}
		users.add(user);
	}
	
	public void showUsers() {
		for (int i = 0; i < users.size(); i++)
			System.out.println(users.get(i));
	}
	
	public void sortUsers() {
		Collections.sort(users, new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				// TODO Auto-generated method stub
				if (o1 instanceof Customer && o2 instanceof Admin)
					return 1;
				return -1;
			}
		});
	}
	
	public User login(String username, String password) {
		for (int i = 0; i < users.size(); i++) {
			User user = users.get(i);
			String u = user.getUsername();
			String p = user.getPassword();
			if (u.equals(username) && p.equals(password))
				return user;
		}
		return null;
			
	}

	@Override
	public String toString() {
		return "UserManager [users=" + users + "]";
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

}
```

<br>

**Menu.java**
```java
package model.user;

import java.util.Scanner;

public class Menu {
	UserManager manager;
	
	public Menu() {
		manager = new UserManager();
	}
	
	public int choice() {
		System.out.println("+----------- Menu ----------+");
		System.out.println("| 1. Thêm User              |");
		System.out.println("| 2. In ra danh sách User   |");
		System.out.println("| 3. Sắp xếp danh sách User |");
		System.out.println("| 4. Đăng nhập              |");
		System.out.println("| 5. Thoát                  |");
		System.out.println("+---------------------------+");
		System.out.print("Nhập lựa chọn: ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public int choiceSub() {
		System.out.println("+---- Thêm User ---+");
		System.out.println("| 1. Thêm Admin    |");
		System.out.println("| 2. Thêm Customer |");
		System.out.println("+------------------+");
		System.out.print("Nhập lựa chọn: ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public void run() {
		int c1, c2;
		User u;
		Scanner sc = new Scanner(System.in);
		do {
			c1 = choice();
			switch (c1) {
				case 1:
					c2 = choiceSub();
					switch (c2) {
						case 1:
							u = new Admin();
							u.input();
							manager.add(u);
							break;
						case 2:
							u = new Customer();
							u.input();
							manager.add(u);
							break;
							
					}
					break;
				case 2:
					System.out.println("\nDanh sách người dùng");
					manager.showUsers();
					break;
				case 3:
					manager.sortUsers();
					System.out.println("Đã sắp xếp danh sách");
					break;
				case 4:
					System.out.print("Nhập Username: ");
					String username = sc.nextLine();
					System.out.print("Nhập Password: ");
					String password = sc.nextLine();
					User user = manager.login(username, password);
					if (user != null) {
						System.out.println("Đăng nhập thành công!");
						System.out.println(user);
					} else {
						System.out.println("Tài khoản hoặc mật khẩu không đúng.");
					}
					break;
			}
		} while(c1 != 5);
		System.out.println("Kết thúc");
	}
}

```

<br>

**Main.java**
```java
package model.user;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu = new Menu();
		menu.run();
	}

}
```
</details>
<br>