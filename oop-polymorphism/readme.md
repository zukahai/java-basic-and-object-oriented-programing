<div align="center">

# Tính đa hình trong lập trình hướng đối tượng

</div>

### Ví dụ 1

Tạo class **Student** dùng để biểu diễn tập hợp những sinh viên.<br>Bao gồm:
- Các thuộc tính:
    - **studentID**: String, dùng để đại diện cho mã sinhv viên
    - **name**: String, dùng để dại diện cho tên
    - **age**: int, ddùng để đại diện cho tuổi
- Các phương thức:
    - Các phương thức khởi tạo măc định và khởi tạo có thuộc tính
    - Các phương thức **getter**, **setter** và **toString()**
    - Phương thức **inpu()t** cho phép nhập thông tin của sinh viên vào từ bàn phím.
    - Phương thức **equals()** dùng để kiểm tra 2 sinh viên có giống nhau hay không
    - Phương thức **incAge()** dùng để tăng tuổi của sinh viên thêm **1**.
    - Phương thức **decAge()** dùng để trả lại tuổi của sinh viên thêm **1**.
    - Phương thức **incAge(int n)** dùng để tăng tuổi của sinh viên thêm **n**.
    - Phương thức **decAge()** dùng để trả lại tuổi của sinh viên thêm **n**.

*Lưu ý: Không có 2 sinh viên nào có mã sinh viên giống*

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java

```

</details>
<br>

### Ví dụ 2
Tạo class **StudentIT** kế thừa class **Student** dùng để biểu diễn tập hợp những sinh viên công nghệ thông tin.<br>Bao gồm thêm:
- Các thuộc tính:
    - **scoreCPP**: float, dùng để đại diện cho điểm học phần "Lập trình C++" của sinh viên
    - **scoreJava**: float, d­ùng để đại diện cho điểm học phần "Lập trình Java" của sinh viên.
- Các phương thức:
    - Các phương thức khởi tạo măc định và khởi tạo có thuộc tính
    - Các phương thức **getter**, **setter** cho các thuộc tính **scoreCPP** và **scoreJava**.
    - Ghi đề phương thức **toString()** và **input()**
    - Phương thức **calculateAverage()** dùng để tính điểm trung bình của sinh viên

*Lưu ý: Điểm của sinh viên luôn trong khoảng 0 đến 10, nếu điểm sinh viên khác với khoảng đó thì mặc định điểm đó bằng 0*

### Ví dụ 3
Tạo class **StudentBA** kế thừa class **Student** dùng để biểu diễn tập hợp những sinh viên công nghệ thông tin.<br>Bao gồm thêm:
- Các thuộc tính:
    - **socrePM**: float, dùng để đại diện cho điểm học phẩn "quản lí dư án" của sinh viên
    - **socreBA**: float, d­ùng để đại diện cho điểm họpc phần "Phân tích kinh doanh" của sinh viên.
- Các phương thức:
    - Các phương thức khởi tạo măc định và khởi tạo có thuộc tính
    - Các phương thức **getter**, **setter** cho các thuộc tính **socrePM** và **socreBA**.
    - Ghi đề phương thức **toString()** và **input()**
    - Phương thức **calculateAverage()** dùng để tính điểm trung bình của sinh viên

*Lưu ý: Điểm của sinh viên luôn trong khoảng 0 đến 10, nếu điểm sinh viên khác với khoảng đó thì mặc định điểm đó bằng 0*

### Ví dụ 4
Tao class **StudentManager** đại diễn cho tập hợp các hệ thống quản lí sinh viên.<br>Bao gồm:
- Các thuộc tính:
    - **students**: ArrayList\<Student\>, dùng để đại diện cho danh sách sinh viên.
- Các phương thức:
    - Các phương thức khởi tạo măc định và khởi tạo có thuộc tính
    - Các phương thức **getter**, **setter** cho các thuộc tính **students**.
    - Phương thức **addStudent(Student s)** dùng để thêm sinh viên **s** vào danh sách.
    - Phương thức **addStudent(ArrayList\<Student> s)** dùng để thêm danh sách sinh viên **s** vào danh sách.
    - Phương thức **showStudents()** dùng để xem danh sách sinh viên.
    - Phương thức **deleteStudent(Student s)** dùng để xóa sinh viên **s** trong danh sách.
    - Phương thức **deleteStudent(String studentID)** dùng để xóa sinh viên có mã sinh viên là **studentID** trong danh sách.
    - Phương thức **updateStudent(Student s)** dùng để update sinh viên **s** trong danh sách.
    - Phương thức **updateStudent(String studentID, Student s)** dùng để update sinh viên có mã sinh viên là **studentID** trong danh sách.
    - Phương thức **searchStudent(String studentID)** dùng để tìm kiểm sinh viên có mã sinh viên **studentID**
    - Phương thức **searchStudent(Student s)** d­ùng để tìm kiếm sinh viên **s**.
    - Phương thức **sortByScore()** dùng đề sắp xếp sinh viên tăng dần theo điểm trung bình
    - Phương thức **sortByAge()** dùng đề sắp xếp sinh viên tăng dần theo tuổi
    - Phương thức **sortByID()** dùng đề sắp xếp sinh viên tăng dần theo mã sinh
    - Phương thức **SortByType()** dùng đề sắp xếp sinh viên theo ngành học, sinh viên IT lên trước sinh viên BA

### Ví dụ 5
Tạo class **Menu** dại diện cho tập hợp những menu.<br>Bao gồm
- Các phương thức:
    - Phương thức **choiceMenu()**: int, dùng để hiện thi menu và cho phép nhập và trả về lựa chọn.
    - Các phương thức chọn Menu nhỏ khác
    - Phương thức run() để khởi động Menu

Tạo 1 Menu có các chức năng như sau:
```text
1. Nhập thông tin sinh viên
    1.1. Nhập sinh viên IT.
    1.2. Nhập sinh viên BA.
2. Xem danh sách sinh viên
3. Tìm kiếm sinh viên
    3.1. Tìm kiểm theo studentID.
    3.2. Tìm kiếm theo thông tin sinh viên.
4. Xoá sinh viên
    4.1. Xóa sinh viên theo studentID.
    4.2. Xoá sinh viên theo thông tin sinh viên.
5. Cập nhật sinh viên
    5.1. Cập nhật sinh viên theo studentID.
    5.2. Cập nhật sinh viên theo thông tin sinh viên.
6. Sắp xếp sinh viên
    4.1. Sắp xếp sinh viên theo điểm trung bình.
    4.2. Sắp xếp sinh viên theo tuổi.
    4.3. Sắp xếp sinh viên theo ngành hoc.
7. Thoát.
```