<div align="center">

# Một số lỗi thường gặp

</div>

## 1. Lỗi bộ nhớ đệm, không có nhập chuỗi

Lỗi này thường xảy ra khi bạn nhập số, sau đó lại nhập chuỗi.
Ví dụ:

```java
public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập số: ");
    int n = sc.nextInt();
    System.out.print("Nhập chuỗi: ");
    String s = sc.nextLine();
    
    System.out.println("Số vừa nhập: " + n);
    System.out.println("Chuỗi vừa nhập: " + s);
}
```

Với đoạn code trên chúng ta cho phép nhập mỗi số, sau đó nhập một chuỗi, nhưng kết quả ở màn hình console là

```text
Nhập số: 2023
Nhập chuỗi: Số vừa nhập: 2023
Chuỗi vừa nhập: 
```

Chương trình không cho phép chúng ta dừng lại để nhập chuỗi, mà chạy tiếp phần lệnh phía dưới.

Lý do là khi bạn sử dụng **nextInt()** hoặc các phương thức tương tự, chúng đọc giá trị của kiểu dữ liệu mong muốn nhưng không đọc ký tự dòng mới *(newline character)* sau giá trị đó. Dấu newline này vẫn còn lại trong bộ đệm sau khi bạn nhập số và nhấn Enter.

Khi bạn sau đó gọi **nextLine()**, phương thức này sẽ đọc dòng mới chứa dấu newline từ bộ đệm và trả về một chuỗi trống (empty string), và sau đó bạn có thể nhập tiếp chuỗi hoặc văn bản khác mà bạn muốn.

**Cách giải quyết**

Để sửa lỗi trên chúng ta cần gọi hàm **nextLine()** giữa nhập số và chuỗi để có thể xoá *(newline character)* trong bộ nhớ điểm trước khi nhập chuỗi.

```java
public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập số: ");
    int n = sc.nextInt();
    
    sc.nextLine(); // Xoá bộ nhớ đệm
    
    System.out.print("Nhập chuỗi: ");
    String s = sc.nextLine();
    
    
    System.out.println("Số vừa nhập: " + n);
    System.out.println("Chuỗi vừa nhập: " + s);
}
```

Lúc này chương trình đã chạy đúng như mình mong muốn:

```text
Nhập số: 2023
Nhập chuỗi: HaiZuka
Số vừa nhập: 2023
Chuỗi vừa nhập: HaiZuka
```
