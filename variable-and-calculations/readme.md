# Khai báo biến, nhập xuất dữ liệu và tính toán cơ bản

### Ví dụ 1:
Nhập vào hai số nguyên a và b, tính và in ra tổng, hiệu, tích và thương của 2 số đó.

**Code mẫu:**

```java
import java.util.Scanner;
public class VKU {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập A = ");
		a = sc.nextInt();
		System.out.print("Nhập B = ");
		b = sc.nextInt();
		
		//Xu li
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("A + B = " + (a + b));
		System.out.println("A - B = " + (a - b));
		System.out.println("A * B = " + (a * b));
		System.out.println("A / B = " + (a / (float)b));
	}
}
```

Để nhập dữ liệu từ bàn phím thì các bạn sử dụng class Scanner từ package java.util. (Nhớ import thư viện này vào nhé, nên áp dụng **ctrl + space** để tự import thư viện luôn)

Lưu ý là trong ngôn ngữ Java, việc chia 2 số có kiểu đều là số nguyên thì chỉ trả lại phần nguyên của kết quả thôi.

Ví dụ:
```Java
int a = 5;
int b = 2;
System.out.println(a / b);
```

Thì kết quả chỉ trả về 2 thì vì kết quả đúng là 2.5

Để giải quyết vấn đề này thì các bạn có nhiều cách:
Cách 1: Đổi kiểu dữ liệu của 1 trong 2 biến thành kiểu số thực (float, double)
Cách 2: Trong lúc tính toán có thể áp dụng kỹ thuật ép kiểu 1 trong 2 biến a và b thành kiểu số thực.
Ví dụ:
```java
int a = 5;
int b = 2;
System.out.println((float)a / b);
System.out.println(a / (float)b);
```

### Ví dụ 2:
Nhập vào bán kính của một hình tròn, tính và in ra chu vi và diện tích của hình tròn đó.

**Code mẫu:**
```java
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập bán kính của hình tròn: ");
		double r = sc.nextFloat();
		double p = 2 * Math.PI * r;
		double s = Math.PI * r * r;
		System.out.println("Chu vi của hình tròn là: " + p);
		System.out.println("Diện tích của hình tròn là: " + s);
	}
}
```

Trong ngôn ngữ để lấy giá trị Pi các bạn sử dụng **Math.PI**

### Ví dụ 3
Nhập và chiều dài và chiều rộng của một hình chữ nhật, tính và in ra chu vi và diện tích của hình chữ nhật đó.

**Code mẫu:**
Hãy thử tim hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 4:
Nhập và 3 cạnh của 1 tam giác, tính và in ra chu vi và diện tích của tam giác đó.

Gợi ý tính diện tích: Hãy áp dụng công thức [Heron](https://vi.wikipedia.org/wiki/Công_thức_Heron) để tính diện tích khi biết ba cạnh của tam giác.


**Code mẫu:**
Hãy thử tim hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 5:
Nhập tuổi của một sinh viên tính đến năm 2023, hãy tính và in ra năm sinh viên đó.

**Code mẫu:**
Hãy thử tim hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 6:
Nhập vào một số nguyên N, hãy in ra chữ số cuối cùng của số đó.

Gợi ý: Chữ số cuối cùng của só n chính là kết quả của phép chia lấy phần dư của n cho 10.

Ví dụ, để lấy chữ số cuối cùng của 123, ta lấy 123 chia cho 10 và lấy phần dư, 123 chia 10 được 12 dư 3, vậy chữ số cuối cùng của 123 là 3.

Trong Java, phép chia lấy dư được biểu diễn bằng ký tự **%**.
Ví dụ 5 % 2 = 1, 123 % 10 = 3,...

Lưu ý cần lấy trị tuyệt đối để tránh trường hợp n < 0


**Code mẫu:**
```java
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N = ");
		int n = sc.nextInt();
		System.out.println("Chữ số cuối cùng của " + n + " là " + Math.abs(n % 10));
	}
}

```

### Ví dụ 7
Nhập vào một số nguyên N có ít nhất 2 chữ số (lớn hơn 9 hoặc nhỏ hơn -9). In ra chữ số gần cuối của N.
Ví dụ N = 123, chữ số gần cuối là 2. 
Ví dụ N = 1234, chữ số gần cuối là 3.
Ví dụ N = 928743, chữ số gần cuối là 4.
Ví dụ N = -24381, chữ số gần cuối là 8.

**Code mẫu:**
Hãy thử tim hiểu trước, sẽ cập nhật code mẫu sau.
