<div align="center">

# Kiểm tra giữa kỳ - bài tập mẫu

</div>

### Ví dụ 1: Quản lí sách
> Nộp bài **[Tại đây](https://docs.google.com/forms/d/e/1FAIpQLSctrFfru_LKqf8PF8SeZZQaV30gR64wPu05_Q6a0pfXAb-uIg/viewform?usp=sharing)**, chỉ nhận bài tập đến **0h00 ngày 16 tháng 10 năm 2023**

Tạo class **Book** để biểu diễn cho tập hợp sách. <br>Bao gồm:
- Cách thuộc tính:
    - **bookID**: int, dùng để đại diện cho mã sách, nó là duy nhất.
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
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Hãy tải xuống **[BookManagement.zip](./BookManagement.zip)**

</details>
<br>


<details>
<summary> <strong>🎒 Nhận xét bài làm  📝</strong></summary>

<details>
<summary> <strong>👩‍🎓 23IT179 - Phan Thị Thanh Ngân </strong></summary>
<br>

**💬 Nhận xét chung**
- Có cố gắng sửa lại bài nén flle lỗi
- Các class tạo tốt, tuy nhiên vẫn có chức năng bị sai.
- Menu dễ dùng.

**🔧 Cần cải thiện**
- Hàm **isBigBook** còn bị sai yêu cầu, yêu cầu chưa cần > 200 trong khi của em là >= 200
- **bookID** là duy nhất, nên không thể thêm được được book có **bookId** đã tồn tại.
- Còn bị lỗi bộ nhớ đệm, không nhập được **title**. Xem các giải quyết ở mục 1 [Tại đây](https://github.com/zukahai/java-basic-and-object-oriented-programing/blob/main/bugs.md)
</details>

<details>

<summary> <strong>👨‍🎓 23IT321 - Đào Thanh Vương</strong></summary>
<br>

**💬 Nhận xét chung**
- Bài làm rất tốt.
- Tất cả chức năng đều chạy được và chạy đúng.

**🔧 Cần cải thiện**
- Phần views Book nên cho nó in thông tin mỗi BOOK trên 1 dòng luôn, tốt nhất là in là hàm toString() của book đó.
- Nên tách từng class thành từng file để dễ quản lí.
</details>

<details>
<summary> <strong>👨‍🎓 23IT032 - Ngô Khắc Cường</strong></summary>
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
<summary> <strong>👨‍🎓 23IT268 - Nguyễn Đức Thuận</strong></summary>
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
<summary> <strong>👨‍🎓 23IT142 - Hùng Vũ Long</strong></summary>
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
<summary> <strong>👨‍🎓 23IT082 - Chu Ngọc Hoàng</strong></summary>
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
<summary> <strong>👨‍🎓 23IT154 - Bùi Đoàn Duy Lưu</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chạy được, tất cả chức năng hoạt động rất tốt

**🔧 Cần cải thiện**
- Khi thêm sách, cần kiểm tra xem **bookId** của sách mới đã tồn tại chưa, vì không thể cả 2 sách của cùng **bookId**
</details>


<details>
<summary> <strong>👩‍🎓 23IT117 - Từ Thị Thanh Hương</strong></summary>
<br>

**💬 Nhận xét chung**
- Tất cả các file đều là file **\*.class**, không thể chạy được.

**🔧 Cần cải thiện**
- Cần xem lại cách nén file và nộp bài.
</details>

<details>
<summary> <strong>👨‍🎓 23IT259 - Phạm Văn Thiện</strong></summary>
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
<summary> <strong>👨‍🎓 23IT285 - Nguyễn Thanh Triều</strong></summary>
<br>

**💬 Nhận xét chung**
- Code không chạy được do nén file sai cách.
- Hàm khởi tạo mặc định viết chủ quan.
- Cách chức năng xử lí khá tốt.

**🔧 Cần cải thiện**
- Cần xem lại cách nén file [Tại đây](https://github.com/zukahai/java-basic-and-object-oriented-programing/blob/main/submit.md)
- Nên viết các hàm khởi tạo mặc định, trong hàm đó gán tất cả thuộc tính của nó là mặc định.
- Khi thêm sách, cần kiểm tra xem **bookId** của sách mới đã tồn tại chưa, vì không thể cả 2 sách của cùng **bookId**
- 2 phương thức **searchBook()** nên có kiểu trả về. Xong mới in ra ở menu.
- Code nhìn khá ổn, tiếc là không chạy được, cần nén cả **project** thay vì nén mỗi **package**.
</details>

<details>
<summary> <strong>👩‍🎓 23IT001 - Đặng Ngọc Thúy An</strong></summary>
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
<summary> <strong>👨‍🎓 23IT274 - Nguyễn Tiến</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chạy được.
- Tạo các class tốt.
- Còn một số lỗi cần cải thiện.

**🔧 Cần cải thiện**
- Chú ý chính tả ở class **BôkManager**
- Khi thêm sách, cần kiểm tra xem **bookId** của sách mới đã tồn tại chưa, vì không thể cả 2 sách của cùng **bookId**
- In thông tin của sách nên in trên 1 dòng bằng hàm **toString()**
- Còn bị lỗi bộ nhớ đệm, không nhập được **title**. Xem các giải quyết ở mục 1 [Tại đây](https://github.com/zukahai/java-basic-and-object-oriented-programing/blob/main/bugs.md)
- Mỗi lần thực hiện xong một chức năng cần hiển thị lại Menu cho người dùng xem.
</details>

<details>
<summary> <strong>👨‍🎓 23IT239 - Trần Như Sum</strong></summary>
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
<summary> <strong>👨‍🎓 23IT015 - Nguyễn Hoàng Nhật Bảo</strong></summary>
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
```
- Khi thêm sách, cần kiểm tra xem **bookId** của sách mới đã tồn tại chưa, vì không thể cả 2 sách của cùng **bookId**
- Các hàm tìm kiếm nên có kiểu tra về.
- Cần kiêm tra file trước khi nộp, tránh nộp bài nhiều lần.
</details>

<details>
<summary> <strong>👨‍🎓 23IT048 - Lê Duy Đạt</strong></summary>
<br>

**💬 Nhận xét chung**
- Code không chạy được. *(Nén code sai)*
- Tạo các class và chức năng tốt.
- Tạo các chức năng tốt.
- Bài làm có vẻ rất tốt nhưng lại không chạy được.

**🔧 Cần cải thiện**
- Nén file chưa đúng cách, các nén cả cả **project** chứ không phải mỗi **package**, xem cách nén code [Tại đây](https://github.com/zukahai/java-basic-and-object-oriented-programing/blob/main/submit.md)
- Khi thêm sách, cần kiểm tra xem **bookId** của sách mới đã tồn tại chưa, vì không thể cả 2 sách của cùng **bookId**

</details>

<details>
<summary> <strong>👩‍🎓 23IT156 - Phan Khánh Ly</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chưa chạy được *(Nén code sai cách)*
- Tạo các class tốt
- Các hàm viết tốt, nhất là hàm tìm kiếm

**🔧 Cần cải thiện**
- Nén file chưa đúng cách, các nén cả cả **project** chứ không phải mỗi **package**, xem cách nén code [Tại đây](https://github.com/zukahai/java-basic-and-object-oriented-programing/blob/main/submit.md)
- Khi thêm sách, cần kiểm tra xem **bookId** của sách mới đã tồn tại chưa, vì không thể cả 2 sách của cùng **bookId**
- Bài làm có vẻ chạy rất tốt, chỉ tiếc là nén code sau cách.
</details>

<details>
<summary> <strong>👨‍🎓 23IT036 - Hoàng Công Dũng</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chạy được
- Các hàm viết rất tốt
- Vẫn chưa đủ các yêu cầu của đề.


**🔧 Cần cải thiện**
- Nên xoá các file **.class** đi trước khi nộp bài, tránh rối.

- Các chức năng sắp xếp có vẻ chưa hoạt động
```text
Nhap lua chon cua ban: 5.1
Book{bookID=0, title='0', author='0', price=0}
Book{bookID=1, title='1', author='1', price=1}
Book{bookID=1, title='1', author='1', price=1}
Book{bookID=2, title='2', author='2', price=100}
Book{bookID=1, title='1', author='1', price=1}
```
- Chưa ghi đè lại phương thức **toString()**
- Khi thêm sách, cần kiểm tra xem **bookId** của sách mới đã tồn tại chưa, vì không thể cả 2 sách của cùng **bookId**
- Cần hiển thị lại menu sao mỗi lần thực hiện xong chức năng.
</details>

<details>
<summary> <strong>👨‍🎓 23IT148 - Võ Đình Lộc</strong></summary>
<br>

**💬 Nhận xét chung**
- Code không chạy được (*Nén code sai cách và lỗi chương trình)*
- Tạo các class tốt.

**🔧 Cần cải thiện**
- Nén file chưa đúng cách, các nén cả cả **project** chứ không phải mỗi **package**, xem cách nén code [Tại đây](https://github.com/zukahai/java-basic-and-object-oriented-programing/blob/main/submit.md)
- Khi thêm sách, cần kiểm tra xem **bookId** của sách mới đã tồn tại chưa, vì không thể cả 2 sách của cùng **bookId**
- Nên đọc kỹ đề, chỉ có lớn hơn thôi
```java
public boolean isBigBook (eBook c) {
    return c.getFileSizeMB() >= 200;
}
```
- Nên dùng hàm **size()** để lấy kích thước của **List** chứ không cần biến phụ.
- Hàm **displayBooks()** kiểu void nên không thể in ra được.
</details>

<details>
<summary> <strong>👨‍🎓 23IT166 - Trần Châu Minh</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chạy được.
- Tạo các class rất tốt.
- Viết menu rất tốt.
- Còn một sô lỗi chức năng

**🔧 Cần cải thiện**
- Kiểm tra id đã tồn tại sai cách, từ khoá **instanceof** để kiếm tra 1 đối tượng của thuộc class đó hay không thôi.
```java
if (b instanceof Book) // chỉ kiểm tra được b có phải class Book hay không, không thể biết được id đã tồn tại chưa
    System.out.println("Thêm sách thất bại. Mã sách đã tồn tại");
```
- Hàm tìm kiếm theo **title** nên trả về một danh sách vì có thể có nhiều sách cùng **title**
- Để so sánh chuỗi nên dùng hàm **equals()** thay vì dùng **==**, xem mục 3 [Tại đây](https://github.com/zukahai/java-basic-and-object-oriented-programing/blob/main/bugs.md)
</details>

<details>
<summary> <strong>👨‍🎓 23IT256 - Trần Mạnh Thắng</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chạy được.
- Tạo các class tốt.
- Các chức năng chạy tốt.
- Menu dễ dùng.

**🔧 Cần cải thiện**
- Đọc kỹ để phần hàm **isBigBook()**. Chỉ lớn hơn 200MB thôi.
- Khi thêm sách, cần kiểm tra xem **bookId** của sách mới đã tồn tại chưa, vì không thể cả 2 sách của cùng **bookId**
- Nên xoá cái file **.class** trước khi nộp bài tránh loạn.
</details>

<details>
<summary> <strong>👨‍🎓 23IT301 - Nguyễn Thanh Tùng</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chạy được.
- Tạo các class tốt.
- Các chức năng 1, 3, 4, 5, 6 và 7 hoạt động tốt.
- Menu dễ sử dụng.

**🔧 Cần cải thiện**
- Hàm **isBigFile()** còn sai chỗ >= 200, chỉ > 200 thôi, cần đọc kĩ đề.
- Kiểm tra Id đã tồn tại bị sai, trong khi **c** là lựa chọn phía trên chứ không phải là **bookId** em nhập vào, phải thay **c** thành **bookID.getBookId()**
```java
Book tmp = bmanager.searchBook(c);
if (tmp != null)
    System.out.println("Them sach that bai.Sach da ton tai");
else {
    bmanager.addBook(bookID);
    System.out.println("Them sach thanh cong");
}
```
</details>

<details>
<summary> <strong>👨‍🎓 23IT088 - Nguyễn Văn Hoàng</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chạy được.
- Tạo class tốt
- Các chức năng hoạt động tốt, trừ chức năng thêm chưa kiểm tra được trùng **id**.
- Menu rất dễ sử dụng
**🔧 Cần cải thiện**
- Khi thêm sách, cần kiểm tra xem **bookId** của sách mới đã tồn tại chưa, vì không thể cả 2 sách của cùng **bookId**
- Phần nhập dữ liệu nên dùng **System.out.print** trước của dòng in ra nhập gì đó, cho dễ nhập, ví dụ **System.out.print("Nhập ID: ")**
</details>


<details>
<summary> <strong>👨‍🎓 23IT198 - Huỳnh Đức Nhật</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chạy được.
- Các class tạo tốt.
- Menu rõ ràng
- Các chức năng hoạt động tốt, trừ chức năng thêm.
- Cấu trúc file rõ ràng

**🔧 Cần cải thiện**
- Thông tin sách nên in trên 1 dòng cho dễ xem, vì khi in ra danh sách nhiều cuôn sách sẽ rất khó xem.
- Khi thêm sách, cần kiểm tra xem **bookId** của sách mới đã tồn tại chưa, vì không thể cả 2 sách của cùng **bookId**
- Sau khi thực hiện xong một chức năng nên hiển thị lại menu cho người dùng dễ sử dụng.
</details>

<details>
<summary> <strong>👨‍🎓 23IT255 - Phạm Quốc Thắng</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chạy được.
- Tạo các class tốt, nhưng vẫn còn hàm lỗi
- Các chức năng rõ ràng
- Menu thực sự dễ dùng
- Bài làm rất tốt

**🔧 Cần cải thiện**
- Hàm **isBigFile()** còn sai chỗ >= 200, chỉ > 200 thôi, cần đọc kĩ đề.
- Khi thêm sách, cần kiểm tra xem **bookId** của sách mới đã tồn tại chưa, vì không thể cả 2 sách của cùng **bookId**
</details>

<details>
<summary> <strong>👨‍🎓 23IT296 - Nguyễn Thanh Tú</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chưa chạy được *(Nén file sai cách và còn lỗi khi biên dịch)*
- Các class tạo rất tốt
- Chưa tận dùng được các hàm trong class đã tạo.

**🔧 Cần cải thiện**
- Cần nén code đúng quy định, nên cả **project** chứ không phải mỗi **package**, xem cách nén code [Tại đây](https://github.com/zukahai/java-basic-and-object-oriented-programing/blob/main/submit.md)
- Nên gọi hàm **input()** đã viết để nhập thông tin sách
- Khi thêm sách, cần kiểm tra xem **bookId** của sách mới đã tồn tại chưa, vì không thể cả 2 sách của cùng **bookId**
- Cần kiểm tra file trước khi nộp, tránh nộp bài nhiều lần.
</details>

<details>
<summary> <strong>👨‍🎓 23IT106 - Nguyễn Trọng Minh Huy</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chưa chạy được *(Nén file sai cách)*
- Tạo các class tương đối ổn, những còn nhiều hàm chưa hợp lí.
- Menu dễ hiểu, dễ dùng
- Có kiểm tra được id trùng lặp khi thêm, rất tốt.

**🔧 Cần cải thiện**
- Cần nén code đúng quy định, nên cả **project** chứ không phải mỗi **package**, xem cách nén code [Tại đây](https://github.com/zukahai/java-basic-and-object-oriented-programing/blob/main/submit.md)
- Các hàm kiểm tra nên sử dung **boolean** làm kiểu trả về, áp dụng cho hàm **isBigBook()**.
</details>

<details>
<summary> <strong>👨‍🎓 23IT283 - Lê Quốc Trí</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chưa chạy được **(Biên dịch lỗi)**
- Có kiểm tra ID bị trùng khi thêm sách, rất tốt
- Một số hàm viết sai và cách gọi chưa đúng.

**🔧 Cần cải thiện**
- Nên tạo package chứa các class đẻ sau này dễ phát triển
- Các hàm **searchBook()** có kiểu trả về nên cần phải in nó ra mới các thể thấy được.
- Các hàm **getTitle, getBookID** không tồn tại bên **BookManager** nên không gọi được
</details>

<details>
<summary> <strong>👨‍🎓 23IT248 - Nguyễn Đình Thái</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chưa chạy được, *(Nên file sai cách)*
- Các class tạo tương đổi ổn, vẫn còn một số hàm chưa hợp lí.
- Menu dễ sử dụng.

**🔧 Cần cải thiện**
- Cần nén code đúng quy định, nên cả **project** chứ không phải mỗi **package**, xem cách nén code [Tại đây](https://github.com/zukahai/java-basic-and-object-oriented-programing/blob/main/submit.md)
- Hàm tìm kiếm theo **title** nên cho nó trả về 1 danh sách, vì đôi khi sẽ nhiều sách có cùng **title**, cần đưa ra hết.
- Khi thêm sách, cần kiểm tra xem **bookId** của sách mới đã tồn tại chưa, vì không thể cả 2 sách của cùng **bookId**
</details>

<details>
<summary> <strong>👨‍🎓 23IT018 - Phạm Quốc Bảo</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chưa chạy được *(Nên file sai cách)*, File em gửi chỉ gồm những file **.class** thôi chứ chưa phải là file **.java**

**🔧 Cần cải thiện**
- Cần nén code đúng quy định, xem cách nén code [Tại đây](https://github.com/zukahai/java-basic-and-object-oriented-programing/blob/main/submit.md)


</details>

<details>
<summary> <strong>👨‍🎓 23IT191 - Nguyễn Quang Nhân</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chạy được.
- Các class tạo tốt
- Menu dễ sử dụng
- Bài làm tốt

**🔧 Cần cải thiện**
- Hàm tìm kiếm theo **title** nên cho nó trả về 1 danh sách, vì đôi khi sẽ nhiều sách có cùng **title**, cần đưa ra hết.
- Khi thêm sách, cần kiểm tra xem **bookId** của sách mới đã tồn tại chưa, vì không thể cả 2 sách của cùng **bookId**
- Phàn tìm sách nếu không tìm thấy cũng nên đưa ra 1 thông báo là không tìm thấy.
</details>

<details>
<summary> <strong>👩‍🎓 23IT245 - Phan Thanh Tâm</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chạy chạy được *(Nên file sai cách)*, các file là **.class** chứa không phải là file **.java**.

**🔧 Cần cải thiện**
- Cần nén code đúng quy định, xem cách nén code [Tại đây](https://github.com/zukahai/java-basic-and-object-oriented-programing/blob/main/submit.md)
</details>


<details>
<summary> <strong>👩‍🎓 23IT252 - Trịnh Thị Thanh Thảo</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chạy được.
- Tạo 3 class tốt.
- Các phương thức chưa thực sự tốt.
- Menu dễ dùng.

**🔧 Cần cải thiện**
- Các hàm tìm kiếm sách nên cho nó có kiểu trả về, sau đó ở Menu mới in kết quả ra.
- Khi chưa có sách, mà người dùng muốn xem sách nên hiển thị cho người dùng một thông báo.
- Hàm **input()** ở 2 class con chưa gọi hàm **input()** ở class cha nên nó chưa cho phép nhập những thông tin như bookID, title, author
- Chức năng 6, 7 chưa hoạt động.
- Phương thức **sortBooksByType** chưa hợp lí.
</details>


<details>
<summary> <strong>👨‍🎓 23IT069 - Trần Thành Hậu</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chưa chạy được *(Nén code chưa hợp lí)*
- Tạo các class tốt.
- Menu có vẻ dễ nhìn, dễ sử dụng.
**🔧 Cần cải thiện**
- Cần nén code đúng quy định, cần nén cả **project** chứ không phải mỗi **package**, xem cách nén code [Tại đây](https://github.com/zukahai/java-basic-and-object-oriented-programing/blob/main/submit.md)
- Khi thêm sách, cần kiểm tra xem **bookId** của sách mới đã tồn tại chưa, vì không thể cả 2 sách của cùng **bookId**
- Các hàm tìm kiếm sách nên cho nó có kiểu trả về, sau đó ở Menu mới in kết quả ra.

</details>


<details>
<summary> <strong>👨‍🎓 23IT160 - Văn Công Mạnh</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chạy được.
- Menu dễ sử dụng, tuy nhiên chưa kết thúc menu được.
- Tạo các class tốt.

**🔧 Cần cải thiện**
- Các hàm tìm kiếm sách nên cho nó có kiểu trả về, sau đó ở Menu mới in kết quả ra.
- Khi thêm sách, cần kiểm tra xem **bookId** của sách mới đã tồn tại chưa, vì không thể cả 2 sách của cùng **bookId**
- Chức năm 0. Exit chưa hoạt đông, em có thể dùng lệnh **break** ở case 0.
</details>


<details>
<summary> <strong>👩‍🎓 23IT169 - Văn Thị Phước My</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chạy được.
- Các class Book tạo rất tốt.
- Các chức năng ở **BookManager** chưa hoàn thiện.

**🔧 Cần cải thiện**
- Thiếu hàm **isBigFile()**
- Hàm tìm kiếm theo **title** nên cho nó trả về 1 danh sách, vì đôi khi sẽ nhiều sách có cùng title, cần đưa ra hết.
</details>

<details>
<summary> <strong>👨‍🎓 23IT125 - Nguyễn Đức Khánh</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chưa chay được *(Gửi file sai định dạng)*
- Tạo các class tốt.

**🔧 Cần cải thiện**
- Thay vì gửi file doc thì nên nén file theo hướng dẫn [Tại đây](https://github.com/zukahai/java-basic-and-object-oriented-programing/blob/main/submit.md)
</details>

<details>
<summary> <strong>👨‍🎓 23IT113 - Lê Minh Hưng</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chưa chay được *(Gửi file sai định dạng)*
- Chỉ có class **Book**

**🔧 Cần cải thiện**
- Thay vì gửi file doc thì nên nén file theo hướng dẫn [Tại đây](https://github.com/zukahai/java-basic-and-object-oriented-programing/blob/main/submit.md)
</details>

<details>
<summary> <strong>👨‍🎓 23IT162 - Đinh Trần Tiến Minh</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chưa chay được *(Gửi file sai định dạng)*
- Tạo các class tốt.
**🔧 Cần cải thiện**
- Thay vì gửi file doc thì nên nén file theo hướng dẫn [Tại đây](https://github.com/zukahai/java-basic-and-object-oriented-programing/blob/main/submit.md)
- Các hàm searchBook nên có kiểu dữ liệu trả về, sau đó trong Menu mới in ra.
</details>

<details>
<summary> <strong>👨‍🎓 23IT058 - Lê Công Đức</strong></summary>
<br>

**💬 Nhận xét chung**
- Code chay được.
- Tạo các class tốt.
- Có kiểm tra được trùng ID trong lúc thêm.
- Menu dễ hiểu dễ dùng.
**🔧 Cần cải thiện**
- Các hàm searchBook nên có kiểu dữ liệu trả về, sau đó trong Menu mới in ra.
- Nên nộp bài đúng hạn.
</details>

</details>
<br>

### Ví dụ 2: Quản lí trái cây

> Nộp bài **[Tại đây](https://forms.gle/rFwUbV2DZCGu5YZY7)**, chỉ nhận bài tập đến **0h00 ngày 31 tháng 10 năm 2023**
> Chỉ được nộp bài 1 lần nên cần kiểm tra kĩ trước khi nộp

Siêu thị trái cây quản lý trái cây với các thông tin như mã, tên, giá và số lượng như sau:
- **Fruit** (**id**:int, **name**:String, **price**:double)
- **FruitIn** là mô tả trái cây trong nước, quản lý thêm phí nội bộ **extraIn**: double
- **FruitOut** là mô tả trái cây nhập khẩu, quản lý thêm xuất xứ **orgin**: String và phí nhập khẩu **extraOut**: double

**Thực hiện các yêu cầu sau:**

- Định nghĩa interface **IFruit** với các phương thức định giá bán tới người dùng **priceForSale()**

- Định nghĩa lớp **Fruit** cài đặt (implement) giao diện **IFruit**, với các thuộc tính và phương thức
theo yêu cầu.

- Định nghĩa lớp **FruitIn** kế thừa lớp **Fruit**.

- Định nghĩa lớp **FruitOut** kế thừa lớp **Fruit**.
- Yêu cầu tính giá bán của trái cây **priceForSale**, biết rằng
    - Giá bán **FruitIn** bằng giá **price** cộng với phí nội bộ **extraIn** .
    - Giá bán **FruitOut** bằng giá **price** cộng với phí nhập khẩu **extraOut** và 10% của **extraOut**
- **Câu 5**. Định nghĩa lớp FruitList với thuộc tính và các phương thức sau:
```text
- 1. Thêm Fruit vào danh sách gồm FruitIn và FruitOut
- 2. In ra danh sách Fruit
- 3. In danh sách FruitIn và FruitOut có priceForSale lớn hơn 20
- 4. Tính tổng số Fruit có trong danh sách
- 5. Viết chương trình theo dạng Menu Driven Program
```

### Ví dụ 3: Quản lí sản phẩm

Tạo Interface **IManager\<T>** bao gồm:
- Các phương thức trừa tượng:
    - void **add(T t)**, đùng dể thêm
    - T **search(int id)**, đùng dể tìm kiếm theo id
    - void **remove(int id)**, dùng để xoá
    - ArrayList\<T> **search(String name)**, tìm kiếm theo tên
    - ArrayList\<T> **getAll()**, đùng để lấy tất cả danh sách
    - void **displayAll()**, đùng để in danh sách

Tạo Interface **ISort** bao gồm:
- Các phương thức trừa tượng:
    - void **sortById()**, dùng để sắp xếp tăng dần theo **id**
    - void **sortById(boolean reverse)**, nếu **reverse** bằng true thì sắp xếp giảm dần ngược lại sắp xếp tăng dần theo **id**

Tạo Interface **ISortPrice**
- Các phương thức trừa tượng:
    - void **sortByPrice()**, dùng có sắp xếp tên theo **priceForSale**
    - void **sortByPrice(boolean reverse)**, nếu **reverse** bằng true thì sắp xếp giảm dần, ngược lại sắp xếp tăng giảm theo **priceForSale**

Tạo class **TypeProduct** dùng để biểu diễn tập hợp những loại sản phẩm.<br>Bao gồm:
- Các thuộc tính:
    - **id**: int, dùng để đại diện cho mã loại sản phẩm.
    - **name**: String, dùng để đại diện cho tên loại sản phẩm.
    - **description**: String, dùng có dùng cho mô tả của loại sản phẩm.
- Các phương thức:
    - Các phương thức khởi tạo mặc định, khởi tạo có tham số.
    - Các phương thức **getter**, **setter** cho các thuộc tính
    - Phương thức **input()** cho phép nhập thông tin các thuộc tính từ bàn phím.
    - Phương thức **toString()**, cho phép trả về 1 chuỗi chứa đầy đủ thông tin.

Tạo abstract class **Product** dùng để đại diện cho tập hợp những sản phẩm.<br>Bao gồm:
- Các thuộc tính:
    - **id**: int, d­ùng để đại diện cho mã sản phẩm
    - **name**: String, dùng đại diện cho tên sản phẩm.
    - **type**: TypeProduct, dùng đại diện cho loại sản phẩm.
    - **price**: long, dùng để đại diện cho giá của sản phẩm.
- Các phương thức:
    - Các phương thức khởi tạo mặc định, khởi tạo có tham số.
    - Các phương thức **getter**, **setter** cho các thuộc tính
    - Phương thức **input()** cho phép nhập thông tin các thuộc tính từ bàn phím.
    - Phương thức trừa tượng **priceForSale()**: long

Tạo class **ProductIn** kế thừa class **Product** dùng để đại diện cho tập hợp những sản phẩm nội địa.<br>Bao gồm:
- Các thuộc tính thêm:
    - **extraIn**: long dùng để đại diện cho phí nội bộ của sản phẩm.
- Các phương thức:
    - Các phương thức khởi tạo mặc định, khởi tạo có tham số.
    - Các phương thức **getter**, **setter** cho các thuộc tính
    - Ghi đè phương thức **input()** và **toString()**
    - Định nghĩa phương thức **priceForSale()** tính bằng chi phí **price** cộng thêm phí nội bộ **extraIn**

Tạo class **ProductOut** kế thừa class **Product** dùng để đại diện cho tập hợp những sản phẩm nhập khẩu.<br>Bao gồm:
- Các thuộc tính thêm:
    - **extraOut**: long dùng để đại diện cho phí nhập khẩu của sản phẩm.
- Các phương thức:
    - Các phương thức khởi tạo mặc định, khởi tạo có tham số.
    - Các phương thức **getter**, **setter** cho các thuộc tính
    - Ghi đè phương thức **input()** và **toString()**
    - Định nghĩa phương thức **priceForSale()** tính bằng chi phí **price** cộng thêm phí nhập khẩu **extraOut**, cộng thêm với 10% **extraOut**

Tạo class **TypeProductManager** thực hiện interface **IManager\<TypeProduct>** và interface **ISort**.<br>Bao gồm:
- Các thuộc tính:
    - **typeProducts**: ArrayList\<TypeProduct>, đại diện cho danh sách loại sản phẩm.
- Các phương thức:
    - Các phương thức khởi tạo mặc định, khởi tạo có tham số.
    - Các phương thức **getter**, **setter** cho các thuộc tính.
    - Định nghĩa các phương thức trong interface **IManager\<TypeProduct>**.
    - Định nghĩa các phương thức trong interface **ISort**

Tạo class **ProductManager** thực hiện interface **IManager\<Product>**, interface **ISort** và interface **ISortPrice**.<br>Bao gồm:
- Các thuộc tính:
    - **products**: ArrayList\<Product>, đại diện cho danh sách loại sản phẩm.
- Các phương thức:
    - Các phương thức khởi tạo mặc định, khởi tạo có tham số.
    - Các phương thức **getter**, **setter** cho các thuộc tính.
    - Định nghĩa các phương thức trong interface **IManager\<Product>**.
    - Định nghĩa các phương thức trong interface **ISort**.
    - Định nghĩa các phương thức trong interface **ISortPrice**

Tạo class **Menu** gồm các chức năng như sau:
```text
1. Quản lí loại sản phẩm
    1.1. Xem thông tin loại sản phẩm
    1.2. Tạo loại sản phẩm
    1.3. Tìm kiếm loại sản phẩm
        1.3.1. Tìm kiếm theo id
        1.3.2. Tìm kiếm theo tên loại sản phẩm
    1.4. Sắp xếp loại sản phẩm
        1.4.1. Sắp xếp tăng dần theo id
        1.4.2. Sắp xếp giảm dần theo id
        1.4.3. Sắp xếp giảm dần theo số lượng sản phẩm có loại sản phẩm đó.
    1.5. Đưa ra danh sách sản phẩm dựa vào TypeProduct
    1.6. Xoá loại sản phẩm
    1.7. Thoát quản lí sản phẩm
2. Quản lí sản phẩm
    2.1. Xem thông tin sản phẩm
        2.1.1. Xem danh sách tất cả sản phẩm
        2.1.2. Xem danh sách sản phẩm nội địa
        2.1.3. Xem danh sách sản phẩm nhập khẩu
        2.1.4. Xem những sản phẩm có giá bán ra lớn hơn 100000
    2.2. Tạo sản phẩm
        2.2.1. Tạo sản phẩm nội địa
        2.2.2. Tạo sản phẩm nhập khẩu
    2.3. Tìm kiếm sản phẩm
        2.3.1. Tìm kiếm theo id
        2.3.2. Tìm kiếm theo tên
    2.4. Sắp xếp sản phẩm
        2.4.1. Sắp xếp tăng dần theo id
        2.4.2. Sắp xếp giảm dần theo id
        2.4.3. Sắp xếp tăng dần theo giá bán ra
        2.4.4. Sắp xếp giảm dần theo giá bán ra
    2.5. Xoá sản phẩm
    2.6. Thoát quản lí sản phẩm
3. Thoát chương trình
```

- **Chú ý**:
    - Trong các loại sản phẩm và sản phẩm thì **id** là duy nhất, không thể có 2 sản phẩm hay loại sản phẩm cùng **id**.
    - Ở chức năng **1.4.3. Sắp xếp giảm dần theo số lượng sản phẩm có loại sản phẩm đó**. Có nghĩa là loại sản phẩm nào có nhiều sản phẩm hơn sẽ ưu tiên lên trước khi sắp xếp.
    - Ở chức năng **2.2 Tạo sản phẩm**. Lúc thao tác đến phần nhập TypeProduct. Bạn cần đưa ra danh sách TypeProduct. và cho phép người dùng chọn 1 trong số đó.
    - Ở chức năng **1.5. Đưa ra danh sách sản phẩm dựa vào TypeProduct**. Cũng cần phải đưa ra danh sách loại sản phẩm cho người dùng chọn.
    - Ở chức năng **1.6. Xoá loại sản phẩm**. Cần phải xoá luôn những sản phẩm mang loại sản phẩm đó.
    - Ở 2 menu lớn là **Quản lí loại sản phẩm** và **Quản lí sản phẩm** chỉ thoát ra khi người dùng chọn thoát chương trình quản lí đó.

