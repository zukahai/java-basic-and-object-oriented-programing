# Tính kế thừa trong Java

- Khi lớp **A** kế thừa lớp **B**, thì lớp **A** sẽ kế thừa tất cả các thuộc tính và phương thức của lớp **B** (có kiểu là `public` hoặc `protected`).

- Từ khóa **super** được sử dụng để đại diện cho đối tượng của lớp cha.
Nó có thể truy cập được đến các hàm cũng như thuộc tính (có kiểu là `public` hoặc `protected`) của lớp cha.

```Java
class A {
    int a = 10;
    void display() {
        System.out.println("a = " + a);
    }
}

class B extends A {
    int b = 20;
    void display() {
        super.display();
        System.out.println("b = " + b);
    }
}
```

## Tính đa hình trong Java

### Ghi đè (Overriding)

Nếu class con có một phương thức giống với phương thức của class cha, thì class con sẽ ghi đè phương thức của class cha.

```Java
class A {
    void display() {
        System.out.println("A");
    }
}

class B extends A {
    void display() {
        System.out.println("B");
    }
}
```

Khi gọi phương thức `display()` của class **B**, nó sẽ gọi phương thức `display()` của class **B** chứ không phải của class **A**.

## Nạp chồng (Overloading)

Nạp chồng là việc tạo nhiều phương thức cùng tên nhưng khác nhau về số lượng tham số hoặc kiểu dữ liệu của tham số.

```Java
class A {
    void display(int a) {
        System.out.println("a = " + a);
    }

    void display(int a, int b) {
        System.out.println("a = " + a + ", b = " + b);
    }
}
```

