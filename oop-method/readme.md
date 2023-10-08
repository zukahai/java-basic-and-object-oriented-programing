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

	public double getArea() {
		return this.height * this.width;
	}

	public double getPerimeter() {
		return 2 * (this.height + this.width);
	}

	public boolean isSquare() {
		return this.width == this.height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(5, 5);
		System.out.println(rectangle);
		System.out.println("Chu vi: " + rectangle.getPerimeter());
		System.out.println("Diện tích: " + rectangle.getArea());
		if (rectangle.isSquare()) {
			System.out.println("Là hình vuông");
		} else {
			System.out.println("Không là hình vuông");
		}
	}

}
```

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
	
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
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
		System.out.println("Chu vi: " + circle.getPerimeter());
		System.out.println("Diện tích: " + circle.getArea());
	}

}
```

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
- **isRightTriangle()** để kiểm tra hình tam giác có vuông không
- set(sideA, sideB, sideC) để thay đổi giá trị của 3 cạnh cùng 1 lúc

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
	
	public double getArea() {
		double p = (sideA + sideB + sideC) / 2;
		return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
	}
	
	public double getPerimeter() {
		return sideA + sideB + sideC;
	}
	
	public boolean isIsoscelesTriangle() {
		return sideA == sideB || sideA == sideC || sideB == sideC;
	}
	
	public boolean isEquilateralTriangle() {
		return sideA == sideB && sideA == sideC && sideB == sideC;
	}
	
	public boolean isRightTriangle() {
		if (sideA * sideA + sideB * sideB == sideC * sideC)
			return true;
		if (sideA * sideA + sideC * sideC == sideB * sideB)
			return true;
		if (sideC * sideC + sideB * sideB == sideA * sideA)
			return true;
		return false;
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
		Triangle triangle = new Triangle(4, 4, 4);
		System.out.println(triangle);
		System.out.println("Chu vi: " + triangle.getPerimeter());
		System.out.println("Diện tích: " + triangle.getArea());
		System.out.println("Là tam giác đều: " + triangle.isEquilateralTriangle());
		System.out.println("Là tam giác cân: " + triangle.isIsoscelesTriangle());
		System.out.println("Là tam giác vuông: " + triangle.isRightTriangle());
	}

}
```

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
	
	public double getArea() {
		return side * side;
	}
	
	public double getPerimeter() {
		return 4 * side;
	}
	
	public boolean isIntegerSquareSide() {
		return side == (int)side;
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
		Square square = new Square(5.8);
		System.out.println(square);
		System.out.println("Diện tích: " + square.getArea());
		System.out.println("Chi vi: " + square.getPerimeter());
		System.out.println("Cạnh hinh vuông là số nguyên: "+ square.isIntegerSquareSide());
	}

}
```
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
	
	public int getYearOfBirth() {
		return 2023 - age;
	}
	
	public boolean equalsColor(Animal a) {
		return this.color.equals(a.getColor());
	}
	
	public void increaseAge() {
		this.age++;
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
		Animal animal1 = new Animal("Dog", "Black", 1);
		Animal animal2 = new Animal("Cat", "Black", 2);
		System.out.println(animal1);
		System.out.println(animal2);
		System.out.println("Năm sinh của " + animal1.getName() + " là: " + animal1.getYearOfBirth());
		animal2.increaseAge();
		System.out.println(animal2);
		System.out.println(animal1.getName() + " có cùng màu với " + animal2.getName() + "Không?: " + animal1.equalsColor(animal2));
	}

}
```

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
	
	public int getAge() {
		return 2023 - year;
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
		System.out.println("Xe đã lăn bánh được " + car.getAge() + " năm");
	}
}
```

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
	
	public double getTotalPrice() {
		return price * quantity;
	}
	
	public void increaseQuantity() {
		quantity++;
	}
	
	public void decreaseQuantity() {
		quantity--;
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
		
		System.out.println("Tổng giá trị: " + product.getTotalPrice());
		product.increaseQuantity();
		
		System.out.println("Sau khi tăng quantity lên 1");
		System.out.println(product);
		
		System.out.println("Sau khi giảm quantity đi 2");
		product.decreaseQuantity();
		product.decreaseQuantity();
		System.out.println(product);
	}

}
```

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
- **increaseScore()** để tăng điểm số của người chơi lên 1
- **decreaseScore()** để giảm điểm số của người chơi lên 1
- **increaseScore(int n)** để tăng điểm số của người chơi lên n điểm
- **decreaseScore(int n)** để giảm điểm số của người chơi lên n điểm
- **isWinner()** để kiểm tra người chơi có thể thắng hay không, người chơi thắng khi điểm lớn hơn hoặc bằng 100


<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package model;

public class Player {
	private String name;
	private int age;
	private int score;
	private int positionX;
	private int positionY;

	public Player() {
		this.name = "";
		this.score = 0;
		this.age = 0;
		this.positionX = 0;
		this.positionY = 0;
	}

	public Player(String name, int score, int age, int positionX, int positionY) {
		this.name = name;
		this.score = score;
		this.age = age;
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
	public void increaseScore() {
		score ++;
	}
	
	public void decreaseScore() {
		score --;
	}
	
	public void increaseScore(int n) {
		score += n;
	}
	
	public void decreaseScore(int n) {
		score -= n;
	}
	
	public boolean isWinner() {
		return this.score >= 100;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", score=" + score + ", positionX=" + positionX
				+ ", positionY=" + positionY + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
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
		Player player = new Player("Hai", 20, 25, 100, 50);
		System.out.println(player);
		
		System.out.println("Win: " + player.isWinner());
		player.increaseScore(90);
		System.out.println("Win: " + player.isWinner());
	}

}
```

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
	
	public Player getWinner() {
		if (player1.isWinner())
			return player1;
		if (player2.isWinner())
			return player2;
		return null;
	}
	
	public void resetGame() {
		player1.setScore(0);
		player2.setScore(0);
	}
	
	public void swapPlayers() {
		Player t = player1;
		player1 = player2;
		player2 = t;
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
		Player player1 = new Player("Hải", 20, 25, 100, 50);
		Player player2 = new Player("Nam", 0, 23, 10, 20);
		Game game = new Game(1, player1, player2);
		System.out.println(game);
		
		game.getPlayer1().increaseScore(80);
		game.setPlayer1(player1);
		System.out.println("Winer: " + game.getWinner());
		
		game.swapPlayers();
		System.out.println(game);
	}
}
```

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
