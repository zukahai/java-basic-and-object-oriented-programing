<div align="center">

# Lệnh Switch Case
</div>

### Ví dụ 1
Nhập vào một số tự nhiên có 1 chữ số, hãy in ra cách đọc tiếng Việt tương ứng.

*Ví dụ:*

Nhập N = 3 thì kết quả là "Ba"
Nhập N = 9 thì kết quả là "Chín"

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 2

Quy định 0 là nam, 1 là nữ, 2 là khác. Nhập và một số nguyên chỉ giới tính của một người, hãy chi biết người đó giới tính gì.

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 3
Quy định ký tự 'N' là hướng Bắc, 'S' là hướng Nam, 'W' là hướng Đông, 'E' là hướng Tây. Nhập và một ký tự trong NEWS, hãy cho biêý hướng tương ứng của ký tự đó.

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.

### Ví dụ 4

Nhập và số nguyên **a** và **b**, nhập tiếp một phép tính +,-,*,/,%. Tính và đưa ra kết quả.

Ví dụ nhập a = 14, b = 5, phép tính bằng '%' thì kết quả là 14 % 5 = 2

**Code mẫu:**

```Java
package DHDN;

import java.util.Scanner;

public class VKU {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		char ch;
		System.out.print("Nhập A: ");
		a = sc.nextInt();
		System.out.print("Nhập B: ");
		b = sc.nextInt();
		System.out.print("Nhập phép tính: ");
		ch = sc.next().charAt(0);
		
		switch (ch) {
			case '+':
				System.out.println(a + " + " + b + " = " + (a + b));
				break;
			case '-':
				System.out.println(a + " - " + b + " = " + (a - b));
				break;
			case '*':
				System.out.println(a + " * " + b + " = " + (a * b));
				break;
			case '/':
				System.out.println(a + " / " + b + " = " + ((float)a - b));
				break;
			case '%':
				System.out.println(a + " % " + b + " = " + (a % b));
				break;
			default:
				System.out.println("Vui lòng nhập phép tính +, -, *, /, %");
		}
	}
}
```

### Ví dụ 5

Nhập vào năm và tháng, hãy ra in số ngày trong tháng của năm đó.

*Gợi ý:* những tháng 1, 3, 5, 7, 8, 10, 12 có 31 ngày, những tháng 4, 6, 9, 11 có 30 ngày, những tháng 2 là năm nhuận thì có 28 ngày, tháng 2 của năm bình thường có 29 ngày.

Năm nhuận là năm chia hết cho 4 và không chia hết cho 100, hoặc những năm chia hết cho 400.

**Code mẫu:**

Hãy thử tìm hiểu trước, sẽ cập nhật code mẫu sau.