<div align="center">

# Cấu trúc mảng trong Java
</div>

### Ví dụ 1

Nhập vào một mảng có 5 số nguyên, in ra mảng vừa nhập trên một dòng, giữa 2 phần tử có một dấu cách.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package DHDN;

import java.util.Scanner;

public class VKU {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a[] = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("A[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("Mảng vừa nhập là:");
		for (int i = 0; i < 5; i++)
			System.out.print(a[i] + " ");
		
	}
}
```

</details>
<br>
      

### Ví dụ 2

Nhập vào một số nguyên dương **N**, tiếp theo nhập lần lượt **N** phần tử của mảng **a**. In ra các phần tử của mảng **a** trên một dòng, giữa 2 phần tử có một dấu cách.

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

		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("Mảng vừa nhập là:");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		
	}
}
```

</details>
<br>
      

### Ví dụ 3

Nhập vào một số nguyên dương **N**, tiếp theo nhập lần lượt **N** phần tử của mảng **a**. In ra các phần tử của mảng **a** trên một dòng theo thứ tự ngược lại, giữa 2 phần tử có một dấu cách.

Ví dụ nhập N = 4, các phần tử được nhập lần lượt là 4, 1, 2, 7 thì in ra 7 2 1 4

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		// Cho phép nhập dữ liệu từ bàn phím
		Scanner sc = new Scanner(System.in);

		// Khai báo và nhập số phần tử trong mảng
		System.out.print("Nhập số phần tử trong mảng: ");
		int n = sc.nextInt();

		// Khai báo mảng
		int a[] = new int[n];

		// Nhập mảng
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "] = ");
			a[i] = sc.nextInt();
		}

		// In ngược mảng
		System.out.println("Mảng in ngược lại là:");
		for (int i = n - 1; i >= 0; i--)
			System.out.print(a[i] + " ");
	}
}
```

</details>
<br>

### Ví dụ 4

Nhập vào một mảng gồm **N** số nguyên, hãy tính và in ra tổng của mảng đó.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		// Cho phép nhập dữ liệu từ bàn phím
		Scanner sc = new Scanner(System.in);

		// Khai báo và nhập số phần tử trong mảng
		System.out.print("Nhập số phần tử trong mảng: ");
		int n = sc.nextInt();

		// Khai báo mảng
		int a[] = new int[n];
		
		// Nhập mảng
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		
		// Tính tổng của mảng
		int sum = 0;
		for (int i = 0; i < n; i++)
			sum += a[i];

		System.out.println("Tổng của mảng vừa nhập là: " + sum);
	}
}
```

</details>
<br>

### Ví dụ 5

Nhập vào một mảng gồm **N** số nguyên, hãy tính và in ra tổng của các phần tử chẵn và mang chỉ số lẻ trong mảng.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		// Cho phép nhập dữ liệu từ bàn phím
		Scanner sc = new Scanner(System.in);

		// Khai báo và nhập số phần tử trong mảng
		System.out.print("Nhập số phần tử trong mảng: ");
		int n = sc.nextInt();

		// Khai báo mảng
		int a[] = new int[n];

		// Nhập mảng
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "] = ");
			a[i] = sc.nextInt();
		}

		// Tính tổng các phần tử chẵn và mang chỉ số lẻ
		// Cách làm tốt nhất là mình sẽ chỉ duyệt các phần tử chỉ số lẻ
		int sum = 0;
		for (int i = 1; i < n; i += 2)
			if (a[i] % 2 == 0)
				sum += a[i];

		System.out.println("Tổng của mảng vừa nhập là: " + sum);
	}
}
```

</details>
<br>

### Ví dụ 6

Nhập vào mảng gồm **N** số nguyên, in ra phần tử đầu tiên và phần tử cuối cùng trong mảng.
<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		// Cho phép nhập dữ liệu từ bàn phím
		Scanner sc = new Scanner(System.in);

		// Khai báo và nhập số phần tử trong mảng
		System.out.print("Nhập số phần tử trong mảng: ");
		int n = sc.nextInt();

		// Khai báo mảng
		int a[] = new int[n];

		// Nhập mảng
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "] = ");
			a[i] = sc.nextInt();
		}

		// Phần tử đầu tiên mang chỉ số 0
		System.out.println("Phần tử đầu tiên là: " + a[0]);
		// Phần tử đầu tiên mang chỉ số n - 1
		System.out.println("Phần tử cuối cùng là: " + a[n - 1]);
	}
}
```

