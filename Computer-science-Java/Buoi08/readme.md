## Tạo class Student

- Class Student có các thuộc tính sau:
  - name: tên của student
  - age: tuổi của student
  - scores: ArrayList chứa điểm các môn học của student
  - university: tên trường đại học mà student đang theo học

Ràng buộc:
- Tuổi của student phải lớn hơn hoặc bằng 18 đến 100, nếu người dùng tạo tuổi không hợp lệ thì gán tuổi mặc định là 18
- Tên của student không được để trống, nếu người dùng tạo tên trống thì gán tên mặc định là "Unknown"
- Điểm các môn học của student phải nằm trong khoảng từ 0 đến 10, nếu người dùng nhập điểm không hợp lệ thì bỏ qua, không thêm vào danh sách điểm
- name, age, scores là các thuộc tính private
- university là biến public và static

- Class Student có các phương thức sau:
    - Constructor không tham số
    - Constructor với 2 tham số: name và age
    - Phương thức `addScore(double score)`: thêm một điểm vào danh sách điểm của student
    - Phương thức `getAverageScore()`: trả về điểm trung bình của student
    - Phương thức `toString()`: trả về thông tin của student dưới dạng chuỗi
    - Các phương thức getter và setter cho các thuộc tính
    - Phương thức `getRank()`: trả về xếp loại của student dựa trên điểm trung bình
      - Nếu điểm trung bình >= 9.0: xếp loại A
      - Nếu điểm trung bình >= 7.0: xếp loại B
      - Nếu điểm trung bình >= 5.0: xếp loại C
      - Nếu điểm trung bình < 5.0: xếp loại D

## Tạo class StudentIT

- Class StudentIT kế thừa từ class Student
- Class StudentIT có các thuộc tính sau:
  - major: chuyên ngành của student
  - projectScore: điểm của project mà student đã thực hiện

Ràng buộc:
- major không được để trống, nếu người dùng tạo major trống thì gán major mặc định là "Unknown"
- projectScore phải nằm trong khoảng từ 0 đến 10, nếu người dùng nhập điểm không hợp lệ thì gán projectScore mặc định là 0
- major, projectScore là các thuộc tính private


- Class StudentIT có các phương thức sau:
    - Constructor không tham số
    - Constructor có tất cả tham số
    - Phương thức `getAverageScore()`: trả về điểm trung bình của student, được tính bằng trọng số 0.7 điểm trung bình các môn học và 0.3 điểm project
    - Phương thức `toString()`: trả về thông tin của student dưới dạng chuỗi
    - Các phương thức getter và setter cho các thuộc tính
    - Phương thức `getRank()`: trả về xếp loại của student dựa trên điểm trung bình