<div align="center">

# Tính kế thừa trong lập trình hướng đối tượng
</div>

### Ví dụ 1

Tạo class **ElectronicDevice** đùng để biểu diễn cho các thiết bị điện tử. <br>Bao gồm:
- Các thuộc tính:
    **manufacturer**: String, dùng để đại diện cho nhà sản xuất của thiết bị điện tử.
    **price**: long, dùng để đại diện cho giá của thiết bị điện tử.
- Các phương thức:
    - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính.
    - Các phương thức **getter**, **setter** và **toString()**
    - Phương thức **input()** cho phép nhập thông tin của thiết bị điện tử đó.

Tạo class **Laptop** dùng để biểu diễn các máy tính xách tay. Kế thừa class **ElectronicDevice**<br>Bao gồm:
- Các thuộc tính:
    - **screenSize**: String, dùng để đại diện cho kích thước màn hình của máy tính xách tay đó.
- Các phương thức:
     - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính.
    - Các **getter** và **setter** cho các thuộc tính **color** va **breed**
    - Ghi đè lại phương thức **toString()** và **input()**


### Ví dụ 2

Tạo class **Animal** để biểu diễn tập hợp các động vật.<br> Bao gồm:
- Các thuộc tính
    - **name**: String, dùng để đại diện cho tên của động vật đó
    - **age**: int, dùng để đại diện cho tuổi của động vật đó.
- Các phương thức
    - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính.
    - Các phương thức **getter**, **setter** và **toString()**
    - Phương thức **input()** cho phép nhập thông tin của động vật đó.
    - **getYearOfBirth()**: Lấy năm sinh của động vật đó.

Tạo class **Cat** để biểu diễn cho tập hợp mèo. Kế thừa class **Animal**.<br> Bao gồm:
- Các thuộc tính
    - **color**: String, dùng để đại diện cho màu lông của con mèo
    - **breed**: String, dùng để đại diện cho giới tính của mèo
- Các phương thức:
    - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính.
    - Các **getter** và **setter** cho các thuộc tính **color** va **breed**
    - Ghi đè lại phương thức **toString()**
    - Phương thức **equalBreed(Cat c)** kiểm tra xem 2 con mèo các cùng giới tính không?

**Thực hiện các hành động sau:**
- Khởi tạo thông tin 2 con mèo
- In ra thông tin 2 con mèo đó
- In ra năm sinh của con mèo thứ 2
- Kiểm tra xem 2 con mèo có cùng giới tính không



</details>
<br>

### Ví dụ 3

Tạo class **Person** để biểu diễn tập hơn nhiều đối tượng người.<br> Bao gồm:
- Các thuộc tính
    - **name**: String, dùng để đại diện cho tên của người đó
    - **age**: int, dùng để đại diện cho tuổi của người đó
    - **address** : String, dùng để đại diện cho địa chỉ của người đó.

- Các phương thức
    - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính.
    - Các phương thức **getter**, **setter** và **toString()**
    - Phương thức **input()** cho phép nhập thông tin của người đó.
    - **getYearOfBirth()**: Lấy năm sinh của người đó.
    - **getUpperName()**: Lấy tên in hoa của người đó.
    - **checkAge(int n)**: Kiểm tra xem người đó đã đủ **n** tuổi chưa.

Tạo class **Student** để biểu diễn tập hơn nhiều đối tượng người. Kế thừa lớp **Person**<br> Bao gồm thêm:
- Các thuộc tính
    - **studentId**: String, dùng để đại diện cho mã sinh viên của người đó
    - **nameSchool**: String, dùng để đại diện cho tên trường học của sinh viên đó.
- Các phương thức
    - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính.
    - Các **getter** và **setter** cho các thuộc tính **studentId** và **nameSchool**
    - Ghi đè lại phương thức **toString()** và **input()**
    - Phương thức **checkStudentId()** kiểm tra xem sinh viên đó có mã sinh viên bắt đầu bằng **23IT** không?

**Thực hiện các hoạt động sau:**
- Cho phéo nhập vào một đối tương sinh viên.
- In ra thông tính của sinh viên đó.
- Kiểm tra xem sinh viên đó có đủ **18** tuổi không?
- In ra tên viên hoa của sinh viên đó.
- Kiểm tra sinh viên đó có phải có mã sinh viên bắt đầu bằng **23IT** không?


### Ví dụ 4

Tạo class **Rectangle** dùng để biểu diễn cho các hình chữ nhật. <br> Bao gồm:
- Các thuộc tính:
    - **width**: float, đại diện co chiều rộng của hình chữ nhật.
    - **height**: float, đại diện cho chiều dài cho hình chữ nhật
- Các phương thức:
     - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính.
    - Các phương thức **getter**, **setter** và **toString()**
    - Phương thức **input()** cho phép nhập thông tin của hình chữ nhật.
    - Phương thức **getArea()** để lấy diện tích của hình chữ nhật
    - Phương thức **getPerimeter()** để lấy chu vi của hình chữ nhật