</details>
<br>


### Ví dụ 7

Nhập vào mảng gồm **N** số nguyên, tìm và in ra giá trị lớn nhất và nhỏ nhất trong mảng.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		// Cho phép nhập dữ liệu từ bàn phím
		Scanner sc = new Scanner(System.in);

		// Khai báo và nhập số phần tử trong mảng
		System.out.print("Nhập số phần tử trong mảng: ");
		int n = sc.nextInt();

		// Khai báo mảng
		int a[] = new int[n];

		// Nhập mảng
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "] = ");
			a[i] = sc.nextInt();
		}

		// Dùng một biến min để lưu giá trị nhỏ nhất trong mảng, mặc định cho số đầu tiên là min
		int min = a[0];
		// Duyệt từ phần tử thứ 2 đến hết mảng
		for (int i = 1; i < n; i++)
			// Nếu có phần tử còn nhỏ hơn cả min thì cập nhật lại min
			if (a[i] < min)
				min = a[i];
		
		// Tương tự với tìm max
		int max = a[0];
		for (int i = 1; i < n; i++)
			if (a[i] > max)
				max = a[i];
		
		System.out.println("Giá trị nhỏ nhất min = " + min);
		System.out.println("Giá trị lớn nhất max = " + max);
	}
}
```

</details>
<br>

### Ví dụ 8

Nhập vào mảng gồm **N** số nguyên, tìm và in ra giá trị lớn nhất trong mảng và số lượng phần tử mang giá trị đó.

Ví dụ mảng có 5 phần tử là 4, 1, 2, 4, 4 thì in ra max = 4 và số lượng phần tử mang giá trị 4 là 3.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		// Cho phép nhập dữ liệu từ bàn phím
		Scanner sc = new Scanner(System.in);

		// Khai báo và nhập số phần tử trong mảng
		System.out.print("Nhập số phần tử trong mảng: ");
		int n = sc.nextInt();

		// Khai báo mảng
		int a[] = new int[n];

		// Nhập mảng
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		
		// Tìm max
		int max = a[0];
		for (int i = 1; i < n; i++)
			if (a[i] > max)
				max = a[i];
		
		// Đếm xem có bao nhiêu phần tử max
		int count = 0;
		for (int i = 0; i < n; i++)
			if (a[i] == max)
				count++;
		
		System.out.println("Giá trị lớn nhất là " + max + ", số lượng là " + count);
	}
}
```

</details>
<br>

### Ví dụ 9

Nhập vào mảng gồm **N** số nguyên, đếm và in ra số lượng số chẵn trong mảng.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		// Cho phép nhập dữ liệu từ bàn phím
		Scanner sc = new Scanner(System.in);

		// Khai báo và nhập số phần tử trong mảng
		System.out.print("Nhập số phần tử trong mảng: ");
		int n = sc.nextInt();

		// Khai báo mảng
		int a[] = new int[n];

		// Nhập mảng
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		
		// Đếm xem có bao nhiêu phần tử chẵn trong mảng
		int count = 0;
		for (int i = 0; i < n; i++)
			if (a[i] % 2 == 0)
				count++;
		
		System.out.println("Số lượng phần tử chẵn trong mảng là " + count);
	}
}
```

</details>
<br>

### Ví dụ 10

Nhập vào mảng gồm **N** số nguyên, hãy in ra các số chia hết cho 5 trong mảng, nếu không có số nào chia hết cho 5 thì in ra "Không tồn tại phần tử nào chia hết cho 5"

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		// Cho phép nhập dữ liệu từ bàn phím
		Scanner sc = new Scanner(System.in);

		// Khai báo và nhập số phần tử trong mảng
		System.out.print("Nhập số phần tử trong mảng: ");
		int n = sc.nextInt();

		// Khai báo mảng
		int a[] = new int[n];

		// Nhập mảng
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		
		// Gán 1 biến flag  = true, nếu trong mảng có phần tử chia hết cho 5 thì đổi lại bằng false
		boolean flag = true;
		
		// In ra các số chia hết cho 5
		for (int i = 0; i < n; i++)
			if (a[i] % 5 == 0) {
				System.out.print(a[i] + " ");
				flag = false;
			}
		if (flag == true)
		System.out.println("Không tồn tại phần tử nào chia hết cho 5");
	}
}
```

