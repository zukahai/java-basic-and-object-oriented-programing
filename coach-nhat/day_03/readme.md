# Buổi 3: Tính trừu tượng

## Phương thức trừu tượng

Phương thức trừu tượng là phương thức mà không có thân hàm, chỉ có khai báo. Phương thức trừu tượng được khai báo trong abstract class và interface.

```java
abstract class Student {
    abstract void getAvgScore();
}
```

## Abstract class

Abstract class là một class mà có thể chứa phương thức trừu tượng (nó vẫn có thể có các phương thức thuộc tính như class bình thường). **Abstract class không thể khởi tạo đối tượng.**

```java
abstract class Student {
    String name;

    public Student() {
        this.name = "";
    }

    public Student(String name) {
        this.name = name;
    }

    void hello() {
        System.out.println("Hello");
    }
    abstract void getAvgScore();
}
```

Nếu abstract class không thể tao đối tượng thì làm sao để sử dụng nó? Để sử dụng abstract class, chúng ta cần tạo ra một class khác kế thừa abstract class đó.

```java

class StudentIT extends Student {
    float scoreCPP;
    float scoreJava;

    public StudentIT(String name, float scoreCPP, float scoreJava) {
        super(name);
        this.scoreCPP = scoreCPP;
        this.scoreJava = scoreJava;
    }

    @Override
    void getAvgScore() {
        System.out.println((scoreCPP + scoreJava) / 2);
    }
}
```

## Interface

Interface là một tập hợp các phương thức trừu tượng. Interface không thể chứa phương thức có thân hàm (tất cả phương thức đều là trừu tượng và là public).

```java
interface IStudent {
    void getAvgScore();
}
```

## Một số câu hỏi

### 1. Sự khác nhau giữa int và Integer là gì?

int là kiểu dữ liệu nguyên thủy, còn Integer là một đối tượng. Nên là Interger sẽ có các phương thức hỗ trợ xử lý dữ liệu.

```java

int a = 5;
Integer b = new Integer(5);

System.out.println(a + 5); // 10
System.out.println(b + 5); // 10

b.toUnsignedString(8, 6);
```

### 2. Sự khác nhau giữa abstract class và interface là gì?

Abstract class có thể chứa phương thức trừu tượng và phương thức bình thường, còn interface chỉ chứa phương thức trừu tượng.

Abstract class không thể khởi tạo đối tượng, còn interface không thể chứa thuộc tính.

### 3. Sử khác nhau giữa abstract class và class thông thường là gì?

Abstract class không thể khởi tạo đối tượng, còn class thông thường có thể khởi tạo đối tượng.

Abstract class có thể chứa phương thức trừu tượng, còn class thông thường không thể.


## Bài tập

Làm bài tập [Tại đây](https://java-vku.vercel.app/midterm-exam/)


