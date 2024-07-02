# Câu hỏi phỏng vấn Java mà Hải tổng 

Cách trả lời phải tự tin, trả lời câu trả lời ngắn trước. Sua đó chờ khoảng 3 giây, nếu nhà tuyển dụng im lặng thì em mới mở rộng câu trả lời.

## 1. Câu hỏi về kiến thức chung

### 1.1. Sử dụng `final` trong Java

📚 Câu hỏi: `final` là gì? Khi nào sử dụng `final`?

<details>
<summary> <strong>Gợi ý trả lời </strong></summary>

**Trả lời ngắn**:

- `final` là một từ khóa trong Java, dùng để khai báo một hằng số.

**Trả lời mở rộng**:

- `final` là một từ khóa trong Java, dùng để khai báo một hằng số, một biến không thể thay đổi giá trị sau khi đã được gán giá trị ban đầu.

- `final` cũng được sử dụng để khai báo một lớp không thể kế thừa hoặc một phương thức không thể ghi đè.

</details>
<br>

### 1.2. So sánh `==` và `equals()` trong Java

📚 Câu hỏi: Sự khác biệt giữa `==` và `equals()` trong Java?

<details>
<summary> <strong>Gợi ý trả lời </strong></summary>

**Trả lời ngắn**:

- `==` là toán tử so sánh địa chỉ của hai đối tượng.

- `equals()` là một phương thức được sử dụng để so sánh giá trị của hai đối tượng.

**Trả lời mở rộng**:

- Mặc định, phương thức `equals()` được triển khai từ lớp `Object` và so sánh hai đối tượng dựa trên địa chỉ của chúng. Để so sánh giá trị của hai đối tượng, bạn cần ghi đè phương thức `equals()` trong lớp của bạn.

</details>

## 2. Câu hỏi về OOP

### 2.1. Tính đóng gói (Encapsulation) trong Java

📚 Câu hỏi: Tính đóng gói (Encapsulation) là gì? Tại sao chúng ta cần tính đóng gói trong Java?

<details>
<summary> <strong>Gợi ý trả lời </strong></summary>

**Trả lời ngắn**:

- Tính đóng gói (Encapsulation) là một trong bốn nguyên tắc của lập trình hướng đối tượng (OOP). Nó cho định nghĩa phạm vi truy cập cho các thành phần của một lớp.

**Trả lời mở rộng**:

- Có 4 mức độ truy cập trong Java:
    - private: Chỉ có thể truy cập từ bên trong lớp.
    - default: Chỉ có thể truy cập từ cùng package.
    - protected: Chỉ có thể truy cập từ cùng package hoặc các lớp con.
    - public: Có thể truy cập từ bất kỳ nơi nào.

</details>

### 2.2. Tính kế thừa (Inheritance) trong Java

📚 Câu hỏi: Tính kế thừa (Inheritance) là gì? Tại sao chúng ta cần tính kế thừa trong Java?

<details>
<summary> <strong>Gợi ý trả lời </strong></summary>

**Trả lời ngắn**:

- Tính kế thừa (Inheritance) là một trong bốn nguyên tắc của lập trình hướng đối tượng (OOP). Nó cho phép một lớp (lớp con) kế thừa các thuộc tính và phương thức từ một lớp khác (lớp cha).

**Trả lời mở rộng**:

- Tính kế thừa giúp tái sử dụng mã nguồn, giảm sự phức tạp của mã nguồn và tăng tính linh hoạt của mã nguồn.

</details>

### 2.3. Tính đa hình (Polymorphism) trong Java

📚 Câu hỏi: Tính đa hình (Polymorphism) là gì? Tại sao chúng ta cần tính đa hình trong Java?

<details>
<summary> <strong>Gợi ý trả lời </strong></summary>

**Trả lời ngắn**:

Tính đa hình (Polymorphism) là một trong bốn nguyên tắc của lập trình hướng đối tượng (OOP). Nó cho phép một đối tượng có thể thể hiện các hành vi khác nhau tùy thuộc vào ngữ cảnh.

**Trả lời mở rộng**:

- Tính đa hình có 2 loại:
    - Nạp chồng phương thức (Method Overloading): Cùng tên phương thức nhưng khác tham số.
    - Ghi đè phương thức (Method Overriding): Phương thức trong lớp con ghi đè phương thức trong lớp cha (về cùng tên, cùng tham số).

