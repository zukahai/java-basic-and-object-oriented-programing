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

```java
package model;

public class Rectangle {
	private double width;
	private double height;

	public Rectangle() {
		this.width = 0;
		this.height = 0;
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(3, 4);
		System.out.println(rectangle);
	}

}
```

</details>
<br>

### Ví dụ 3
Tạo một **Class** để biểu diễn các đối tượng **Circle** gồm các thuộc tính:
- radius: double, dùng dể đại diện cho bán kính của hình tròn

Hãy viết các phương thức: phương thức khởi tạo mặc định, phương thức khởi tạo có thuộc tính và các phương thức **getter**, **setter**  và **toString()**

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package model;

public class Circle {
	private double radius;

	public Circle() {
		this.radius = 0;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(10);
		System.out.println(circle);
	}

}
```

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

```java
package model;

public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;

	public Triangle() {
		this.sideA = 0;
		this.sideB = 0;
		this.sideC = 0;
	}

	public Triangle(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	@Override
	public String toString() {
		return "Triangle [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]";
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangle = new Triangle(3, 4, 5);
		System.out.println(triangle);
	}

}
```

</details>
<br>

### Ví dụ 5
Tạo một **Class** để biểu diễn các đối tượng **Square** gồm các thuộc tính:
- side: double, dùng dể đại diện cho cạnh của hình vuông

Hãy viết các phương thức: phương thức khởi tạo mặc định, phương thức khởi tạo có thuộc tính và các phương thức **getter**, **setter** và **toString()**

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package model;

public class Square {
	private double side;

	public Square() {
		this.side = 0;
	}

	public Square(double side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square square = new Square(5);
		System.out.println(square);
	}

}
```

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

```java
package model;

public class Animal {
	private String name;
	private String color;
	private int age;

	public Animal() {
		this.name = "";
		this.color = "";
		this.age = 0;
	}

	public Animal(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal("Dog", "Black", 1);
		System.out.println(animal);
	}

}
```

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

```java
package model;

public class Car {
	private String name;
	private String color;
	private int seatingCapacity;
	private int year;

	public Car() {
		this.color = "";
		this.name = "";
		this.seatingCapacity = 0;
		this.year = 0;
	}

	public Car(String name, String color, int seatingCapacity, int year) {
		this.color = color;
		this.name = name;
		this.seatingCapacity = seatingCapacity;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", seatingCapacity=" + seatingCapacity + ", year=" + year
				+ "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("Vinfast", "Black", 4, 2020);
		System.out.println(car);
	}
}
```

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

```java
package model;

public class Product {
	private String name;
	private double price;
	private int quantity;

	public Product() {
		this.name = "";
		this.price = 0;
		this.quantity = 0;
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product("Laptop", 200, 10);
		System.out.println(product);
	}

}
```

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

```java
package model;

public class Player {
	private String name;
	private int age;
	private int positionX;
	private int positionY;

	public Player() {
		this.name = "";
		this.age = 0;
		this.positionX = 0;
		this.positionY = 0;
	}

	public Player(String name, int age, int positionX, int positionY) {
		this.name = name;
		this.age = age;
		this.positionX = positionX;
		this.positionY = positionY;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", positionX=" + positionX + ", positionY=" + positionY + "]";
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

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player = new Player("Hai", 25, 100, 50);
		System.out.println(player);
	}

}
```

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

```java
package model;

public class Game {
	private int id;
	private Player player1;
	private Player player2;

	public Game() {
		this.id = 0;
		this.player1 = new Player();
		this.player2 = new Player();
	}

	public Game(int id, Player player1, Player player2) {
		this.id = id;
		this.player1 = player1;
		this.player2 = player2;
	}

	@Override
	public String toString() {
		return "Game [\n\tid=" + id + ", \n\tplayer1=" + player1 + ", \n\tplayer2=" + player2 + "\n]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player1 = new Player("Hải", 0, 25, 100, 50);
		Player player2 = new Player("Nam", 0, 23, 10, 20);
		Game game = new Game(1, player1, player2);
		System.out.println(game);
	}

}
```

</details>
<br>