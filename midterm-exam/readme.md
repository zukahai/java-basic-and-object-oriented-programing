<div align="center">

# Kiểm tra giữa kỳ - bài tập mẫu

</div>

### Ví dụ 1: Quản lí sách
Tạo class **Book** để biểu diễn cho tập hợp sách. <br>Bao gồm:
- Cách thuộc tính:
    - **bookID**: int, dùng để đại diện cho mã sách.
    - **title**: String, dùng để dại diện cho tiêu đề của sách.
    - **author**: String, dùng để đại diện cho tác giả của sách.
    - **price**: long, dùng để đại diện cho giá của sách.
- Các phương thức:
    - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính.
    - Các phương thức **getter**, **setter** và **toString()**
    - Phương thức **input()** cho phép nhập thông tin của sách.

Tạo class **HardcoverBook** kế thừa class **Book** để biểu diễn cho tập hơn các cuốn sách cứng.<br>Bao gồm:
- Các thuộc tính:
    - **coverMaterial**: String, dùng để dại diện cho chất liệu của sách.
    - **numberOfPages**: int, dùng để đại diện cho số trang của sách.
- Các phương thức:
    - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính.
    - Các **getter** và **setter** cho các thuộc tính **coverMaterial** và **numberOfPages**
    - Ghi đè lại phương thức **toString()** và **input()**

Tạo class **EBook** kết từa class **Book** để dại diện cho tập hợp sách điện tử.<br>Bao gồm:
- Các thuộc tính:
    - **format**: String, d­ùng để đại diện cho định dạng của sách.
    - **fileSizeMB**: double, dùng để đại diện cho độ lớn của sách
- Các phương thức:
    - Phương thức khởi tạo mặc định và phương thức khởi tạo có thuộc tính.
    - Các **getter** và **setter** cho các thuộc tính **format** và **fileSizeMB**
    - Ghi đè lại phương thức **toString()** và **input()**
    - Phương thức **isBigBook**, để kiểm tra xem sách có phải là sách kích thước lớn hay không. Một sách có kích thuốc lớn hơn 200MB được xem là một sách kích thước lớn.

Tạo class **BookManager** dùng để quản lí sách.<br>Bao gồm:
- Cách thuộc tính:
    - **books**: ArrayList\<Book\>, dùng để lưu danh sách các cuốn sách.
- Các phương thức:
    - Phương thức **addBook(Book b)** dùng để thêm một sách (sách cứng hoặc sách điện tử) vào danh sách sách.
    - Phương thức **searchBook(String title)** dùng để tìm kiếm những cuốn sách có tên là **title**.
    - Phương thức **searchBook(int bookID)** dùng để tìm kiếm những cuốn sách có tên là **bookID**.
    - Phương thức **removeBook(int bookID)** dùng xoá sách có mã là **id** ra khỏi danh sách sách.
    - Phương thức **displayBooks()** dùng để in ra danh sách sách.
    - Phương thức **sortByPrice()** dùng để sắp xếp danh sách sách không giảm theo giá.
    Phương thức **sortByType()** dùng để sắp xếp danh sách theo loại, những sách cứng ở trên, những sách điện tử ở dưới.
    - Phương thức **totalPrice()** dùng để tính tổng giá sách trong danh sách sách.
    - Phương thức **getTotalFileSize()** d­ùng để tính tổng kích thước của sách điện tử.

Tạo một Menu cho phép  người dùng thực hiện cách chức năng sách.

```text
1. Xem danh sách sách
2. Thêm sách
    2.1. Thêm sách cứng
    2.2. Thêm sách điện tử
3. Tìm sách
    3.1 Tìm sách theo title
    3.2 Tìm sách theo bookID
4. Xoá sách theo bookID
5. Sắp xếp
    5.1. Sắp theo tăng dần theo giá
    5.2. Sắp theo theo loại
6. Tính tổng giá sách
7. Tính tổng kích thước sách
```

Nộp bài **[Tại đây](https://docs.google.com/forms/d/e/1FAIpQLSctrFfru_LKqf8PF8SeZZQaV30gR64wPu05_Q6a0pfXAb-uIg/viewform?usp=sharing)**, chỉ nhận bài tập đến **0h00 ngày 16 tháng 10 năm 2023**