# Nội dung học ngày 1

Class là gì: Class là thứ đại diện cho tập học những **đối tượng** có cùng **thuộc tính** và **hành động**.

Các thành phần chính của class:
- Thuộc tính (Attribute): Là những đặc điểm của đối tượng.
- Phương thức (Method): Là những hành động của đối tượng.
    - Phương thức khởi tạo (Constructor): Là phương thức đặc biệt, được gọi khi khởi tạo một đối tượng.
    - Phương thức getter và setter: Dùng để truy xuất và thay đổi giá trị của thuộc tính.
    - Phương thức toStrin(): Dùng để hiển thị thông tin của đối tượng.

Tính đóng gói (Encapsulation):
- **private**: Chỉ có thể truy cập trong class.
```java
private String name;
```
- **default**: Chỉ có thể truy cập trong package.
```java
String name;
```
- **protected**: Chỉ có thể truy cập trong package và các class kế thừa.
```java
protected String name;
```
- **public**: Có thể truy cập ở mọi nơi.
```java
public String name;
```

Lỗi bộ nhớ đệm khi nhập số xong nhập chuỗi:
```java
int a = scanner.nextInt();
scanner.nextLine();
String s = scanner.nextLine();
```
Phải thêm `scanner.nextLine();` sau khi nhập số để xóa bộ nhớ đệm. Vì khi nhập số, `nextInt()` chỉ đọc số, không đọc kí tự xuống dòng. Khi nhập chuỗi, `nextLine()` sẽ đọc kí tự xuống dòng.


