<div align="center">

# Chuỗi (String) trong Java
</div>

### Ví dụ 1

Viết một chương trình để đảo ngược một chuỗi đã cho.

Ví dụ: Nếu chuỗi là "Hello", thì kết quả sẽ là "olleH".

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example  {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chuỗi: ");
		String s = sc.nextLine();
		String p = "";
		for (int i = s.length() - 1; i >= 0; i--)
			p = p + s.charAt(i);
		System.out.println("Chuỗi đảo ngược của " + s + " là " + p);
	}
}
```

</details>
<br>

### Ví dụ 2

Viết chương trình để đếm số ký tự 'a' trong một chuỗi đã cho.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example  {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Nhập chuỗi
		System.out.print("Nhập chuỗi: ");
		String s = sc.nextLine();
		// đếm ký tự 'a' trong chuỗi
		int count = 0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == 'a')
				count++;
		System.out.println("Số lượng ký tự 'a' là " + count);
	}
}
```

</details>
<br>

### Ví dụ 3

Viết chương trình để kiểm tra xem một chuỗi có phải là chuỗi đối xứng hay không. Chuỗi đối xứng là chuỗi mà khi đảo ngược nó vẫn giữ nguyên giá trị, ví dụ: "racecar".

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example  {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chuỗi: ");
		String s = sc.nextLine();
		String p = "";
		for (int i = s.length() - 1; i >= 0; i--)
			p = p + s.charAt(i);
		if (s.equals(p))
			System.out.println(s + " là chuỗi đối xứng");
		else
			System.out.println(s + " không là chuỗi đối xứng");
	}
}
```

</details>
<br>

### Ví dụ 4

Viết chương trình đếm số từ trong một chuỗi, biết giữa 2 từ chỉ cách nhau bởi một khoảng trắng

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example  {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Nhập chuỗi
		System.out.print("Nhập chuỗi: ");
		String s = sc.nextLine();
		// đếm ký tự ' ' trong chuỗi
		int count = 0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == ' ')
				count++;
		System.out.println("Số lượng từ trong chuỗi là " + (count + 1));
	}
}
```

</details>
<br>


### Ví dụ 5

Viết chương trình để kiểm tra xem một chuỗi có chứa ít nhất một ký tự số hay không.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example  {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Nhập chuỗi
		System.out.print("Nhập chuỗi: ");
		String s = sc.nextLine();
		
		boolean flag = false;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
				flag = true;
		if (flag)
			System.out.println("Có ký tự số");
		else
			System.out.println("Không có ký tự số");
	}
}
```

</details>
<br>

### Ví dụ 6

Viết chương trình để kiểm tra xem một chuỗi có phải là chuỗi pangram hay không. Chuỗi pangram là chuỗi chứa tất cả các chữ cái trong bảng chữ cái tiếng Anh ít nhất một lần.

Ví dụ "The quick brown fox jumps over the lazy dog" là chuỗi pangram

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example  {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Nhập chuỗi
		System.out.print("Nhập chuỗi: ");
		String s = sc.nextLine();
		// in thường chuỗi
		s = s.toLowerCase();
		
		boolean d[] = new boolean[123];
		for (char ch = 'a'; ch <= 'z'; ch++)
			d[ch] = false;
		
		for (int i = 0; i < s.length(); i++)
			d[s.charAt(i)] = true;
		
		boolean flag = true;
		for (char ch = 'a'; ch <= 'z'; ch++)
			if (d[ch] == false)
				flag = false;
		
		if (flag)
			System.out.println("Là chuỗi pangram ");
		else
			System.out.println("Không là chuỗi pangram ");
	}
}
```

</details>
<br>

### Ví dụ 7

Viết chương trình in hoa tất cả ký tự trong một chuỗi.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example  {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Nhập chuỗi
		System.out.print("Nhập chuỗi: ");
		String s = sc.nextLine();
		// dùng hàm để in thường chuỗi
		s = s.toLowerCase();
		System.out.println("Chuỗi sau khi in thường là " + s);
	}
}
```

</details>
<br>

### Ví dụ 8
Nhập vào số nguyên dương N. Hãy thử in ra tháp '*' bằng 1 vòng lặp duy nhất.

Ví dụ N = 5, thì kết quả là:

```text
*
**
***
****
*****
```

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example  {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập N: ");
		int n = sc.nextInt();
		
		String s = "";
		for (int i = 1; i <= n; i++) {
			s = s + "*";
			System.out.println(s);
		}
	}
}
```

</details>
<br>

### Ví dụ 9

Viết chương trình đưa ra tất cả ký tự và số lần xuất xuất hiệ của nó trong chuỗi

Ví dụ: Chuỗi là "Hello"

Thì in ra:<br>
H xuất hiện 1 lần <br>
e xuất hiện 1 lần <br>
l xuất hiện 2 lần <br>
o xuất hiện 1 lần <br>

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example  {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Nhập chuỗi
		System.out.print("Nhập chuỗi: ");
		String s = sc.nextLine();
		
		int d[] = new int[256];
		for (char ch = 0; ch <= 255; ch++)
			d[ch] = 0;
		
		for (int i = 0; i < s.length(); i++)
			d[s.charAt(i)] ++;
		
		boolean flag = true;
		for (int i = 0; i < s.length(); i++)
			if (d[s.charAt(i)] > 0) {
				System.out.println(s.charAt(i) + " xuất hiện " + d[s.charAt(i)] + " lần");
				d[s.charAt(i)] = 0;
			}
	}
}
```

</details>
<br>

