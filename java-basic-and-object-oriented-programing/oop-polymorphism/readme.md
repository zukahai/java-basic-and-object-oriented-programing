<div align="center">

# Tính đa hình trong lập trình hướng đối tượng

</div>

### Ví dụ 1

Tạo class **Student** dùng để biểu diễn tập hợp những sinh viên.<br>Bao gồm:
- Các thuộc tính:
    - **studentID**: String, dùng để đại diện cho mã sinhv viên
    - **name**: String, dùng để dại diện cho tên
    - **age**: int, ddùng để đại diện cho tuổi
- Các phương thức:
    - Các phương thức khởi tạo măc định và khởi tạo có thuộc tính
    - Các phương thức **getter**, **setter** và **toString()**
    - Phương thức **inpu()t** cho phép nhập thông tin của sinh viên vào từ bàn phím.
    - Phương thức **equals()** dùng để kiểm tra 2 sinh viên có giống nhau hay không
    - Phương thức **incAge()** dùng để tăng tuổi của sinh viên thêm **1**.
    - Phương thức **decAge()** dùng để trả lại tuổi của sinh viên thêm **1**.
    - Phương thức **incAge(int n)** dùng để tăng tuổi của sinh viên thêm **n**.
    - Phương thức **decAge()** dùng để trả lại tuổi của sinh viên thêm **n**.
    - Phương thức **copyObject()** dùng để trả về một sinh viên có tất cả thông tin giống sinh viên hiện tại.

*Lưu ý: Không có 2 sinh viên nào có mã sinh viên giống*

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package model;

import java.util.Scanner;

public class Student {
	private String studentID;
	private String name;
	private int age;

	public Student() {
		this.studentID = "";
		this.name = "";
		this.age = 0;
	}

	public Student(String studentID, String name, int age) {
		this.studentID = studentID;
		this.name = name;
		this.age = age;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập ID: ");
		this.studentID = sc.nextLine();
		System.out.print("Nhập Name: ");
		this.name = sc.nextLine();
		System.out.print("Nhập Age: ");
		this.age = sc.nextInt();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		Student otherStudent = (Student) obj;
		return this.getStudentID().equals(otherStudent.getStudentID());

	}
	
	public void incAge() {
		this.age++;
	}
	
	public void decAge() {
		this.age++;
	}
	
	public void incAge(int n) {
		this.age += n;
	}
	
	public void decAge(int n) {
		this.age += n;
	}
	
	public float calculateAverage() {
		return 0;
	}
	
