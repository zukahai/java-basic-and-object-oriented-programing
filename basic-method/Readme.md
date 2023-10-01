<div align="center">

# Lập trình hàm trong Java
</div>

### Ví dụ 1

Viết phương thức tính tổng 2 số nguyên.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

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

</details>
<br>

### Ví dụ 2

Viết phương thức tính tích của 3 số nguyên cho trước.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

public class Example {
	public static int mul(int a, int b, int c) {
		return a * b * c;
	}
	
	public static void main(String[] args) {
		System.out.println(mul(2, 3, 2)); //12
	}
}
```

</details>
<br>

### Ví dụ 3

Viết phương thức kiểm tra xem một số nguyên có phải là số tự nhiên hay không

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

public class Example {
	public static boolean isNaturalNumber(int n) {
		return n >= 0;
	}
	
	public static void main(String[] args) {
		System.out.println(isNaturalNumber(0));
	}
}
```

</details>
<br>

### Ví dụ 4

Viết phương thức kiểm tra xem một số nguyên có phải là số chẵn hay không

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

public class Example {
	public static boolean isEven(int n) {
		return n % 2 == 0;
	}
	
	public static void main(String[] args) {
		System.out.println(isEven(10));
	}
}
```

</details>
<br>

### Ví dụ 5

Viết phương thức tính N!

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

public class Example {
	public static int calculateFactorial(int n) {
		int factor = 1;
		for (int i = 2; i <= n; i++)
			factor *= i;
		return factor;
	}
	
	public static void main(String[] args) {
		System.out.println(calculateFactorial(5)); //120
	}
}
```

</details>
<br>

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

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

public class Example {
	public static void printName(String name) {
		System.out.println("Hello " + name);
	}
	
	public static void main(String[] args) {
		printName("Hải"); //Hello Hải
	}
}
```

</details>
<br>

### Ví dụ 8

Viết phương thức kiểm tra chuỗi đối xứng

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

public class Example {
	public static boolean isPalindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++)
			if (s.charAt(i) != s.charAt(s.length() - i - 1))
				return false;
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("absssba"));
	}
}
```

</details>
<br>

### Ví dụ 9

Viết phương thức tim ước chung lớn nhất của 2 số nguyên dương

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

public class Example {
	public static int findGCD(int a, int b) {
		while (a % b != 0) {
			int d = a % b;
			a = b;
			b = d;
		}
		return b;
	}
	
	public static void main(String[] args) {
		System.out.println(findGCD(10, 25));
	}
}
```

</details>
<br>

### Ví dụ 10

Viết phương thức kiểm tra xem một chuỗi có phải là chuỗi pangram hay không

Chuỗi pangram là chuỗi chứa tất cả các chữ cái trong bảng chữ cái tiếng Anh ít nhất một lần.

Ví dụ "Mr Jock, TV quiz PhD, bags few lynx." là chuỗi pangram.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

public class Example {
	public static boolean isPangram(String s) {
		s = s.toLowerCase();
		boolean d[] = new boolean[256];
		for (char ch = 'a'; ch <= 'z'; ch++)
			d[ch] = false;
		
		for (int i = 0; i < s.length(); i++)
			d[s.charAt(i)] = true;
		
		boolean flag = true;
		for (char ch = 'a'; ch <= 'z'; ch++)
			if (d[ch] == false)
				flag = false;
		
		return flag;
	}
	
	public static void main(String[] args) {
		System.out.println(isPangram("Mr Jock, TV quiz PhD, bags few lynx."));
	}
}
```

</details>
<br>

### Ví dụ 11

Viết phương thức kiểm tra xe một số nguyên có phải là số nguyên tố hay không

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

public class Example {
	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPrime(7));
	}
}
```

</details>
<br>

### Ví dụ 12

Viết phương thức in ra **n** chuỗi **s**, mỗi chuỗi trên một dòng

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

public class Example {
	public static void print(String s, int n) {
		for (int i = 1; i <= n; i++)
			System.out.println(s);
	}
	
	public static void main(String[] args) {
		print("VKU", 10);
	}
}
```

</details>
<br>

