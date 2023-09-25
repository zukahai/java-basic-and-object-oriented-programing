<div align="center">

# Câu lệnh điều kiện
</div>

### Ví dụ 1

Nhập vào một số nguyên **N**, kiểm tra và in ra N có phải là số tự nhiên hay không.

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
		
		if (n >= 0)
			System.out.println(n + " là số tự nhiên");
		else
			System.out.println(n + " không phải là số tự nhiên");
	}
}

```
</details>
<br>

### Ví dụ 2
Nhập vào 2 cạnh của một hình chữ nhật, hãy kiểm tra xem hình chữ nhật đó có phải là hình vuông hay không.

**Gợi ý:**

Hình chữ nhật có chiều dài bằng chiều rộng là hình vuông.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package DHDN;

import java.util.Scanner;

public class VKU {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập vào chiều dài: ");
		float a = sc.nextFloat();
		System.out.print("Nhập vào chiều rộng: ");
		float b = sc.nextFloat();
		
		if (a == b)
			System.out.println("Là hình vuông");
		else
			System.out.println("Không phải là hình vuông");
	}
}
```
</details>
<br>

### Ví dụ 3
Nhập vào một số nguyên **N**, kiểm tra và in ra **N** có phải là số chẵn hay không?

*Gợi ý*: Áp dụng chia lấy dư cho 2.
Số chẵn chia 2 sẽ dư 0 còn số lẻ sẻ dư 1

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
		
		if (n % 2 == 0)
			System.out.println(n + " là số chẵn");
		else
			System.out.println(n + " là số lẻ");
	}
}
```
</details>
<br>

### Ví dụ 4
Nhâp vào **2** số nguyên **a** và **b**, hãy dùng cầu lệnh điều kiện đề tìm và đưa ra số lớn hơn.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập A: ");
		int a = sc.nextInt();
		
		System.out.print("Nhập A: ");
		int b = sc.nextInt();
		
		if (a > b)
			System.out.println("Số lớn hơn là " + a);
		else
			System.out.println("Số lớn hơn là " + b);
	}
}
```
</details>
<br>

### Ví dụ 5
Điểm số hợp lí là điểm số nằm trong khoảng **0** đến **10**. Nhập vào một số, hãy kiểm tra xem số đó có phải là điểm số hợp lí không.

**Gợi ý**:

Giá trị của biến **score** được xem là hợp lí nếu đồng thời thoả mãn 2 điều kiện là socre >= 0 và score <= 10, nên ta sẽ dùng kết hợp giữa 2 điều kiện bằng phép và **&&**

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập số điểm: ");
		float score = sc.nextFloat();
		
		if (score >= 0 && score <= 10)
			System.out.println(score + " là số điểm hợp lí");
		else
			System.out.println(score + " không là số điểm hợp lí");
	}
}
```
</details>
<br>

### Ví dụ 6
Nhập vào **3** số nguyên **a, b, c**, hãy kiểm tra xem 3 số đó có thể là độ dài 3 cạnh của một tam giác hay không.

**Gợi ý**:

Ba số được coi là độ dài của 3 cạnh trong cùng 1 tam giác khi 3 số đó dương và tổng 2 số luôn lớn hơn số còn lại

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập độ dài cạnh thứ nhất: ");
		int a = sc.nextInt();
		System.out.print("Nhập độ dài cạnh thứ hai: ");
		int b = sc.nextInt();
		System.out.print("Nhập độ dài cạnh thứ ba: ");
		int c = sc.nextInt();
		
		if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a)
			System.out.println("Có thể là độ dài của 3 cạnh trong 1 tam giác");
		else
			System.out.println("Không thể là độ dài của 3 cạnh trong 1 tam giác");
	}
}
```
</details>
<br>

### Ví dụ 7
Nhập vào **3** số nguyên **a, b, c**, hãy kiểm tra xem 3 số đó có thể là độ lớn 3 góc của một tam giác hay không.

**Gợi ý**:

Điều kiện để 3 số nguyên a, b, c là độ lớn 3 góc của 1 tam giác là 3 số dương và tổng bằng 180.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập A: ");
		int a = sc.nextInt();
		System.out.print("Nhập B: ");
		int b = sc.nextInt();
		System.out.print("Nhập C: ");
		int c = sc.nextInt();
		
		if (a > 0 && b > 0 && c > 0 && a + b + c == 180)
			System.out.println("Có thể là độ lớn của 3 góc trong 1 tam giác");
		else
			System.out.println("Không thể là độ lớn của 3 góc trong 1 tam giác");
	}
}
```
</details>
<br>

### Ví dụ 8
Nhập vào một số thực, kiểm tra xem số thực đó có phải là số nguyên hay không.

**Gợi ý:**

Dùng ép kiểu trong java. Khi ép kiểu 1 số thực về một kiểu số nguyên nó sẽ chỉ lấy được phần nguyên của số thực đó.

```java
float a = 3.14f;
System.out.println((int)a); // chỉ in ra 3
```

Ta sẽ kiểm tra xem số thực a có bằng phân nguyên của nó hay không, nếu bằng thì a là số nguyên.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập A: ");
		float a = sc.nextFloat();
		
		if (a == (int)a)
			System.out.println(a + " là số nguyên");
		else
			System.out.println(a + " không là số nguyên");
	}
}
```
</details>
<br>