	public Student copyObject() {
		return new Student(studentID, name, age);
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", name=" + name + ", age=" + age + "]";
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
```

</details>
<br>

### Ví dụ 2
Tạo class **StudentIT** kế thừa class **Student** dùng để biểu diễn tập hợp những sinh viên công nghệ thông tin.<br>Bao gồm thêm:
- Các thuộc tính:
    - **scoreCPP**: float, dùng để đại diện cho điểm học phần "Lập trình C++" của sinh viên
    - **scoreJava**: float, d­ùng để đại diện cho điểm học phần "Lập trình Java" của sinh viên.
- Các phương thức:
    - Các phương thức khởi tạo măc định và khởi tạo có thuộc tính
    - Các phương thức **getter**, **setter** cho các thuộc tính **scoreCPP** và **scoreJava**.
    - Ghi đề phương thức **toString()**, **input()** và **copyObject()**
    - Phương thức **calculateAverage()** dùng để tính điểm trung bình của sinh viên

*Lưu ý: Điểm của sinh viên luôn trong khoảng 0 đến 10, nếu điểm sinh viên khác với khoảng đó thì mặc định điểm đó bằng 0*

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package model;

import java.util.Scanner;

public class StudentIT extends Student {
	private float scoreCPP;
	private float scoreJava;

	public StudentIT() {
		super();
		this.scoreCPP = 0;
		this.scoreJava = 0;
	}

	public StudentIT(String studentId, String name, int age, float scoreCPP, float scoreJava) {
		super(studentId, name, age);
		this.setScoreCPP(scoreCPP);
		this.setScoreJava(scoreJava);
	}

	@Override
	public String toString() {
		return "StudentIT [studentID=" + super.getStudentID() + ", name=" + super.getName() + ", age=" + super.getAge()
				+ ", scoreCPP=" + scoreCPP + ", scoreJava=" + scoreJava + "]";
	}

	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập ScoreCPP: ");
		this.setScoreCPP(sc.nextFloat());
		System.out.print("Nhập ScoreJava: ");
		this.setScoreJava(sc.nextFloat());
	}

	public float calculateAverage() {
		return (scoreCPP + scoreJava) / 2;
	}
	
	public Student copyObject() {
		return new StudentIT(super.getStudentID(), super.getName(), super.getAge(), scoreCPP, scoreJava);
	}

	public float getScoreCPP() {
		return scoreCPP;
	}

	public void setScoreCPP(float scoreCPP) {
		this.scoreCPP = scoreCPP;
		if (scoreCPP < 0 || scoreCPP > 10)
			this.scoreCPP = 0;
	}

	public float getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(float scoreJava) {
		this.scoreJava = scoreJava;
		if (scoreJava < 0 || scoreJava > 10)
			this.scoreJava = 0;
	}

}

```

</details>
<br>

### Ví dụ 3
Tạo class **StudentBA** kế thừa class **Student** dùng để biểu diễn tập hợp những sinh viên công nghệ thông tin.<br>Bao gồm thêm:
- Các thuộc tính:
    - **socrePM**: float, dùng để đại diện cho điểm học phẩn "quản lí dư án" của sinh viên
    - **socreBA**: float, d­ùng để đại diện cho điểm họpc phần "Phân tích kinh doanh" của sinh viên.
- Các phương thức:
    - Các phương thức khởi tạo măc định và khởi tạo có thuộc tính
    - Các phương thức **getter**, **setter** cho các thuộc tính **socrePM** và **socreBA**.
    - Ghi đề phương thức **toString()**, **input()** và **copyObject()**
    - Phương thức **calculateAverage()** dùng để tính điểm trung bình của sinh viên

*Lưu ý: Điểm của sinh viên luôn trong khoảng 0 đến 10, nếu điểm sinh viên khác với khoảng đó thì mặc định điểm đó bằng 0*

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package model;

import java.util.Scanner;

public class StudentBA extends Student {
	private float scorePM;
	private float scoreBA;

	public StudentBA() {
		super();
		this.scorePM = 0;
		this.scoreBA = 0;
	}

	public StudentBA(String studentId, String name, int age, float scorePM, float scoreBA) {
		super(studentId, name, age);
		this.setScorePM(scorePM);
		this.setScoreBA(scoreBA);
	}

	@Override
	public String toString() {
		return "StudentBA [studentID=" + super.getStudentID() + ", name=" + super.getName() + ", age=" + super.getAge()
				+ ", scorePM=" + scorePM + ", scoreBA=" + scoreBA + "]";
	}

	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập ScorePM: ");
		this.setScorePM(sc.nextFloat());
		System.out.print("Nhập ScoreBA: ");
		this.setScoreBA(sc.nextFloat());
	}

	public float calculateAverage() {
		return (scorePM + scoreBA) / 2;
	}
	
	public Student copyObject() {
		return new StudentBA(super.getStudentID(), super.getName(), super.getAge(), scorePM, scoreBA);
	}

	public float getScorePM() {
		return scorePM;
	}

	public void setScorePM(float scorePM) {
		this.scorePM = scorePM;
		if (scorePM < 0 || scorePM > 10)
			this.scorePM = 0;
	}

	public float getScoreBA() {
		return scoreBA;
	}

	public void setScoreBA(float scoreBA) {
		this.scoreBA = scoreBA;
		if (scoreBA < 0 || scoreBA > 10)
			this.scoreBA = 0;
	}

}

```

</details>
<br>

### Ví dụ 4
Tao class **StudentManager** đại diễn cho tập hợp các hệ thống quản lí sinh viên.<br>Bao gồm:
- Các thuộc tính:
    - **students**: ArrayList\<Student\>, dùng để đại diện cho danh sách sinh viên.
- Các phương thức:
    - Các phương thức khởi tạo măc định và khởi tạo có thuộc tính
    - Các phương thức **getter**, **setter** cho các thuộc tính **students**.
    - Phương thức **addStudent(Student s)** dùng để thêm sinh viên **s** vào danh sách.
    - Phương thức **addStudent(ArrayList\<Student> s)** dùng để thêm danh sách sinh viên **s** vào danh sách.
    - Phương thức **showStudents()** dùng để xem danh sách sinh viên.
    - Phương thức **deleteStudent(Student s)** dùng để xóa sinh viên **s** trong danh sách.
    - Phương thức **deleteStudent(String studentID)** dùng để xóa sinh viên có mã sinh viên là **studentID** trong danh sách.
    - Phương thức **updateStudent(Student s)** dùng để update sinh viên **s** trong danh sách.
    - Phương thức **updateStudent(String studentID, Student s)** dùng để update sinh viên có mã sinh viên là **studentID** trong danh sách.
    - Phương thức **searchStudent(String studentID)** dùng để tìm kiểm sinh viên có mã sinh viên **studentID**
    - Phương thức **searchStudent(Student s)** d­ùng để tìm kiếm sinh viên **s**.
    - Phương thức **sortByScore()** dùng đề sắp xếp sinh viên tăng dần theo điểm trung bình
    - Phương thức **sortByAge()** dùng đề sắp xếp sinh viên tăng dần theo tuổi
    - Phương thức **sortByID()** dùng đề sắp xếp sinh viên tăng dần theo mã sinh
    - Phương thức **SortByType()** dùng đề sắp xếp sinh viên theo ngành học, sinh viên IT lên trước sinh viên BA

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentManager {
	private ArrayList<Student> students;

	public StudentManager() {
		this.students = new ArrayList<>();
	}

	public StudentManager(ArrayList<Student> students) {
		this.students = students;
	}

	public void add(Student s) {
		students.add(s);
	}

	public void add(ArrayList<Student> s) {
		students.addAll(s);
	}

	public void showStudents() {
		if (this.students.size() > 0) {
			System.out.println("Danh sách sinh viên");
			for (int i = 0; i < this.students.size(); i++)
				System.out.println(this.students.get(i));
		} else {
			System.out.println("Chưa có sinh viên nào");
		}

	}

	public void deleteStudent(Student s) {
		for (int i = 0; i < students.size(); i++) {
			Student st = students.get(i);
			if (st.equals(s)) {
				students.remove(i);
				break;
			}
		}
	}

	public void deleteStudent(String studentID) {
		for (int i = 0; i < students.size(); i++) {
			Student st = students.get(i);
			String id = st.getStudentID();
			if (id.equals(studentID)) {
				students.remove(i);
				break;
			}
		}
	}

	public void updateStudent(Student s) {
		for (int i = 0; i < students.size(); i++) {
			Student st = students.get(i);
			if (st.equals(s)) {
				students.set(i, s);
				break;
			}
		}
	}

	public void updateStudent(String studentID, Student s) {
		for (int i = 0; i < students.size(); i++) {
			Student st = students.get(i);
			String id = st.getStudentID();
			if (id.equals(studentID)) {
				students.set(i, s);
				break;
			}
		}
	}

	public Student searchStudent(String studentID) {
		for (Student student : this.students) {
			String id = student.getStudentID();
			if (id.equals(studentID))
				return student;
		}
		return null;
	}

	public Student searchStudent(Student s) {
		for (Student student : this.students) {
			if (student.equals(s))
				return student;
		}
		return null;
	}

	public void sortByScore() {
		Collections.sort(this.students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.calculateAverage() > o2.calculateAverage() ? 1 : -1;
			}
		});
	}

	public void sortByAge() {
		Collections.sort(this.students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getAge() > o2.getAge() ? 1 : -1;
			}
		});
	}

	public void sortByID() {
		Collections.sort(this.students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getStudentID().compareTo(o2.getStudentID());
			}
		});
	}

	public void sortByType() {
		Collections.sort(this.students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				if (o1 instanceof StudentBA && o2 instanceof StudentIT)
					return 1;
				return -1;
			}
		});
	}

	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < this.students.size(); i++) {
			str = str + "\t" + this.students.get(i);
			if (i != this.students.size())
				str = str + ",";
			str = str + "\n";
		}
		return "StudentManager [students=\n" + str + "]";
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

}

```

</details>
<br>

### Ví dụ 5
Tạo class **Menu** dại diện cho tập hợp những menu.<br>Bao gồm
- Các phương thức:
    - Phương thức **choiceMenu()**: int, dùng để hiện thi menu và cho phép nhập và trả về lựa chọn.
    - Các phương thức chọn Menu nhỏ khác
    - Phương thức run() để khởi động Menu

Tạo 1 Menu có các chức năng như sau:
```text
1. Nhập thông tin sinh viên
    1.1. Nhập sinh viên IT.
    1.2. Nhập sinh viên BA.
2. Xem danh sách sinh viên
3. Tìm kiếm sinh viên theo sutdentID
4. Xoá sinh viên theo studentID
5. Cập nhật sinh viên
6. Sắp xếp sinh viên
    4.1. Sắp xếp sinh viên theo điểm trung bình.
    4.2. Sắp xếp sinh viên theo tuổi.
    4,2. Sắp xếp sinh viên theo mã sinh viên.
    4.4. Sắp xếp sinh viên theo ngành hoc.
7. Thoát.
```

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package model;

import java.util.Scanner;

public class Menu {
	private StudentManager smanager;

