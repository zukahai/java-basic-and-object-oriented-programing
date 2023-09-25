<div align="center">

# Lập trình hàm trong Java
</div>

### Ví dụ 1

Viết phương thức tính tổng 2 số nguyên.

**Code mẫu:**

```java
package DHDN;

public class VKU {
	
	public static int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println(sum(5, 7));
	}
}
```

### Ví dụ 2

Viết phương thức tính tích của 3 số nguyên cho trước.

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 3

Viết phương thức kiểm tra xem số nguyên có phải là số tự nhiên hay không

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 4

Viết phương thức kiểm tra xem số nguyên có phải là số chẵn hay không

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 5

Viết phương thức tính N!

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 6

Viết phương thức tính số ước của số nguyên dương N

**Code mẫu:**

```java
package DHDN;

public class VKU {
	
	public static int countFactors(int n) {
		int count = 0;
		for (int i = 1; i <= Math.sqrt(n); i++)
			if (n % i == 0) 
				count += 2;
		if (Math.sqrt(n) == (int)(Math.sqrt(n)))
			count--;
		return count;
	}

	public static void main(String[] args) {
		System.out.println(countFactors(100));
	}
}
```

Nếu i là ước của N thì N/i của là ước của N nên ta chỉ cần chạy i đến căn bậc 2 của N. Nếu N là số chính phương thì ước căn N bị đếm 2 lần nên cần trù đi 1

### Ví dụ 7

Viết một phương thức nhập vào tên của bạn, phương thức in ra chữ "Hello" + tên của bạn.

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 8

Viết phương thức kiểm tra chuỗi đối xứng

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 9

Viết phương thức tim ước chung lớn nhất của 2 số nguyên dương

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 10

Viết phương thức kiểm tra xem một chuỗi có phải là chuỗi pangram hay không

Chuỗi pangram là chuỗi chứa tất cả các chữ cái trong bảng chữ cái tiếng Anh ít nhất một lần.

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 11

Viết phương thức kiểm tra xe một số nguyên có phải là số nguyên tố hay không

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 12

Viết phương thức in ra **n** chuỗi **s**, mỗi chuỗi trên một dòng

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 13

Viết phương thức tính diện tích của một tam giác khi biết 3 cạnh

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 14

Viết phương thức chuyển số n thành chuỗi nhị phân

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 15

Viết phương thức tính tổng của một mảng

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 16

Viết phương thức tính tổng: 1^2 + 2^2 + 3^2 + ... + n^2

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 17

Viết phương thức đưa ra chữ số cuối cùng của một số nguyên

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 18

Viết phương thức in ra chữ số đầu tiên của một số tự nhiên

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 19

Viết phương thức kiểm tra xem một số nguyên dương có phải là số chính phương hay không

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 20

Viết phương thức in số lượng chữ số 0 cuối cùng của n!

<details>
<summary> <strong>📝Test case 🧪</strong></summary>

#### Testcase 1:

|Input| Output|
|-----|:-----:|
|5| 1|

#### Testcase 2:

|Input| Output|
|-----|:-----:|
|12| 2|

#### Testcase 3:

|Input| Output|
|-----|:-----:|
|17| 3|

#### Testcase 4:

|Input| Output|
|-----|:-----:|
|26| 6|

#### Testcase 5:

|Input| Output|
|-----|:-----:|
|48| 10|

#### Testcase 6:

|Input| Output|
|-----|:-----:|
|236| 57|

#### Testcase 7:

|Input| Output|
|-----|:-----:|
|74823| 18700|

#### Testcase 8:

|Input| Output|
|-----|:-----:|
|736283948372635| 184070987093150|

#### Testcase 9:

|Input| Output|
|-----|:-----:|
|19283746253648293| 4820936563412061|

#### Testcase 10:

|Input| Output|
|-----|:-----:|
|11111111111111111| 2777777777777765|

#### Testcase 11:

|Input| Output|
|-----|:-----:|
|999999999999999999| 249999999999999977|

#### Testcase 12:

|Input| Output|
|-----|:-----:|
|82739402938472634| 20684850734618145|

#### Testcase 13:

|Input| Output|
|-----|:-----:|
|27122712271227129| 6780678067806772|

#### Testcase 14:

|Input| Output|
|-----|:-----:|
|42763948273847263| 10690987068461806|

#### Testcase 15:

|Input| Output|
|-----|:-----:|
|1| 0|

</details>
<br>

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.