### Ví dụ 13

Viết phương thức tính diện tích của một tam giác khi biết 3 cạnh.
Ví dụ nhập 3 cạnh là 3, 4, 5 thì diện tích bằng 12.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

public class Example {
	public static float areaTriangle(float a, float b, float c) {
		float p = (a + b + c) / 2.0f;
		float area = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return area;
	}
	
	public static void main(String[] args) {
		System.out.println(areaTriangle(3, 4, 5));
	}
}
```

</details>
<br>

### Ví dụ 14

Viết phương thức chuyển số tự nhiên n thành chuỗi nhị phân.
Ví dụ binary(7) = "111".

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

public class Example {
	public static String binary(int n) {
		if (n == 0)
			return "0";
		String ans = "";
		while(n > 0) {
			ans =  (n % 2) + ans;
			n /= 2;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(binary(10));
	}
}
```

</details>
<br>

### Ví dụ 15

Viết phương thức tính tổng của một mảng số nguyên

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

public class Example {
	public static int sumArray(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		return sum;
	}
	
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 10};
		System.out.println(sumArray(a)); //16
	}
}
```

</details>
<br>

### Ví dụ 16

Viết phương thức tính tổng: 1^2 + 2^2 + 3^2 + ... + n^2

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

public class Example {
	public static int sumSquar(int n) {
		return n * (n + 1) * (2 * n + 1) / 6;
	}
	
	public static void main(String[] args) {
		System.out.println(sumSquar(3)); //14
	}
}
```

</details>
<br>

### Ví dụ 17

Viết phương thức đưa ra chữ số cuối cùng của một số nguyên.
Ví dụ getLastDigit(-123) = 3

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

public class Example {
	public static int getLastDigit(int n) {
		return Math.abs(n % 10);
	}
	
	public static void main(String[] args) {
		System.out.println(getLastDigit(-123)); //3
	}
}
```

</details>
<br>

### Ví dụ 18

Viết phương thức in ra chữ số đầu tiên của một số tự nhiên.
Ví dụ getFirstDigit(123) = 1

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

public class Example {
	public static int getFirstDigit(int n) {
		String numberString = n + "";
		return numberString.charAt(0) - '0';
	}
	
	public static int getFirstDigit2(int n) {
		while(n > 10)
			n /= 10;
		return n;
	}
	
	public static void main(String[] args) {
		System.out.println(getFirstDigit2(123)); //1
	}
}
```

</details>
<br>

### Ví dụ 19

Viết phương thức kiểm tra xem một số nguyên dương có phải là số chính phương hay không

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

public class Example {
	public static boolean isPerfectSquare(int n) {
		return Math.sqrt(n) == (int)Math.sqrt(n);
	}
	
	public static void main(String[] args) {
		System.out.println(isPerfectSquare(100)); //true
	}
}
```

</details>
<br>

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

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

public class Example {
	public static long countTrailingZerosInFactorial(long n) {
		long count = 0;
		long pow5 = 5;
		while(pow5 <= n) {
			count += n / pow5;
			pow5 *= 5;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(countTrailingZerosInFactorial(200)); // 49
	}
}

```
Hàm **countTrailingZerosInFactorial** tính số lượng chữ số 0 cuối cùng của n! bằng cách đếm số lượng thừa số 5 trong phân tích thừa số nguyên của n!. Nó hoạt động bằng cách chia lần lượt cho các bội số của 5 và cộng dồn số lần chia.

</details>
<br>

### Ví dụ 21

Viết 2 phương thức sau:
- 1 hàm cho phép in ra một mảng một chiều a
- 1 hàm trả về mảng đảo ngược của một mảng

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

```java
package VKU;

public class Example {
	public static void printArray(int a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	
	public static int[] reverseArray(int a[]) {
		for (int i = 0; i < a.length / 2; i++) {
			int t = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = t;
		}
		return a;
	}

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4};
		System.out.println("Mảng ban đầu:");
		printArray(a);
		a = reverseArray(a);
		System.out.println("Mảng đảo ngược:");
		printArray(a);
	}
}
```

</details>
<br>