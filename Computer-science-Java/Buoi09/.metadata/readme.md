<div align="center">

# Tính trừu tượng trong lập trình hướng đối tượng

</div>

### Ví dụ 1
Tạo lớp trừu tượng **Shape** định nghĩa trừu tượng cho các hình dạng.<br>Bao gồm
- Các thuộc tính:
    - **color**: String, đại diện cho màu sắc của hình dạng.
- Các phương thức:
    - Gồm các phương thức getter và setter cho **color**
- Các phương thức trừu tượng
    - **getArea():** Float, dùng để tính diện tích
    - **getPerimeter()**: Float, dùng để tính chu vu
    - **input()**: void, dùng để nhập thông tin.
    - **toString()**: String, dùng để in ra các thông tin của hình dạng.

Tạo class **Triangle** kế thừa abstract class **Shape**<br> Bao gồm:
- Các thuộc tính:
    - **sideA**: float, dùng để đại diện cho cạnh thứ nhất của hình tam giác
    - **sideB**: float, dùng để đại diện cho cạnh thứ hai của hình tam giác
    - **sideC**: float, dùng để đại diện cho cạnh thứ ba của hình tam giác
- Các phương thức:
    - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính
    - Các phương thức **getter()** và **setter()**
    - Ghi đè tất cả những phương thức trừu tượng của **Shape**

Tạo class **Rectangel** kế thừa class **Shape**<br> Bao gồm:
- Các thuộc tính:
    - **width**: float, dùng để đại diện cho chiều rộng.
    - **height**: float, dùng để đại diện cho chiều dài.
- Các phương thức:
    - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính
    - Các phương thức **getter()** và **setter()**
    - Ghi đè tất cả những phương thức trừu tượng của **Shape**

### Ví dụ 2
Tạo lớp trừu tượng **Student** định nghĩa trừu tượng cho các hình dạng.<br>Bao gồm:
- Các thuộc tính:
    - **masv**: String, dùng dể đại diện cho mã sinh viên
    - **name**: String, dùng dể đại diện cho tên của sinh viên
    - **age**: int, dùng dể lưu đại diện cho tuổi của sinh viên
- Các phương thức:
    - Các phương thức khởi tạo
    - Gồm các phương thức getter và setter cho **masv**, **name** và **age**
    - **input()**: void, dùng để nhập thông tin.
- Các phương thức trừa tượng
    - **toString()**: String, dùng để in ra các thông tin của sinh viên
    - **calculateAverage()**: float, dùng làm trung bình tất cả các môn của sinh viên

Tạo lớp **StudentIT** kế thừa lớp trừu tượng **Student**.<br>Bao gồm:
- Các thuộc tính:
    - **scoreCpp**: float, dùng để đại diện cho điểm C++
    - **scoreJava**: float, dùng để đại diện cho điểm Java
- Các phương thức:
    - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính
    - Các phương thức **getter()** và **setter()**
    - Ghi đè phương thưc **input()**
    - Ghi đè tất cả những phương thức trừu tượng của **Student**

Tạo lớp **StudentBA** kế thừa lớp trừu tượng **Student**.<br>Bao gồm:
- Các thuộc tính:
    - **scorePm**: float, dùng để đại diện cho điểm học phần quản lí dự án
    - **scoreBA**: float, dùng để đại diện cho điểm học phần quản trị kinh doanh
- Các phương thức:
    - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính
    - Các phương thức **getter()** và **setter()**
    - Ghi đè tất cả những phương thức trừu tượng của **Student**

### Ví dụ 3

Tiếp nối ví dụ 2.

Tạo interface **IManager** gồm các phương thức:
    - void **addStudent(Student student)**: Thêm một học sinh vào danh sách.
    - void **editStudent(String masv, Student student)**: Sửa thông tin của một học sinh.
    - void **removeStudent(String masv)**: Xóa một học sinh dựa trên mã sinh viên
    - Student **findStudent(String masv)**: Tìm kế học sinh theo masv
    - void **sortByAge()**: Sắp xếp danh sách sinh viên không giảm theo tuổi
    - void **sortByScore()**: Sắp xếp danh sách sinh viên không giảm theo điểm trung bình.
    - ArrayList\<Student> **findStudent(int age)**: Tìm kế học sinh theo age
    - void **displayAllStudents()**: Hiển thị thông tin của tất cả học sinh trong danh sách.

### Ví dụ 4

Tạo class **StudentManager** sử dụng interface **IManager**.<br>
- Các thuộc tính:
    - **students**: ArrayList\<Student\>, dùng để lưu danh sách sinh viên
- Các phương thức:
    - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính.
    - Các phương thức **getter** và **setter** cho **students**
    - Định nghĩa lại tất cả phương thức của interface **IManager**.

### Ví dụ 5
Tạo Menu thực hiện được các chức năng sau:
```text
- 1. Hiện thị danh sách sinh viên
- 2. Thêm sinh viên
    - 2.1. Thêm sinh viên IT
    - 2.2. Thêm sinh viên BA
- 3. Tìm kiếm sinh viên
    - 3.1. Tìm theo mã sinh viên
    - 3.2. Tìm theo tuổi
- 4. Xoá sinh viên
- 5. Sắp xếp sinh viên
    - 5.1. Sắp xếp theo tuổi
    - 5.2. Sắp xếp theo điểm trung bình
- 6. Chỉnh sửa thông tin sinh viên
- 7. Thoát chương trình
```