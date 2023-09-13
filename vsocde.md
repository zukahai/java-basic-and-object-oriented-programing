<div align="center">

# Hướng dẫn cài đặt JDK và Visual Studio Code

</div>

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

### 2. Cài đặt Visual Studio Code
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

## Chúc các bạn thành công!

