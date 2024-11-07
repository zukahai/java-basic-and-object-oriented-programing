# Thi thử giữa kỳ.

Theo yêu cầu của những bạn sau cần ra đề này:

![alt text](8dff4553f1e549bb10f4.jpg)


## Đề bài:

Chương trình quản lý sinh viên

1. Tạo abtract class Student với:
- Các thuộc tính:
    - id: lưu trữ mã sinh viên, kiểu dữ liệu String
    - name: lưu trữ tên sinh viên, kiểu dữ liệu String
    - age: lưu trữ tuổi sinh viên, kiểu dữ liệu int

- Các phương thức:
    - Phương thức khởi tạo không tham số
    - Phương thức khởi tạo có tham số
    - Phương thức `toString()` hiển thị thông
    - Các phương thức getter và setter

- Các phương thức abstract:
    - `void input()`: nhập thông tin sinh viên
    - `getScore()`: trả về điểm trung bình của sinh viên



2. Tạo class StudentIT kế thừa từ Student với 
- Có thêm các thuộc tính:
    - java: lưu trữ điểm môn Java, kiểu dữ liệu double
    - html: lưu trữ điểm môn HTML, kiểu dữ liệu double
    - css: lưu trữ điểm môn CSS, kiểu dữ liệu double

- Các phương thức:
    - Phương thức khởi tạo không tham số
    - Phương thức khởi tạo có tham số
    - Phương thức `toString()` hiển thị thông
    - Các phương thức getter và setter

- Ghi đè phương thức:
    - `void input()`: nhập thông tin sinh viên
    - `getScore()`: trả về điểm trung bình của sinh viên

3. Tạo class StudentBiz kế thừa từ Student với

- Có thêm các thuộc tính:
    - marketing: lưu trữ điểm môn Marketing, kiểu dữ liệu double
    - sales: lưu trữ điểm môn Sales, kiểu dữ liệu double
    - management: lưu trữ điểm môn Management, kiểu dữ liệu double

- Các phương thức:
    - Phương thức khởi tạo không tham số
    - Phương thức khởi tạo có tham số
    - Phương thức `toString()` hiển thị thông
    - Các phương thức getter và setter

- Ghi đè phương thức:
    - `void input()`: nhập thông tin sinh viên
    - `getScore()`: trả về điểm trung bình của sinh viên

4. Tạo class Main chứa menu driver program để thực hiện các yêu cầu sau:

```
1. Nhập thông tin sinh viên IT
2. Nhập thông tin sinh viên Biz
3. Hiển thị thông tin danh sách sinh viên
4. Hiện thị sinh viên có điểm trung bình cao nhất
5. Hiện thị các sinh viên IT có điểm java cao nhất
6. Hiện thị các sinh viên Biz có điểm marketing thấp nhất
0. Thoát
```

Lưu ý: Chức năng 5, 6. Nếu có nhiều sinh viên cùng thoả mãn thì hiển thị tất cả sinh viên đó. Ví dụ có nhiều sinh viên IT có điểm java cao nhất thì hiển thị tất cả sinh viên đó.





