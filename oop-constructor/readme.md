<div align="center">

# Phương thức khởi tạo trong OOP
</div>

### Ví dụ 1
Tạo một **Class** để biểu diễn các đối tượng **Student** gồm các thuộc tính:
- masv: String, dùng dể đại diện cho mã sinh viên
- name: String, dùng dể đại diện cho tên của sinh viên
- age: int, dùng dể lưu đại diện cho tuổi của sinh viên

Viết các phương thức bao gồm phương thức khởi tạo mặc định, phương thức khởi tạo có thuộc tính và các phương thức **getter**, **setter** và **toString()**

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

</details>
<br>

### Ví dụ 2
Tạo một **Class** để biểu diễn các đối tượng **Rectangle** gồm các thuộc tính:
- width: double, dùng dể đại diện cho chiều rộng của hình chữ nhật
- height: double, dùng dể đại diện cho chiều dài của hình chữ nhật

Hãy viết các phương thức:  phương thức khởi tạo mặc định, phương thức khởi tạo có thuộc tính và các phương thức **getter**, **setter** và **toString()**

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Chưa có bài giải.<br> Nếu cần thiết có thể liên hệ facebook [Phan Đức Hải](https://www.facebook.com/chiatayde)

</details>
<br>

### Ví dụ 3
Tạo một **Class** để biểu diễn các đối tượng **Circle** gồm các thuộc tính:
- radius: double, dùng dể đại diện cho bán kính của hình tròn

Hãy viết các phương thức: phương thức khởi tạo mặc định, phương thức khởi tạo có thuộc tính và các phương thức **getter**, **setter**  và **toString()**

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Chưa có bài giải.<br> Nếu cần thiết có thể liên hệ facebook [Phan Đức Hải](https://www.facebook.com/chiatayde)

</details>
<br>

### Ví dụ 4
Tạo một **Class** để biểu diễn các đối tượng **Triangle** gồm các thuộc tính:
- sideA: double, dùng dể đại diện cho cạnh thứ nhất của hình tam giác
- sideB: double, dùng dể đại diện cho cạnh thứ hai của hình tam giác
- sideC: double, dùng dể đại diện cho cạnh thứ ba của hình tam giác

Hãy viết các phương thức: phương thức khởi tạo mặc định, phương thức khởi tạo có thuộc tính và các phương thức **getter**, **setter**  và **toString()**

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Chưa có bài giải.<br> Nếu cần thiết có thể liên hệ facebook [Phan Đức Hải](https://www.facebook.com/chiatayde)

</details>
<br>

### Ví dụ 5
Tạo một **Class** để biểu diễn các đối tượng **Square** gồm các thuộc tính:
- side: double, dùng dể đại diện cho cạnh của hình vuông

Hãy viết các phương thức: phương thức khởi tạo mặc định, phương thức khởi tạo có thuộc tính và các phương thức **getter**, **setter** và **toString()**

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Chưa có bài giải.<br> Nếu cần thiết có thể liên hệ facebook [Phan Đức Hải](https://www.facebook.com/chiatayde)

</details>
<br>

### Ví dụ 6
Tạo một **Class** để biểu diễn các đối tượng **Animal** gồm các thuộc tính:
- name: String, dùng dể đại diện cho tên của động vật
- color: String, dùng dể đại diện cho màu của động vật
- age: int, dùng dể lưu đại diện cho tuổi của động vật

Hãy viết các phương thức: phương thức khởi tạo mặc định, phương thức khởi tạo có thuộc tính và các phương thức **getter**, **setter** và **toString()**

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Chưa có bài giải.<br> Nếu cần thiết có thể liên hệ facebook [Phan Đức Hải](https://www.facebook.com/chiatayde)

</details>
<br>

### Ví dụ 7
Tạo một **Class** để biểu diễn các đối tượng **Car** gồm các thuộc tính:
- color: String, dùng dể đại diện cho màu của xe
- name: String, dùng dể đại diện cho màu của xe
- seatingCapacity: int, dùng dể lưu đại diện cho số ghế của xe
- year: int, dùng dể lưu đại diện cho năm sản xuất của xe

Hãy viết các phương thức: phương thức khởi tạo mặc định, phương thức khởi tạo có thuộc tính và các phương thức **getter**, **setter** và **toString()**

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Chưa có bài giải.<br> Nếu cần thiết có thể liên hệ facebook [Phan Đức Hải](https://www.facebook.com/chiatayde)

</details>
<br>

### Ví dụ 8
Tạo một **Class** để biểu diễn các đối tượng **Product** gồm các thuộc tính:
- name: String, dùng dể đại diện cho tên của sản phẩm
- price: double, dùng dể đại diện cho giá của sản phẩm
- quantity: int, dùng dể lưu đại diện cho số lượng của sản phẩm

Hãy viết các phương thức: phương thức khởi tạo mặc định, phương thức khởi tạo có thuộc tính và các phương thức **getter**, **setter** và **toString()**

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Chưa có bài giải.<br> Nếu cần thiết có thể liên hệ facebook [Phan Đức Hải](https://www.facebook.com/chiatayde)

</details>
<br>

### Ví dụ 9
Tạo một **Class** để biểu diễn các đối tượng **Player** gồm các thuộc tính:
- name: String, dùng dể đại diện cho tên của người chơi
- age: int, dùng dể lưu đại diện cho tuổi của người chơi
- positionX: int, dùng dể đại diện cho vi trí X của người chơi
- positionY: int, dùng dể đại diện cho vi trí Y của người chơi

Hãy viết các phương thức: phương thức khởi tạo mặc định, phương thức khởi tạo có thuộc tính và các phương thức **getter**, **setter** và **toString()**

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Chưa có bài giải.<br> Nếu cần thiết có thể liên hệ facebook [Phan Đức Hải](https://www.facebook.com/chiatayde)

</details>
<br>

### Ví dụ 10
Tạo một **Class** để biểu diễn các đối tượng **Game** gồm các thuộc tính:
- id: int, dùng dể lưu đại diện cho ID của game
- player1: Player, dùng dể lưu đại diện cho người chơi 1
- player2: Player, dùng dể lưu đại diện cho người chơi 2

*Lưu ý: hãy sử dụng class **Player** được tạo ở ví dụ 9*

Hãy viết các phương thức: phương thức khởi tạo mặc định, phương thức khởi tạo có thuộc tính và các phương thức **getter**, **setter** và **toString()**

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Chưa có bài giải.<br> Nếu cần thiết có thể liên hệ facebook [Phan Đức Hải](https://www.facebook.com/chiatayde)

</details>
<br>