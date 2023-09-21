<div align="center">

# Câu lệnh điều kiện
</div>

### Ví dụ 1

Nhập vào một số nguyên **N**, kiểm tra và in ra N có phải là số tự nhiên hay không.

**Code mẫu:**
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


### Ví dụ 2
Nhập vào 2 cạnh của một hình chữ nhật, hãy kiểm tra xem hình chữ nhật đó có phải là hình vuông hay không.

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 3
Nhập vào một số nguyên **N**, kiểm tra và in ra **N** có phải là số chẵn hay không?

*Gợi ý*: Áp dụng chia lấy dư cho 2.
Số chẵn chia 2 sẽ dư 0 còn số lẻ sẻ dư 1

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 4
Nhâp vào **2** số nguyên **a** và **b**, hãy dùng cầu lệnh điều kiện đề tìm và đưa ra số lớn hơn.

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.


### Ví dụ 5
Điểm số hợp lí là điểm số nằm trong khoảng **0** đến **10**. Nhập vào một số, hãy kiểm tra xem số đó có phải là điểm số hợp lí không.

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 6
Nhập vào **3** số nguyên **a, b, c**, hãy kiểm tra xem 3 số đó có thể là độ dài 3 cạnh của một tam giác hay không.

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 7
Nhập vào **3** số nguyên **a, b, c**, hãy kiểm tra xem 3 số đó có thể là độ lớn 3 góc của một tam giác hay không.

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 8
Nhập vào một số thực, kiểm tra xem số thực đó có phải là số nguyên hay không.

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 9
Nhập vào một số nguyên dương **N**, hãy kiểm tra xem **N** có phải là số chính phương hay không.

Số chính phương là số có thể biểu diễn bởi bình phương của một số nguyên khác, ví dụ **4, 9, 1, 25, 100,...** là các số chính phương

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 10
Nhập vào 3 số nguyên dương **a**, **b**, **c**, hãy kiểm tra xem b có đồng thời là ước của **a** và là bội của **c** hay không

(Một số **x** được gọi là bội của **y** khi **x** chia hết cho **y**, một số **x** gọi là ước của **y** khi **y** chia hết cho **x**)

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 11
Nhập vào một ký tự **ch** Kiểm tra xem ch có phải là chữ cái in thường hay không.

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 12
Nhập vào một ký tự **ch** Kiểm tra xem ch có phải là chữ cái in hoa hay không.

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 13
Nhập vào 2 chuỗi ký tự **a** và **b**, hãy kiểm tra xem 2 chuỗi đó có giống nhau hay không?

**Gợi ý:** Sử dụng hàm **equals** trong java để kiểm tra 2 chuỗi có bằng nhau hay không.

Tại sao không sử dụng **a == b** mà phải sử dụng **equals**, vì hàm **equals** sẽ so sánh nội dung trong khi sử dụng **==** sẽ so sánh luôn địa chỉ của 2 object. (Học đến phần OOP mình sẽ giải thích kỹ hơn).

**Code mẫu:**
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

### Ví dụ 14
Nhập và chuỗi **a** và chuỗi **b**, in ra chuỗi có độ dài dài hơn, nếu 2 chuỗi dài bằng nhau thì in ra chuỗi **a**.

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 15
Nhập và h (0 <= h < 24) và m (0 <= h < 60) để biểu diễn số giờ và số phút hiện tại. Hãy in ra thời gian sau 1 phút nữa.

Ví dụ h = 10, m = 35. thời gian hiện tại là 10:35 và thời gian sau 1 phút nữa là 10:36

Ví dụ h = 20, m = 59. thời gian hiện tại là 20:59 và thời gian sau 1 phút nữa là 21:00