</details>

### 2.4. Tính trừu tượng (Abstraction) trong Java

📚 Câu hỏi: Tính trừu tượng (Abstraction) là gì? Tại sao chúng ta cần tính trừu tượng trong Java?

<details>
<summary> <strong>Gợi ý trả lời </strong></summary>

**Trả lời ngắn**:

- Tính trừu tượng (Abstraction) là một trong bốn nguyên tắc của lập trình hướng đối tượng (OOP). Nó cho phép ẩn giấu chi tiết triển khai của một lớp và chỉ hiển thị các thông tin cần thiết cho người dùng.

**Trả lời mở rộng**:

- Abstract Class: Là một lớp trừu tượng không thể tạo đối tượng từ lớp đó.

</details>

### 2.5. Interface và Abstract Class

📚 Câu hỏi: Sự khác biệt giữa Interface và Abstract Class trong Java?

<details>

<summary> <strong>Gợi ý trả lời </strong></summary>

**Trả lời ngắn**:

- Interface:
    - Tất cả các phương thức trong Interface đều là abstract.
- Abstract Class:
    - Có thể có phương thức abstract và non-abstract (phương thức thường).

**Trả lời mở rộng**:

- Một lớp có thể triển khai nhiều Interface nhưng chỉ kế thừa một Abstract Class.

</details>

### 2.6 Class và Abstract Class

📚 Câu hỏi: Sự khác biệt giữa Class và Abstract Class trong Java?

<details>

<summary> <strong>Gợi ý trả lời </strong></summary>

- Class:
    - Có thể tạo đối tượng từ một lớp.
- Abstract Class:
    - Không thể tạo đối tượng từ một Abstract Class.
    - Có thể chứa phương thức abstract và non-abstract (phương thức thường).
</details>

### 2.7 static

📚 Câu hỏi: `static` là gì? Khi nào sử dụng `static`?

<details>
<summary> <strong>Gợi ý trả lời </strong></summary>

- `static` là một từ khóa trong Java, dùng để khai báo một biến hoặc phương thức thuộc về lớp, không phải đối tượng.
- Biến `static` chia sẻ giữa tất cả các đối tượng của lớp.
- Phương thức `static` có thể được gọi mà không cần tạo đối tượng từ lớp.

```java
public class Student {
    private static int b = 0;
}

public class Main {
    public static void main(String[] args) {
        Student.b = 10;
        System.out.println(Student.b); // 10
        Student s = new Student();
        System.out.println(s.b); // 10
    }
}
```


</details>

### 2.8 Phương thức khởi tạo (Constructor)

📚 Câu hỏi: Phương thức khởi tạo (Constructor) là gì? Tại sao chúng ta cần phương thức khởi tạo trong Java?

<details>
<summary> <strong>Gợi ý trả lời </strong></summary>

**Trả lời ngắn**:

- Phương thức khởi tạo (Constructor) là một phương thức đặc biệt được sử dụng để khởi tạo đối tượng.

**Trả lời mở rộng**:

- Phương thức khởi tạo có cùng tên với lớp và không có kiểu trả về.
- Một lớp có thể có nhiều phương thức khởi tạo, nhưng phải khác nhau về tham số hoặc kiểu dữ liệu của tham số.
- Mặc định, Java cung cấp một phương thức khởi tạo không tham số (default constructor) nếu lớp không có phương thức khởi tạo nào. Khi bạn tạo một phương thức khởi tạo, phương thức khởi tạo mặc định sẽ không sử dụng được nữa.

```java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 20);
        Person person2 = new Person(); // Lỗi: không có phương thức khởi tạo không tham số
    }
}
```

</details>

### 2.9. Các hoạt động của hàm constructor

📚 Câu hỏi: Các hoạt động của hàm constructor?

<details>

<summary> <strong>Gợi ý trả lời </strong></summary>

- Nếu trong constructor không có gọi `super()`, Java sẽ tự động gọi `super()`.
- Tiếp theo, Sẽ thực hiện tiếp các câu lệnh trong constructor.

```java

public class A {
    public A() {
        System.out.println("A");
    }
}

public class B extends A {
    public B() {
        System.out.println("B");
    }
}

public class Main {
    public static void main(String[] args) {
        B b = new B();
    }
}

```

Kết quả:
```
A
B
```
</details>




