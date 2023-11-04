<div align="center">

# Thao tác với cơ sở dữ liệu

</div>
Trong SQL tạo database studentmamangement, tạo table student gồm các cột:

- **id**: int tự tăng
- **masv**: varchar, không trùng lặp
- **name**: varchar
- **address**: varchar

Tạo một Java Project StudentManager dùng để quản lí sinh viên, tương tác với cơ sở dữ liệu, bao gồm các chức năng như sau:
- Hiện thị danh sách sinh viên
- Thêm mới một sinh viên
- Xoá một sinh viên
- Chỉnh sửa thông tin **name** và **address** khi biết **masv** của sinh viên
- Tìm kiếm sinh và đưa ra danh sách sinh viên theo **masv**, **name** hoặc **address**

Sinh viên có thể triển khai code nhiều cách để đáp ứng được yêu cầu của chương trình, những một trong những cách tốt nhất là sẽ triển khai như sau:
- Tạo class **ConnectJDBC**:
    - Gồm phương thức static Connection getConnection() dùng để trả về 1 connection đến SQl
- Tạo class **Student** đại diện cho tập hợp những sinh viên.<br>Bao gồm:
    - Các thuộc tính:
        - **id**: int, đại diện cho id
        - **masv**: String, đại diện cho mã sinh viên
        - **name**: String, đại diện cho tên
        - **address**: đại diện cho địa chỉ
    - Các phương thức:
        - Phương thức khởi tạo mặc định, khởi tạo có thuộc tính
        - Các phương thức getter, setter
        - Phương thức toString

- Tạo interface **IManager** gồm các phương thức:
    - ArrayList\<Student> **getAll()**
    - boolean **add(Student s)**
    - boolean **edit(String masv, Student s)**
    - boolean **delete(String masv)**
    - ArrayList\<Student> **findByName(String name)**
    - ArrayList\<Student> **findByAddress(String address)**
    - Student **findByMasv(String masv)**
- Tạo class **StudentManager** implements **IManager**:
    - Định nghĩa lại các phương thức trong interface **IManager**
- Tạo class **Menu**:
    - Gồm các hàm và phương thức để thực hiện những chức năng của chương trình.
