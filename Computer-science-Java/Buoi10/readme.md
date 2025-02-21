- Tạo class Time với các
  - Thuộc tính: hour, minute, second
  - Phương thức:
    - Các hàm khởi tạo
    - Các hàm getter, setter
    - Hàm input: nhập giờ, phút, giây từ bàn phím
    - Orverride hàm toString để hiển thị thời gian theo định dạng hh:mm:ss
    - Hàm nextSecond: trả về 1 đối tượng thời gian mới 1 giây sau thời gian hiện tại
    - Hàm nextMinute: trả về 1 đối tượng thời gian mới 1 phút sau thời gian hiện tại
    - Hàm nextHour: trả về 1 đối tượng thời gian mới 1 giờ sau thời gian hiện tại
    - Hàm compareTime: so sánh 2 thời gian, hàm trả về 1 nếu thời gian thứ nhất lớn hơn thời gian thứ 2, trả về 0 nếu bằng nhau, trả về -1 nếu thời gian thứ 1 nhỏ hơn thời gian thứ 2.
    Ví dụ:
  ```java
    Time t = new Time(10, 10, 10);
    Time t2 = new Time(10, 10, 11);
    sout(t.compareTime(t2)); // -1
  ```