<div align="center">

# Vòng lặp
</div>

### Ví dụ 1

In ra màn hình 20 chữ VKU, mỗi chữ trên một dòng

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```Java
package DHDN;

public class VKU {
	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++)
			System.out.println("VKU");
	}
}
```

</details>
<br>

### Ví dụ 2
Nhập vào một số nguyên dương **N**, in ra các số từ **1** đến **N**, mỗi số trên một dòng.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package DHDN;

import java.util.Scanner;

public class VKU {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập N: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++)
			System.out.println(i);
	}
}
```
</details>
<br>


### Ví dụ 3

Nhập vào một số nguyên dương **N**, in ra các số từ **N** giảm **1**, mỗi số trên một dòng.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập N: ");
		int n = sc.nextInt();
		
		for (int i = n; i >= 1; i--)
			System.out.println(i);
	}
}
```
</details>
<br>

### Ví dụ 4

Nhập vào một số nguyên dương **N**, tính và in ra tổng các số từ 1 đến N.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập N: ");
		int n = sc.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum += i;
		System.out.println("Tổng từ 1 đến " + n + " là " + sum);
	}
}
```

Cách tốt nhất bạn có thể in ra n * (n + 1) / 2

</details>
<br>

### Ví dụ 5

Nhập vào một số nguyên dương tư nhiên **N**, in ra các số tự nhiên chẵn nhỏ hơn hoặc bằng **N**.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập N: ");
		int n = sc.nextInt();
		
		System.out.println("Các số tự nhiên chẵn nhỏ hơn hoặc bằng " + n + " là:");
		
		for (int i = 0; i <= n; i += 2)
			System.out.print(i + " ");
	}
}
```
</details>
<br>

### Ví dụ 6

Nhập vào số nguyên dương **S**, tìm số nguyên dương **N** nhỏ nhất sau cho:

1 + 2 + 3 + ... + N <= S

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập S: ");
		int s = sc.nextInt();
		
		int n = 0;
		int sum = 0;
		
		while (sum <= s) {
			n ++;
			sum += n;
		}
		
		System.out.println("N = " + (n - 1));
	}
}
```
</details>
<br>

### Ví dụ 7
Nhập vào bàn phím số nguyên **N**, nếu **N <= 0** thì yêu cầu nhập lại, quá trình trên lặp lại đến nếu **N > 0**.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package DHDN;

import java.util.Scanner;

public class VKU {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhập N: ");
			n = sc.nextInt();
			if (n <= 0)
				System.out.println("Vui lòng nhập lại");
		} while(n <= 0);
		System.out.println("Kết thúc vòng lặp");
	}
}
```
</details>
<br>

### Ví dụ 8
Nhập vào một số nguyên dương **N**, hãy kiểm tra N có phải là một luỹ thừa của 2 không.

N là luỹ thường của 2 khi N có thể biểu diễn được dưới dạng **N = 2^k** (k là số tự nhiên)

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập N: ");
		int n = sc.nextInt();
		
		while (n % 2 == 0 && n > 0) {
			n /= 2;
		}
		if (n == 1)
			System.out.println("Là luỹ thừa của 2");
		else
			System.out.println("Không là luỹ thừa của 2");
	}
}
```
</details>
<br>

### Ví dụ 9
Nhập vào một số nguyên dương **N**, hãy tính và in ra **N!**.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập N: ");
		int n = sc.nextInt();
		
		int factorial = 1;
		for (int i = 2; i <= n; i++)
			factorial *= i;
		System.out.println(n + "! = " + factorial);
	}
}
```
</details>
<br>

### Ví dụ 10
Nhập vào số nguyên dương N (1 <= N <= 9), hãy in ra bảng cửu chương N.
Ví dụ n = 5 thì in ra

```text
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
```

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập N: ");
		int n = sc.nextInt();
		
		System.out.println("Bảng cửu chương " + n + ":");
		for (int i = 1; i <= 9; i++)
			System.out.printf("%d x %2d = %2d\n", n, i, n * i);
	}
}
```

**printf()** cho phép mình format dữ liệu mình in ra.

</details>
<br>

### Ví dụ 11
Nhập vào một số nguyên dương **N**. hãy in ra các ước số tự nhiên của N.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập N: ");
		int n = sc.nextInt();
		
		System.out.println("Các ước số tự nhiên của " + n + " là:");
		
		for (int i = 1; i <= n; i++)
			if (n % i == 0)
				System.out.print(i + " ");
	}
}
```
</details>
<br>

### Ví dụ 12
Nhập vào một số nguyên **N**. hãy kiểm tra xem N có phải là số nguyên tố hay không.

*Gợi ý*

*Cách 1:* đếm ố ước tự nhiên của N, nếu N là số tự nhiên và có đúng 2 ước số tự nhiên thì N là số nguyên tố.

*Cách 2:* Nếu N > 1 và không chia hết cho số nào từ 2 đến căn của N thì N là số nguyên tố.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Cách 1:

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập N: ");
		int n = sc.nextInt();
		
		int count = 0;
		for (int i = 1; i <= n; i++)
			if (n % i == 0)
				count ++;
		if (count == 2)
			System.out.println(n + " là số nguyên tố");
		else
			System.out.println(n + " không là số nguyên tố");
	}
}
```

Cách 2:

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập N: ");
		int n = sc.nextInt();
		
		boolean flag = true;
		if (n < 2)
			flag = false;
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				flag = false;
		if (flag)
			System.out.println(n + " là số nguyên tố");
		else
			System.out.println(n + " không là số nguyên tố");
	}
}
```
</details>
<br>

### Ví dụ 13
Nhập vào một số tự nhiên N, tính tổng các chữ số của N.

Ví dụ

N = 123 thì kết quả là 6 (1 + 2 + 3)
N = 5555 thì kết quả là 20 (5 + 5 + 5 + 5)

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập N: ");
		int n = sc.nextInt();
		
		System.out.print("Tổng các chữ số của " + n + " là: ");
		
		int sum = 0;
		while(n > 0) {
			sum += (n % 10);
			n /= 10;
		}
		System.out.println(sum);
	}
}
```
</details>
<br>

### Ví dụ 14
Nhập vào tên của bạn, hãy in ra từng ký tự trong tên của bạn, mỗi ký tự trên 1 dòng

Ví dụ bạn nhập "Long" thì kết quả là
```text
L
o
n
g
```

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập tên của bạn: ");
		String name = sc.nextLine();
		
		for (int i = 0; i < name.length(); i++)
			System.out.println(name.charAt(i));
	}
}
```
</details>
<br>

### Ví dụ 15
Nhập số nguyên dương N, tính tổng sau:

1 * 2 + 2 * 3 + 3 * 4 + ... + N * (N + 1)

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập N: ");
		int n = sc.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum += i * (i + 1);
		System.out.println("Sum = " + sum);
	}
}
```
</details>
<br>