	public Menu() {
		smanager = new StudentManager();
	}

	public int choiceMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n+-------- Quản lí sinh viên -------+");
		System.out.println("| 1. Nhập thông tin sinh viên      |");
		System.out.println("| 2. Xem danh sách sinh viên       |");
		System.out.println("| 3. Tìm kiếm sinh viên            |");
		System.out.println("| 4. Xoá sinh viên                 |");
		System.out.println("| 5. Cập nhập thông tin sinh viên  |");
		System.out.println("| 6. Sắp xếp sinh viên             |");
		System.out.println("| 7. Thoát                         |");
		System.out.println("+----------------------------------+");
		System.out.print("Nhập lựa chọn của bạn: ");
		return sc.nextInt();
	}
	
	public int choiceMenu(int c) {
		Scanner sc = new Scanner(System.in);
		switch (c) {
			case 1:
				System.out.println("\n+----------- Nhập thông tin  ---------+");
				System.out.println("| 1. Nhập thông tin sinh viên IT      |");
				System.out.println("| 2. Nhập thông tin sinh viên BA      |");
				System.out.println("+-------------------------------------+");
				break;
			case 6:
				System.out.println("\n+--------- Sắp xếp  --------+");
				System.out.println("| 1. Theo điểm trung bình   |");
				System.out.println("| 2. Theo tuổi              |");
				System.out.println("| 3. Theo ID                |");
				System.out.println("| 4. Theo ngành học         |");
				System.out.println("+---------------------------+");
				break;
	
		}
		
		System.out.print("Nhập lựa chọn của bạn: ");
		return sc.nextInt();
	}
	
