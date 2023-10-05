<div align="center">

# Viết các phương thức trong lập trình hướng đối tượng
</div>

### Ví dụ 1
Tạo một **Class** để biểu diễn các đối tượng **Student** gồm các thuộc tính:
- **masv: String**, dùng dể đại diện cho mã sinh viên
- **name: String**, dùng dể đại diện cho tên của sinh viên
- **age: int**, dùng dể lưu đại diện cho tuổi của sinh viên

Viết các phương thức bao gồm phương thức khởi tạo mặc định, phương thức khởi tạo có thuộc tính và các phương thức **getter**, **setter** và **toString()**

Viết thêm các phương thức:
- **getYearOfBirth()** để lấy năm sinh của sinh viên
- **getUpperName()** để lấy tên sinh viên viết in hoa

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package model;

public class Student {
	private String masv;
	private String name;
	private int age;
	
	public Student() {
		this.masv = "";
		this.name = "";
		this.age = 0;
	}

	public Student(String masv, String name, int age) {
		this.masv = masv;
		this.name = name;
		this.age = age;
	}
	
	int getYearOfBirth() {
		return 2023 - age;
	}
	
	String getUpperName() {
		return name.toUpperCase();
	}

	@Override
	public String toString() {
		return "Student [masv=" + masv + ", name=" + name + ", age=" + age + "]";
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Student student = new Student("23IT111", "Hùng", 18);
		System.out.println(student);
		System.out.println("Năm sinh: " + student.getYearOfBirth());
		System.out.println("Tên viết hoa: " + student.getUpperName());
	}
}
```

</details>
<br>

### Ví dụ 2
Tạo một **Class** để biểu diễn các đối tượng **Rectangle** gồm các thuộc tính:
- **width: double**, dùng dể đại diện cho chiều rộng của hình chữ nhật
- **height: double**, dùng dể đại diện cho chiều dài của hình chữ nhật

Hãy viết các phương thức:  phương thức khởi tạo mặc định, phương thức khởi tạo có thuộc tính và các phương thức **getter**, **setter** và **toString()**

Viết thêm các phương thức cho Rectangle:
- **getArea()** để lấy diện tích của hình chữ nhật
- **getPerimeter()** để lấy chu vi của hình chữ nhật
- **isSquare()** để kiểm tra hình chữ nhật có phải hình vuông không


<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Chưa có bài giải.<br> Nếu cần thiết có thể liên hệ facebook [Phan Đức Hải](https://www.facebook.com/chiatayde)

</details>
<br>

### Ví dụ 3
Tạo một **Class** để biểu diễn các đối tượng **Circle** gồm các thuộc tính:
- **radius: double**, dùng dể đại diện cho bán kính của hình tròn

Hãy viết các phương thức: phương thức khởi tạo mặc định, phương thức khởi tạo có thuộc tính và các phương thức **getter**, **setter**  và **toString()**

Viết them các phương thức cho Circle:
- **getArea()** để lấy diện tích của hình tròn
- **getPerimeter()** để lấy chu vi của hình tròn

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Chưa có bài giải.<br> Nếu cần thiết có thể liên hệ facebook [Phan Đức Hải](https://www.facebook.com/chiatayde)

</details>
<br>

### Ví dụ 4
Tạo một **Class** để biểu diễn các đối tượng **Triangle** gồm các thuộc tính:
- **sideA: double**, dùng dể đại diện cho cạnh thứ nhất của hình tam giác
- **sideB: double**, dùng dể đại diện cho cạnh thứ hai của hình tam giác
- **sideC: double**, dùng dể đại diện cho cạnh thứ ba của hình tam giác

Hãy viết các phương thức: phương thức khởi tạo mặc định, phương thức khởi tạo có thuộc tính và các phương thức **getter**, **setter**  và **toString()**

Viết thêm các phương thức cho Triangle:
- **getArea()** để lấy diện tích của hình tam giác
- **getPerimeter()** để lấy chu vi của hình tam giác
- **isIsoscelesTriangle()** để kiểm tra hình tam giác có cân không
- **isEquilateralTriangle()** để kiểm tra hình tam giác có đều không
- isRightTriangle() để kiểm tra hình tam giác có vuông không
- set(sideA, sideB, sideC) để thay đổi giá trị của 3 cạnh cùng 1 lúc

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Chưa có bài giải.<br> Nếu cần thiết có thể liên hệ facebook [Phan Đức Hải](https://www.facebook.com/chiatayde)

</details>
<br>

### Ví dụ 5
Tạo một **Class** để biểu diễn các đối tượng **Square** gồm các thuộc tính:
- **side: double**, dùng dể đại diện cho cạnh của hình vuông

Hãy viết các phương thức: phương thức khởi tạo mặc định, phương thức khởi tạo có thuộc tính và các phương thức **getter**, **setter** và **toString()**

Viết thêm các phương thức cho Square:
- **getArea()** để lấy diện tích của hình vuông
- **getPerimeter()** để lấy chu vi của hình vuông
- **isIntegerSquareSide()** cho kiểm tra độ dài của hình vuông có phải là số nguyên không.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Chưa có bài giải.<br> Nếu cần thiết có thể liên hệ facebook [Phan Đức Hải](https://www.facebook.com/chiatayde)

</details>
<br>

### Ví dụ 6
Tạo một **Class** để biểu diễn các đối tượng **Animal** gồm các thuộc tính:
- **name: String**, dùng dể đại diện cho tên của động vật
- **color: String**, dùng dể đại diện cho màu của động vật
- **age: int**, dùng dể lưu đại diện cho tuổi của động vật

Hãy viết các phương thức: phương thức khởi tạo mặc định, phương thức khởi tạo có thuộc tính và các phương thức **getter**, **setter** và **toString()**

Viết thêm các phương thức cho Animal:
- **getYearOfBirth()** để lấy năm sinh của động vật
- **equalsColor(Animal a)** để kiểm tra 2 động vật có màu sắc giống nhau hay không.
- **increaseAge()** để tăng tuổi của động vật lên 1.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Chưa có bài giải.<br> Nếu cần thiết có thể liên hệ facebook [Phan Đức Hải](https://www.facebook.com/chiatayde)

</details>
<br>

### Ví dụ 7
Tạo một **Class** để biểu diễn các đối tượng **Car** gồm các thuộc tính:
- **color: String**, dùng dể đại diện cho màu của xe
- **name: String**, dùng dể đại diện cho màu của xe
- **seatingCapacity: int**, dùng dể lưu đại diện cho số ghế của xe
- **year: int**, dùng dể lưu đại diện cho năm sản xuất của xe

Hãy viết các phương thức: phương thức khởi tạo mặc định, phương thức khởi tạo có thuộc tính và các phương thức **getter**, **setter** và **toString()**

Viết thêm các phương thức cho Car:
- **getAge()** để lấy tuổi thọ của xe

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Chưa có bài giải.<br> Nếu cần thiết có thể liên hệ facebook [Phan Đức Hải](https://www.facebook.com/chiatayde)

</details>
<br>

### Ví dụ 8
Tạo một **Class** để biểu diễn các đối tượng **Product** gồm các thuộc tính:
- **name: String**, dùng dể đại diện cho tên của sản phẩm
- **price: double**, dùng dể đại diện cho giá của sản phẩm
- **quantity: int**, dùng dể lưu đại diện cho số lượng của sản phẩm

Hãy viết các phương thức: phương thức khởi tạo mặc định, phương thức khởi tạo có thuộc tính và các phương thức **getter**, **setter** và **toString()**

Viết thêm các phương thức cho Product:
- **getTotalPrice()** để lấy tổng giá trị của sản phẩm
- **increaseQuantity()** để tăng số lượng của sản phẩm lên 1
- **decreaseQuantity()** để giảm số lượng của sản phẩm lên 1

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Chưa có bài giải.<br> Nếu cần thiết có thể liên hệ facebook [Phan Đức Hải](https://www.facebook.com/chiatayde)

</details>
<br>

### Ví dụ 9
Tạo một **Class** để biểu diễn các đối tượng **Player** gồm các thuộc tính:
- **name: String**, dùng dể đại diện cho tên của người chơi
- **age: int**, dùng dể lưu đại diện cho tuổi của người chơi
- **score: int**, dùng dể đại diện cho điểm số của người chơi
- **positionX: int**, dùng dể đại diện cho vi trí X của người chơi
- **positionY: int**, dùng dể đại diện cho vi trí Y của người chơi

Hãy viết các phương thức: phương thức khởi tạo mặc định, phương thức khởi tạo có thuộc tính và các phương thức **getter**, **setter** và **toString()**

Viết thêm các phương thức cho Player:
- **getScore()** để lấy điểm số của người chơi
- **increaseScore()** để tăng điểm số của người chơi lên 1
- **decreaseScore()** để giảm điểm số của người chơi lên 1
- **increaseScore(int n)** để tăng điểm số của người chơi lên n điểm
- **decreaseScore(int n)** để giảm điểm số của người chơi lên n điểm
- **isWinner()** để kiểm tra người chơi có thể thắng hay không, người chơi thắng khi điểm lớn hơn hoặc bằng 100


<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Chưa có bài giải.<br> Nếu cần thiết có thể liên hệ facebook [Phan Đức Hải](https://www.facebook.com/chiatayde)

</details>
<br>

### Ví dụ 10
Tạo một **Class** để biểu diễn các đối tượng **Game** gồm các thuộc tính:
- **id: int**, dùng dể lưu đại diện cho ID của game
- **player1: Player**, dùng dể lưu đại diện cho người chơi 1
- **player2: Player**, dùng dể lưu đại diện cho người chơi 2

*Lưu ý: hãy sử dụng class **Player** được tạo ở ví dụ 9*

Hãy viết các phương thức: phương thức khởi tạo mặc định, phương thức khởi tạo có thuộc tính và các phương thức **getter**, **setter** và **toString()**

Viết thêm các phương thức cho Game:
- **getWinner()** để lấy người chơi chiến thắng, nếu cả 2 người thắng thì đưa ra người chơi 1, nếu cả 2 chưa thắng thì trả về null.
- **resetGame()** thiết lập lại điểm số của 2 người chơi là 0
- **swapPlayers()** hoán đổi 2 người chơi

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Chưa có bài giải.<br> Nếu cần thiết có thể liên hệ facebook [Phan Đức Hải](https://www.facebook.com/chiatayde)

</details>
<br>

### Ví dụ 11
Tạo một **Class** để biểu diễn các đối tượng **Student** gồm các thuộc tính:
- **masv: String**, dùng dể đại diện cho mã sinh viên
- **name: String**, dùng dể đại diện cho tên của sinh viên
- **age: int**, dùng dể lưu đại diện cho tuổi của sinh viên

Viết các phương thức bao gồm phương thức khởi tạo mặc định, phương thức khởi tạo có thuộc tính và các phương thức **getter**, **setter** và **toString()**

Viết thêm các phương thức:
- **input()** cho phép nhập các thuộc tính của Student từ bàn phím

<!-- <details> -->
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package model;

import java.util.Scanner;

public class Student {
	private String masv;
	private String name;
	private int age;

	public Student() {
		this.masv = "";
		this.name = "";
		this.age = 0;
	}

	public Student(String masv, String name, int age) {
		this.masv = masv;
		this.name = name;
		this.age = age;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Masv: ");
		this.masv = sc.nextLine();
		System.out.print("Name: ");
		this.name = sc.nextLine();
		System.out.print("Age: ");
		this.age = sc.nextInt();
	}

	@Override
	public String toString() {
		return "Student [masv=" + masv + ", name=" + name + ", age=" + age + "]";
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.input();
		System.out.println(student);
		
		Student student2 = new Student();
		student2.input();
		System.out.println(student2);
	}
}
```
</details>
<br>

