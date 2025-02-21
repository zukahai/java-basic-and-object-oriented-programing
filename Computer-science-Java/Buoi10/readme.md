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

- Tạo class CClass với các
  - Thuộc tính:  teacher, timeStart, timeEnd
  - Phương thức:
    - Các hàm khởi tạo
    - Các hàm getter, setter
    - Hàm input: nhập tên lớp, giáo viên
    - Hàm toString: hiển thị thông tin lớp học
    - Hàm checkTime(time): kiểm tra xem thời gian time có nằm trong khoảng thời gian của lớp học không

- Tạo class OnlineClass kế thừa từ CClass với các
  - Thuộc tính: link
  - Phương thức:
    - Các hàm khởi tạo
    - Các hàm getter, setter
    - Hàm input: nhập link
    - Hàm toString: hiển thị thông tin lớp học online
    
- Tạo class OfflineClass kế thừa từ CClass với các
  - Thuộc tính: address
  - Phương thức:
    - Các hàm khởi tạo
    - Các hàm getter, setter
    - Hàm input: nhập địa chỉ
    - Hàm toString: hiển thị thông tin lớp học offline

- Tạo interface IClass với các phương thức truy tượng
    - getAllClass: trả về danh sách tất cả các lớp học
    - getClassByTeacher(String name): trả về danh sách các lớp học mà giáo viên dạy
    - getClassByTime(Time time): trả về danh sách các lớp học diễn ra vào thời gian time
    - addClass(CClass c): thêm lớp học vào danh sách
    - removeClass(CClass c): xóa lớp học khỏi danh sách

- Tạo class ClassManager sử dụng interface IClass với các
  - Thuộc tính: danh sách các lớp học
  - Phương thức:
    - Các hàm khởi tạo
    - Hàm getAllClass
    - Hàm getClassByTeacher(String name)
    - Hàm getClassByTime(Time time)
    - Hàm addClass(CClass c)
    - Hàm removeClass(CClass c)

- Tạo class Main để kiểm tra các class trên
    - Tạo danh sách các lớp học
    - Thêm các lớp học vào danh sách
    - Hiển thị danh sách các lớp học
    - Tìm lớp học theo giáo viên
    - Tìm lớp học theo thời gian
    - Xóa lớp học khỏi danh sách
    - Hiển thị danh sách lớp học sau khi xóa

    