### Ví dụ 9
Nhập vào một số nguyên dương **N**, hãy kiểm tra xem **N** có phải là số chính phương hay không.

Số chính phương là số có thể biểu diễn bởi bình phương của một số nguyên khác, ví dụ **4, 9, 1, 25, 100,...** là các số chính phương

**Gợi ý:**

Một số là số chính phương khi nó là bình phương của một số nguyên, mình sẽ tính căn bậc 2 của số đó, nếu căn bậc 2 của một số là số nguyên thì nó là số chính phương.

Cách kiểm tra số thực của phải là số nguyên hay không: Xem ví dụ 8

Cách lấy căn bậc 2 của n: dùng hàm **Math.sqrt(n)**

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
		
		float sqrtN = (float) Math.sqrt(n);
		
		if (sqrtN == (int)sqrtN)
			System.out.println(n + " là số chính phương");
		else 
			System.out.println(n + " không phải số chính phương");
		
	}
}
```
</details>
<br>

### Ví dụ 10
Nhập vào 3 số nguyên dương **a**, **b**, **c**, hãy kiểm tra xem b có đồng thời là ước của **a** và là bội của **c** hay không

(Một số **x** được gọi là bội của **y** khi **x** chia hết cho **y**, một số **x** gọi là ước của **y** khi **y** chia hết cho **x**)

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập A: ");
		int a = sc.nextInt();
		
		System.out.print("Nhập B: ");
		int b = sc.nextInt();
		
		System.out.print("Nhập C: ");
		int c = sc.nextInt();
		
		if (a % b == 0 && b % c == 0)
			System.out.println("Đúng yêu cầu");
		else
			System.out.println("Không đúng yêu cầu");
	}
}
```
</details>
<br>

### Ví dụ 11
Nhập vào một ký tự **ch** Kiểm tra xem ch có phải là chữ cái in thường hay không.

**Gợi ý:**

Ký tự ch là chữ cái in thường khi ch nằm trong đoạn 'a' đến 'z' trong bảng mã ASCII, và có giá trị từ 97 đến 122.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập ký tự: ");
		
		char ch = sc.next().charAt(0);
		
		if (ch >= 'a' && ch <= 'z') // hoặc ch >= 97 && ch <= 122
			System.out.println(ch + " là ký tự in thường.");
		else
			System.out.println(ch + " không là ký tự in thường.");
		
	}
}
```
</details>
<br>

### Ví dụ 12
Nhập vào một ký tự **ch** Kiểm tra xem ch có phải là chữ cái in hoa hay không.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập ký tự: ");
		
		char ch = sc.next().charAt(0);
		
		if (ch >= 'A' && ch <= 'Z') // hoặc ch >= 65 && ch <= 90
			System.out.println(ch + " là ký tự in hoa.");
		else
			System.out.println(ch + " không là ký tự in hoa.");
		
	}
}
```
</details>
<br>

### Ví dụ 13
Nhập vào 2 chuỗi ký tự **a** và **b**, hãy kiểm tra xem 2 chuỗi đó có giống nhau hay không?

**Gợi ý:** Sử dụng hàm **equals** trong java để kiểm tra 2 chuỗi có bằng nhau hay không.

Tại sao không sử dụng **a == b** mà phải sử dụng **equals**, vì hàm **equals** sẽ so sánh nội dung trong khi sử dụng **==** sẽ so sánh luôn địa chỉ của 2 object. (Học đến phần OOP mình sẽ giải thích kỹ hơn).

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package DHDN;

import java.util.Scanner;

public class VKU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chuỗi A: ");
		String a = sc.nextLine();
		System.out.print("Nhập chuỗi B: ");
		String b = sc.nextLine();
		
		if (a.equals(b))
			System.out.println("Hai chuỗi có nội dung giống nhau");
		else
			System.out.println("Hai chuỗi có nội dung khác nhau");
	}

}
```
</details>
<br>

### Ví dụ 14
Nhập và chuỗi **a** và chuỗi **b**, in ra chuỗi có độ dài dài hơn, nếu 2 chuỗi dài bằng nhau thì in ra chuỗi **a**.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập chuỗi A: ");
		String a = sc.nextLine();
		System.out.print("Nhập chuỗi B: ");
		String b = sc.nextLine();
		
		if (a.length() >= b.length()) 
			System.out.println("Chuỗi dài hơn là: " + a);
		else
			System.out.println("Chuỗi dài hơn là: " + b);
	}
}
```
</details>
<br>

### Ví dụ 15
Nhập và h (0 <= h < 24) và m (0 <= m < 60) để biểu diễn số giờ và số phút hiện tại. Hãy in ra thời gian sau 1 phút nữa.

Ví dụ h = 10, m = 35. thời gian hiện tại là 10:35 và thời gian sau 1 phút nữa là 10:36

Ví dụ h = 20, m = 59. thời gian hiện tại là 20:59 và thời gian sau 1 phút nữa là 21:00

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập h [0-23]: ");
		int h = sc.nextInt();
		System.out.print("Nhập m [0-59]: ");
		int m = sc.nextInt();
		
		// Lưu giá trị của của h và m
		int oldH = h;
		int oldM = m;
		
		m++;
		if (m == 60) {
			m = 0;
			h++;
		}
		
		if (h == 24)
			h = 0;
		
		System.out.println("1 phút sau của " + oldH + ":" + oldM + " là " + h + ":" + m);
		
	}
}
```
</details>
<br>