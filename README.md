<div align="center">

# Hướng dẫn cài đặt JDK và eclipse để chạy Java
</div>

<hr>

## Mục lục

[1. Cài đặt JDK](#1-cài-đặt-jdk)

[2. Cài đặt Eclipse](#2-cài-đặt-eclipse)

[3. Chạy chương trình java](#3-chạy-chương-trình-java)

[4. Một số cài đặt trên eclipse](#4-một-số-cài-đặt-trên-eclipse)

[5. Cài đặt Visual Studio Code](#5-cài-đặt-visual-studio-code)


<hr>


Xin chào các bạn, nếu bạnd đang muốn cài đặt java để học tập thì xem hướng dẫn bên dưới nhé.

Để cài đặt vào chạy chương trình java bản cần:

### 1. Cài đặt JDK
JDK là môi trường để chạy ngôn ngữ java.
Hiện có rất nhiều bản JDK nhưng theo kinh nghiệm của mình thì bản JDK8 là ổn định nhất.
Các bạn cóp thể tải JDK8 [Tại đây](https://app.downloadvn.com/8cwmfb7upg/F-_-F1ml0ZEiPGnDvAifTw/1694495852/jdk-8u45-windows-x64.exe)

Sau khi tải về các bạn tiến hành cài đặt bẳng cách mở file exe vừa tải.

Đoạn này thì cứ next hết nha, để mặc định các thông số của nó.

Sau khi hoàn thành các bạn kiểm tra copy đoạn mã bên dưới:

``` text
C:\Program Files\Java\jre1.8.0_45\bin
```

Tiếp đến mở file explorer bằng cách gõ window + E:

<div align="center">
<img src="./setup/setup1.png">


Chuột phải vào **This PC** và chọn **properties**:
</div>

<div align="center">
<img src="./setup/setup2.png">


</div>

Chọn **Advanced system settings**

<div align="center">
<img src="./setup/setup3.png">

</div>

Chọn **Environment variables**

<div align="center">
<img src="./setup/setup4.png">

</div>

Tại đây cần nhìn vào **Path** sau đó chọn **Edit**

<div align="center">
<img src="./setup/setup5.png">

</div>

Tiếp theo hãy chọn **new**

<div align="center">
<img src="./setup/setup6.png">

</div>

Tiếp theo thêm đoạn path bên dưới
```
C:\Program Files\Java\jre1.8.0_45\bin
```

Sau đó chọn **OK**

<div align="center">
<img src="./setup/setup7.png">

</div>

Để kiểm tra bạn đã cài đặt thành công JDK chưa hãy gõ: window + R gõ cmd

<div align="center">
<img src="./setup/setup15.png">

</div>

Tiếp theo gõ:
```
java -version
```

Nếu kết quả như bên dưới thì bạn đã cài đặt thành công JDK

<div align="center">
<img src="./setup/setup8.png">

</div>

### 2. Cài đặt Eclipse

Tiếp theo bạn cần cài đặt Eclipse:

Bạn có thể tải eclipse ở [Tại đây](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2023-06/R/eclipse-inst-jre-win64.exe&mirror_id=1311)

Mở file vừa tải và làm các bước sau:

Chọn **Eclipse IDE for Developers**

<div align="center">
<img src="./setup/setup9.png">

</div>

Chọn **Install** chờ cài đặt xong vào chọn **Launch**

Tiếp theo chọn folder lưu trữ code của bạn, sau đó chọn **Launch**
<div align="center">
<img src="./setup/setup10.png">

</div>

Tiếp tục chọn **Continue**, lúc này giao diện eclipse sẽ như thế này.

<div align="center">
<img src="./setup/setup11.png">

</div>

Chúc mừng bạn đã cài đặt xong eclipse

### 3. Chạy chương trình java

Bạn hãy thử tạo chương trình java đầu tiên nhé.

Chọn **File** -> **New** -> **Java Project**

Nhập tên sau đó chọn **Finish**

<div align="center">
<img src="./setup/setup12.png">

</div>

Tại folder **src** chọn **File** -> **New** -> **Package**

<div align="center">
<img src="./setup/setup13.png">

</div>

Đặt tên package và chọn **Finish**

Tại package vừa tạo, chuột phải chọn **new** -> **Class**

Đặt tên class và chọn **Finish**

Trong hàm main hãy viết dòng code như sau:
```Java
public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println("Hello world!");
}
```

Chọn **Run** để chạy chương trình:

<div align="center">
<img src="./setup/setup14.png">

</div>

Nếu phần **Terminal** hiện thị *Hello world!* thì bạn đã thành công.

### 4. Một số cài đặt trên eclipse

#### 4.1 Gợi ý code

Gợi ý code sẽ giúp tốc đó code của các bạn nhanh hơn, sẽ tự động import các thư viện mà bạn cần.

Các bạn có thể thử tính năng này bằng cách gõ thử **scan** sao đó bấm tổ hợp phím **Ctrl + Space** nếu dòng code đó thành như bên dưới thì IDE của bạn đã mở tính năng này.

<div align="center">
<img src="./setup/setup16.png">

</div>

Nếu không hiện ra bạn có thể bật tính năng này bằng cách sau:

Bấm **Window>Preferences>Java>Editor>Content Assist>Advanced**

Đánh dấu vào tất cả sau đó chọn **Apply and close**:

<div align="center">
<img src="./setup/setup17.png">

</div>

Sau bước này bạn hãy khởi động lại IDE và thử lại tính năng đó nhé.

### 5. Cài đặt Visual Studio Code
*Lưu ý: Bạn chỉ cần sử dụng 1 tỏng 2 IDE là eclipse hoặc Visual Studio Code*

Phần cài đặt vsocde khá là dễ nên mình sẽ qua nhanh phần này.

Sau khi cài đặt vscode các bạn mở lên, lúc này giao diện sẽ như sau:

<div align="center">
<img src="./setup/vsc1.png">

</div>

Khi mới tải về các bạn cần làm thêm 2 bước sau:

Bước 1: Cài đặt extension **code Runner**

Gõ **Ctrl + Shift + X** hoặc click vào icon Extension để mở cửa số extension.

<div align="center">
<img src="./setup/vsc2.png">

</div>

Tiếp theo gõ **Code Runner**, chọn extension Code Runner và tiến hành cài đặt.

<div align="center">
<img src="./setup/vsc3.png">
</div>


<div align="center">
<img src="./setup/vsc12.png">
</div>

Bước 2: Setting chạy code bằng terminal

Gõ **Ctrl + ,** để mở cửa số setting

Gõ **Run in terminal** chọn **Run Code Configuration**, cuối cùng tick vào **Whether to run code in intergrated Terminal**
<div align="center">
<img src="./setup/vsc11.png">
</div>

#### Tạo project Java trên Visual Studio Code
Gõ **Ctrl + Shift + P** và gõ **Java: Create**, sau đó chọn **Java: Create New Project**

<div align="center">
<img src="./setup/vsc4.png">
</div>

Chọn **No Build Tools**
<div align="center">
<img src="./setup/vsc5.png">
</div>

Chọn folder để lưu trữ project của bạn
<div align="center">
<img src="./setup/vsc6.png">
</div>

Đặt tên cho project
<div align="center">
<img src="./setup/vsc7.png">
</div>

Sau khi hoàn thành các bước trên bây giờ vscode sẽ tạo cho bạn 1 project như sau:
<div align="center">
<img src="./setup/vsc8.png">
</div>

Để chọn thử chương trình hãy mở file App.java ở trong src, bấm vào mũi tên bên phải icon code runner, chọn **Run Java**
<div align="center">
<img src="./setup/vsc9.png">
</div>

Nếu kết quả hiện thị như hình thì bạn đã chạy thành công, lưu ý lần đầu chạy code Java khi mở vscode hơi lâu, bạn cần chờ một xíu.
<div align="center">
<img src="./setup/vsc10.png">
</div>

Mọi thắc mắc hoặc lỗi xin liên hệ [Phan Đức Hải](https://www.facebook.com/chiatayde/)

**Chúc các bạn thành công!**

