# Cách sử dụng ArrayList

## 1. Khai báo ArrayList
```java
ArrayList<String> arrayList = new ArrayList<String>();
```

## 2. Thêm phần tử vào ArrayList
```java

arrayList.add("Java");

```

## 3. Lấy phần tử từ ArrayList

Sử dụng phương thức get(index) để lấy phần tử từ ArrayList, trong đó index là vị trí của phần tử trong ArrayList.
```java

String element = arrayList.get(0);

```

## 4. Xóa phần tử khỏi ArrayList

Sử dụng phương thức remove(index) để xóa phần tử khỏi ArrayList, trong đó index là vị trí của phần tử trong ArrayList.
```java

arrayList.remove(0);

```

## 5. Cập nhật phần tử trong ArrayList

Sử dụng phương thức set(index, element) để cập nhật phần tử trong ArrayList, trong đó index là vị trí của phần tử trong ArrayList và element là phần tử mới.
```java

arrayList.set(0, "Python");

```

## 6. Lấy kích thước của ArrayList

Sử dụng phương thức size() để lấy kích thước của ArrayList.
```java

int size = arrayList.size();

```

# Sử dụng Equals

Sự khác biệt giữa == và equals() trong Java

## 1. ==

- == là toán tử so sánh tham chiếu trong Java, nó vừa so sánh giá trị và vừa so sánh địa chỉ của hai đối tượng.

- equals() là phương thức của lớp Object, được ghi đè bởi các lớp con để so sánh giá trị của hai đối tượng. Mặc định, phương thức equals() so sánh địa chỉ của hai đối tượng. Tuy nhiên, nếu lớp con ghi đè phương thức này, chúng ta có thể so sánh giá trị của hai đối tượng.

```java

String s1 = new String("Java");
String s2 = new String("Java");

System.out.println(s1 == s2); // false
System.out.println(s1.equals(s2)); // true

```

```java

package models;

public class Student {
	private String name;
	private int age;

	public Student() {
		this.name = "";
		this.age = 0;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	public boolean equals(Student s) {
		if (this.age != s.getAge())
			return false;
		if (!this.name.equals(s.getName()))
			return false;
		return true;
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

# instanceof

instanceof là một toán tử trong Java, được sử dụng để kiểm tra xem một đối tượng có phải là một thể hiện của một lớp cụ thể hay không. Nó trả về true nếu đối tượng được kiểm tra là một thể hiện của lớp cụ thể, ngược lại trả về false.

```java

Student student1 = new StudentIT("John", 20);
Student student2 = new StudentBA("Peter", 20);

System.out.println(student1 instanceof StudentIT); // true

```