</details>
<br>

### Ví dụ 11

Nhập vào mảng gồm **N** số nguyên, hãy in ra chỉ số của giá trị lớn nhất trong mảng, nếu có nhiều phần tử mang giá trị lớn nhất thì in ra chỉ số của phần tử lớn nhất cuối cùng.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		// Cho phép nhập dữ liệu từ bàn phím
		Scanner sc = new Scanner(System.in);

		// Khai báo và nhập số phần tử trong mảng
		System.out.print("Nhập số phần tử trong mảng: ");
		int n = sc.nextInt();

		// Khai báo mảng
		int a[] = new int[n];

		// Nhập mảng
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		
		int max = a[0];
		int csmax = 0;
		
		for (int i = 0; i < n; i++)
			// Nếu a[i] > max thì cập nhật lại max và csmax
			// Như thế sẽ lưu được chỉ số  của max cuối cùng
			if (a[i] >= max) {
				max = a[i];
				csmax = i;
			}
		
		System.out.println("Max = " + max + ", chỉ số cuối cùng của max = " + csmax);
	}
}
```

</details>
<br>

### Ví dụ 12
Nhập vào mảng gồm **N** số nguyên, nhập vào một số nguyên **k** (0 <= k < N). Hãy xoá phần tử ở chỉ số **k** trong mảng, sau đó in ra mảng.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		// Cho phép nhập dữ liệu từ bàn phím
		Scanner sc = new Scanner(System.in);

		// Khai báo và nhập số phần tử trong mảng
		System.out.print("Nhập số phần tử trong mảng: ");
		int n = sc.nextInt();

		// Khai báo mảng
		int a[] = new int[n];

		// Nhập mảng
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "] = ");
			a[i] = sc.nextInt();
		}

		// Khai báo và nhập chỉ số của phần tử cần xoá
		System.out.print("Nhập chỉ số của phần tử cần xoá: ");
		int k = sc.nextInt();

		// Dồn các phần tử bên phải chỉ số 'k' qua trái 1 bước
		for (int i = k; i < n - 1; i++)
			a[i] = a[i + 1];
		n--;

		System.out.println("Mảng sau khi xoá phần tử ở chỉ số " + k + " là:");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}
}
```

</details>
<br>

### Ví dụ 13
Nhập vào mảng gồm **N** số nguyên, kiểm tra xem mảng có phải là mảng không giảm hay không?

(Mảng không giảm là mảng mà phần tử sau không nhỏ hơn các phần tử trước)

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		// Cho phép nhập dữ liệu từ bàn phím
		Scanner sc = new Scanner(System.in);

		// Khai báo và nhập số phần tử trong mảng
		System.out.print("Nhập số phần tử trong mảng: ");
		int n = sc.nextInt();

		// Khai báo mảng
		int a[] = new int[n];

		// Nhập mảng
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "] = ");
			a[i] = sc.nextInt();
		}

		// Đánh dấu mảng đang là dãy không giảm
		boolean flag = true;
		
		// Kiểm tra xem có phải dãy không giảm không
		for (int i = 0; i < n - 1; i++)
			if (a[i] > a[i + 1])
				flag = false;
		
		if (flag)
			System.out.println("Là dãy không giảm");
		else
			System.out.println("Không phải dãy không giảm");
	}
}
```

</details>
<br>


