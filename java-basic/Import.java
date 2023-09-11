package basic;

import java.util.Scanner;

public class Import {

	public static void main(String[] args) {
		// Định nghĩa 1 đối tượng Scanner cho phép đọc dự liệu
		Scanner sc = new Scanner(System.in);
		// Khai báo biến a kiểu số nguyên
		int a;
		// In ra dòng thông báo, để người dùng biến cần nhập biến a
		System.out.print("Nhập giá trị của số nguyên A: ");
		// Nhập giá trị của biến a từ bàn phím
		a = sc.nextInt();
		// In ra giá trị của biến a
		System.out.println("Giá trị vừa nhập là: " + a);
	}

}
