<div align="center">

# Mảng trong Java
</div>

### Ví dụ 1

Nhập vào một mảng có 5 số nguyên, in ra mảng vừa nhập trên một dòng, giữa 2 phần tử có một dấu cách.

**Code mẫu:**

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

### Ví dụ 2

Nhập vào một số nguyên dương **N**, tiếp theo nhập lần lượt **N** phần tử của mảng **a**. In ra các phần tử của mảng **a** trên một dòng, giữa 2 phần tử có một dấu cách.

**Code mẫu:**

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

### Ví dụ 3

Nhập vào một số nguyên dương **N**, tiếp theo nhập lần lượt **N** phần tử của mảng **a**. In ra các phần tử của mảng **a** trên một dòng theo thứ tự ngược lại, giữa 2 phần tử có một dấu cách.

Ví dụ nhập N = 3, các phần tử được nhập lần lượt là 4, 1, 2, 7 thì in ra 7 2 1 4

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 4

Nhập vào một mảng gồm **N** số nguyên, hãy tính và in ra tổng của mảng đó.

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 5

Nhập vào một mảng gồm **N** số nguyên, hãy tính và in ra tổng của các phần tử chẵn và mang chỉ số lẻ trong mảng.

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 6

Nhập vào mảng gồm **N** số nguyên, in ra phần tử đầu tiên và phần tử cuối cùng trong mảng.
**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.


### Ví dụ 7

Nhập vào mảng gồm **N** số nguyên, tìm và in ra giá trị lớn nhất và nhỏ nhất trong mảng.

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 8

Nhập vào mảng gồm **N** số nguyên, tìm và in ra giá trị lớn nhất trong mảng và số lượng phần tử mang giá trị đó.

Ví dụ mảng có 5 phần tử là 4, 1, 2, 4, 4 thì in ra max = 4 và số lượng phần tử mang giá trị 4 là 3.

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 9

Nhập vào mảng gồm **N** số nguyên, đếm và in ra số lượng số chẵn trong mảng.

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 10

Nhập vào mảng gồm **N** số nguyên, hãy in ra các số chia hết cho 5 trong mảng, nếu không có số nào chia hết cho 5 thì in ra "Không tồn tại phần tử nào chia hết cho 5"

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 11

Nhập vào mảng gồm **N** số nguyên, hãy in ra chỉ số của giá trị lớn nhất trong mảng, nếu có nhiều phần tử mang giá trị lớn nhất thì in ra chỉ số của phần tử lớn nhất cuối cùng.

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 12
Nhập vào mảng gồm **N** số nguyên, nhập vào một số nguyên **k** (0 <= k < N). Hãy xoá phần tử ở chỉ số **k** trong mảng, sau đó in ra mảng.

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 13
Nhập vào mảng gồm **N** số nguyên, kiểm tra xem mảng có phải là mảng không giảm hay không?

(Mảng không giảm là mảng mà phần tử sau không nhỏ hơn các phần tử trước)

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.