### Ví dụ 12
Tạo một **Class** để biểu diễn các đối tượng **Book** gồm các thuộc tính:
- **name: String**, dùng dể đại diện cho tên của sách
- **price: double**, dùng dể đại diện cho giá của sách
- **quantity: int**, dùng dể lưu đại diện cho số lượng của sách

Viết các phương thức bao gồm phương thức khởi tạo mặc định, phương thức khởi tạo có thuộc tính và các phương thức **getter**, **setter** và **toString()**

Viết thêm các phương thức:
- **input()** cho phép nhập các thuộc tính của Book từ bàn phím

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Chưa có bài giải.<br> Nếu cần thiết có thể liên hệ facebook [Phan Đức Hải](https://www.facebook.com/chiatayde)

</details>
<br>

### Ví dụ 13

Từ class **Book** ở **Ví dụ 12** hãy nhập vào thông tin của **N** quyển sách, sau đó:
- In ra thông tin của N cuốn sách vừa nhập
- In ra thông tin những cuốn sách có giá cao nhất
- In ra thông tin những cuốn sách có tên là "Java OOP"
- Sắp xếp danh sách tăng dần thêm **quantity**
- Sắp xếp danh sách giảm dần theo **price**

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Chưa có bài giải.<br> Nếu cần thiết có thể liên hệ facebook [Phan Đức Hải](https://www.facebook.com/chiatayde)

</details>
<br>
