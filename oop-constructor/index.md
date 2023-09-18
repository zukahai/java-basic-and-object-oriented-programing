<div align="center">

# Hàm khởi tạo trong OOP
</div>

### Ví dụ 1
Tạo một **Class** để biểu diễn các đối tượng **Student(String masv, String name, int age)**

Bao gồm hàm khởi tạo mặc định, hàm khởi tạo có thuộc tính và các hàm **getter**, **setter** và **toString()**

**Code mẫu**

```Java
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
}
```

### Ví dụ 2
Tạo một **Class** để biểu diễn các đối tượng Rectangle(double width, double height)

Bao gồm hàm khởi tạo mặc định, hàm khởi tạo có thuộc tính và các hàm **getter**, **setter** và **toString()**

### Ví dụ 3
Tạo một **Class** để biểu diễn các đối tượng Circle(double radius)

Bao gồm hàm khởi tạo mặc định, hàm khởi tạo có thuộc tính và các hàm **getter**, **setter**  và **toString()**

### Ví dụ 4
Tạo một **Class** để biểu diễn các đối tượng Triangle(double sideA, double sideB, double sideC)

Bao gồm hàm khởi tạo mặc định, hàm khởi tạo có thuộc tính và các hàm **getter**, **setter**  và **toString()**

### Ví dụ 5
Tạo một **Class** để biểu diễn các đối tượng Square(double side)

Bao gồm hàm khởi tạo mặc định, hàm khởi tạo có thuộc tính và các hàm **getter**, **setter** và **toString()**

### Ví dụ 6
Tạo một **Class** để biểu diễn các đối tượng Animal(String name, String color, int age)

Bao gồm hàm khởi tạo mặc định, hàm khởi tạo có thuộc tính và các hàm **getter**, **setter** và **toString()**