	public void input(int c) {
		Student t;
		switch (c) {
			case 1: 
				t = new StudentIT();
				break;
			case 2:
				t = new StudentBA();
				break;
			default:
				System.out.println("Lựa chọn không đúng");
				return;
		}
		t.input();
		Student tmp = smanager.searchStudent(t);
		if (tmp != null)
			System.out.println("Thêm sinh viên thất bại. Mã sinh viên đã tồn tại");
		else  {
			smanager.add(t);
			System.out.println("Thêm sinh viên thành công");
		}
	}
	
	public void showStudents() {
		smanager.showStudents();
	}
	
	public void search() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập ID sinh viên cần tìm kiếm: ");
		String studentID = sc.nextLine();
		Student t = smanager.searchStudent(studentID);
		if (t == null)
			System.out.println("Không tồn tại sinh viên ID là: " + studentID);
		else {
			System.out.println("Tìm kiếm hoàn tất sinh viên có ID là: " + studentID);
			System.out.println(t);
		}
	}
	
	public void deleteSutdent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập ID sinh viên cần xoá: ");
		String studentID = sc.nextLine();
		Student t = smanager.searchStudent(studentID);
		if (t == null)
			System.out.println("Không tồn tại sinh viên ID là: " + studentID);
		else {
			System.out.println("Xoá hoàn tất sinh viên có ID là: " + studentID);
			smanager.deleteStudent(studentID);
		}
	}
	
	public void updateStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập ID sinh viên cần cập nhật: ");
		String studentID = sc.nextLine();
		Student t = smanager.searchStudent(studentID);
		if (t == null)
			System.out.println("Không tồn tại sinh viên ID là: " + studentID);
		else {
			System.out.println("Nhập thông tin mới");
			Student newStudent = t.copyObject();
			newStudent.input();
			Student t2 = smanager.searchStudent(newStudent.getStudentID());
			if (t2 != null && !t2.getStudentID().equals(studentID)) {
				System.out.println("ID của thông tin mới đã tồn tại");
			} else {
				smanager.updateStudent(studentID, newStudent);
				System.out.println("Cập nhật thành công!");
			}
			
		}
	}
	
	public void sortStudent(int c) {
		switch (c) {
			case 1:
				smanager.sortByScore();
				break;
			case 2:
				smanager.sortByAge();
				break;
			case 3:
				smanager.sortByID();
				break;
			case 4:
				smanager.sortByType();
				break;
			default:
				System.out.println("Lựa chọn không đúng");
				return;
		}
		System.out.println("Đã sắp xếp thành công!");
		
	}
	
	public void run() {
		int choice, choice2;
		String studentID;
		do {
			choice = choiceMenu();
			switch (choice) {
				case 1:
					choice2 = choiceMenu(1);
					input(choice2);
					break;
				case 2:
					showStudents();
					break;
				case 3:
					search();
					break;
				case 4:
					deleteSutdent();
					break;
				case 5:
					updateStudent();
					break;
				case 6:
					choice2 = choiceMenu(6);
					sortStudent(choice2);
					break;
				case 7:
					break;
				default:
					System.out.println("Lựa chọn không đúng");
					return;
				
			}
		} while(choice != 7);
		System.out.println("Kết thúc chương trình!");
	}
}

```

</details>
<br>

Tải tất cả mã nguồn **[Tại đây](./StudentManagement.zip)**