<div align="center">

# Kiểm tra giữa kỳ - bài tập mẫu

</div>

### Ví dụ 1: Quản lí sách
> Nộp bài **[Tại đây](https://docs.google.com/forms/d/e/1FAIpQLSctrFfru_LKqf8PF8SeZZQaV30gR64wPu05_Q6a0pfXAb-uIg/viewform?usp=sharing)**, chỉ nhận bài tập đến **0h00 ngày 16 tháng 10 năm 2023**

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


<details>
<summary> <strong>📝 Nhận xét bài làm </strong></summary>

<details>
<summary> <strong>💡 23IT179 - Phan Thị Thanh Ngân </strong></summary>
<br>

**💬 Nhận xét chung**
- File **rar** rỗng, không có nội dung

</details>

<details>

<summary> <strong>💡 23IT321 - Đào Thanh Vương</strong></summary>
<br>

**💬 Nhận xét chung**
- Bài làm rất tốt.
- Tất cả chức năng đều chạy được và chạy đúng.

**🔧 Cần cải thiện**
- Phần views Book nên cho nó in thông tin mỗi BOOK trên 1 dòng luôn, tốt nhất là in là hàm toString() của book đó.
- Nên tách từng class thành từng file để dễ quản lí.
</details>

<details>
<summary> <strong>💡 23IT032 - Ngô Khắc Cường</strong></summary>
<br>

**💬 Nhận xét chung**
- Bài làm rất tốt.
- Tất cả các chức năng đều chạy được và chạy đúng

**🔧 Cần cải thiện**
- bookID là duy nhất, nên không thể thêm được được book có bookId đã tồn tại.
- Nên viết có Menu thành 1 đối tượng luôn. xong gọi đối tượng đối ra sử dùng
```java
Menu menu = new Menu();
```

</details>

<details>
<summary> <strong>💡 23IT268 - Nguyễn Đức Thuận</strong></summary>
<br>

**💬 Nhận xét chung**
- Tạo các class rất tốt, các chức năng hoàn chỉnh.
- Code chạy được nhưng chưa được như mong muốn.
- Cần luyện tập cách gọi phương thức.
- Cần kiểm thử chương trình kỹ hơn.

**🔧 Cần cải thiện**
- Phần case 2 chưa có break nên khi thêm sách là nó thực hiện luôn case 3:
```java
case 2:
    System.out.println("2.1. Thêm sách cứng");
    System.out.println("2.2. Thêm sách điện tử");
    System.out.println("-----------------------------");
    System.out.println("Chọn số : ");
    double choice1 = sc.nextDouble();
    if (choice1 == 2.1) {
        bookManager.addHardcoverBook();

    }
    if (choice1 == 2.2) {
        bookManager.addEBook();
    }
    // cần thêm break ở đây
case 3:
    bookManager.searchBook(so);
```
- In ra thông tin của sách nên in trên 1 dòng để dễ xem hơn, tất nhất cứ in ra cái **toString()**
- **bookId** không trùng được, nên lần sau làm thêm cái không cho thêm 1 sách với **bookId** đã trùng với sách trong danh sách.
- Cái thêm sách và xoá sách nên cho phép người dùng nhập vào một bookId cần thêm hoặc xoá. Chứ em đang mặc định xoá theo cái bookId bằng 3 rồi.
- Phương thức **totalPrice()** và **getTotalfileSize()** là hai phương thức trả về giá trị, nên cần phải dùng **sysout** để in giá trị 2 phương thức đó ra
</details>


<details>
<summary> <strong>💡 23IT142 - Hùng Vũ Long</strong></summary>
<br>

**💬 Nhận xét chung**
- Nén file chưa đúng qui định.
- Các class tạo rất tốt, code dễ nhìn dễ hiểu.
- Các chức năng đều rất tốt. (Nhưng chưa chạy được do nén file sai cách, anh phải sửa lại mới chạy được)

**🔧 Cần cải thiện**
- Cần nén file chuẩn hơn, cần nén cả **project** chứ không phải một **package**.
- Khi thêm sách, cần kiểm tra xem **bookId** của sách mới đã tồn tại chưa, vì không thể cả 2 sách của cùng **bookId**
- Nên in thông tin mỗi sách trên 1 dòng để dễ đọc.

</details>

<details>
<summary> <strong>💡 23IT082 - Chu Ngọc Hoàng</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chạy được
- Các chức năng trong các tốt, trừ chức năng tìm kiếm
- Tạo menu tốt, cần chú ý khi dùng switch case

**🔧 Cần cải thiện**
- Khi thêm sách, cần kiểm tra xem **bookId** của sách mới đã tồn tại chưa, vì không thể cả 2 sách của cùng **bookId**
- case 3, 4, 5, 6 thiếu break:
- Ở hàm **searchBook()** các hàm **toString()** phải dùng **sysout** để in ra. Các hàm tìm kiếm nên trả về goá trị, sau đó mới in ra sau.
```java
public void searchBook(int BookID) {
    for (Book bk : books) {
        if (bk.getBookID() == BookID) {
            bk.toString(); // phải in ra
        }
    }
}
```
</details>


<details>
<summary> <strong>💡 23IT154 - Bùi Đoàn Duy Lưu</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chạy được, tất cả chức năng hoạt động rất tốt

**🔧 Cần cải thiện**
- Khi thêm sách, cần kiểm tra xem **bookId** của sách mới đã tồn tại chưa, vì không thể cả 2 sách của cùng **bookId**
</details>


<details>
<summary> <strong>💡 23IT117 - Từ Thị Thanh Hương</strong></summary>
<br>

**💬 Nhận xét chung**
- Tất cả các file đều là file **\*.class**, không thể chạy được.

**🔧 Cần cải thiện**
- Cần xem lại cách nén file và nộp bài.
</details>

<details>
<summary> <strong>💡 23IT259 - Phạm Văn Thiện</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chạy được.
- Tạo các class tốt, chức năng tốt.
- Chưa tạo được menu

**🔧 Cần cải thiện**
- Cần xem cách tạo Menu, cũng như cách sử dụng các hàm đã viết.
- Khi thêm sách, cần kiểm tra xem **bookId** của sách mới đã tồn tại chưa, vì không thể cả 2 sách của cùng **bookId**
</details>

<details>
<summary> <strong>💡 23IT285 - Nguyễn Thanh Triều</strong></summary>
<br>

**💬 Nhận xét chung**
- Code không chạy được do nén file sai cách.
- Hàm khởi tạo mặc định viết chủ quan.
- Cách chức năng xử lí khá tốt.

**🔧 Cần cải thiện**
- Cần xem lại cách nén file [Tại đây](../submit.md)
- Nên viết các hàm khởi tạo mặc định, trong hàm đó gán tất cả thuộc tính của nó là mặc định.
- Khi thêm sách, cần kiểm tra xem **bookId** của sách mới đã tồn tại chưa, vì không thể cả 2 sách của cùng **bookId**
- 2 phương thức **searchBook()** nên có kiểu trả về. Xong mới in ra ở menu.
- Code nhìn khá ổn, tiếc là không chạy được, cần nén cả **project** thay vì nén mỗi **package**.
</details>

<details>
<summary> <strong>💡 23IT001 - Đặng Ngọc Thúy An</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chạy được.
- Các class, các hàm xử lí viết rất tốt
- Viết Menu rất tốt, dễ sử dụng

**🔧 Cần cải thiện**
- Khi thêm sách, cần kiểm tra xem **bookId** của sách mới đã tồn tại chưa, vì không thể cả 2 sách của cùng **bookId**
- Hàm tìm kiếm theo **title** nên cho nó trả về 1 danh sách, vì đôi khi sẽ nhiều sách có cùng title, cần đưa ra hết

</details>

<details>
<summary> <strong>💡 23IT274 - Nguyễn Tiến</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chạy được.
- Tạo các class tốt.
- Còn một số lỗi cần cải thiện.

**🔧 Cần cải thiện**
- Chú ý chính tả ở class **BôkManager**
- Khi thêm sách, cần kiểm tra xem **bookId** của sách mới đã tồn tại chưa, vì không thể cả 2 sách của cùng **bookId**
- In thông tin của sách nên in trên 1 dòng bằng hàm **toString()**
- Còn bị lỗi bộ nhớ đệm, không nhập được **title**. Xem các giải quyết ở mục 1 [Tại đây](../bugs.md)
- Mỗi lần thực hiện xong một chức năng cần hiển thị lại Menu cho người dùng xem.
</details>

<details>
<summary> <strong>💡 23IT239 - Trần Như Sum</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chạy được.
- Tạo các class tốt
- 6 chức năng đầu chạy tốt.

**🔧 Cần cải thiện**
- Không nên dùng **new Scanner(System.in)** quả nhiều như vậy, sẽ tốn bộ nhớ, có thể đúng khi học nhưng lại chưa tốt ưu khi đi làm.
- Sai chính tả ở *filseSizeMB*
```java
public EBook(int bookID, String title, String author, long price, String format, int filseSizeMB) {
    super(bookID,title,author,price);
    this.format=format;
    this.fileSizeMB=fileSizeMB;
}
```
- Không nên dùng **static** ở bên dưới, như thế này định nghĩa biến **books** là của class chứ không phải của đối tượng.
```java
private static ArrayList<Book> books;
```
- Các chức năng tìm kiểm nên có kiểu trả về.
- Khi thêm sách, cần kiểm tra xem **bookId** của sách mới đã tồn tại chưa, vì không thể cả 2 sách của cùng **bookId**
- Cần làm thêm chức năng số 7
</details>

<details>
<summary> <strong>💡 23IT015 - Nguyễn Hoàng Nhật Bảo</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chạy được.
- Các class tạo tốt.
- Menu còn khó sử dụng.

**🔧 Cần cải thiện**
- Hỏi người ta chọn yes / no xong bắt nhật y. Hơi khó sử dụng đoạn này.
```java
System.out.print("Tiếp tục? (Yes/No): ");
String continueChoice = sc.nextLine().toLowerCase();
if (!continueChoice.equals("y")) {
    break;
}
- Khi thêm sách, cần kiểm tra xem **bookId** của sách mới đã tồn tại chưa, vì không thể cả 2 sách của cùng **bookId**
- Các hàm tìm kiếm nên có kiểu tra về.
```
</details>

<details>
<summary> <strong>💡 23IT032 - </strong></summary>
<br>

**💬 Nhận xét chung**


**🔧 Cần cải thiện**

</details>

<details>
<summary> <strong>💡 23IT032 - </strong></summary>
<br>

**💬 Nhận xét chung**


**🔧 Cần cải thiện**

</details>

</details>
<br>