Tạo class **Square** dùng để biểu diễn các hình vuông, kế thừa lớp **Rectangle**.<br> Bao gồm:
- Các phương thức:
    - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính.
    - Các **getter** và **setter** cho các thuộc tính **side**
    - Ghi đè lại phương thức **toString()** và **input()**

**Thực hiện các thao tác sau từ trên xuông dưới:**
- Khởi tạo một hình vuông có kích thước là 10
- In ra thông tin của hình vuông.
- In ra chu vi của hình vuông.
- In ra diện tích của hình vuông.
- Sửa lại kích thước hinh vuông là 20
- In ra thông tin của hình vuông.
- In ra chu vi của hình vuông.
- In ra diện tích của hình vuông.
- Nhập vào thông tin một hình vuông
- In ra chu vi của hình vuông.
- In ra diện tích của hình vuông.


### Ví dụ 5

Tạo class **User** dùng để biểu diễn các người dùng trong hệ thống. <br> Bao gồm:
- Các thuộc tính:
    - **userId**: String, dùng của diện id của người dùng.
    - **username**: String, dùng đại diện cho tên đăng nhập của người dùng.
    - **password**: String, dùng đại diện cho mật khẩu của người dùng.
    - **email**: String, dùng đại diện cho email của người dùng.
- Các phương thức:
    - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính.
    - Các phương thức **getter**, **setter** và **toString()**
    - Phương thức **input()** cho phép nhập thông tin của người dùng.

Tạo class **Customer** dùng để biểu diễn các khách hành, kế thừa class **User**.<br> Bao gồm:
- Các thuộc tính
    - **shippingAddress**: String, dùng đại diện cho địa chỉ nhân hàng.
- Các phương thức:
    - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính.
    - Các **getter** và **setter** cho các thuộc tính **shippingAddress**
    - Ghi đè lại phương thức **toString()** và **input()**

Tạo class **Admin** dùng để biểu diễn các người quản lí, kế thừa class **User**.<br> Bao gồm:

- Các thuộc tính:
    **permissions**: ArrayList<String>, danh sách các quyền của người quản lí đó.
- Các phương thức:
    - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính.
    - Các **getter** và **setter** cho các thuộc tính **permissions**
    - Ghi đè lại phương thức **toString()** và **input()**

**Tạo một Menu và chương trình có các tính năng như sau**
1. Thêm 1 **User**
    1.1. Thêm 1 **Customer**
    1.2. Thêm 1 **Admin**
2. In ra danh sách tất cả **User**
3. Sắp xếp các **User** sao cho các **Admin** ở trên các **Customer**
4. Đăng nhập (Nhập và **username** và **password**, kiểm tra xem tài khoản này có thể đăng nhập không, nếu có thể in ra User đang đăng nhập).


### Ví dụ 6

Tao một **Class** để biểu diễn các đối tượng **Time** gồm các thuộc tính:
- **hour: int**, dùng dể đại diện cho giờ
- **minute: int**, dùng dể đại diện cho phút
- **second: int**, dùng dể đại diện cho giây

Viết các phương thức bao gồm phương thức khởi tạo mặc định, phương thức khởi tạo có thuộc tính và các phương thức **getter**, **setter** và **toString()**.

- Viết hàm nextSecond() để tăng thời gian hiện tại lên 1 giây.
- Viết hàm nextMinute() để tăng thời gian hiện tại lên 1 phút.
- Viết hàm nextHour() để tăng thời gian hiện tại lên 1 giờ.

Tạo class DateTime để biểu diễn thời gian hiện tại, kế thừa lớp **Time**. 

Có thêm các thuộc tính:
- **day: int**, dùng để đại diện cho ngày
- **month: int**, dùng để đại diện cho tháng
- **year: int**, dùng để đại diện cho năm

Viết các phương thức bao gồm phương thức khởi tạo mặc định, phương thức khởi tạo có thuộc tính và các phương thức **getter**, **setter** và **toString()**.

- Viết hàm nextDay() để tăng thời gian hiện tại lên 1 ngày.
- Viết hàm nextMonth() để tăng thời gian hiện tại lên 1 tháng.
- Viết hàm nextYear() để tăng thời gian hiện tại lên 1 năm.

Ghi đè phương thức nextHour(), nếu giờ hiện tại là 23 thì giờ sẽ trở về 0 và tăng ngày lên 1.

**Lưu ý**: Các hàm next() sẽ tăng thêm 1 nếu giá trị hiện tại nhỏ hơn giá trị lớn nhất, nếu giá trị hiện tại lớn hơn giá trị lớn nhất thì giá trị hiện tại sẽ trở về 0 và tăng giá trị tiếp theo lên 1.
